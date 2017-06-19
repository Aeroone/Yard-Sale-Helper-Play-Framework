
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Yard Sale")/*12.19*/ {_display_(Seq[Any](format.raw/*12.21*/("""

    """),format.raw/*17.8*/("""

    """),format.raw/*21.7*/("""

    """),format.raw/*28.7*/("""

    """),_display_(/*30.6*/message),format.raw/*30.13*/("""
""")))}),format.raw/*31.2*/("""

"""),format.raw/*33.1*/("""<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*35.54*/routes/*35.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*35.101*/("""">
    </head>


    <body class="mainPage">
        <div id="link1">
            <a href=""""),_display_(/*41.23*/routes/*41.29*/.HomeController.login),format.raw/*41.50*/("""" class="button"><en>Login</en></a>
        </div>
        <div id="link2">
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.HomeController.register),format.raw/*44.53*/("""" class="button"><en>Register</en></a>
        </div>
    </body>


</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/index.scala.html
                  HASH: 52dc9a1ac6b0bcd3fcd8b389384f88107758cb99
                  MATRIX: 834->95|946->112|975->308|1003->310|1029->327|1069->329|1102->458|1135->520|1168->702|1201->709|1229->716|1261->718|1290->720|1388->791|1403->797|1466->838|1585->930|1600->936|1642->957|1767->1055|1782->1061|1827->1085
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|44->28|46->30|46->30|47->31|49->33|51->35|51->35|51->35|57->41|57->41|57->41|60->44|60->44|60->44
                  -- GENERATED --
              */
          