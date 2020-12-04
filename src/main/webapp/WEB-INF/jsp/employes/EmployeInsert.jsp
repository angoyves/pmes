<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" language="javascript">
function fn_moveEmployeTestInsert(){
	util trimRequiredValue();
	if (!validateFrm_employeTest_insert(document.frm_employeTest_insert)){
		return;
	}
	util_confirmAlert();
}
</script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm_employeTest_insert" method="post" modelAttribute="employesTestQVO">
	<table>
		<tr>
			<td><input type="text" name="name" id="name"></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>
	</table>
</form>
</body>
</html>