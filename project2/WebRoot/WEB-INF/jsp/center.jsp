<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="${pageContext.request.contextPath}/bootstrap2.3.2/css/bootstrap.min.css" rel="stylesheet" />
    <title></title>
    <link href="${pageContext.request.contextPath}/css/Common.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/css/Index2.css" rel="stylesheet" />

</head>



<body>
    <div class="container-fluid">
        <div class="row-fluid">
            <h4>数据列表</h4>
            <div>
            	<form action="${pageContext.request.contextPath}/scust/queryByCondition.action" method="post">
            		 <div class="uinArea" id="uinArea">
						客户名称：
                	 <input type="text" id="cust_username" name="cust_name1" class="inputstyle"/>
                		客户类型：
               		<input type="text" id="cust_type" name="cust_type1" class="inputstyle"/>
               		<input type="submit" style="width:60px;" class="button_blue"></input>
                </div>
            	</form>
            	
            </div>
            <div class="add"><a class="btn btn-success" onclick="openadd();">新增</a></div>
            <div class="w">
                <div class="span12">
                    <table class="table table-condensed table-bordered table-hover tab">
                    
                        <thead>
                            <tr>
                                <th>客户名称</th>
                                <th>客户类型</th>
                                <th>客户电话</th>
                                <th>客户地址</th>
                                <th>所属用户角色</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody id="tbody">
                        <c:forEach  items="${custlist }"  var="cust">
                        	 <tr>
                                <th>${cust.cust_name }</th>
                                <th>${cust.cust_type }</th>
                                <th>${cust.cust_phone }</th>
                                <th>${cust.cust_address}</th>
                                <th>${cust.nickname}</th>
                                <!-- <th><a href="deleteById.action">删除</a></th> -->
                                <th><a href="${pageContext.request.contextPath }/scust/deleteCustById.action?cid=${cust.cid}">删除</a></th>
                            </tr>
                         </c:forEach> 
                        </tbody>
                    </table>
                    <div id="page" class="tr"></div>
                </div>
            </div>

            <div id="addModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h3 id="myModalLabel">添加客户</h3>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="addform" action="${pageContext.request.contextPath}/scust/addCust.action" method="post">
                        <div class="control-group">
                            <label class="control-label" for="userName">客户名称</label>
                            <div class="controls">
                                <input type="text" id="userName" placeholder="客户名称" name="cust_name">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="Chinese">客户类型</label>
                            <div class="controls">
                                <input type="text" id="Chinese" placeholder="客户类型" name="cust_type">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="Math">客户电话</label>
                            <div class="controls">
                                <input type="text" id="Math" placeholder="客户电话" name="cust_phone">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="English">客户地址</label>
                            <div class="controls">
                                <input type="text" id="English" placeholder="客户地址" name="cust_address">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="Chinese">所属用户角色</label>
                            <div class="controls">
                            <select name="cust_link_user" id="suser">
                            </select>

                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
                    <button class="btn btn-primary" id="add" onclick="addCust()" type="button">保存</button>
                </div>
            </div>
        </div>
    </div>
<script type="text/javascript">
function addCust() {
	var username=$("#userName").val();
	if(username==""){
		 alert("请输入客户名称!");
		 $("#userName").focus();
        return false;
	}
	
	var Chinese=$("#Chinese").val();
	if(Chinese==""){
		 alert("请输入客户类型!");
		 $("#Chinese").focus();
        return false;
	}
	
	var Math=$("#Math").val();
	if(Math==""){
		 alert("请输入客户电话!");
		 $("#Math").focus();
        return false;
	}
	 
	var English=$("#English").val();
	if(English==""){
		 alert("请输入客户地址!");
		 $("#English").focus();
        return false;
	}
	 $("#addform").submit();
	
}

</script>
    <script src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap2.3.2/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/Index2.js"></script>
</body>
</html>