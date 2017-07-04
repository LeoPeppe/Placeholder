package it.contadini.action;

import it.contadini.servicebuilder.model.Clienti;
import it.contadini.servicebuilder.service.ClientiLocalServiceUtil;
import it.contadini.utility.MailSenderCliente;
import it.contadini.utility.MailSenderInterno;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


/**
 * Portlet implementation class ContadiniForm
 */
public class ContadiniForm extends MVCPortlet {
 

	public void salva(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
	
		try{
			
			String nome= ParamUtil.getString(actionRequest, "nome");
			String cognome= ParamUtil.getString(actionRequest, "cognome");
			String email= ParamUtil.getString(actionRequest, "email");
			String indirizzo= ParamUtil.getString(actionRequest, "address");
			String cap= ParamUtil.getString(actionRequest, "zip_code");
			String telefono= ParamUtil.getString(actionRequest, "phone");
			
			
			// calcolo da data odierna da salvare nel db 
//			Format dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Format dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			String dataCompilazione= dateFormat.format(date);
			
			/**Salvataggio sul database */
			Clienti clientimodel ;
			
			long clientiId;
			clientiId = CounterLocalServiceUtil.increment();
			
			
			System.out.println("Client id "+clientiId);
			clientimodel= ClientiLocalServiceUtil.createClienti(clientiId);
			
			clientimodel.setNome(nome);
			clientimodel.setCognome(cognome);
			clientimodel.setEmail(email);
			clientimodel.setIndirizzo(indirizzo);
			clientimodel.setCap(cap);
			clientimodel.setTelefono(telefono);
			clientimodel.setDataCompilazione(dataCompilazione);
			
			ClientiLocalServiceUtil.updateClienti(clientimodel);
			/** FINE Salvataggio sul database */

			
			//invio mail interno 
			String destinatariMailInterni = com.liferay.util.portlet.PortletProps.get("destinatariMailInterni");
			String mailMittente = com.liferay.util.portlet.PortletProps.get("mailMittente");
			String pwd = com.liferay.util.portlet.PortletProps.get("pwdMailMittente");
			String host=com.liferay.util.portlet.PortletProps.get("host");
			String smtpAuth=com.liferay.util.portlet.PortletProps.get("smtpAuth");
			String oggetto=com.liferay.util.portlet.PortletProps.get("oggetto");
			
//			System.out.println("destinatariMailInterni "+destinatariMailInterni
//					+ " mailMittente "+mailMittente+
//					"pwd "+pwd+
//					"host "+pwd+
//					"smtpAuth "+ smtpAuth);
			
			MailSenderInterno mailSenderInterno = new MailSenderInterno();

			List<String> destinatari=new ArrayList<String>();
			
			String[] parts = destinatariMailInterni.split(",");
			for (int i = 0; i < parts.length; i++) {
				destinatari.add(parts[i]);
			}
			
			
			String testoMail="Il cliente "
					+ "\n NOME: "+nome
					+ "\n COGNOME: "+cognome
					+ "\n EMAIL: "+email
					+ "\n INDIRIZZO: "+indirizzo
					+ "\n CAP: "+cap
					+ "\n TELEFONO: "+telefono
					+ "\n \n ha effettuato la compilazione del questionario ";
			
			
			try {
			 /** MAIL INTERNA  */
				mailSenderInterno.inviaMail(mailMittente, pwd, host, smtpAuth, destinatari, testoMail, oggetto);
			 
			 
			 /** Mail cliente*/
				String oggettoCliente= "Oggetto Cliente";
				String testoMailCliente= "testo mail Cliente";
				MailSenderCliente mailCliente = new MailSenderCliente();
					mailCliente.inviaMail(mailMittente, pwd, host, smtpAuth, email, testoMailCliente, oggettoCliente);
				/** FINE Mail cliente */
			 
			 		SessionMessages.add(actionRequest,"salva-form-success");
			 		
			 		actionRequest.setAttribute("errore","NO");
				
				actionResponse.setRenderParameter("jspPage",
						"/html/contadiniform/view.jsp");
			
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
				SessionErrors.add(actionRequest,"salva-form-error");
				
				actionRequest.setAttribute("errore", e.getMessage());
				
				actionResponse.setRenderParameter("jspPage",
						"/html/contadiniform/view.jsp");
			}
			/**FINE INVIO MAIL **/
			
				
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			SessionErrors.add(actionRequest,"salva-form-error");
			 
			actionRequest.setAttribute("errore", e.getMessage());
			
			actionResponse.setRenderParameter("jspPage",
					"/html/contadiniform/view.jsp");
			
			
			
		}
	}


	



}
