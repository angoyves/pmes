<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jsp"%>
<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Employes Page</div>
        <div class="panel-body">
           Employes List
        </div>
        <table class="table table-stripe table-hover table-responsive">
        	<thead>
        		<tr>
        			<th>Noms</th>
        			<th>Prénoms</th>
        			<th>Fonction</th>
        			<th></th>
        		</tr>
        	</thead>
        	
	        <c:forEach items="${employes}" var="employe">
	        	<tr>
	        		<td>${employe.nom}</td>
	        		<td>${employe.prenom}</td>
	        		<td>${employe.fonction}</td>
	        		<td>
	        			<a href="employes/delete/${employe.id}"><button type="button" class="btn btn-danger btn-delete" data="${employe.id}"><i class="fa fa-trash"></i></button></a>
	        			<a href="edit/${employe.id}"><button type="button" class="btn btn-success btn-edit" data="${employe.id}"><i class="fa fa-edit"></i></button></a>
        			</td>
	        	</tr>
	        </c:forEach>
	        <tr>
	        		<td></td>
	        		<td></td>
	        		<td></td>
	        		<td>
	        			<a href="employes/add"><button type="button" class="btn btn-success btn-add" data="${employe.id}"><i class="fa fa-edit"></i></button></a>
        			</td>
	        </tr>
        </table>
     </div>
 </div>
 
<%@ include file="../common/footer.jspf"%>