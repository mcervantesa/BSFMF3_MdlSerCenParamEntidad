package mx.appwhere.remittances.front.application.dto.bsfoperador;

public class DatosCentroDTO {

    private String NOMBRE;
    private String FECHA_ALTA;
    private String CALLE;
    private String NUMEROEXT;
    private String NUMEROINT;
    private String COLONIA;
    private String CP;
    
    public DatosCentroDTO(String nOMBRE, String fECHA_ALTA, String cALLE, String nUMEROEXT, String nUMEROINT,
			String cOLONIA, String cP) {
		super();
		NOMBRE = nOMBRE;
		FECHA_ALTA = fECHA_ALTA;
		CALLE = cALLE;
		NUMEROEXT = nUMEROEXT;
		NUMEROINT = nUMEROINT;
		COLONIA = cOLONIA;
		CP = cP;
	}

	public DatosCentroDTO() {
    	
    }
    
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getFECHA_ALTA() {
		return FECHA_ALTA;
	}
	public void setFECHA_ALTA(String fECHA_ALTA) {
		FECHA_ALTA = fECHA_ALTA;
	}
	public String getCALLE() {
		return CALLE;
	}
	public void setCALLE(String cALLE) {
		CALLE = cALLE;
	}
	public String getNUMEROEXT() {
		return NUMEROEXT;
	}
	public void setNUMEROEXT(String nUMEROEXT) {
		NUMEROEXT = nUMEROEXT;
	}
	public String getNUMEROINT() {
		return NUMEROINT;
	}
	public void setNUMEROINT(String nUMEROINT) {
		NUMEROINT = nUMEROINT;
	}
	public String getCOLONIA() {
		return COLONIA;
	}
	public void setCOLONIA(String cOLONIA) {
		COLONIA = cOLONIA;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}

}
