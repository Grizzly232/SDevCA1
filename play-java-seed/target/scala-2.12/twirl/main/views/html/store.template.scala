
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

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.4*/(""" """),format.raw/*1.5*/("""<!Wayne Carruth X00138115 Michael Brady X0013103 Kevin Hoang x00137044>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("Game Commodities : Cart", scripts)/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 20 17:09:55 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/store.scala.html
                  HASH: 05226131a03b50fea0cbe56c8366ac189bc7b631
                  MATRIX: 941->1|1021->78|1035->85|1115->89|1143->91|1183->105|1197->111|1270->164|1382->249|1410->250|1452->265|1522->309|1550->310|1608->3|1635->4|1735->330|1764->333|1813->373|1853->375
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12
                  -- GENERATED --
              */
          