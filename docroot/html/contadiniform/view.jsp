<%@ include file="init.jsp"%>


<portlet:actionURL var="salvaFormURL" windowState="normal" name="salva">
</portlet:actionURL>


<portlet:defineObjects />


<!DOCTYPE html>
<html lang="en">

<head>
  
  <title>Form</title>


</head>

<body>

<%
System.out.println("Error = "+renderRequest.getAttribute("errore"));
if( renderRequest.getAttribute("errore")!= null){
	if(renderRequest.getAttribute("errore").equals("NO")){
%>

<liferay-ui:success key="salva-form-success" message="Grazie per aver compilato il nostro form!" />

<%} else { %>
<liferay-error key="salva-form-error" message="Si è verificato un errore. Ci dispiace per l'inconveniente. Si prega di riprovare." />
<%}
	}%>

  <div class="container">
    <h2>FORM</h2>
    <br/>
 

<%--   <aui:form role="form" data-pg-collapsed  action="<%=salvaFormURL%>" method="post" id="<portlet:namespace/>FormContadini" class="form-horizontal" > --%>
  <aui:form  action="<%=salvaFormURL%>" method="post" class="form-horizontal">
 
  	  <h4>ANAGRAFICA COMPILATORE</h4>
  	 
  	 <div class="form-group">
	        <div class="col-sm-12">
				  	 <aui:input id="id_nome" name="nome"  label="Name" value="">
				  	 	<aui:validator name="required" errorMessage="Field is required" />
<%-- 				  	 	<aui:validator name="alpha"/> --%>
				  	 </aui:input>
				  	 <aui:input id="id_cognome" name="cognome" label="Last Name" value="">
				  	 	<aui:validator name="required" errorMessage="Field is required" />
<%-- 				  	 	<aui:validator name="alpha"/> --%>
				  	 </aui:input>
				  	 <aui:input id="id_email" name="email" label="Email" value="">
				  	 	<aui:validator name="required" errorMessage="Field is required" />
				  	  	<aui:validator name="email"/>
				  	 </aui:input>
				  	 <aui:input id="id_address" name="address" label="Address" value="" >
				  		 <aui:validator name="required" errorMessage="Field is required" />
				  	 </aui:input>
				  	  <aui:input id="id_zip_code" name="zip_code" label="Zip Code" value="">
				  	  	<aui:validator name="required" errorMessage="Field is required" />
				  	  </aui:input>
				  	  <aui:input id="id_phone" name="phone" label="Phone" value="">
				  	  	<aui:validator name="required" errorMessage="Field is required" />
				  	  </aui:input>
				  	 
				  	 
  	   		 </div>
	
	
		  <button  id="<portlet:namespace/>id_salva"  type="submit" class="btn btn-success" style="text-align:center;font-weight: bold;" onclick="salva()">Avanti</button>
	</div>
      </aui:form>


  </div>



  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!--   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> -->
  <!-- Include all compiled plugins (below), or include individual files as needed -->
     <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
      <script src="<%=request.getContextPath()%>/js/scripts.js"></script>
  <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>


</body>

</html>