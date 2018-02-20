package mx.appwhere.remittances.front.application.util;

import com.google.gson.Gson;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

@Component
public final class Util<T> {

	private static final Logger log = LogManager.getLogger(Util.class);

	/**
	 * Metodo utilitario para convertir un json a un objeto.
	 * @param objectRes
	 * @param json
	 * @param nodos
	 * @return
	 * @throws ParseException
	 */
	public Object jsonToObject(T objectRes, String json, ArrayList<String> nodos) throws ParseException {
		try {
			Gson gson = new Gson();
			JSONParser parser = new JSONParser();
			Object objRes = parser.parse(json);
			JSONObject jsonObject = (JSONObject) objRes;
			for (String nodo : nodos) {
				if(jsonObject.containsKey(nodo)) {
					jsonObject = (JSONObject) jsonObject.get(nodo);
				}
			}
			String jsonResponse = jsonObject.toJSONString();
			return gson.fromJson(jsonResponse, ((T) objectRes).getClass());
		} catch (Exception e) {
			log.error("\nError en el metodo jsonToObject(T objectRes, String json, ArrayList<String> nodos)" + "\nParametros de entrada ( " + objectRes.getClass() + ", " + json + ", "
					+ nodos.toString() + " )" + "\nException Message: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Metodo utilitario para convertir un json a un objeto.
	 * @param objectRes
	 * @param json
	 * @return
	 * @throws ParseException
	 */
	public Object jsonToObject(T objectRes, String json) throws ParseException {
		try {
			Gson gson = new Gson();
			JSONParser parser = new JSONParser();
			Object objRes = parser.parse(json);
			JSONObject jsonObject = (JSONObject) objRes;
			String jsonResponse = jsonObject.toJSONString();
			Object response = gson.fromJson(jsonResponse, ((T) objectRes).getClass());
			return response;
		} catch (Exception e) {
			log.error("\nError en el metodo jsonToObject(T objectRes, String json)" + "\nParametros de entrada ( " +
					objectRes.getClass() + ", " + json + ")" + "\nException Message: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Metodo utilitario para convertir un objeto a un json.
	 * @param object
	 * @return
	 */
	public String objectToJson(Object object) {
		Gson gson = new Gson();
		return gson.toJson(object);
	}

	/**
	 * Metodo utilitario para realizar llamada REST por el metodo POST
	 * @param obj
	 * @param uri
	 * @return
	 */
	public String callRestPost(Object obj, String uri) {
		String output = "";
		try {
			String input = this.objectToJson(obj);
			URL restServiceURL = new URL(uri);
			HttpURLConnection httpConnection = (HttpURLConnection) restServiceURL.openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod("POST");
			httpConnection.setRequestProperty("Content-Type", "application/json");
			OutputStream outputStream = httpConnection.getOutputStream();
			outputStream.write(input.getBytes());
			outputStream.flush();
			if (httpConnection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + httpConnection.getResponseCode());
			}
			BufferedReader responseBuffer = new BufferedReader(new InputStreamReader((httpConnection.getInputStream()), "UTF8"));
			String outputline;
			while ((outputline = responseBuffer.readLine()) != null) {
				output += outputline;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return output;
	}

}