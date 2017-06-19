
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchUniqueItem_Scope0 {
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

class searchUniqueItem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[controllers.ItemController.uniqueItem],User,SaleEvent,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.ItemController.uniqueItem], user: User, saleEvent: SaleEvent):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.91*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Search unique item")/*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""

    """),format.raw/*17.8*/("""

    """),format.raw/*21.7*/("""

    """),format.raw/*28.7*/("""
""")))}),format.raw/*29.2*/("""

"""),format.raw/*31.1*/("""<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*33.54*/routes/*33.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*33.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*34.54*/routes/*34.60*/.Assets.versioned("stylesheets/content.css")),format.raw/*34.104*/("""">
    </head>
    <body>
        <header id="header">
            <dt>"""),_display_(/*38.18*/user/*38.22*/.name),format.raw/*38.27*/(""" """),format.raw/*38.28*/("""<span>("""),_display_(/*38.36*/user/*38.40*/.email),format.raw/*38.46*/(""")</span></dt>
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.SaleController.saleInfo(saleEvent.ID)),format.raw/*39.67*/("""" style="font-size: 12px"
            class="button"><en>Back</en></a>
            <a href=""""),_display_(/*41.23*/routes/*41.29*/.HomeController.logout()),format.raw/*41.53*/("""" style="font-size: 12px" class="button">Logout</a>
        </header>

            """),format.raw/*54.15*/("""
        """),format.raw/*55.9*/("""<div class="form">
            <form action = """"),_display_(/*56.30*/routes/*56.36*/.ItemController.postsearchUniqueItem(saleEvent.ID)),format.raw/*56.86*/("""" method = "post">
                <h1>Search for Items</h1>

                <p>
                    Seller name:  """),_display_(/*60.36*/user/*60.40*/.name),format.raw/*60.45*/("""
                """),format.raw/*61.17*/("""</p>

                """),format.raw/*67.19*/("""

                """),format.raw/*69.17*/("""<p>
                    Item Name: <input type = "itemname" name="itemname">
                </p>

                """),format.raw/*77.19*/("""

                """),format.raw/*79.17*/("""<p>
                    <button class="button">Search Item</button>
                </p>
            </form>
        </div>

    </body>
</html>"""))
      }
    }
  }

  def render(userForm:Form[controllers.ItemController.uniqueItem],user:User,saleEvent:SaleEvent): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user,saleEvent)

  def f:((Form[controllers.ItemController.uniqueItem],User,SaleEvent) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user,saleEvent) => apply(userForm,user,saleEvent)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object searchUniqueItem extends searchUniqueItem_Scope0.searchUniqueItem
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:02 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/searchUniqueItem.scala.html
                  HASH: 02a4eb51e033e1582153fd5a231d66da866d3489
                  MATRIX: 908->95|1092->184|1121->380|1149->382|1184->408|1224->410|1257->539|1290->601|1323->783|1355->785|1384->787|1482->858|1497->864|1560->905|1643->961|1658->967|1724->1011|1823->1083|1836->1087|1862->1092|1891->1093|1926->1101|1939->1105|1966->1111|2029->1147|2044->1153|2103->1191|2223->1284|2238->1290|2283->1314|2394->1666|2430->1675|2505->1723|2520->1729|2591->1779|2735->1896|2748->1900|2774->1905|2819->1922|2869->2051|2915->2069|3058->2317|3104->2335
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|45->29|47->31|49->33|49->33|49->33|50->34|50->34|50->34|54->38|54->38|54->38|54->38|54->38|54->38|54->38|55->39|55->39|55->39|57->41|57->41|57->41|60->54|61->55|62->56|62->56|62->56|66->60|66->60|66->60|67->61|69->67|71->69|75->77|77->79
                  -- GENERATED --
              */
          