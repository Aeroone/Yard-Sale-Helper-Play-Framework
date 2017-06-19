
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object saleConfirmation_Scope0 {
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

class saleConfirmation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(saleEventID : String, transactionID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

"""),_display_(/*3.2*/main("Transaction Created")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

""")))}),format.raw/*5.2*/("""

    """),format.raw/*7.5*/("""<html>
        <head>
            <link rel="stylesheet" media="screen" href=""""),_display_(/*9.58*/routes/*9.64*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.105*/("""">
            <link rel="stylesheet" media="screen" href=""""),_display_(/*10.58*/routes/*10.64*/.Assets.versioned("stylesheets/content.css")),format.raw/*10.108*/("""">
        </head>
        <style type = "text/css">
        p
        """),format.raw/*14.9*/("""{"""),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""text-align:center;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""</style>
        <h>
            <h1>Transaction Created!</h1>
        </h>
        <a style="color: white;" href=""""),_display_(/*21.41*/routes/*21.47*/.SaleController.saleInfo(saleEventID)),format.raw/*21.84*/("""">Done</a>
        <a style="color: white;" href=""""),_display_(/*22.41*/routes/*22.47*/.TransactionController.printReceipt(transactionID)),format.raw/*22.97*/("""" ><en>Print Receipt</en></a>
        <a style="color: white;" href=""""),_display_(/*23.41*/routes/*23.47*/.EmailController.sendReceipt(saleEventID, transactionID)),format.raw/*23.103*/("""">Email Receipt</a>
        """),_display_(/*24.10*/if(flash.containsKey("success"))/*24.42*/ {_display_(Seq[Any](format.raw/*24.44*/("""
            """),format.raw/*25.13*/("""<p style="color: white;">"""),_display_(/*25.39*/flash/*25.44*/.get("success")),format.raw/*25.59*/("""</p>
        """)))}),format.raw/*26.10*/("""

    """),format.raw/*28.5*/("""</html>"""))
      }
    }
  }

  def render(saleEventID:String,transactionID:String): play.twirl.api.HtmlFormat.Appendable = apply(saleEventID,transactionID)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (saleEventID,transactionID) => apply(saleEventID,transactionID)

  def ref: this.type = this

}


}

/**/
object saleConfirmation extends saleConfirmation_Scope0.saleConfirmation
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/saleConfirmation.scala.html
                  HASH: ecd9eb3df6db490258acc7a78e527cf38ca118ac
                  MATRIX: 774->1|914->46|942->49|977->76|1016->78|1048->81|1080->87|1185->166|1199->172|1261->213|1348->273|1363->279|1429->323|1527->394|1556->395|1592->404|1646->431|1675->432|1711->441|1854->557|1869->563|1927->600|2005->651|2020->657|2091->707|2188->777|2203->783|2281->839|2337->868|2378->900|2418->902|2459->915|2512->941|2526->946|2562->961|2607->975|2640->981
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|38->7|40->9|40->9|40->9|41->10|41->10|41->10|45->14|45->14|46->15|47->16|47->16|48->17|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|59->28
                  -- GENERATED --
              */
          