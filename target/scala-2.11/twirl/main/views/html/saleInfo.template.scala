
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object saleInfo_Scope0 {
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

class saleInfo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[SaleEvent,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(saleEvent: SaleEvent):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Sale Info")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

""")))}),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/content.css")),format.raw/*9.104*/("""">
    </head>
    <body>

        <header id = "header">
            <a class="button" href=""""),_display_(/*14.38*/routes/*14.44*/.HomeController.content()),format.raw/*14.69*/("""">Home</a>
            <a href=""""),_display_(/*15.23*/routes/*15.29*/.SaleController.listSales()),format.raw/*15.56*/(""""class = "button" ><en>Back</en></a>
        </header>
        <div>
            <dl id="side-nav">
                <dd>
                    <a href=""""),_display_(/*20.31*/routes/*20.37*/.TransactionController.createTransactionPage(saleEvent.ID)),format.raw/*20.95*/("""">New Transaction</a>
                    <a href=""""),_display_(/*21.31*/routes/*21.37*/.TransactionController.listTransactions(saleEvent.ID)),format.raw/*21.90*/("""">View Transactions</a>
                    <a href=""""),_display_(/*22.31*/routes/*22.37*/.ItemController.addItem(saleEvent.ID)),format.raw/*22.74*/("""">Add Items</a>
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.ItemController.searchItem(saleEvent.ID)),format.raw/*23.77*/("""">Search all Items</a>
                    <a href=""""),_display_(/*24.31*/routes/*24.37*/.ItemController.searchUniqueItem(saleEvent.ID)),format.raw/*24.83*/("""">Search Unique Item</a>
                    <a href=""""),_display_(/*25.31*/routes/*25.37*/.ItemController.searchUnsoldedItem(saleEvent.ID)),format.raw/*25.85*/("""">Search Unsold Items</a>
                    <a href=""""),_display_(/*26.31*/routes/*26.37*/.UserController.assignAdmin(saleEvent.ID)),format.raw/*26.78*/("""">Assign Users</a>
                </dd>
            </dl>
        </div>
        <div class="sale-info-priv">
            <form action = """"),_display_(/*31.30*/routes/*31.36*/.SaleController.updateSale(saleEvent.ID)),format.raw/*31.76*/("""" method = "post">
                <h1>Edit Sale Event</h1>
                <p>
                    Name:  """),_display_(/*34.29*/saleEvent/*34.38*/.name),format.raw/*34.43*/("""
                """),format.raw/*35.17*/("""</p>

                <p>
                    Address: """),_display_(/*38.31*/saleEvent/*38.40*/.address),format.raw/*38.48*/("""
                """),format.raw/*39.17*/("""</p>

                <p>
                    Start Date: """),_display_(/*42.34*/saleEvent/*42.43*/.startDate),format.raw/*42.53*/("""
                """),format.raw/*43.17*/("""</p>

                <p>
                    End Date: """),_display_(/*46.32*/saleEvent/*46.41*/.endDate),format.raw/*46.49*/("""
                """),format.raw/*47.17*/("""</p>

                <p>
                    Name: <input type="text" name="name">
                </p>

                <p>
                    Address:  <input type="text" name="address">
                </p>

                <p>
                    Start Date: <input type="date" name="startDate">
                </p>
                <p>
                    End Date: <input type="date" name="endDate">
                </p>
                <p>
                    <button class="button">Update</button>
                </p>
            </form>
            <form action = """"),_display_(/*67.30*/routes/*67.36*/.HomeController.content),format.raw/*67.59*/("""" method = "get">
                <p>
                    <button class="button">Cancel</button>
                </p>
            </form>
            <form action = """"),_display_(/*72.30*/routes/*72.36*/.SaleController.deleteSale(saleEvent.ID)),format.raw/*72.76*/("""" method = "post">
                <p>
                    <button class="button">Delete</button>
                </p>
            </form>
        </div>

    </body>

</html>"""))
      }
    }
  }

  def render(saleEvent:SaleEvent): play.twirl.api.HtmlFormat.Appendable = apply(saleEvent)

  def f:((SaleEvent) => play.twirl.api.HtmlFormat.Appendable) = (saleEvent) => apply(saleEvent)

  def ref: this.type = this

}


}

/**/
object saleInfo extends saleInfo_Scope0.saleInfo
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/saleInfo.scala.html
                  HASH: 2428f7012c8446d464bce7eecdc443658e06fdf4
                  MATRIX: 754->1|871->23|899->26|924->43|963->45|995->48|1022->49|1119->120|1133->126|1195->167|1277->223|1291->229|1356->273|1478->368|1493->374|1539->399|1599->432|1614->438|1662->465|1840->616|1855->622|1934->680|2013->732|2028->738|2102->791|2183->845|2198->851|2256->888|2329->934|2344->940|2405->980|2485->1033|2500->1039|2567->1085|2649->1140|2664->1146|2733->1194|2816->1250|2831->1256|2893->1297|3060->1437|3075->1443|3136->1483|3271->1591|3289->1600|3315->1605|3360->1622|3443->1678|3461->1687|3490->1695|3535->1712|3621->1771|3639->1780|3670->1790|3715->1807|3799->1864|3817->1873|3846->1881|3891->1898|4496->2476|4511->2482|4555->2505|4749->2672|4764->2678|4825->2718
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|39->8|39->8|39->8|40->9|40->9|40->9|45->14|45->14|45->14|46->15|46->15|46->15|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|62->31|62->31|62->31|65->34|65->34|65->34|66->35|69->38|69->38|69->38|70->39|73->42|73->42|73->42|74->43|77->46|77->46|77->46|78->47|98->67|98->67|98->67|103->72|103->72|103->72
                  -- GENERATED --
              */
          