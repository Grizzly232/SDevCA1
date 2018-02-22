
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(hello: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*4.75*/(""""></script>
	<script type="text/javascript">  
        $(document).ready(function () """),format.raw/*6.39*/("""{"""),format.raw/*6.40*/("""  
            """),format.raw/*7.13*/("""$('.dropdown-toggle').dropdown();  
        """),format.raw/*8.9*/("""}"""),format.raw/*8.10*/(""");  
   </script> 
""")))};
Seq[Any](format.raw/*1.17*/(""" """),format.raw/*1.18*/("""<!Michael Brady X00136103>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("JCMB Inc.", scripts)/*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
	"""),format.raw/*13.2*/("""<h1>"""),_display_(/*13.7*/hello),format.raw/*13.12*/("""</h1>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(hello:String): play.twirl.api.HtmlFormat.Appendable = apply(hello)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (hello) => apply(hello)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 21 17:02:49 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/index.scala.html
                  HASH: dfd298e0dae0d38e00c2a464c46dd64601f1a89f
                  MATRIX: 948->1|1041->48|1055->55|1135->59|1164->62|1204->76|1218->82|1291->135|1405->222|1433->223|1476->239|1547->284|1575->285|1636->16|1664->17|1721->307|1752->312|1787->338|1827->340|1857->343|1888->348|1914->353|1952->361
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12|47->13|47->13|47->13|48->14
                  -- GENERATED --
              */
          