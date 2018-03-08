
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

  /**/
  def apply/*1.2*/(title: String, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="all" href=""""),_display_(/*7.51*/routes/*7.57*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*7.103*/("""">
        <link rel="stylesheet" media="all" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*8.107*/("""">
        <link rel="stylesheet" media="all" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.98*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
        """),_display_(/*11.10*/scripts),format.raw/*11.17*/("""
    """),format.raw/*12.5*/("""</head>
    <body>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <div class="container-fluid head">
            <h1>JCMB Inc. Employee Management</h1>
            <h4>Work to live. Live to work. We'll make it easier.</h4>
        </div>
        <div class="container-fluid">
            <ul class="nav navbar-nav buttons">
                <li><a href=""""),_display_(/*23.31*/routes/*23.37*/.HomeController.index()),format.raw/*23.60*/("""">Home</a></li>
                <li><a href=""""),_display_(/*24.31*/routes/*24.37*/.HomeController.projects()),format.raw/*24.63*/("""">Projects</a></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Log in
                    <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <input type="email" class="form-control" id="usr" placeholder="Email" required>
                        <input type="password" class="form-control" id="usr" placeholder="Password" required>
                        <button type="button" class="btn btn-default">Log in</button>
                        <label class="form-check-label">
                            <input type="checkbox" class="form-check-input"> Remember me
                        </label>
                    </ul>
                </li>
            </ul>
        </div>
        """),format.raw/*39.31*/("""
        """),_display_(/*40.10*/content),format.raw/*40.17*/("""
        """),format.raw/*41.9*/("""<div class="container-fluid footer">
            <h4>JCMB Inc. &copy 2018</h4>
            <a href="#">Back to top</a>
        </div>

        <script src=""""),_display_(/*46.23*/routes/*46.29*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*46.82*/(""""></script>
        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("javascripts/main.js")),format.raw/*47.69*/(""""></script>
        <script src=""""),_display_(/*48.23*/routes/*48.29*/.Assets.versioned("javascripts/bootstrap.js")),format.raw/*48.74*/(""""></script>
        <script src=""""),_display_(/*49.23*/routes/*49.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*49.78*/(""""></script>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.versioned("javascripts/main.js")),format.raw/*50.69*/(""""></script>

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
                  DATE: Tue Mar 06 17:25:52 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/main.scala.html
                  HASH: cfa92c0aa61f0d7a91dd3b2da3fec99c46b1a6f5
                  MATRIX: 957->1|1108->57|1136->59|1222->119|1247->124|1332->183|1346->189|1413->235|1492->288|1506->294|1577->344|1656->397|1670->403|1731->444|1819->505|1834->511|1895->550|1934->562|1962->569|1994->574|2445->998|2460->1004|2504->1027|2577->1073|2592->1079|2639->1105|3457->1984|3494->1994|3522->2001|3558->2010|3742->2167|3757->2173|3831->2226|3892->2260|3907->2266|3968->2306|4029->2340|4044->2346|4110->2391|4171->2425|4186->2431|4256->2480|4317->2514|4332->2520|4393->2560
                  LINES: 28->1|33->1|35->3|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|44->12|55->23|55->23|55->23|56->24|56->24|56->24|70->39|71->40|71->40|72->41|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50
                  -- GENERATED --
              */
          