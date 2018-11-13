<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  
    <title>Bootstrap contact form</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
     <link rel="shortcut icon" href="img/favicon (2).ico" type="image/x-icon">
<link rel="icon" href="img/favicon (2).ico" type="image/x-icon">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <h2 class="text-center" style="margin-top:30px;">Bootstrap contact form</h2>
    <div class="container" style="background-color: #3E5F68;margin-top:20px;color:#C8EFF0;">
    	
    	
        <div class="row">
          <div class="col-sm-12 text-center">
            <h2>Contact Us</h2>
          </div>
        </div>
        
        <div class="row">
          <div class="col-sm-8">
            <h3 class="white">Get In Touch</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            <br>
            
            <form id="contact-form" class="form-horizontal" role="form">
              <div class="form-group">
                <label for="name" class="col-12  col-lg-2  control-label">Name:</label>
                <div class="col-12  col-lg-10">
                  <input class="form-control" name="name" id="name" type="text">
                </div>
              </div>                  
              <div class="form-group">
                <label for="email" class="col-12  col-lg-2  control-label" style="color:white; ">Email:</label>
                <div class="col-12  col-lg-10">
                  <input class="form-control" name="email" id="email" type="email">
                </div>
              </div>
              <div class="form-group">
                <label for="message" class="col-12  col-lg-2  control-label">Message:</label>
                <div class="col-12  col-lg-10">
                  <textarea class="form-control" rows="7" name="message" id="message"></textarea>
                </div>
              </div>
              <div class="form-group">
                <div class="col-12  col-lg-2">&nbsp;</div>
                <div class="col-12  col-lg-10">
                  <button type="submit" class="btn btn-info btn-lg btn-full" style="background-color: #7d9298">Send</button>
                </div>
              </div>
            </form>
          </div><!--End Col 8-->
          
          <div class="col-sm-4">
                <form>
            <h3><span class="glyphicon glyphicon-globe"></span> Our office</h3>
            <address>
                <strong>Abc, Inc.</strong><br>
                XXX Ave, Suite yyy<br>
                city, state 00000<br>
                <abbr title="Phone">
                    P:</abbr>
                (123) 456-7890
            </address>
            <address>
                <strong>Email</strong><br>
                <a href="">email@example.com</a>
            </address>
            </form>
            <br>
            <h3>Find Us At</h3>
            <ul class="list-inline share-buttons">
           
	<li><a href="https://www.facebook.com/sharer/sharer.php?u=&t=" target="_blank" title="Share on facebook"><img src="img/flat_web_icon_set/color/Facebook.png"></a></li>
	<li><a href="https://twitter.com/intent/tweet?source=&text=:%20" target="_blank" title="Tweet"><img src="img/flat_web_icon_set/color/Twitter.png"></a></li>
	<li><a href="https://plus.google.com/share?url=" target="_blank" title="Share on Google+"><img src="img/flat_web_icon_set/color/GooglePlus.png"></a></li>
</ul>
              
            
          </div><!--End Col 4-->
        </div><!--End Row-->
        
      </div>
    </body>
</html>