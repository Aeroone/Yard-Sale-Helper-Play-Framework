
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object content_Scope0 {
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

class content extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User, ID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/main("Yard Sale - Home")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

""")))}),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE>s
<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/content.css")),format.raw/*10.104*/("""">
    </head>
    <body>
    <body>
        <header class="header">
            <dt>"""),_display_(/*15.18*/user/*15.22*/.email),format.raw/*15.28*/("""</dt>
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.editProfile()),format.raw/*16.58*/("""" style="font-size: 12px" class="button">Edit Profile</a>
            <a href=""""),_display_(/*17.23*/routes/*17.29*/.HomeController.logout()),format.raw/*17.53*/("""" style="font-size: 12px" class="button">Logout</a>
        </header>
        <h1 class="wel">Welcome, """),_display_(/*19.35*/user/*19.39*/.name),format.raw/*19.44*/("""!</h1>
        <h2 class="title">THE ULTIMATE YARD SALE HELPER</h2>
        <div>
         <dd class="links">
             """),_display_(/*23.15*/if(user.getAuthority().equals("Bookkeeper"))/*23.59*/ {_display_(Seq[Any](format.raw/*23.61*/("""
                 """),_display_(/*24.19*/if(SaleEvent.findSale(ID) != null)/*24.53*/ {_display_(Seq[Any](format.raw/*24.55*/("""
                     """),format.raw/*25.22*/("""<a href=""""),_display_(/*25.32*/routes/*25.38*/.TransactionController.bookTransactions(ID)),format.raw/*25.81*/(""""class="button">Transactions List</a>
                     <a href=""""),_display_(/*26.32*/routes/*26.38*/.SaleController.viewFinancialReport(ID)),format.raw/*26.77*/(""""class="button">Financial Report</a>
                 """)))}),format.raw/*27.19*/("""
                 """),_display_(/*28.19*/if(SaleEvent.findSale(ID) == null)/*28.53*/ {_display_(Seq[Any](format.raw/*28.55*/("""
                     """),format.raw/*29.22*/("""<p>
                         *** The sale has been deleted! ***
                     </p>
                 """)))}),format.raw/*32.19*/("""
             """)))}),format.raw/*33.15*/("""

             """),_display_(/*35.15*/if(user.getAuthority().equals("Cashier"))/*35.56*/ {_display_(Seq[Any](format.raw/*35.58*/("""
                 """),_display_(/*36.19*/if(SaleEvent.findSale(ID) != null)/*36.53*/ {_display_(Seq[Any](format.raw/*36.55*/("""
                     """),format.raw/*37.22*/("""<a href=""""),_display_(/*37.32*/routes/*37.38*/.ItemController.searchItem(ID)),format.raw/*37.68*/(""""class="button">Search all Items</a>
                     <a href=""""),_display_(/*38.32*/routes/*38.38*/.ItemController.addItem(ID)),format.raw/*38.65*/(""""class="button">Add Items</a>
                     <a href=""""),_display_(/*39.32*/routes/*39.38*/.TransactionController.listTransactions(ID)),format.raw/*39.81*/(""""class="button">View Transactions</a>
                 """)))}),format.raw/*40.19*/("""
                 """),_display_(/*41.19*/if(SaleEvent.findSale(ID) == null)/*41.53*/ {_display_(Seq[Any](format.raw/*41.55*/("""
                     """),format.raw/*42.22*/("""<p>
                         *** The sale has been deleted! ***
                     </p>
                 """)))}),format.raw/*45.19*/("""
             """)))}),format.raw/*46.15*/("""

             """),_display_(/*48.15*/if(user.getAuthority().equals("Clerk"))/*48.54*/ {_display_(Seq[Any](format.raw/*48.56*/("""
                 """),_display_(/*49.19*/if(SaleEvent.findSale(ID) != null)/*49.53*/ {_display_(Seq[Any](format.raw/*49.55*/("""
                     """),format.raw/*50.22*/("""<a href=""""),_display_(/*50.32*/routes/*50.38*/.ItemController.searchItem(ID)),format.raw/*50.68*/("""" class="button">Search all Items</a>
                 """)))}),format.raw/*51.19*/("""
                 """),_display_(/*52.19*/if(SaleEvent.findSale(ID) == null)/*52.53*/ {_display_(Seq[Any](format.raw/*52.55*/("""
                     """),format.raw/*53.22*/("""<p>
                         *** The sale has been deleted! ***
                     </p>
                 """)))}),format.raw/*56.19*/("""
             """)))}),format.raw/*57.15*/("""

             """),_display_(/*59.15*/if(user.getAuthority().equals("Seller"))/*59.55*/ {_display_(Seq[Any](format.raw/*59.57*/("""
                 """),_display_(/*60.19*/if(SaleEvent.findSale(ID) != null)/*60.53*/ {_display_(Seq[Any](format.raw/*60.55*/("""
                     """),format.raw/*61.22*/("""<a href=""""),_display_(/*61.32*/routes/*61.38*/.ItemController.searchItem(ID)),format.raw/*61.68*/("""" class="button">Search all Items</a>
                     <a href=""""),_display_(/*62.32*/routes/*62.38*/.SaleController.listSales()),format.raw/*62.65*/("""" class="button">View Active Sale Events</a>
                     <a href=""""),_display_(/*63.32*/routes/*63.38*/.ItemController.addItem(ID)),format.raw/*63.65*/("""" class="button">Add Item</a>
                 """)))}),format.raw/*64.19*/("""
                 """),_display_(/*65.19*/if(SaleEvent.findSale(ID) == null)/*65.53*/ {_display_(Seq[Any](format.raw/*65.55*/("""
                     """),format.raw/*66.22*/("""<p>
                         *** The sale has been deleted! ***
                     </p>
                 """)))}),format.raw/*69.19*/("""
             """)))}),format.raw/*70.15*/("""

             """),_display_(/*72.15*/if(user.getAuthority().equals("SuperUser"))/*72.58*/ {_display_(Seq[Any](format.raw/*72.60*/("""
                 """),format.raw/*73.18*/("""<a href=""""),_display_(/*73.28*/routes/*73.34*/.HomeController.logout()),format.raw/*73.58*/("""" class="button">Logout</a>
                 <a href=""""),_display_(/*74.28*/routes/*74.34*/.HomeController.editProfile()),format.raw/*74.63*/("""" class="button">Edit Profile</a>
                 <a href=""""),_display_(/*75.28*/routes/*75.34*/.SaleController.listSales()),format.raw/*75.61*/("""" class="button">View Active Sale Events</a>
                 <a href=""""),_display_(/*76.28*/routes/*76.34*/.SaleController.createSalePage()),format.raw/*76.66*/("""" class="button">Create New Sale Event</a>
                 <a href=""""),_display_(/*77.28*/routes/*77.34*/.UserController.searchUser()),format.raw/*77.62*/("""" class="button">List all users</a>
             """)))}),format.raw/*78.15*/("""

             """),_display_(/*80.15*/if(user.getAuthority().equals("Admin") || user.getAuthority().equals("Guest"))/*80.93*/ {_display_(Seq[Any](format.raw/*80.95*/("""
                 """),format.raw/*81.18*/("""<a href=""""),_display_(/*81.28*/routes/*81.34*/.SaleController.createSalePage()),format.raw/*81.66*/("""" class="button">Create New Sale Event</a>
                 <a href=""""),_display_(/*82.28*/routes/*82.34*/.SaleController.listSales()),format.raw/*82.61*/("""" class="button">View Active Sale Events</a>
             """)))}),format.raw/*83.15*/("""
         """),format.raw/*84.10*/("""</dd>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(user:User,ID:String): play.twirl.api.HtmlFormat.Appendable = apply(user,ID)

  def f:((User,String) => play.twirl.api.HtmlFormat.Appendable) = (user,ID) => apply(user,ID)

  def ref: this.type = this

}


}

/**/
object content extends content_Scope0.content
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:00 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/content.scala.html
                  HASH: 70089a299974fa8b7c510c7ece0c95734300c9d4
                  MATRIX: 754->1|873->25|901->28|933->52|972->54|1004->57|1031->58|1140->141|1154->147|1216->188|1299->244|1314->250|1380->294|1493->380|1506->384|1533->390|1588->418|1603->424|1653->453|1760->533|1775->539|1820->563|1951->667|1964->671|1990->676|2141->800|2194->844|2234->846|2280->865|2323->899|2363->901|2413->923|2450->933|2465->939|2529->982|2625->1051|2640->1057|2700->1096|2786->1151|2832->1170|2875->1204|2915->1206|2965->1228|3104->1336|3150->1351|3193->1367|3243->1408|3283->1410|3329->1429|3372->1463|3412->1465|3462->1487|3499->1497|3514->1503|3565->1533|3660->1601|3675->1607|3723->1634|3811->1695|3826->1701|3890->1744|3977->1800|4023->1819|4066->1853|4106->1855|4156->1877|4295->1985|4341->2000|4384->2016|4432->2055|4472->2057|4518->2076|4561->2110|4601->2112|4651->2134|4688->2144|4703->2150|4754->2180|4841->2236|4887->2255|4930->2289|4970->2291|5020->2313|5159->2421|5205->2436|5248->2452|5297->2492|5337->2494|5383->2513|5426->2547|5466->2549|5516->2571|5553->2581|5568->2587|5619->2617|5715->2686|5730->2692|5778->2719|5881->2795|5896->2801|5944->2828|6023->2876|6069->2895|6112->2929|6152->2931|6202->2953|6341->3061|6387->3076|6430->3092|6482->3135|6522->3137|6568->3155|6605->3165|6620->3171|6665->3195|6747->3250|6762->3256|6812->3285|6900->3346|6915->3352|6963->3379|7062->3451|7077->3457|7130->3489|7227->3559|7242->3565|7291->3593|7372->3643|7415->3659|7502->3737|7542->3739|7588->3757|7625->3767|7640->3773|7693->3805|7790->3875|7805->3881|7853->3908|7943->3967|7981->3977
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|40->9|40->9|40->9|41->10|41->10|41->10|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|63->32|64->33|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|76->45|77->46|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|87->56|88->57|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|96->65|96->65|96->65|97->66|100->69|101->70|103->72|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|111->80|111->80|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|114->83|115->84
                  -- GENERATED --
              */
          