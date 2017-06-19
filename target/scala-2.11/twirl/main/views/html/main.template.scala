
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<div id="title_text">
            <title>"""),_display_(/*15.21*/title),format.raw/*15.26*/("""</title>
        </div>
        """),format.raw/*36.11*/("""

    """),format.raw/*38.5*/("""</head>
    <body>
            """),format.raw/*41.36*/("""


    """),format.raw/*44.5*/("""</body>
    <header>
        """),format.raw/*53.11*/("""
    """),format.raw/*54.5*/("""</header>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/main.scala.html
                  HASH: 2551a7f9b4e5eb0a9b4527cb34906106c013c7bd
                  MATRIX: 1002->260|1127->290|1155->292|1279->389|1294->395|1357->436|1396->500|1432->509|1501->551|1527->556|1587->1207|1620->1213|1679->1338|1713->1345|1770->1560|1802->1565
                  LINES: 32->7|37->7|39->9|42->12|42->12|42->12|43->13|44->14|45->15|45->15|47->36|49->38|51->41|54->44|56->53|57->54
                  -- GENERATED --
              */
          