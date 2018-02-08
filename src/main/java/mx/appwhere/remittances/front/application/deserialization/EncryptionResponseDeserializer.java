package mx.appwhere.remittances.front.application.deserialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import mx.appwhere.remittances.front.domain.entities.encryption.BsfOperador;
import mx.appwhere.remittances.front.domain.entities.encryption.DecryptionResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/17
 */
public class EncryptionResponseDeserializer extends JsonDeserializer<DecryptionResponse> {

    private ObjectMapper objectMapper;

    @Autowired
    public EncryptionResponseDeserializer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public DecryptionResponse deserialize(JsonParser jsonParser, DeserializationContext ctx)
            throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String codRet = node.get("codRet").asText();
        String error = node.get("error").asText();
        String bsfOperadorJson = node.get("respuesta").asText();
        BsfOperador bsfOperador = objectMapper.readValue(bsfOperadorJson, BsfOperador.class);

        DecryptionResponse decryptionResponse = new DecryptionResponse();
        decryptionResponse.setCodRet(codRet);
        decryptionResponse.setError(error);
        decryptionResponse.setBsfOperador(bsfOperador);
        return decryptionResponse;
    }
}
