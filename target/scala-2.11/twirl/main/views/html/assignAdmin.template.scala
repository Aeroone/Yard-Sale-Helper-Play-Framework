
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object assignAdmin_Scope0 {
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

class assignAdmin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[controllers.UserController.UserForm],List[models.User],User,String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.UserController.UserForm], userList: List[models.User], user: User, ID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.108*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Assign Users")/*12.22*/ {_display_(Seq[Any](format.raw/*12.24*/("""

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
            <a href=""""),_display_(/*39.23*/routes/*39.29*/.SaleController.listSales()),format.raw/*39.56*/("""" style="font-size: 12px" class="button"><en>Back</en></a>
            <a href=""""),_display_(/*40.23*/routes/*40.29*/.HomeController.logout()),format.raw/*40.53*/("""" style="font-size: 12px" class="button">Logout</a>
        </header>

        <ul style="color:white; font-family: 'Rockwell Extra Bold'">
            """),_display_(/*44.14*/for(oneuser <- userList) yield /*44.38*/ {_display_(Seq[Any](format.raw/*44.40*/("""
                """),format.raw/*45.17*/("""<p>
                  E-mail: """),_display_(/*46.28*/oneuser/*46.35*/.email),format.raw/*46.41*/("""
                """),format.raw/*47.17*/("""</p>
                <p>
                  Name: """),_display_(/*49.26*/oneuser/*49.33*/.name),format.raw/*49.38*/("""
                """),format.raw/*50.17*/("""</p>
                <p>
                  Role: """),_display_(/*52.26*/oneuser/*52.33*/.getAuthority()),format.raw/*52.48*/("""
                """),format.raw/*53.17*/("""</p>

                <form action=""""),_display_(/*55.32*/routes/*55.38*/.UserController.postassignAdmin(ID)),format.raw/*55.73*/("""" method="POST">
                    <label>Change Role:</label>
                    <select name="authority">
                        <option value="Admin">Admin</option>
                        <option value="Seller">Seller</option>
                        <option value="Clerk">Clerk</option>
                        <option value="Bookkeeper">Bookkeeper</option>
                        <option value="Cashier">Cashier</option>
                    </select>
                    <input type="hidden" name="email" value = """"),_display_(/*64.65*/oneuser/*64.72*/.email),format.raw/*64.78*/(""""/>
                    <input type="submit" value="Assign" name= "Assign"/>
                </form>
            """)))}),format.raw/*67.14*/("""
        """),format.raw/*68.9*/("""</ul>

    </body>
</html>"""))
      }
    }
  }

  def render(userForm:Form[controllers.UserController.UserForm],userList:List[models.User],user:User,ID:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,userList,user,ID)

  def f:((Form[controllers.UserController.UserForm],List[models.User],User,String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,userList,user,ID) => apply(userForm,userList,user,ID)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object assignAdmin extends assignAdmin_Scope0.assignAdmin
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:00 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/assignAdmin.scala.html
                  HASH: 0b4e94a11165f2a49b5d0856d61e30de9a2da4f5
                  MATRIX: 911->95|1113->201|1142->397|1170->399|1199->419|1239->421|1272->550|1305->612|1338->794|1370->796|1399->798|1497->869|1512->875|1575->916|1658->972|1673->978|1739->1022|1838->1094|1851->1098|1877->1103|1906->1104|1941->1112|1954->1116|1981->1122|2044->1158|2059->1164|2107->1191|2215->1272|2230->1278|2275->1302|2455->1455|2495->1479|2535->1481|2580->1498|2638->1529|2654->1536|2681->1542|2726->1559|2803->1609|2819->1616|2845->1621|2890->1638|2967->1688|2983->1695|3019->1710|3064->1727|3128->1764|3143->1770|3199->1805|3752->2331|3768->2338|3795->2344|3940->2458|3976->2467
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|45->29|47->31|49->33|49->33|49->33|50->34|50->34|50->34|54->38|54->38|54->38|54->38|54->38|54->38|54->38|55->39|55->39|55->39|56->40|56->40|56->40|60->44|60->44|60->44|61->45|62->46|62->46|62->46|63->47|65->49|65->49|65->49|66->50|68->52|68->52|68->52|69->53|71->55|71->55|71->55|80->64|80->64|80->64|83->67|84->68
                  -- GENERATED --
              */
          