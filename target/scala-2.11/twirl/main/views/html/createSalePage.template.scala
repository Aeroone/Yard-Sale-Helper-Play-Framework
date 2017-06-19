
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createSalePage_Scope0 {
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

class createSalePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*5.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.14*/("""

"""),format.raw/*11.3*/("""
"""),_display_(/*12.2*/main("Create New Sale")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""

    """),format.raw/*17.7*/("""

    """),format.raw/*21.7*/("""
""")))}),format.raw/*22.2*/("""
"""),format.raw/*23.1*/("""<!DOCTYPE>
<html>
    """),format.raw/*25.32*/("""

    """),format.raw/*27.22*/("""
    """),format.raw/*28.10*/("""
        """),format.raw/*29.31*/("""
        """),format.raw/*30.23*/("""
        """),format.raw/*31.22*/("""
        """),format.raw/*32.32*/("""
        """),format.raw/*33.31*/("""

        """),format.raw/*35.24*/("""
        """),format.raw/*36.25*/("""
        """),format.raw/*37.26*/("""
        """),format.raw/*38.31*/("""
        """),format.raw/*39.32*/("""
        """),format.raw/*40.31*/("""
        """),format.raw/*41.32*/("""
        """),format.raw/*42.60*/("""
    """),format.raw/*43.10*/("""

    """),format.raw/*45.10*/("""
    """),format.raw/*46.10*/("""
        """),format.raw/*47.31*/("""
    """),format.raw/*48.10*/("""

    """),format.raw/*50.16*/("""
    """),format.raw/*51.10*/("""
        """),format.raw/*52.24*/("""
        """),format.raw/*53.24*/("""
        """),format.raw/*54.24*/("""
        """),format.raw/*55.31*/("""
        """),format.raw/*56.31*/("""
        """),format.raw/*57.23*/("""
        """),format.raw/*58.22*/("""
        """),format.raw/*59.30*/("""
        """),format.raw/*60.29*/("""

    """),format.raw/*62.10*/("""

    """),format.raw/*64.15*/("""
    """),format.raw/*65.10*/("""
        """),format.raw/*66.31*/("""
        """),format.raw/*67.23*/("""
        """),format.raw/*68.22*/("""
        """),format.raw/*69.30*/("""
        """),format.raw/*70.32*/("""
        """),format.raw/*71.34*/("""
        """),format.raw/*72.26*/("""
        """),format.raw/*73.33*/("""
        """),format.raw/*74.27*/("""
        """),format.raw/*75.26*/("""
        """),format.raw/*76.31*/("""
        """),format.raw/*77.30*/("""
        """),format.raw/*78.30*/("""
        """),format.raw/*79.32*/("""
        """),format.raw/*80.60*/("""
        """),format.raw/*81.29*/("""
        """),format.raw/*82.47*/("""
    """),format.raw/*83.10*/("""

    """),format.raw/*85.11*/("""
    """),format.raw/*86.10*/("""
        """),format.raw/*87.31*/("""
        """),format.raw/*88.25*/("""
        """),format.raw/*89.28*/("""
        """),format.raw/*90.30*/("""
    """),format.raw/*91.10*/("""
    """),format.raw/*92.17*/("""
    """),format.raw/*93.5*/("""<head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*94.54*/routes/*94.60*/.Assets.versioned("stylesheets/content.css")),format.raw/*94.104*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(/*98.23*/routes/*98.29*/.HomeController.content),format.raw/*98.52*/("""" class="button"><en>Back</en></a>
        </header>

        <div>

            <form action = """"),_display_(/*103.30*/routes/*103.36*/.SaleController.createSale),format.raw/*103.62*/("""" method = "post">
                <h1 id="title">Create New Sale</h1>
                <div class="form">
                    <p>
                        Name: <input type="name" name="name" placeholder="Name">
                    </p>

                    <p>
                        Address: <input type="address" name="address" placeholder="Address">
                    </p>

                    <p>
                        Start Date: <input type="date" name="startDate" placeholder="mm/dd/yyyy">
                    </p>

                    <p>
                        End Date: <input type="date" name="endDate" placeholder="mm/dd/yyyy">
                    </p>

                    <p>
                        <button class="button">Create Sale</button>
                    </p>
                </div>
            </form>
            <form action = """"),_display_(/*127.30*/routes/*127.36*/.HomeController.content),format.raw/*127.59*/("""" method = "get">
                <p style="text-align: center" >
                    <button class="button">Cancel</button>
                </p>
            </form>
        </div>

    </body>

</html>
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/*
* This template takes a single argument, a String containing a
* message to display.
*/
object createSalePage extends createSalePage_Scope0.createSalePage
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:00 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/createSalePage.scala.html
                  HASH: b2b20ff5bb58d0ee79b915d18bc1b660cb35337c
                  MATRIX: 847->92|954->104|983->296|1011->298|1043->321|1083->323|1116->449|1149->511|1181->513|1209->514|1259->563|1293->586|1326->596|1363->627|1400->650|1437->672|1474->704|1511->735|1549->760|1586->785|1623->811|1660->842|1697->874|1734->905|1771->937|1808->997|1841->1007|1875->1018|1908->1028|1945->1059|1978->1069|2012->1086|2045->1096|2082->1120|2119->1144|2156->1168|2193->1199|2230->1230|2267->1253|2304->1275|2341->1305|2378->1334|2412->1345|2446->1361|2479->1371|2516->1402|2553->1425|2590->1447|2627->1477|2664->1509|2701->1543|2738->1569|2775->1602|2812->1629|2849->1655|2886->1686|2923->1716|2960->1746|2997->1778|3034->1838|3071->1867|3108->1914|3141->1924|3175->1936|3208->1946|3245->1977|3282->2002|3319->2030|3356->2060|3389->2070|3422->2087|3454->2092|3541->2152|3556->2158|3622->2202|3714->2267|3729->2273|3773->2296|3899->2394|3915->2400|3963->2426|4852->3287|4868->3293|4913->3316
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|43->22|44->23|46->25|48->27|49->28|50->29|51->30|52->31|53->32|54->33|56->35|57->36|58->37|59->38|60->39|61->40|62->41|63->42|64->43|66->45|67->46|68->47|69->48|71->50|72->51|73->52|74->53|75->54|76->55|77->56|78->57|79->58|80->59|81->60|83->62|85->64|86->65|87->66|88->67|89->68|90->69|91->70|92->71|93->72|94->73|95->74|96->75|97->76|98->77|99->78|100->79|101->80|102->81|103->82|104->83|106->85|107->86|108->87|109->88|110->89|111->90|112->91|113->92|114->93|115->94|115->94|115->94|119->98|119->98|119->98|124->103|124->103|124->103|148->127|148->127|148->127
                  -- GENERATED --
              */
          