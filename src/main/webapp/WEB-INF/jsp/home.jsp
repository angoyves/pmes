<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Home Page</div>
        <div class="panel-body">
           Welcome <c:out value="${name}" />!! <a href="employes">Click here</a> to manage your employees
        </div>
     </div>
 </div>
<%@ include file="common/footer.jspf"%>