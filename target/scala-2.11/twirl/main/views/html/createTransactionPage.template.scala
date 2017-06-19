
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createTransactionPage_Scope0 {
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

class createTransactionPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(saleEventID : String, items : List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.math.BigInteger; var i = 0

Seq[Any](format.raw/*1.44*/("""
"""),_display_(/*2.2*/main("Create New Transaction")/*2.32*/ {_display_(Seq[Any](format.raw/*2.34*/("""

  """),format.raw/*7.5*/("""

  """),format.raw/*11.5*/("""
""")))}),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""<html>
  <style type="text/css">
  .container """),format.raw/*16.14*/("""{"""),format.raw/*16.15*/("""
    """),format.raw/*17.5*/("""border:2px solid white;
    text-align: left;
    width:400px;
    height: 100px;
    overflow-y: scroll;
    margin:0 auto
  """),format.raw/*23.3*/("""}"""),format.raw/*23.4*/("""
  """),format.raw/*24.3*/(""".cancelbutton """),format.raw/*24.17*/("""{"""),format.raw/*24.18*/("""
    """),format.raw/*25.5*/("""text-align: right;
  """),format.raw/*26.3*/("""}"""),format.raw/*26.4*/("""
  """),format.raw/*27.3*/("""#registerform
  """),format.raw/*28.3*/("""{"""),format.raw/*28.4*/("""
    """),format.raw/*29.5*/("""position:absolute;
    left: 50%;
    top: 50%;
    margin-left:-150px;
    margin-top:-150px;

    float:left;
    width:350px;
    height:350px;
    padding:10px 15px;
    background:#A9A9A9;
    border-radius:3px;
    border-radius: 3px;
    box-shadow: 0px 0px 10px rgba(40, 40, 40, 0.4);
  """),format.raw/*43.3*/("""}"""),format.raw/*43.4*/("""

  """),format.raw/*45.3*/("""p
  """),format.raw/*46.3*/("""{"""),format.raw/*46.4*/("""
    """),format.raw/*47.5*/("""text-align:center;
  """),format.raw/*48.3*/("""}"""),format.raw/*48.4*/("""
  """),format.raw/*49.3*/("""p1
  """),format.raw/*50.3*/("""{"""),format.raw/*50.4*/("""
    """),format.raw/*51.5*/("""text-align:left;
  """),format.raw/*52.3*/("""}"""),format.raw/*52.4*/("""

  """),format.raw/*54.3*/("""#cancel
  """),format.raw/*55.3*/("""{"""),format.raw/*55.4*/("""
    """),format.raw/*56.5*/("""float:left;
    width:40px;
    height:8px;
    padding:10px 15px;
    position:absolute;
    left: 48%;
    top: 54%;
    margin-left:10px;
    margin-top:40px;

  """),format.raw/*66.3*/("""}"""),format.raw/*66.4*/("""

  """),format.raw/*68.3*/("""button
  """),format.raw/*69.3*/("""{"""),format.raw/*69.4*/("""
    """),format.raw/*70.5*/("""position:absolute;
    left: 25%;
    top: 70%;
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
  """),format.raw/*87.3*/("""}"""),format.raw/*87.4*/("""

  """),format.raw/*89.3*/("""h1
  """),format.raw/*90.3*/("""{"""),format.raw/*90.4*/("""
    """),format.raw/*91.5*/("""text-align:center;
    color:white;
    font-size:15px;
    padding:12px 0px;
  """),format.raw/*95.3*/("""}"""),format.raw/*95.4*/("""
  """),format.raw/*96.3*/("""</style>

  <body>
    <head>
      <link rel="stylesheet" media="screen" href=""""),_display_(/*100.52*/routes/*100.58*/.Assets.versioned("stylesheets/main.css")),format.raw/*100.99*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*101.52*/routes/*101.58*/.Assets.versioned("stylesheets/content.css")),format.raw/*101.102*/("""">
    </head>
    <header id="header">
      <a href=""""),_display_(/*104.17*/routes/*104.23*/.SaleController.saleInfo(saleEventID)),format.raw/*104.60*/("""" class="button"><en>Back</en></a>
    </header>

    <div class="form">

      <form action = """"),_display_(/*109.24*/routes/*109.30*/.TransactionController.createTransaction(saleEventID)),format.raw/*109.83*/("""" method = "post">
        <h1>Create a New Transaction</h1>
        <p>
          Customer Username: <input type="name" name="userName" placeholder="Name">
        </p>
        <p>
           Purchase Date: <input type="date" name="date" placeholder="mm/dd/yyyy">
        </p>
        <h1>Add Items</h1>
        <div class = "container">
        """),format.raw/*120.1*/("""        """),_display_(/*120.10*/for(item <- items) yield /*120.28*/{_display_(Seq[Any](format.raw/*120.29*/("""
          """),_display_(/*121.12*/if(item.getName().length() > 0 && item.getQuantity() > 0)/*121.69*/ {_display_(Seq[Any](format.raw/*121.71*/("""
            """),format.raw/*122.13*/("""<p1>
              """),_display_(/*123.16*/if(item.getMinimumPrice() != item.getPrice())/*123.61*/ {_display_(Seq[Any](format.raw/*123.63*/("""
                """),format.raw/*124.17*/("""Stock#: """),_display_(/*124.26*/item/*124.30*/.getId()),format.raw/*124.38*/(""" """),format.raw/*124.39*/("""- """),_display_(/*124.42*/item/*124.46*/.getName()),format.raw/*124.56*/(""": <input type = 'number' name = '"""),_display_(/*124.90*/item/*124.94*/.getId()),format.raw/*124.102*/("""' min = '0' max = '"""),_display_(/*124.122*/item/*124.126*/.getQuantity()),format.raw/*124.140*/("""' value = '0'>
                $<input type = "number" name = 'HAGGLE:"""),_display_(/*125.57*/item/*125.61*/.getName()),format.raw/*125.71*/("""' step = '0.25' min = '"""),_display_(/*125.95*/Double/*125.101*/.parseDouble(item.getMinimumPrice())),format.raw/*125.137*/("""' max = '"""),_display_(/*125.147*/item/*125.151*/.getPrice()),format.raw/*125.162*/("""' value = '"""),_display_(/*125.174*/item/*125.178*/.getPrice()),format.raw/*125.189*/("""'>
                <br>
              """)))}/*127.17*/else/*127.22*/{_display_(Seq[Any](format.raw/*127.23*/("""
                """),format.raw/*128.17*/("""Stock#: """),_display_(/*128.26*/item/*128.30*/.getId()),format.raw/*128.38*/(""" """),format.raw/*128.39*/("""- """),_display_(/*128.42*/item/*128.46*/.getName()),format.raw/*128.56*/(""": <input type = 'number' name = '"""),_display_(/*128.90*/item/*128.94*/.getId()),format.raw/*128.102*/("""' min = '0' max = '"""),_display_(/*128.122*/item/*128.126*/.getQuantity()),format.raw/*128.140*/("""' value = '0'>
                $"""),_display_(/*129.19*/item/*129.23*/.getPrice()),format.raw/*129.34*/("""
                """),format.raw/*130.17*/("""<br>
              """)))}),format.raw/*131.16*/("""
            """),format.raw/*132.13*/("""</p1>
            """),_display_(/*133.14*/{i = i + 1}),format.raw/*133.25*/("""
          """)))}),format.raw/*134.12*/("""
        """)))}),format.raw/*135.10*/("""
        """),format.raw/*136.9*/("""</div>
        <p>
          <button class="button">Create Transaction</button>
        </p>
      </form>
        <form action = """"),_display_(/*141.26*/routes/*141.32*/.HomeController.content),format.raw/*141.55*/("""" method = "get">
            <div>
                <p>
                    <button class="button">Cancel</button>
                </p>
            </div>

        </form>
    </div>

  </body>

</html>


"""))
      }
    }
  }

  def render(saleEventID:String,items:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(saleEventID,items)

  def f:((String,List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (saleEventID,items) => apply(saleEventID,items)

  def ref: this.type = this

}


}

/**/
object createTransactionPage extends createTransactionPage_Scope0.createTransactionPage
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/createTransactionPage.scala.html
                  HASH: de8a235aff08a88632f83c1bb7f26b7898972433
                  MATRIX: 788->1|963->43|990->45|1028->75|1067->77|1097->195|1128->251|1160->253|1189->255|1263->301|1292->302|1324->307|1477->433|1505->434|1535->437|1577->451|1606->452|1638->457|1686->478|1714->479|1744->482|1787->498|1815->499|1847->504|2169->799|2197->800|2228->804|2259->808|2287->809|2319->814|2367->835|2395->836|2425->839|2457->844|2485->845|2517->850|2563->869|2591->870|2622->874|2659->884|2687->885|2719->890|2911->1055|2939->1056|2970->1060|3006->1069|3034->1070|3066->1075|3498->1480|3526->1481|3557->1485|3589->1490|3617->1491|3649->1496|3756->1576|3784->1577|3814->1580|3923->1661|3939->1667|4002->1708|4084->1762|4100->1768|4167->1812|4251->1868|4267->1874|4326->1911|4451->2008|4467->2014|4542->2067|4917->2454|4954->2463|4989->2481|5029->2482|5069->2494|5136->2551|5177->2553|5219->2566|5267->2586|5322->2631|5363->2633|5409->2650|5446->2659|5460->2663|5490->2671|5520->2672|5551->2675|5565->2679|5597->2689|5659->2723|5673->2727|5704->2735|5753->2755|5768->2759|5805->2773|5904->2844|5918->2848|5950->2858|6002->2882|6019->2888|6078->2924|6117->2934|6132->2938|6166->2949|6207->2961|6222->2965|6256->2976|6315->3016|6329->3021|6369->3022|6415->3039|6452->3048|6466->3052|6496->3060|6526->3061|6557->3064|6571->3068|6603->3078|6665->3112|6679->3116|6710->3124|6759->3144|6774->3148|6811->3162|6872->3195|6886->3199|6919->3210|6965->3227|7017->3247|7059->3260|7106->3279|7139->3290|7183->3302|7225->3312|7262->3321|7422->3453|7438->3459|7483->3482
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->7|37->11|38->12|40->14|42->16|42->16|43->17|49->23|49->23|50->24|50->24|50->24|51->25|52->26|52->26|53->27|54->28|54->28|55->29|69->43|69->43|71->45|72->46|72->46|73->47|74->48|74->48|75->49|76->50|76->50|77->51|78->52|78->52|80->54|81->55|81->55|82->56|92->66|92->66|94->68|95->69|95->69|96->70|113->87|113->87|115->89|116->90|116->90|117->91|121->95|121->95|122->96|126->100|126->100|126->100|127->101|127->101|127->101|130->104|130->104|130->104|135->109|135->109|135->109|145->120|145->120|145->120|145->120|146->121|146->121|146->121|147->122|148->123|148->123|148->123|149->124|149->124|149->124|149->124|149->124|149->124|149->124|149->124|149->124|149->124|149->124|149->124|149->124|149->124|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|150->125|152->127|152->127|152->127|153->128|153->128|153->128|153->128|153->128|153->128|153->128|153->128|153->128|153->128|153->128|153->128|153->128|153->128|154->129|154->129|154->129|155->130|156->131|157->132|158->133|158->133|159->134|160->135|161->136|166->141|166->141|166->141
                  -- GENERATED --
              */
          