package mx.appwhere.remittances.front.application.dto.bsfoperador;

public class BsfOperadorDTO {

    private String ENTIDAD;
    private String CENTRO;
    private Integer TERMINAL;
    private String USERTCB;
    private String SESSIONID;
    private Object PASSTCB;
    private String NOMBREEMPLEADO;
    private String NOMBRECENTRO;
    private String FECHACONTABLE;
    private DatosCentroDTO DIRECCIONCENTRO;
    private TransportDTO TRANSPORT;
    private Integer status;

    public BsfOperadorDTO(String eNTIDAD, String cENTRO, Integer tERMINAL, String uSERTCB, String sESSIONID,
                          Object pASSTCB, String nOMBREEMPLEADO, String nOMBRECENTRO, String fECHACONTABLE,
                          DatosCentroDTO dIRECCIONCENTRO, TransportDTO tRANSPORT, Integer status) {
		ENTIDAD = eNTIDAD;
		CENTRO = cENTRO;
		TERMINAL = tERMINAL;
		USERTCB = uSERTCB;
		SESSIONID = sESSIONID;
		PASSTCB = pASSTCB;
		NOMBREEMPLEADO = nOMBREEMPLEADO;
		NOMBRECENTRO = nOMBRECENTRO;
		FECHACONTABLE = fECHACONTABLE;
		DIRECCIONCENTRO = dIRECCIONCENTRO;
		TRANSPORT = tRANSPORT;
		this.status = status;
	}

	public BsfOperadorDTO() {
    	
    }
    
	public String getENTIDAD() {
		return ENTIDAD;
	}
	public void setENTIDAD(String eNTIDAD) {
		ENTIDAD = eNTIDAD;
	}
	public String getCENTRO() {
		return CENTRO;
	}
	public void setCENTRO(String cENTRO) {
		CENTRO = cENTRO;
	}
	public Integer getTERMINAL() {
		return TERMINAL;
	}
	public void setTERMINAL(Integer tERMINAL) {
		TERMINAL = tERMINAL;
	}
	public String getUSERTCB() {
		return USERTCB;
	}
	public void setUSERTCB(String uSERTCB) {
		USERTCB = uSERTCB;
	}
	public String getSESSIONID() {
		return SESSIONID;
	}
	public void setSESSIONID(String sESSIONID) {
		SESSIONID = sESSIONID;
	}
	public Object getPASSTCB() {
		return PASSTCB;
	}
	public void setPASSTCB(Object pASSTCB) {
		PASSTCB = pASSTCB;
	}
	public String getNOMBREEMPLEADO() {
		return NOMBREEMPLEADO;
	}
	public void setNOMBREEMPLEADO(String nOMBREEMPLEADO) {
		NOMBREEMPLEADO = nOMBREEMPLEADO;
	}
	public String getNOMBRECENTRO() {
		return NOMBRECENTRO;
	}
	public void setNOMBRECENTRO(String nOMBRECENTRO) {
		NOMBRECENTRO = nOMBRECENTRO;
	}
	public String getFECHACONTABLE() {
		return FECHACONTABLE;
	}
	public void setFECHACONTABLE(String fECHACONTABLE) {
		FECHACONTABLE = fECHACONTABLE;
	}
	public DatosCentroDTO getDIRECCIONCENTRO() {
		return DIRECCIONCENTRO;
	}
	public void setDIRECCIONCENTRO(DatosCentroDTO dIRECCIONCENTRO) {
		DIRECCIONCENTRO = dIRECCIONCENTRO;
	}
	public TransportDTO getTRANSPORT() {
		return TRANSPORT;
	}
	public void setTRANSPORT(TransportDTO tRANSPORT) {
		TRANSPORT = tRANSPORT;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BsfOperadorDTO{" +
				"ENTIDAD='" + ENTIDAD + '\'' +
				", CENTRO='" + CENTRO + '\'' +
				", TERMINAL=" + TERMINAL +
				", USERTCB='" + USERTCB + '\'' +
				", SESSIONID='" + SESSIONID + '\'' +
				", PASSTCB=" + PASSTCB +
				", NOMBREEMPLEADO='" + NOMBREEMPLEADO + '\'' +
				", NOMBRECENTRO='" + NOMBRECENTRO + '\'' +
				", FECHACONTABLE='" + FECHACONTABLE + '\'' +
				", DIRECCIONCENTRO=" + DIRECCIONCENTRO +
				", TRANSPORT=" + TRANSPORT.getIDINTERNOPE() +
				", status=" + status +
				'}';
	}
}
