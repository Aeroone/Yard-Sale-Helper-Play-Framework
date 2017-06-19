
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchUnsoldedItem_Scope0 {
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

class searchUnsoldedItem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[controllers.ItemController.ItemID],List[models.Item],User,SaleEvent,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.ItemController.ItemID], itemList: List[models.Item], user: User, saleEvent: SaleEvent):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.116*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Edited web")/*12.20*/ {_display_(Seq[Any](format.raw/*12.22*/("""

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
        <header class = "header">
            <dl id="user">
                <dt>"""),_display_(/*39.22*/user/*39.26*/.name),format.raw/*39.31*/(""" """),format.raw/*39.32*/("""<span>("""),_display_(/*39.40*/user/*39.44*/.email),format.raw/*39.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(/*41.31*/routes/*41.37*/.HomeController.logout()),format.raw/*41.61*/("""">Logout</a>
                    <a href=""""),_display_(/*42.31*/routes/*42.37*/.HomeController.content()),format.raw/*42.62*/("""" id="logo"><en>Back</en></a>
            </dl>
        </header>

        <ul style="color: white; font-family: 'Rockwell Extra Bold'">
            """),_display_(/*47.14*/for(item <- itemList) yield /*47.35*/ {_display_(Seq[Any](format.raw/*47.37*/("""
                """),format.raw/*48.17*/("""<p>
                    StockId: """),_display_(/*49.31*/item/*49.35*/.getId()),format.raw/*49.43*/("""
                """),format.raw/*50.17*/("""</p>
                <p>
                  Name: """),_display_(/*52.26*/item/*52.30*/.getName()),format.raw/*52.40*/("""
                """),format.raw/*53.17*/("""</p>
                <p>
                  Location: """),_display_(/*55.30*/item/*55.34*/.getLocation()),format.raw/*55.48*/("""
                """),format.raw/*56.17*/("""</p>
                <p>
                  Description: """),_display_(/*58.33*/item/*58.37*/.getDescription()),format.raw/*58.54*/("""
                """),format.raw/*59.17*/("""</p>
                <p>
                  Price: """),_display_(/*61.27*/item/*61.31*/.getPrice()),format.raw/*61.42*/("""
                """),format.raw/*62.17*/("""</p>
                <p>
                    Quantity: """),_display_(/*64.32*/item/*64.36*/.getQuantity()),format.raw/*64.50*/("""
                """),format.raw/*65.17*/("""</p>
                """),_display_(/*66.18*/if(item.getPhoto() != null)/*66.45*/ {_display_(Seq[Any](format.raw/*66.47*/("""
                    """),format.raw/*67.21*/("""<img src=""""),_display_(/*67.32*/routes/*67.38*/.ItemController.getImage(item.getId())),format.raw/*67.76*/(""""/>
                """)))}),format.raw/*68.18*/("""
            """)))}),format.raw/*69.14*/("""
        """),format.raw/*70.9*/("""</ul>

    </body>
</html>"""))
      }
    }
  }

  def render(userForm:Form[controllers.ItemController.ItemID],itemList:List[models.Item],user:User,saleEvent:SaleEvent): play.twirl.api.HtmlFormat.Appendable = apply(userForm,itemList,user,saleEvent)

  def f:((Form[controllers.ItemController.ItemID],List[models.Item],User,SaleEvent) => play.twirl.api.HtmlFormat.Appendable) = (userForm,itemList,user,saleEvent) => apply(userForm,itemList,user,saleEvent)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object searchUnsoldedItem extends searchUnsoldedItem_Scope0.searchUnsoldedItem
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:02 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/searchUnsoldedItem.scala.html
                  HASH: 7822936f47332ef09277a63c2bbbe973722ef32e
                  MATRIX: 926->95|1136->209|1165->405|1193->407|1220->425|1260->427|1293->556|1326->618|1359->800|1391->802|1420->804|1518->875|1533->881|1596->922|1679->978|1694->984|1760->1028|1895->1136|1908->1140|1934->1145|1963->1146|1998->1154|2011->1158|2038->1164|2130->1229|2145->1235|2190->1259|2260->1302|2275->1308|2321->1333|2498->1483|2535->1504|2575->1506|2620->1523|2681->1557|2694->1561|2723->1569|2768->1586|2845->1636|2858->1640|2889->1650|2934->1667|3015->1721|3028->1725|3063->1739|3108->1756|3192->1813|3205->1817|3243->1834|3288->1851|3366->1902|3379->1906|3411->1917|3456->1934|3539->1990|3552->1994|3587->2008|3632->2025|3681->2047|3717->2074|3757->2076|3806->2097|3844->2108|3859->2114|3918->2152|3970->2173|4015->2187|4051->2196
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|45->29|47->31|49->33|49->33|49->33|50->34|50->34|50->34|55->39|55->39|55->39|55->39|55->39|55->39|55->39|57->41|57->41|57->41|58->42|58->42|58->42|63->47|63->47|63->47|64->48|65->49|65->49|65->49|66->50|68->52|68->52|68->52|69->53|71->55|71->55|71->55|72->56|74->58|74->58|74->58|75->59|77->61|77->61|77->61|78->62|80->64|80->64|80->64|81->65|82->66|82->66|82->66|83->67|83->67|83->67|83->67|84->68|85->69|86->70
                  -- GENERATED --
              */
          