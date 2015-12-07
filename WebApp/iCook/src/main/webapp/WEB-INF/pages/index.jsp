<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
	<meta name="decorator" content="no" />
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>iCook</title>

    <!-- Bootstrap -->
    <link href='<c:url value="/resources/user_page/css/bootstrap.min.css"></c:url>' rel="stylesheet">
    <link href='<c:url value="/resources/user_page/css/bootstrap-theme.min.css"></c:url>' rel="stylesheet">
    <link href="<c:url value="/resources/user_page/css/font-awesome.min.css"></c:url>" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user_page/css/style.css"></c:url>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/user_page/css/initload.css"></c:url>">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  <header id="home">
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Excercise</a>
      </div>
    
      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav navbar-right">
          <li class="active"><a href="#home">Trang Chủ</a></li>
          <li><a href="/iCook/Admin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </ul>
      </div><!-- /.navbar-collapse -->
      </div>
    </nav>  

    <div id="home-slider" class="carousel slide carousel-fade" data-ride="carousel">
      <div class="carousel-inner">
        <div class="item active" style="background:#fff url('<c:url value="/resources/user_page/images/bg_search_result.jpg"></c:url>') bottom no-repeat;">
          <div class="caption-search">
            <div class="container">
              <form action="">
                <div class="row">
                  <div id="form-search"class="form-search col-sm-6 col-md-4 col-sm-offset-2 col-md-offset-3">
					<button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Tutorials
				    <span class="caret"></span></button>
				    <ul id="category" class="dropdown-menu" role="menu" aria-labelledby="menu1">
				      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">HTML</a></li>
				    </ul>
                  </div>
                  <div id="search-button-container" class="form-button col-md-2 col-md-offset-1">
                    <a id="search-button" data-scroll class="animated " href="#search-result-container">
                      <img src="<c:url value="/resources/user_page/images/search.png"></c:url>" class="img-responsive" alt="Image" width="80px">
                    </a>
                  </div>
                </div>
              </form>
            </div> 
          </div>
        </div>
      </div>
    </div><!--/#home-slider--> 
  </header><!--/#home-->
    <div id="search-result-container" class="search-bacground">
      <div class="pattern">
        <div  class="container">
          <div class="search-container">
              <div class="row">
				<ul id="search-result" class="list-group">
			      <li class="list-group-item">
			      	<h3>Title</h3>
			      	<p>description</p>
			      </li>
			      <li class="list-group-item">Item 2</li>
			      <li class="list-group-item">Item 3</li>
    			</ul>
              </div><!-- /.row -->
          </div> 
          <div class="col-md-offset-6">
            <div id="loading"></div>
          </div>
        </div>
      </div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value="/resources/user_page/js/bootstrap.js"></c:url>"></script>
    <script src="<c:url value="/resources/user_page/js/newinput-content.js"></c:url>"></script>
    <script src="<c:url value="/resources/user_page/js/scroll.js"></c:url>"></script>
    <script src="<c:url value="/resources/user_page/js/initload.js"></c:url>"></script>
    
  </body>
</html>
