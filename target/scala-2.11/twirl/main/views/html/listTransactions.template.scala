
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listTransactions_Scope0 {
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

class listTransactions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Transaction],User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(transactions: List[Transaction], user: User, saleID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""

"""),_display_(/*3.2*/main("Active Sales")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

""")))}),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<html>
  <style>
    button
    """),format.raw/*9.5*/("""{"""),format.raw/*9.6*/("""
    """),format.raw/*10.5*/("""position:absolute;
    left: 0%;
    top: 60%;
    margin-top: 10px;
    margin-bottom: 1px;
    font-family: inherit;
    color: white;
    background: #6495ED;
    outline: none;
    border: none;
    padding: 5px 15px;
    font-size: 1.0em;
    font-weight: 400;
    border-radius: 3px;
    box-shadow: 0px 0px 10px rgba(40, 40, 40, 0.4);
    cursor: pointer;
    transition: all 0.15s ease-in-out;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""
"""),format.raw/*28.1*/("""</style>
<head>
  <link rel="stylesheet" media="screen" href=""""),_display_(/*30.48*/routes/*30.54*/.Assets.versioned("stylesheets/content.css")),format.raw/*30.98*/("""">
</head>
<body>
  <header class = "header">
  """),_display_(/*34.4*/if(user.getAuthority().equals("Admin") || user.getAuthority().equals("SuperUser"))/*34.86*/ {_display_(Seq[Any](format.raw/*34.88*/("""
    """),format.raw/*35.5*/("""<a href=""""),_display_(/*35.15*/routes/*35.21*/.SaleController.saleInfo(saleID)),format.raw/*35.53*/("""" class = "button">Back</a>
  """)))}),format.raw/*36.4*/("""
  """),_display_(/*37.4*/if(user.getAuthority().equals("Cashier"))/*37.45*/ {_display_(Seq[Any](format.raw/*37.47*/("""
    """),format.raw/*38.5*/("""<a href=""""),_display_(/*38.15*/routes/*38.21*/.HomeController.content()),format.raw/*38.46*/("""" class = "button"><en>Back</en></a>
  """)))}),format.raw/*39.4*/("""
  """),format.raw/*40.3*/("""</header>
  <div style="text-align: center">
    """),_display_(/*42.6*/for(transaction <- transactions) yield /*42.38*/{_display_(Seq[Any](format.raw/*42.39*/("""
      """),_display_(/*43.8*/if(transaction.getUserName().length() > 0)/*43.50*/ {_display_(Seq[Any](format.raw/*43.52*/("""
        """),format.raw/*44.9*/("""<a style="color: white; margin-bottom: 10px"  href=""""),_display_(/*44.62*/routes/*44.68*/.TransactionController.printReceipt(
          transaction.getId())),format.raw/*45.31*/("""">"""),_display_(/*45.34*/transaction/*45.45*/.getUserName()),format.raw/*45.59*/("""</a><br>
      """)))}),format.raw/*46.8*/("""
    """)))}),format.raw/*47.6*/("""
  """),format.raw/*48.3*/("""</div>
</body>
</html>"""))
      }
    }
  }

  def render(transactions:List[Transaction],user:User,saleID:String): play.twirl.api.HtmlFormat.Appendable = apply(transactions,user,saleID)

  def f:((List[Transaction],User,String) => play.twirl.api.HtmlFormat.Appendable) = (transactions,user,saleID) => apply(transactions,user,saleID)

  def ref: this.type = this

}


}

/**/
object listTransactions extends listTransactions_Scope0.listTransactions
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/listTransactions.scala.html
                  HASH: 5ba7664a322253ea7d7ffda4f599a8f035543ed8
                  MATRIX: 790->1|946->62|974->65|1002->85|1041->87|1073->90|1100->91|1158->123|1185->124|1217->129|1646->531|1674->532|1702->533|1792->596|1807->602|1872->646|1947->695|2038->777|2078->779|2110->784|2147->794|2162->800|2215->832|2276->863|2306->867|2356->908|2396->910|2428->915|2465->925|2480->931|2526->956|2596->996|2626->999|2702->1049|2750->1081|2789->1082|2823->1090|2874->1132|2914->1134|2950->1143|3030->1196|3045->1202|3133->1269|3163->1272|3183->1283|3218->1297|3264->1313|3300->1319|3330->1322
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|40->9|40->9|41->10|58->27|58->27|59->28|61->30|61->30|61->30|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|70->39|71->40|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|76->45|77->46|78->47|79->48
                  -- GENERATED --
              */
          