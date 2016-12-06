
<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html lang="en">

<tiles:insertAttribute name="head"/>

<body>

	<div class="container-fluid">
	<tiles:insertAttribute name="nav"/>
	<tiles:insertAttribute name="body"/>
	<tiles:insertAttribute name="footer"/>
	</div>

</body>
</html>