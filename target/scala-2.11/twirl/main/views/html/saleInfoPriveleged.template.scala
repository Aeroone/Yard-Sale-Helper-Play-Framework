
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object saleInfoPriveleged_Scope0 {
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

class saleInfoPriveleged extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[SaleEvent,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(saleEvent: SaleEvent):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Sale Info")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

""")))}),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<html>
    <style type = "text/css">
    </style>
  <head>
      <link rel="stylesheet" media="screen" href=""""),_display_(/*10.52*/routes/*10.58*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.99*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*11.52*/routes/*11.58*/.Assets.versioned("stylesheets/content.css")),format.raw/*11.102*/("""">
  </head>

<body>

  <header id = "header">
      <a href=""""),_display_(/*17.17*/routes/*17.23*/.HomeController.content()),format.raw/*17.48*/("""" class = "button">Home</a>
      <a href=""""),_display_(/*18.17*/routes/*18.23*/.SaleController.listSales()),format.raw/*18.50*/("""" class = "button"><en>Back</en></a>
  </header>
    <div>
    <dl id="side-nav">
      <dd>
        <a href=""""),_display_(/*23.19*/routes/*23.25*/.SaleController.viewFinancialReport(saleEvent.ID)),format.raw/*23.74*/("""">View Financial Report</a>
        <a href=""""),_display_(/*24.19*/routes/*24.25*/.SaleController.viewAltFinancialReport(saleEvent.ID)),format.raw/*24.77*/("""">View Alternative Financial Report</a>
        <a href=""""),_display_(/*25.19*/routes/*25.25*/.TransactionController.createTransactionPage(saleEvent.ID)),format.raw/*25.83*/("""">New Transaction</a>
        <a href=""""),_display_(/*26.19*/routes/*26.25*/.TransactionController.listTransactions(saleEvent.ID)),format.raw/*26.78*/("""">View Transactions</a>
        <a href=""""),_display_(/*27.19*/routes/*27.25*/.ItemController.addItem(saleEvent.ID)),format.raw/*27.62*/("""">Add Items</a>
        <a href=""""),_display_(/*28.19*/routes/*28.25*/.ItemController.searchItem(saleEvent.ID)),format.raw/*28.65*/("""">Search all Items</a>
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.ItemController.searchUniqueItem(saleEvent.ID)),format.raw/*29.71*/("""">Search Unique Item</a>
        <a href=""""),_display_(/*30.19*/routes/*30.25*/.ItemController.searchUnsoldedItem(saleEvent.ID)),format.raw/*30.73*/("""">Search Unsold Items</a>
        <a href=""""),_display_(/*31.19*/routes/*31.25*/.UserController.assignAdmin(saleEvent.ID)),format.raw/*31.66*/("""">Assign Users</a>
        <a href=""""),_display_(/*32.19*/routes/*32.25*/.ItemController.printTags(saleEvent.ID)),format.raw/*32.64*/("""">Print Tags</a>
      </dd>
    </dl>
  </div>
  <div class="sale-info-priv">
        <form action = """"),_display_(/*37.26*/routes/*37.32*/.SaleController.updateSale(saleEvent.ID)),format.raw/*37.72*/("""" method = "post">
          <h1>Edit Sale Event</h1>
          <p>
            Name:  """),_display_(/*40.21*/saleEvent/*40.30*/.name),format.raw/*40.35*/("""
          """),format.raw/*41.11*/("""</p>

          <p>
            Address: """),_display_(/*44.23*/saleEvent/*44.32*/.address),format.raw/*44.40*/("""
          """),format.raw/*45.11*/("""</p>

          <p>
            Start Date: """),_display_(/*48.26*/saleEvent/*48.35*/.startDate),format.raw/*48.45*/("""
          """),format.raw/*49.11*/("""</p>

          <p>
            End Date: """),_display_(/*52.24*/saleEvent/*52.33*/.endDate),format.raw/*52.41*/("""
          """),format.raw/*53.11*/("""</p>

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
          <form action = """"),_display_(/*72.28*/routes/*72.34*/.HomeController.content),format.raw/*72.57*/("""" method = "get">
              <p>
                  <button class="button">Cancel</button>
              </p>
          </form>
          <form action = """"),_display_(/*77.28*/routes/*77.34*/.SaleController.deleteSale(saleEvent.ID)),format.raw/*77.74*/("""" method = "post">
              <p>
                  <button class="button">Delete</button>
              </p>
          </form>
          <form action = """"),_display_(/*82.28*/routes/*82.34*/.SaleController.closeSale(saleEvent.ID)),format.raw/*82.73*/("""" method = "post">
              <p>
              """),_display_(/*84.16*/if(saleEvent.isClosed())/*84.40*/ {_display_(Seq[Any](format.raw/*84.42*/("""
                  """),format.raw/*85.19*/("""<button class="button">Open</button>
              """)))}/*86.17*/else/*86.22*/{_display_(Seq[Any](format.raw/*86.23*/("""
                  """),format.raw/*87.19*/("""<button class="button">Close</button>
              """)))}),format.raw/*88.16*/("""
              """),format.raw/*89.15*/("""</p>
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
object saleInfoPriveleged extends saleInfoPriveleged_Scope0.saleInfoPriveleged
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/saleInfoPriveleged.scala.html
                  HASH: eb843751c552b69ce23cd30e55c333af52d29c42
                  MATRIX: 774->1|891->23|919->26|944->43|983->45|1015->48|1042->49|1179->159|1194->165|1256->206|1337->260|1352->266|1418->310|1508->373|1523->379|1569->404|1640->448|1655->454|1703->481|1841->592|1856->598|1926->647|1999->693|2014->699|2087->751|2172->809|2187->815|2266->873|2333->913|2348->919|2422->972|2491->1014|2506->1020|2564->1057|2625->1091|2640->1097|2701->1137|2769->1178|2784->1184|2851->1230|2921->1273|2936->1279|3005->1327|3076->1371|3091->1377|3153->1418|3217->1455|3232->1461|3292->1500|3423->1604|3438->1610|3499->1650|3614->1738|3632->1747|3658->1752|3697->1763|3766->1805|3784->1814|3813->1822|3852->1833|3924->1878|3942->1887|3973->1897|4012->1908|4082->1951|4100->1960|4129->1968|4168->1979|4666->2450|4681->2456|4725->2479|4909->2636|4924->2642|4985->2682|5170->2840|5185->2846|5245->2885|5324->2937|5357->2961|5397->2963|5444->2982|5515->3035|5528->3040|5567->3041|5614->3060|5698->3113|5741->3128
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|49->18|49->18|49->18|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|68->37|68->37|68->37|71->40|71->40|71->40|72->41|75->44|75->44|75->44|76->45|79->48|79->48|79->48|80->49|83->52|83->52|83->52|84->53|103->72|103->72|103->72|108->77|108->77|108->77|113->82|113->82|113->82|115->84|115->84|115->84|116->85|117->86|117->86|117->86|118->87|119->88|120->89
                  -- GENERATED --
              */
          