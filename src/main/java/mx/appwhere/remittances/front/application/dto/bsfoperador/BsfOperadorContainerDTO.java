package mx.appwhere.remittances.front.application.dto.bsfoperador;

public class BsfOperadorContainerDTO {

    private BsfOperadorDTO BSFOPERADOR;
    
    public BsfOperadorContainerDTO(BsfOperadorDTO BSFOPERADOR) {
    	this.BSFOPERADOR = BSFOPERADOR;
    }
    
    public BsfOperadorContainerDTO() {
    	
    }

	public BsfOperadorDTO getBSFOPERADOR() {
		return BSFOPERADOR;
	}

	public void setBSFOPERADOR(BsfOperadorDTO bSFOPERADOR) {
		BSFOPERADOR = bSFOPERADOR;
	}

}
