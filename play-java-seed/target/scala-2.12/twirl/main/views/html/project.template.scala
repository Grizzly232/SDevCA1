
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.Project,List[models.Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, project: models.Project, collaborators: List[models.Employee]):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.79*/(""" """),format.raw/*1.80*/("""<!Michael Brady X00136103>

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main("JCMB Inc. ".concat(project.getProjectName), scripts)/*12.60*/ {_display_(Seq[Any](format.raw/*12.62*/("""
    """),format.raw/*13.5*/("""<div class="wrapper">
        <div class="container">
            <div class="well well-lg">
                <div class="row">
                    <img src=""""),_display_(/*17.32*/routes/*17.38*/.Assets.versioned("images/brain.jpg")),format.raw/*17.75*/("""">
                    <h1>"""),_display_(/*18.26*/project/*18.33*/.getProjectName),format.raw/*18.48*/("""</h1>
                    <h4>"""),_display_(/*19.26*/project/*19.33*/.getDescription),format.raw/*19.48*/("""</h4>
                </div>
                <div class="row">
                    <h1>Project Collaborators</h1>
                    <table class="table table-bordered">
                        <th>ID</th>
                        <th>Name</th>
                        """),_display_(/*26.26*/for(emp <- collaborators) yield /*26.51*/ {_display_(Seq[Any](format.raw/*26.53*/("""
                            """),format.raw/*27.29*/("""<tr>"""),_display_(/*27.34*/emp/*27.37*/.getEmp_id),format.raw/*27.47*/("""</tr>
                            <tr>"""),_display_(/*28.34*/emp/*28.37*/.getName),format.raw/*28.45*/("""</tr>
                        """)))}),format.raw/*29.26*/("""
                    """),format.raw/*30.21*/("""</table>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(name:String,project:models.Project,collaborators:List[models.Employee]): play.twirl.api.HtmlFormat.Appendable = apply(name,project,collaborators)

  def f:((String,models.Project,List[models.Employee]) => play.twirl.api.HtmlFormat.Appendable) = (name,project,collaborators) => apply(name,project,collaborators)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 06 17:25:52 GMT 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/app/views/project.scala.html
                  HASH: c2431025fe3ea24361994550b62dcc1d430f847d
                  MATRIX: 987->1|1142->108|1156->115|1236->119|1267->124|1307->138|1321->144|1394->197|1511->287|1539->288|1583->305|1656->351|1684->352|1741->78|1769->79|1824->370|1853->373|1920->431|1960->433|1992->438|2177->596|2192->602|2250->639|2305->667|2321->674|2357->689|2415->720|2431->727|2467->742|2764->1012|2805->1037|2845->1039|2902->1068|2934->1073|2946->1076|2977->1086|3043->1125|3055->1128|3084->1136|3146->1167|3195->1188|3303->1266
                  LINES: 28->1|32->3|32->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|39->8|39->8|42->1|42->1|44->10|46->12|46->12|46->12|47->13|51->17|51->17|51->17|52->18|52->18|52->18|53->19|53->19|53->19|60->26|60->26|60->26|61->27|61->27|61->27|61->27|62->28|62->28|62->28|63->29|64->30|69->35
                  -- GENERATED --
              */
          