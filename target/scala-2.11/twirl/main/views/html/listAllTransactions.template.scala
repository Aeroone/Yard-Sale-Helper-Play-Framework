
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listAllTransactions_Scope0 {
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

class listAllTransactions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Transaction],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(transactions: List[Transaction]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Active Sales")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

""")))}),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<html>
    <style>
        button
        """),format.raw/*9.9*/("""{"""),format.raw/*9.10*/("""
        """),format.raw/*10.9*/("""position:absolute;
        left: 0%;
        top: 60%;
        margin-top: 10px;
        margin-bottom: 1px;
        font-family: inherit;
        color: white;
        background: #6495ED;
        outline: none;
        border: none;
        padding: 5px 15px;
        font-size: 1.0em;
        font-weight: 400;
        border-radius: 3px;
        box-shadow: 0px 0px 10px rgba(40, 40, 40, 0.4);
        cursor: pointer;
        transition: all 0.15s ease-in-out;
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""
    """),format.raw/*28.5*/("""</style>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*30.54*/routes/*30.60*/.Assets.versioned("stylesheets/content.css")),format.raw/*30.104*/("""">
    </head>
    <body>
        <header>
        <a href=""""),_display_(/*34.19*/routes/*34.25*/.HomeController.content()),format.raw/*34.50*/("""">Back</a>
        </header>
            """),_display_(/*36.14*/for(transaction <- transactions) yield /*36.46*/{_display_(Seq[Any](format.raw/*36.47*/("""
                """),format.raw/*37.17*/("""<p>
                    ID: """),_display_(/*38.26*/transaction/*38.37*/.getId()),format.raw/*38.45*/("""
                """),format.raw/*39.17*/("""</p>
                <p>
                    SaleEvent: """),_display_(/*41.33*/transaction/*41.44*/.getSaleEventID()),format.raw/*41.61*/("""
                """),format.raw/*42.17*/("""</p>
                <p>
                    Date: """),_display_(/*44.28*/transaction/*44.39*/.getDate()),format.raw/*44.49*/("""
                """),format.raw/*45.17*/("""</p>
            """)))}),format.raw/*46.14*/("""
    """),format.raw/*47.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(transactions:List[Transaction]): play.twirl.api.HtmlFormat.Appendable = apply(transactions)

  def f:((List[Transaction]) => play.twirl.api.HtmlFormat.Appendable) = (transactions) => apply(transactions)

  def ref: this.type = this

}


}

/**/
object listAllTransactions extends listAllTransactions_Scope0.listAllTransactions
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/listAllTransactions.scala.html
                  HASH: f517186320269cd136b3f0511866e65b3b679cbd
                  MATRIX: 784->1|912->34|940->37|968->57|1007->59|1039->62|1066->63|1134->105|1162->106|1198->115|1695->585|1723->586|1755->591|1855->664|1870->670|1936->714|2024->775|2039->781|2085->806|2154->848|2202->880|2241->881|2286->898|2342->927|2362->938|2391->946|2436->963|2520->1020|2540->1031|2578->1048|2623->1065|2702->1117|2722->1128|2753->1138|2798->1155|2847->1173|2879->1178
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|40->9|40->9|41->10|58->27|58->27|59->28|61->30|61->30|61->30|65->34|65->34|65->34|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|72->41|72->41|72->41|73->42|75->44|75->44|75->44|76->45|77->46|78->47
                  -- GENERATED --
              */
          