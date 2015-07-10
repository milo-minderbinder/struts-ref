package co.insecurity.strutsref.form;

import org.apache.struts.action.ActionForm;

public class PingForm extends ActionForm {

	private String pingResponse;
	
	
	public void setPingResponse(String response) {
		this.pingResponse = response;
	}
	
	public String getPingResponse() {
		return pingResponse;
	}
}