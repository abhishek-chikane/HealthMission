<!DOCTYPE html>
<!--
-->
<%@page import="in.gov.pc.fyp.hm.ds.DSPeople"%>
<%@page import="java.util.List"%>
<%@page import="in.gov.pc.fyp.hm.objects.People"%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Health Mission</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/bootstrap-responsive.css" rel="stylesheet">
    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="ico/apple-touch-icon-57-precomposed.png">
	<link href='http://fonts.googleapis.com/css?family=Lato:300' rel='stylesheet' type='text/css'>
	
  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="index.jsp"><span class="color-highlight">Health</span>Mission</a>
          <div class="nav-collapse">
            <ul class="nav pull-right">
              <li class="active"><a href="index.jsp">Home</a></li>
              <li><a href="enroll.jsp">Enroll</a></li>
              <li><a href="immunization.jsp">Immunization</a></li>
			  <li><a href="janani.jsp">Janani Surksha</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    
	<div class="container">
		<div class="row">
        <div class="span12" align="cnter">
		<h1>Immunizations Due In 15 Days</h1>	
				<br>		
				<table border="0" width="100%">
					<tr>
							<td>
								First Name
							</td>
							<td>	
								Last Name
							</td>
							<td>	
								Aadhar Id
							</td>						
							<td>	
								Date Of Birth
							</td>
						</tr>
					<%						
						DSPeople dsPeople = new DSPeople();
						List<Object> data = dsPeople.getAll();						
						for(int i = 0 ; i < data.size() ; i++)
						{	
							People people = (People)data.get(i);
					%>
						<tr>
							<td>
								<%= people.getFirstName() %>
							</td>
							<td>	
								<%= people.getLastName() %>
							</td>
							<td>	
								<%= people.getAadharId() %>
							</td>						
							<td>	
								<%= people.getDateOfBirth() %>
							</td>						
						</tr>
					<%
						}
					%>	
				</table>
		</div>
	
    </div><!-- /container -->
    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap-transition.js"></script>
	<script src="js/bootstrap-carousel.js"></script>
    <script src="js/bootstrap-alert.js"></script>
    <script src="js/bootstrap-modal.js"></script>
    <script src="js/bootstrap-dropdown.js"></script>
    <script src="js/bootstrap-scrollspy.js"></script>
    <script src="js/bootstrap-tab.js"></script>
    <script src="js/bootstrap-tooltip.js"></script>
    <script src="js/bootstrap-popover.js"></script>
    <script src="js/bootstrap-button.js"></script>
    <script src="js/bootstrap-collapse.js"></script>
    <script src="js/bootstrap-typeahead.js"></script>
	<script src="js/jquery-ui-1.8.18.custom.min.js"></script>
	<script src="js/jquery.smooth-scroll.min.js"></script>
	<script src="js/lightbox.js"></script>
		<script>
$('.carousel').carousel({
  interval: 5000
})
</script>
  </body>
</html>
