
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateitem_Scope0 {
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

class updateitem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[controllers.ItemController.updateItemForm],Int,models.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.ItemController.updateItemForm], newid: Int, user: models.User, saleID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.108*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Update Items")/*12.22*/ {_display_(Seq[Any](format.raw/*12.24*/("""

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
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.ItemController.searchItem(saleID)),format.raw/*39.63*/("""" style="font-size: 12px" class="button"><en>Back</en></a>
            <a href=""""),_display_(/*40.23*/routes/*40.29*/.HomeController.logout()),format.raw/*40.53*/("""" style="font-size: 12px" class="button">Logout</a>
        </header>

        <div class="form">
            <form action = """"),_display_(/*44.30*/routes/*44.36*/.ItemController.postupdateItem()),format.raw/*44.68*/("""" method = "post">
                <h1>Update Item</h1>

                """),format.raw/*51.19*/("""
                """),format.raw/*52.17*/("""<p>
                    Item Id: """),_display_(/*53.31*/newid),format.raw/*53.36*/("""
                    """),format.raw/*54.21*/("""<input type="hidden" name="id" value = """"),_display_(/*54.62*/newid),format.raw/*54.67*/(""""/>

                </p>
                <p>
                    Name: <input type = "text" name = "name">
                </p>
                <p>
                    Price: <input type="price" name="price">
                </p>

                <p>
                    Location:  <input type="location" name="location">
                </p>

                <p>
                    Description: <input type="description" name="description">
                </p>
                <p>
                    Quantity = <input type = "number" name = "quantity" value = "-1" min = "0">
                </p>
                <p>
                    <button>Update</button>
                </p>


            </form>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(userForm:Form[controllers.ItemController.updateItemForm],newid:Int,user:models.User,saleID:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,newid,user,saleID)

  def f:((Form[controllers.ItemController.updateItemForm],Int,models.User,String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,newid,user,saleID) => apply(userForm,newid,user,saleID)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object updateitem extends updateitem_Scope0.updateitem
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:02 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/updateitem.scala.html
                  HASH: 072b090d39dd0db3684a69db7c4497621173f4b1
                  MATRIX: 908->95|1110->201|1139->397|1167->399|1196->419|1236->421|1269->550|1302->612|1335->794|1367->796|1396->798|1494->869|1509->875|1572->916|1655->972|1670->978|1736->1022|1835->1094|1848->1098|1874->1103|1903->1104|1938->1112|1951->1116|1978->1122|2041->1158|2056->1164|2111->1198|2219->1279|2234->1285|2279->1309|2433->1436|2448->1442|2501->1474|2602->1654|2647->1671|2708->1705|2734->1710|2783->1731|2851->1772|2877->1777
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|45->29|47->31|49->33|49->33|49->33|50->34|50->34|50->34|54->38|54->38|54->38|54->38|54->38|54->38|54->38|55->39|55->39|55->39|56->40|56->40|56->40|60->44|60->44|60->44|63->51|64->52|65->53|65->53|66->54|66->54|66->54
                  -- GENERATED --
              */
          