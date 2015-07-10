package co.insecurity.strutsref.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import co.insecurity.strutsref.form.PingForm;

public class PingAction extends Action {

	public ActionForward execute(
			ActionMapping mapping, ActionForm form, 
			HttpServletRequest request, HttpServletResponse response) 
					throws Exception {
		PingForm pingForm = (PingForm) form;
		pingForm.setPingResponse("pong");
		return mapping.findForward("success");
	}
}