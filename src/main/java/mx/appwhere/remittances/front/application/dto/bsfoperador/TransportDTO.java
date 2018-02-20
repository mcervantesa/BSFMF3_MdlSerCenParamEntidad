package mx.appwhere.remittances.front.application.dto.bsfoperador;

public class TransportDTO {

    private String ACTIONBACK;
    private String TITULO;
    private String TIPODOCUMENTO;
    private String TARGET;
    private String IDINTERNOPE;
    private String IDDOCUMENTO;
    private String MESSAGE;
    private String STATUS;
    private String URLACTION;
    private String MenuDinamico;
    
    public TransportDTO() {
    	
    }
    
	public TransportDTO(String aCTIONBACK, String tITULO, String tIPODOCUMENTO, String tARGET, String iDINTERNOPE,
			String iDDOCUMENTO, String mESSAGE, String sTATUS, String uRLACTION, String menuDinamico) {
		super();
		ACTIONBACK = aCTIONBACK;
		TITULO = tITULO;
		TIPODOCUMENTO = tIPODOCUMENTO;
		TARGET = tARGET;
		IDINTERNOPE = iDINTERNOPE;
		IDDOCUMENTO = iDDOCUMENTO;
		MESSAGE = mESSAGE;
		STATUS = sTATUS;
		URLACTION = uRLACTION;
		MenuDinamico = menuDinamico;
	}

	public String getACTIONBACK() {
		return ACTIONBACK;
	}
	public void setACTIONBACK(String aCTIONBACK) {
		ACTIONBACK = aCTIONBACK;
	}
	public String getTITULO() {
		return TITULO;
	}
	public void setTITULO(String tITULO) {
		TITULO = tITULO;
	}
	public String getTIPODOCUMENTO() {
		return TIPODOCUMENTO;
	}
	public void setTIPODOCUMENTO(String tIPODOCUMENTO) {
		TIPODOCUMENTO = tIPODOCUMENTO;
	}
	public String getTARGET() {
		return TARGET;
	}
	public void setTARGET(String tARGET) {
		TARGET = tARGET;
	}
	public String getIDINTERNOPE() {
		return IDINTERNOPE;
	}
	public void setIDINTERNOPE(String iDINTERNOPE) {
		IDINTERNOPE = iDINTERNOPE;
	}
	public String getIDDOCUMENTO() {
		return IDDOCUMENTO;
	}
	public void setIDDOCUMENTO(String iDDOCUMENTO) {
		IDDOCUMENTO = iDDOCUMENTO;
	}
	public String getMESSAGE() {
		return MESSAGE;
	}
	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getURLACTION() {
		return URLACTION;
	}
	public void setURLACTION(String uRLACTION) {
		URLACTION = uRLACTION;
	}
	public String getMenuDinamico() {
		return MenuDinamico;
	}
	public void setMenuDinamico(String menuDinamico) {
		MenuDinamico = menuDinamico;
	}
    
}
