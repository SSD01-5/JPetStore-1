<%@ include file="IncludeTop.jsp"%>

<table id="main-menu">
  <tr>
    <td><a href='<c:url value="/shop/editAccount.do">
        <c:param name="categoryId" value="${product.categoryId}"/></c:url>'>
        <b><font color="black" size="2">
          &lt;&lt;MyAccount</font></b></a>
    </td>
  </tr>
</table>




<%@ include file="IncludeBottom.jsp"%>