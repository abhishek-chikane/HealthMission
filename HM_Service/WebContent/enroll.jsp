<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Enroll</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	
	<script>
		
	</script>
	
    <!-- Le styles -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <style type="text/css">

    </style>
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
              <li ><a href="index.jsp">Home</a></li>
              <li class="active" ><a href="enroll.jsp">Enroll</a></li>
              <li ><a href="immunization.jsp">Immunization</a></li>
			  <li><a href="janani.jsp">Janani Surksha</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    
	<div class="container">
	<hr>
      <div class="row">
        <div class="span12">
		<h1>Enroll</h1>
			<form name="enrollmentForm" class="well" method="post" action="AddPeople">
				<table border="0" width="100%">
					<tr align="center">
						<td>
							<input name="firstName" type="text" class="span4" placeholder="First Name">
						</td>
						<td>
							<input name="address1" type="text" class="span4" placeholder="Address 1">
						</td>
					</tr>
					<tr align="center">
						<td>
							<input name="lastName" type="text" class="span4" placeholder="Last Name">							
						</td>
						<td>
							<input name="address2" type="text" class="span4" placeholder="Address 2">
						</td>
					</tr>
					<tr align="center">
						<td>
							<input name="middleName" type="text" class="span4" placeholder="Middle Name">
						</td>
						<td>
							<input name="area" type="text" class="span4" placeholder="Area">
						</td>
					</tr>
					<tr align="center">
						<td>
							<input name="aadharId" type="text" class="span4" placeholder="Aadhar Id">							
						</td>
						<td>
							<input name="city" type="text" class="span4" placeholder="City">
						</td>
					</tr>
					<tr align="center">
						<td>
							Date Of Birth <br>
							<input name="dateOfBirth" type="date" class="span4" placeholder="Date Of Birth">						
						</td>
						<td>
							<input name="taluka" type="text" class="span4" placeholder="Taluka">
						</td>
					</tr>
					<tr align="center">
						<td>
							<select name="type" class="span4_select">
								<option id="Mother">Mother</option>
								<option id="Child">Child</option>
							</select>
						</td>
						<td>
							<input name="taluka" type="text" class="span4" placeholder="Taluka">
						</td>
					</tr>
					<tr align="center">
						<td>
							Date Of Conception <br>
							<input name="dateOfConception" type="date" class="span4" placeholder="Date Of Conception">
						</td>
						<td>
							<input name="district" type="text" class="span4" placeholder="District">
						</td>
					</tr>
					<tr align="center">
						<td>
							&nbsp;
						</td>
						<td>
							<input name="state" type="text" class="span4" placeholder="State">
						</td>
					</tr>
					<tr align="center">
						<td>
							&nbsp;
						</td>
						<td>
							<input name="pin" type="text" class="span4" placeholder="Pin">
						</td>
					</tr>
					<tr align="center">
						<td colspan="2">
							<button type="submit" class="btn">Enroll</button>
						</td>
					</tr>
				</table>
			</form>
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
	<script src="js/healthMission.js"></script>
  </body>
</html>
