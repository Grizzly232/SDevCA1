
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,models.Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, project: models.Project):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.versioned("javascripts/jquery-3.2.1.slim.js")),format.raw/*4.78*/(""""></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*6.43*/("""{"""),format.raw/*6.44*/("""
                """),format.raw/*7.17*/("""$('.dropdown-toggle').dropdown();
            """),format.raw/*8.13*/("""}"""),format.raw/*8.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.41*/(""" """),format.raw/*1.42*/("""<!Michael Brady X00136103>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("JCMB Inc. ".concat(project.getProjectName), scripts)/*12.60*/ {_display_(Seq[Any](format.raw/*12.62*/("""
    """),format.raw/*13.5*/("""<div class="wrapper">

    </div>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(name:String,project:models.Project): play.twirl.api.HtmlFormat.Appendable = apply(name,project)

  def f:((String,models.Project) => play.twirl.api.HtmlFormat.Appendable) = (name,project) => apply(name,project)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 04 10:47:23 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/project.scala.html
                  HASH: e05ba0d5368e93e536edcc60bd65e202254a8830
                  MATRIX: 965->1|1082->72|1096->79|1176->83|1208->89|1248->103|1262->109|1335->162|1454->254|1482->255|1527->273|1601->320|1629->321|1688->40|1716->41|1773->341|1804->346|1871->404|1911->406|1944->412|2012->450
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12|47->13|50->16
                  -- GENERATED --
              */
          