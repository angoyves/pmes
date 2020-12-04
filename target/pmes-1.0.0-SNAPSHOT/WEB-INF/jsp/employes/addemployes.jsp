<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jsp"%>
<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Employes Page</div>
        <div class="panel-body">
           Add Employes
        </div>
        <table class="table table-stripe table-hover table-responsive">
        	<form:form id="frmAddHome" modelAttribue="" method="POST" enctype="multipart/form-data">
        		
		        <tr>
		        <td>Noms</td>
		        <td><input type="text" name="name" value=""></td>			
			    </tr>
		        
		        <tr>
		        <td>Prenom</td>
		        <td><input type="text" name="name" value=""></td>			
			    </tr>
			    
			    <tr>
		        <td>Fonction</td>
		        <td><input type="text" name="name" value=""></td>			
			    </tr>
			    
	        </form:form>
        </table>
     </div>
 </div>
 
<%@ include file="../common/footer.jspf"%>