<%@ include file="IncludeTop.jsp"%>

<table id="main-menu">
  <tr>
    <td>
      <a href='<c:url value="/shop/viewProduct.do">
        <c:param name="productId" value="${product.productId}"/></c:url>'>
        <b><font color="black" size="2">
          &lt;&lt; <c:out value="${product.name}" /></font></b></a>
    </td>
  </tr>
</table>
<p>
<div align="center">
  <table id="item">
    <tr>
      <td bgcolor="#FFFFFF">
      <div style="display:flex;width:100%;">
	      <div style="display:inline-block;width:60%">
	        <c:out value="${product.description}" escapeXml="false" />
	      </div>
	      <div style="display:inline-block;width:40%">
	      view : ${view.countview } like: ${view.countlike } 
	       
	      <c:if test="${!empty userSession.account.username}">
	      	<a href='<c:url value="/shop/likeUpdate.do">
	      		 <c:param name="itemId" value="${item.itemId}"/></c:url>'>
	      		 
	      			<img src="/jpetstore/images/NEW-IMG-HEART.png"/>
	      	</a>
	      </c:if> 
	      </div>
      </div>
      </td>
          </tr>
    <tr>
      <td width="100%" bgcolor="#CCCCCC"><b><c:out value="${item.itemId}" /></b></td>
    </tr>
    <tr>
      <td><b><font size="4"> 
        <c:out value="${item.attribute1}" />
        <c:out value="${item.attribute2}" /> 
        <c:out value="${item.attribute3}" />
        <c:out value="${item.attribute4}" /> 
        <c:out value="${item.attribute5}" />
        <c:out value="${product.name}" />
        </font></b></td>
    </tr>
    <tr>
      <td><font size="3"><i><c:out value="${product.name}" /></i></font></td>
    </tr>
    <tr>
      <td>
      <c:if test="${item.quantity <= 0}">
        <font color="red" size="2"><i>Back ordered.</i></font>
      </c:if> 
      <c:if test="${item.quantity > 0}">
        <font size="2"><fmt:formatNumber value="${item.quantity}" /> in stock.</font>
      </c:if>
      </td>
    </tr>
    <tr>
      <td><fmt:formatNumber value="${item.listPrice}" pattern="$#,##0.00" /></td>
    </tr>
    <tr>
      <td>
        <a href='<c:url value="/shop/addItemToCart.do">
          <c:param name="workingItemId" value="${item.itemId}"/></c:url>'>
          <img border="0" src="../images/button_add_to_cart.gif" alt="" /></a>
      </td>
    </tr>
  </table>
</div>

<%@ include file="IncludeBottom.jsp"%>
