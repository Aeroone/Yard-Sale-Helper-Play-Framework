
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object additem_Scope0 {
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

class additem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[controllers.ItemController.Itemform],User,SaleEvent,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.ItemController.Itemform], user: User, saleEvent: SaleEvent):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.89*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Add items")/*12.19*/ {_display_(Seq[Any](format.raw/*12.21*/("""

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
        <header id = "header">
            <dt>"""),_display_(/*38.18*/user/*38.22*/.name),format.raw/*38.27*/(""" """),format.raw/*38.28*/("""<span>("""),_display_(/*38.36*/user/*38.40*/.email),format.raw/*38.46*/(""")</span></dt>
                <a href=""""),_display_(/*39.27*/routes/*39.33*/.HomeController.logout()),format.raw/*39.57*/("""" class = "button" style = "font-size: 12px">Logout</a>
                """),_display_(/*40.18*/if(user.getAuthority().equals("Admin") || user.getAuthority().equals("SuperUser"))/*40.100*/ {_display_(Seq[Any](format.raw/*40.102*/("""
                    """),format.raw/*41.21*/("""<a href=""""),_display_(/*41.31*/routes/*41.37*/.SaleController.saleInfo(saleEvent.ID)),format.raw/*41.75*/("""" style="font-size: 12px" class = "button"><en>Back</en></a>
                """)))}),format.raw/*42.18*/("""
                """),_display_(/*43.18*/if(user.getAuthority().equals("Cashier"))/*43.59*/ {_display_(Seq[Any](format.raw/*43.61*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.content()),format.raw/*44.66*/("""" style="font-size: 12px" class = "button"><en>Back</en></a>
                """)))}),format.raw/*45.18*/("""
        """),format.raw/*46.9*/("""</header>

            """),format.raw/*58.15*/("""
        """),format.raw/*59.9*/("""<div class = "form">
        <form action = """"),_display_(/*60.26*/routes/*60.32*/.ItemController.postaddItem(saleEvent.ID)),format.raw/*60.73*/("""" method = "post">
            <h1>Add Item</h1>

            <p>
                Seller name:  """),_display_(/*64.32*/user/*64.36*/.name),format.raw/*64.41*/("""
            """),format.raw/*65.13*/("""</p>

            <p>
                Name: <input type = "name" name="name">
            </p>

            <p>
                Price: <input type = "price" name="price">
            </p>
            <p>
                Minimum Price: <input type = "text" name="minPrice">
            </p>


            <p>
                Location:  <input type="location" name="location">
            </p>

            <p>
                Description: <input type="description" name="description">
            </p>
            <p>
                Quantity: <input type = "number" name = "quantity" min = 0 value = 0>
            </p>

            <p>
                <button class = "button">Add Item</button>
            </p>
        </form>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(userForm:Form[controllers.ItemController.Itemform],user:User,saleEvent:SaleEvent): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user,saleEvent)

  def f:((Form[controllers.ItemController.Itemform],User,SaleEvent) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user,saleEvent) => apply(userForm,user,saleEvent)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object additem extends additem_Scope0.additem
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:41:59 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/additem.scala.html
                  HASH: ac472fc08f6085a1493a460a87a3ee75f6ebd663
                  MATRIX: 888->95|1070->182|1099->378|1127->380|1153->397|1193->399|1226->528|1259->590|1292->772|1324->774|1353->776|1451->847|1466->853|1529->894|1612->950|1627->956|1693->1000|1794->1074|1807->1078|1833->1083|1862->1084|1897->1092|1910->1096|1937->1102|2004->1142|2019->1148|2064->1172|2164->1245|2256->1327|2297->1329|2346->1350|2383->1360|2398->1366|2457->1404|2566->1482|2611->1500|2661->1541|2701->1543|2754->1568|2791->1578|2806->1584|2852->1609|2961->1687|2997->1696|3048->1988|3084->1997|3157->2043|3172->2049|3234->2090|3358->2187|3371->2191|3397->2196|3438->2209
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|45->29|47->31|49->33|49->33|49->33|50->34|50->34|50->34|54->38|54->38|54->38|54->38|54->38|54->38|54->38|55->39|55->39|55->39|56->40|56->40|56->40|57->41|57->41|57->41|57->41|58->42|59->43|59->43|59->43|60->44|60->44|60->44|60->44|61->45|62->46|64->58|65->59|66->60|66->60|66->60|70->64|70->64|70->64|71->65
                  -- GENERATED --
              */
          