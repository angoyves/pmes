<nav role="navigation" class="navbar navbar-default">
	 <div class="">
	  <a href="http://www.bixterprise.com" class="navbar-brand">Bixterprise</a>
	 </div>
	 <div class="navbar-collapse">
	     <ul class="nav navbar-nav">    
	     
	     </ul>
	     <ul class="nav navbar-nav navbar-left">
			<c:choose>
				<c:when test="${isHome}">
					<li class="active"><a  href="${context}">Home</a></li>
				</c:when>
				<c:otherwise>
					<li>
						<a href="${context}">Home</a>
					</li>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${isEmploye}">
					<li class="active"><a  href="${context }/employes">Employes</a></li>
				</c:when>
				<c:otherwise>
					<li>
						<a href="${context }/employes">Employes</a>
					</li>
				</c:otherwise>
			</c:choose>
	     </ul>
	 </div>
	</nav>