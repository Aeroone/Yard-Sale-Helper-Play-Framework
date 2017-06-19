
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchitem_Scope0 {
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

class searchitem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[controllers.ItemController.ItemID],List[models.Item],User,SaleEvent,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.ItemController.ItemID], itemList: List[models.Item], user: User, saleEvent: SaleEvent):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.116*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Browse Items")/*12.22*/ {_display_(Seq[Any](format.raw/*12.24*/("""

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
        <header>
            <dl id="user">
                <dt>"""),_display_(/*39.22*/user/*39.26*/.name),format.raw/*39.31*/(""" """),format.raw/*39.32*/("""<span>("""),_display_(/*39.40*/user/*39.44*/.email),format.raw/*39.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(/*41.31*/routes/*41.37*/.HomeController.logout()),format.raw/*41.61*/("""">Logout</a>

                    """),_display_(/*43.22*/if(user.getAuthority().equals("Seller"))/*43.62*/ {_display_(Seq[Any](format.raw/*43.64*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.content()),format.raw/*44.66*/("""" id="logo"><en>Back</en></a>
                        <a href=""""),_display_(/*45.35*/routes/*45.41*/.ItemController.printTags(saleEvent.ID)),format.raw/*45.80*/("""">Print Tags</a>
                    """)))}),format.raw/*46.22*/("""
                    """),_display_(/*47.22*/if(user.getAuthority().equals("Clerk"))/*47.61*/ {_display_(Seq[Any](format.raw/*47.63*/("""
                        """),format.raw/*48.25*/("""<a href=""""),_display_(/*48.35*/routes/*48.41*/.HomeController.content()),format.raw/*48.66*/("""" id="logo"><en>Back</en></a>
                    """)))}),format.raw/*49.22*/("""
                    """),_display_(/*50.22*/if(user.getAuthority().equals("Cashier"))/*50.63*/ {_display_(Seq[Any](format.raw/*50.65*/("""
                        """),format.raw/*51.25*/("""<a href=""""),_display_(/*51.35*/routes/*51.41*/.HomeController.content()),format.raw/*51.66*/("""" id="logo"><en>Back</en></a>
                    """)))}),format.raw/*52.22*/("""
                    """),_display_(/*53.22*/if(user.getAuthority().equals("Admin") || user.getAuthority().equals("Guest") || user.getAuthority.equals("SuperUser"))/*53.141*/ {_display_(Seq[Any](format.raw/*53.143*/("""
                        """),format.raw/*54.25*/("""<a href=""""),_display_(/*54.35*/routes/*54.41*/.SaleController.saleInfo(saleEvent.ID)),format.raw/*54.79*/("""" id="logo"><en>Back</en></a>
                    """)))}),format.raw/*55.22*/("""
                """),format.raw/*56.17*/("""</dd>
            </dl>
        </header>

        <ul style="color: white; font-family: 'Rockwell Extra Bold'">
            """),_display_(/*61.14*/for(item <- itemList) yield /*61.35*/ {_display_(Seq[Any](format.raw/*61.37*/("""
                """),format.raw/*62.17*/("""<p>
                    StockId: """),_display_(/*63.31*/item/*63.35*/.getId()),format.raw/*63.43*/("""
                """),format.raw/*64.17*/("""</p>
                <p>
                  Name: """),_display_(/*66.26*/item/*66.30*/.getName()),format.raw/*66.40*/("""
                """),format.raw/*67.17*/("""</p>
                <p>
                  Location: """),_display_(/*69.30*/item/*69.34*/.getLocation()),format.raw/*69.48*/("""
                """),format.raw/*70.17*/("""</p>
                <p>
                  Description: """),_display_(/*72.33*/item/*72.37*/.getDescription()),format.raw/*72.54*/("""
                """),format.raw/*73.17*/("""</p>
                <p>
                  Price: """),_display_(/*75.27*/item/*75.31*/.getPrice()),format.raw/*75.42*/("""
                """),format.raw/*76.17*/("""</p>
                <p>
                    Quantity: """),_display_(/*78.32*/item/*78.36*/.getQuantity()),format.raw/*78.50*/("""
                """),format.raw/*79.17*/("""</p>
                """),_display_(/*80.18*/if(item.getPhoto() != null && item.getPhoto().length() > 0)/*80.77*/ {_display_(Seq[Any](format.raw/*80.79*/("""
                    """),format.raw/*81.21*/("""<img src=""""),_display_(/*81.32*/routes/*81.38*/.ItemController.getImage(item.getId())),format.raw/*81.76*/(""""/>
                """)))}),format.raw/*82.18*/("""
                """),_display_(/*83.18*/if(!user.getAuthority().equals("Clerk"))/*83.58*/ {_display_(Seq[Any](format.raw/*83.60*/("""
                    """),format.raw/*84.21*/("""<form action=""""),_display_(/*84.36*/routes/*84.42*/.ItemController.postsearchItem()),format.raw/*84.74*/("""" method="POST">
                        <input type="hidden" name="id" value = """"),_display_(/*85.66*/item/*85.70*/.getId()),format.raw/*85.78*/(""""/>
                        <input type="submit" value="Delete" name= "Delete"/>
                        <input type="submit" value="Update" name= "Update"/>
                    </form>
                    """),_display_(/*89.22*/helper/*89.28*/.form(action = routes.ItemController.uploadImage(item.getId()), 'enctype -> "multipart/form-data")/*89.126*/ {_display_(Seq[Any](format.raw/*89.128*/("""
                        """),format.raw/*90.25*/("""<input type="file" name="picture">
                        <p>
                            <button>Upload Image</button>
                        </p>
                    """)))}),format.raw/*94.22*/("""
                """)))}),format.raw/*95.18*/("""
            """)))}),format.raw/*96.14*/("""
        """),format.raw/*97.9*/("""</ul>
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
object searchitem extends searchitem_Scope0.searchitem
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:02 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/searchitem.scala.html
                  HASH: ac5b2a6176dc7a6e3b0627ca8a2ce12880e1c92d
                  MATRIX: 910->95|1120->209|1149->405|1177->407|1206->427|1246->429|1279->558|1312->620|1345->802|1377->804|1406->806|1504->877|1519->883|1582->924|1665->980|1680->986|1746->1030|1864->1121|1877->1125|1903->1130|1932->1131|1967->1139|1980->1143|2007->1149|2099->1214|2114->1220|2159->1244|2221->1279|2270->1319|2310->1321|2363->1346|2400->1356|2415->1362|2461->1387|2552->1451|2567->1457|2627->1496|2696->1534|2745->1556|2793->1595|2833->1597|2886->1622|2923->1632|2938->1638|2984->1663|3066->1714|3115->1736|3165->1777|3205->1779|3258->1804|3295->1814|3310->1820|3356->1845|3438->1896|3487->1918|3616->2037|3657->2039|3710->2064|3747->2074|3762->2080|3821->2118|3903->2169|3948->2186|4101->2312|4138->2333|4178->2335|4223->2352|4284->2386|4297->2390|4326->2398|4371->2415|4448->2465|4461->2469|4492->2479|4537->2496|4618->2550|4631->2554|4666->2568|4711->2585|4795->2642|4808->2646|4846->2663|4891->2680|4969->2731|4982->2735|5014->2746|5059->2763|5142->2819|5155->2823|5190->2837|5235->2854|5284->2876|5352->2935|5392->2937|5441->2958|5479->2969|5494->2975|5553->3013|5605->3034|5650->3052|5699->3092|5739->3094|5788->3115|5830->3130|5845->3136|5898->3168|6007->3250|6020->3254|6049->3262|6283->3469|6298->3475|6406->3573|6447->3575|6500->3600|6702->3771|6751->3789|6796->3803|6832->3812
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|45->29|47->31|49->33|49->33|49->33|50->34|50->34|50->34|55->39|55->39|55->39|55->39|55->39|55->39|55->39|57->41|57->41|57->41|59->43|59->43|59->43|60->44|60->44|60->44|60->44|61->45|61->45|61->45|62->46|63->47|63->47|63->47|64->48|64->48|64->48|64->48|65->49|66->50|66->50|66->50|67->51|67->51|67->51|67->51|68->52|69->53|69->53|69->53|70->54|70->54|70->54|70->54|71->55|72->56|77->61|77->61|77->61|78->62|79->63|79->63|79->63|80->64|82->66|82->66|82->66|83->67|85->69|85->69|85->69|86->70|88->72|88->72|88->72|89->73|91->75|91->75|91->75|92->76|94->78|94->78|94->78|95->79|96->80|96->80|96->80|97->81|97->81|97->81|97->81|98->82|99->83|99->83|99->83|100->84|100->84|100->84|100->84|101->85|101->85|101->85|105->89|105->89|105->89|105->89|106->90|110->94|111->95|112->96|113->97
                  -- GENERATED --
              */
          