<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">



<div class="page-header">

    <h1 align="center" >All Products</h1>
    <p align="center">All Awesome Products are available now!!!!!</p>


    <table class="table table-striped table-hover">

        <thead>
        <tr class="bg-success">
            <th>Photo Thumb</th>
            <th>Product Name</th>
            <th>Catagory</th>
            <th>Condition</th>
            <th>Price</th>

        </tr>

        <c:forEach items="${product}" var="product">
        <tr>

          <td><img src="#" alt="image" /></td>
          <td>${product.productName}</td>
          <td>${product.productCatagory}</td>
          <td>${product.productCondition}</td>
          <td>${product.productPrice} USD</td>

        </tr>
        </c:forEach>

        </thead>

    </table>
</div>


 <%@include file="/WEB-INF/views/template/footer.jsp"%>
