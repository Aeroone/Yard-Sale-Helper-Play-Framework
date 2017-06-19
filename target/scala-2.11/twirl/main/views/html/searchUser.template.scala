
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchUser_Scope0 {
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

class searchUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[controllers.UserController.UserForm],List[models.User],User,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.UserController.UserForm], userList: List[models.User], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.96*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Edited web")/*12.20*/ {_display_(Seq[Any](format.raw/*12.22*/("""

    """),format.raw/*17.8*/("""

    """),format.raw/*21.7*/("""

    """),format.raw/*28.7*/("""
""")))}),format.raw/*29.2*/("""

"""),format.raw/*31.1*/("""<html>
    <body>
        <head>
            <link rel="stylesheet" media="screen" href=""""),_display_(/*34.58*/routes/*34.64*/.Assets.versioned("stylesheets/main.css")),format.raw/*34.105*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*35.58*/routes/*35.64*/.Assets.versioned("stylesheets/content.css")),format.raw/*35.108*/("""">
        </head>
        <body>
        <header class = "header">
            <dl id="user">
                <dt>"""),_display_(/*40.22*/user/*40.26*/.name),format.raw/*40.31*/(""" """),format.raw/*40.32*/("""<span>("""),_display_(/*40.40*/user/*40.44*/.email),format.raw/*40.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(/*42.31*/routes/*42.37*/.HomeController.logout()),format.raw/*42.61*/(""""class = "button">Logout</a>
                    <a href=""""),_display_(/*43.31*/routes/*43.37*/.HomeController.content()),format.raw/*43.62*/(""""class = "button"><en>Back</en></a>
                </dd>
            </dl>
        </header>
        <ul style="color: white; font-family: 'Rockwell Extra Bold'">
            """),_display_(/*48.14*/for(oneuser <- userList) yield /*48.38*/ {_display_(Seq[Any](format.raw/*48.40*/("""
                """),format.raw/*49.17*/("""<p>
                  E-mail: """),_display_(/*50.28*/oneuser/*50.35*/.email),format.raw/*50.41*/("""
                """),format.raw/*51.17*/("""</p>
                <p>
                  Name: """),_display_(/*53.26*/oneuser/*53.33*/.name),format.raw/*53.38*/("""
                """),format.raw/*54.17*/("""</p>

                <p>
                  Role: """),_display_(/*57.26*/oneuser/*57.33*/.getAuthority()),format.raw/*57.48*/("""
                """),format.raw/*58.17*/("""</p>
                <p>
                  isLocked: """),_display_(/*60.30*/oneuser/*60.37*/.getislocked()),format.raw/*60.51*/("""
                """),format.raw/*61.17*/("""</p>

                <form action=""""),_display_(/*63.32*/routes/*63.38*/.UserController.postsearchUser()),format.raw/*63.70*/("""" method="POST">
                    <input type="hidden" name="email" value = """"),_display_(/*64.65*/oneuser/*64.72*/.email),format.raw/*64.78*/(""""/>
                    <input type="submit" value="Unlock" name= "Unlock"/>
                    <input type="submit" value="Delete" name= "Delete"/>
                </form>

                <p>

                </p>
                <form action=""""),_display_(/*72.32*/routes/*72.38*/.UserController.postsearchUser()),format.raw/*72.70*/("""" method="POST">
                    <label>Change Role:</label>
                    <select name="authority">
                        <option value="SuperUser">SuperUser</option>
                        """),format.raw/*81.27*/("""
                        """),format.raw/*82.25*/("""<option value="Guest">Guest</option>
                    </select>
                    <input type="hidden" name="email" value = """"),_display_(/*84.65*/oneuser/*84.72*/.email),format.raw/*84.78*/(""""/>
                    <input type="submit" value="Change" name= "Change"/>
                </form>
            """)))}),format.raw/*87.14*/("""
        """),format.raw/*88.9*/("""</ul>
    </body>
</html>"""))
      }
    }
  }

  def render(userForm:Form[controllers.UserController.UserForm],userList:List[models.User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,userList,user)

  def f:((Form[controllers.UserController.UserForm],List[models.User],User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,userList,user) => apply(userForm,userList,user)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object searchUser extends searchUser_Scope0.searchUser
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:02 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/searchUser.scala.html
                  HASH: d448cd2336fd62ad4921c417c297110989ff5833
                  MATRIX: 902->95|1091->189|1120->385|1148->387|1175->405|1215->407|1248->536|1281->598|1314->780|1346->782|1375->784|1492->874|1507->880|1570->921|1657->981|1672->987|1738->1031|1881->1147|1894->1151|1920->1156|1949->1157|1984->1165|1997->1169|2024->1175|2116->1240|2131->1246|2176->1270|2262->1329|2277->1335|2323->1360|2527->1537|2567->1561|2607->1563|2652->1580|2710->1611|2726->1618|2753->1624|2798->1641|2875->1691|2891->1698|2917->1703|2962->1720|3040->1771|3056->1778|3092->1793|3137->1810|3218->1864|3234->1871|3269->1885|3314->1902|3378->1939|3393->1945|3446->1977|3554->2058|3570->2065|3597->2071|3872->2319|3887->2325|3940->2357|4172->2846|4225->2871|4383->3002|4399->3009|4426->3015|4571->3129|4607->3138
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|45->29|47->31|50->34|50->34|50->34|51->35|51->35|51->35|56->40|56->40|56->40|56->40|56->40|56->40|56->40|58->42|58->42|58->42|59->43|59->43|59->43|64->48|64->48|64->48|65->49|66->50|66->50|66->50|67->51|69->53|69->53|69->53|70->54|73->57|73->57|73->57|74->58|76->60|76->60|76->60|77->61|79->63|79->63|79->63|80->64|80->64|80->64|88->72|88->72|88->72|92->81|93->82|95->84|95->84|95->84|98->87|99->88
                  -- GENERATED --
              */
          