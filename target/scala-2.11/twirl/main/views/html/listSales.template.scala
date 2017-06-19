
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listSales_Scope0 {
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

class listSales extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[SaleEvent],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(saleEvents: List[SaleEvent], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("Active Sales")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

""")))}),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/content.css")),format.raw/*8.104*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(/*12.23*/routes/*12.29*/.HomeController.content),format.raw/*12.52*/("""" class="button"><en>Back</en></a>
        </header>
        <div style="text-align: center">
            """),_display_(/*15.14*/for(saleEvent <- saleEvents) yield /*15.42*/{_display_(Seq[Any](format.raw/*15.43*/("""
                """),_display_(/*16.18*/if(saleEvent.name.length() > 0)/*16.49*/ {_display_(Seq[Any](format.raw/*16.51*/("""
                    """),format.raw/*17.21*/("""<a style="color: white; margin-bottom: 10px" href=""""),_display_(/*17.73*/routes/*17.79*/.SaleController.saleInfo(saleEvent.ID)),format.raw/*17.117*/("""
                    """),format.raw/*18.21*/("""">"""),_display_(/*18.24*/saleEvent/*18.33*/.name),format.raw/*18.38*/("""</a><br>
                """)))}),format.raw/*19.18*/("""
            """)))}),format.raw/*20.14*/("""
        """),format.raw/*21.9*/("""</div>
    </body>
</html>"""))
      }
    }
  }

  def render(saleEvents:List[SaleEvent],user:User): play.twirl.api.HtmlFormat.Appendable = apply(saleEvents,user)

  def f:((List[SaleEvent],User) => play.twirl.api.HtmlFormat.Appendable) = (saleEvents,user) => apply(saleEvents,user)

  def ref: this.type = this

}


}

/**/
object listSales extends listSales_Scope0.listSales
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/listSales.scala.html
                  HASH: 6634d8d18451ce6f3c97b1188a4c162ac3aabdc3
                  MATRIX: 767->1|903->42|931->45|959->65|998->67|1030->70|1057->71|1154->142|1168->148|1233->192|1325->257|1340->263|1384->286|1518->393|1562->421|1601->422|1646->440|1686->471|1726->473|1775->494|1854->546|1869->552|1929->590|1978->611|2008->614|2026->623|2052->628|2109->654|2154->668|2190->677
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|39->8|39->8|39->8|43->12|43->12|43->12|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|50->19|51->20|52->21
                  -- GENERATED --
              */
          