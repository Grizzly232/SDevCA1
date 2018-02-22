
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.58*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="all" href=""""),_display_(/*14.51*/routes/*14.57*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*14.103*/("""">
        <link rel="stylesheet" media="all" href=""""),_display_(/*15.51*/routes/*15.57*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*15.107*/("""">
		<link rel="stylesheet" media="all" href=""""),_display_(/*16.45*/routes/*16.51*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.92*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
		"""),_display_(/*18.4*/scripts),format.raw/*18.11*/("""
	"""),format.raw/*19.2*/("""</head>
    <body>
		<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<div class="container-fluid head">
		<h1>JCMB Inc. Employee Management</h1>
		<h4>Work to live. Live to work. We'll make it easier.</h4>
	</div>
	<div class="container-fluid">
		<ul class="nav navbar-nav buttons">
			<li><a href=""""),_display_(/*30.18*/routes/*30.24*/.HomeController.index()),format.raw/*30.47*/("""">Home</a></li>
			<li><a href=""""),_display_(/*31.18*/routes/*31.24*/.HomeController.store()),format.raw/*31.47*/("""">Projects</a></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Log in 
				<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<input type="email" class="form-control" id="usr" placeholder="Email" required>
					<input type="password" class="form-control" id="usr" placeholder="Password" required>
					<button type="button" class="btn btn-default">Log in</button>
					<label class="form-check-label">
						<input type="checkbox" class="form-check-input"> Remember me
					</label>
					<h5>Not a member? <a href=""""),_display_(/*41.34*/routes/*41.40*/.HomeController.signup()),format.raw/*41.64*/("""">Register here</a></h5>
				</ul>
			</li>
		</ul>
	</div>
        """),format.raw/*47.32*/("""
        """),_display_(/*48.10*/content),format.raw/*48.17*/("""
	"""),format.raw/*49.2*/("""<div class="container-fluid footer">
		<h4>JCMB Inc. &copy 2018</h4>
		<a href="#">Back to top</a>
	</div>
		
		
		<script src=""""),_display_(/*55.17*/routes/*55.23*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*55.76*/(""""></script>
        <script src=""""),_display_(/*56.23*/routes/*56.29*/.Assets.versioned("javascripts/main.js")),format.raw/*56.69*/(""""></script>
        <script src=""""),_display_(/*57.23*/routes/*57.29*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*57.74*/(""""></script>
        <script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*58.78*/(""""></script>
		<script src=""""),_display_(/*59.17*/routes/*59.23*/.Assets.versioned("javascripts/main.js")),format.raw/*59.63*/(""""></script> 

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts) => (content) => apply(title,scripts)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 21 09:52:42 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/main.scala.html
                  HASH: 124d19e1ccbbddab50c9c5ed37f8628bc033544b
                  MATRIX: 1216->266|1367->322|1397->326|1480->434|1517->444|1552->452|1578->457|1665->517|1680->523|1748->569|1829->623|1844->629|1916->679|1991->727|2006->733|2068->774|2157->836|2172->842|2233->881|2266->888|2294->895|2324->898|2709->1256|2724->1262|2768->1285|2829->1319|2844->1325|2888->1348|3498->1931|3513->1937|3558->1961|3659->2125|3697->2136|3725->2143|3755->2146|3917->2281|3932->2287|4006->2340|4068->2375|4083->2381|4144->2421|4206->2456|4221->2462|4287->2507|4349->2542|4364->2548|4434->2597|4490->2626|4505->2632|4566->2672
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|50->19|61->30|61->30|61->30|62->31|62->31|62->31|72->41|72->41|72->41|77->47|78->48|78->48|79->49|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|88->58|88->58|88->58|89->59|89->59|89->59
                  -- GENERATED --
              */
          