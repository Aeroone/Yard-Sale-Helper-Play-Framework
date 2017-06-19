
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addItemsToTransaction_Scope0 {
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

class addItemsToTransaction extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Item],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[Item], saleID: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.math.BigInteger; var i = 0

Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Add Items")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

""")))}),format.raw/*5.2*/("""
"""),format.raw/*6.1*/("""<html>
    <style>
    button
    """),format.raw/*9.5*/("""{"""),format.raw/*9.6*/("""
        """),format.raw/*10.9*/("""position:absolute;
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
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""
    """),format.raw/*28.5*/("""</style>
    <body>
        <header>
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.SaleController.saleInfo(saleID)),format.raw/*31.61*/("""">Back</a>
        </header>

        <form action = "" method = "post">
            <h1>Add Items</h1>
            """),format.raw/*37.1*/("""            """),_display_(/*37.14*/for(item <- items) yield /*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
                """),_display_(/*38.18*/if(item.getName().length() > 0 && item.getQuantity() > 0)/*38.75*/ {_display_(Seq[Any](format.raw/*38.77*/("""
                    """),format.raw/*39.21*/("""<input type = 'checkbox' name = 'items["""),_display_(/*39.61*/i),format.raw/*39.62*/("""]' value = """),_display_(/*39.74*/item/*39.78*/.getId()),format.raw/*39.86*/(""">"""),_display_(/*39.88*/item/*39.92*/.getName()),format.raw/*39.102*/(""" """),format.raw/*39.103*/("""<br>
                    """),_display_(/*40.22*/{i = i + 1}),format.raw/*40.33*/("""
                """)))}),format.raw/*41.18*/("""
            """)))}),format.raw/*42.14*/("""
            """),format.raw/*43.13*/("""<p>
                <button>Add Items</button>
            </p>

        </form>
    </body>
</html>
"""))
      }
    }
  }

  def render(items:List[Item],saleID:String): play.twirl.api.HtmlFormat.Appendable = apply(items,saleID)

  def f:((List[Item],String) => play.twirl.api.HtmlFormat.Appendable) = (items,saleID) => apply(items,saleID)

  def ref: this.type = this

}


}

/**/
object addItemsToTransaction extends addItemsToTransaction_Scope0.addItemsToTransaction
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:41:59 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/addItemsToTransaction.scala.html
                  HASH: da5c3897a82ab831b9b226cd526c2d4a0d144b2e
                  MATRIX: 788->1|956->36|984->39|1009->56|1048->58|1080->61|1107->62|1167->96|1194->97|1230->106|1727->576|1755->577|1787->582|1873->641|1888->647|1941->679|2084->835|2124->848|2158->866|2197->867|2242->885|2308->942|2348->944|2397->965|2464->1005|2486->1006|2525->1018|2538->1022|2567->1030|2596->1032|2609->1036|2641->1046|2671->1047|2724->1073|2756->1084|2805->1102|2850->1116|2891->1129
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|40->9|40->9|41->10|58->27|58->27|59->28|62->31|62->31|62->31|67->37|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|69->39|69->39|69->39|69->39|70->40|70->40|71->41|72->42|73->43
                  -- GENERATED --
              */
          