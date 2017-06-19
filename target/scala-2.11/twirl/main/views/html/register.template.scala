
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.HomeController.Registration],play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.HomeController.Registration]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.59*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Register")/*12.18*/ {_display_(Seq[Any](format.raw/*12.20*/("""

    """),format.raw/*17.8*/("""

    """),format.raw/*21.7*/("""
""")))}),format.raw/*22.2*/("""

"""),format.raw/*24.1*/("""<html>
    <style type="text/css">

        #registerform
        """),format.raw/*28.9*/("""{"""),format.raw/*28.10*/("""
            """),format.raw/*29.13*/("""position: absolute;
            top:0;
            bottom: 0;
            left: 0;
            right: 0;

            margin: 250px auto;

            float:left;
            width:350px;
            height:350px;
            padding:10px 15px;
            background: #316ba9;
            border: #9219ff;
            border-style: groove;
            border-radius: 100px;
            box-shadow: 0px 0px 5px 5px rgba(0, 0, 0, 0.22);
        """),format.raw/*46.9*/("""}"""),format.raw/*46.10*/("""

        """),format.raw/*48.9*/("""p
        """),format.raw/*49.9*/("""{"""),format.raw/*49.10*/("""
            """),format.raw/*50.13*/("""text-align:center;
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/("""

        """),format.raw/*53.9*/("""#cancel
        """),format.raw/*54.9*/("""{"""),format.raw/*54.10*/("""
            """),format.raw/*55.13*/("""float:left;
            width:40px;
            height:8px;
            padding:10px 15px;
            position:absolute;
            left: 48%;
            top: 54%;
            margin-left:10px;
            margin-top:40px;

        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/("""

        """),format.raw/*67.9*/("""button
        """),format.raw/*68.9*/("""{"""),format.raw/*68.10*/("""
            """),format.raw/*69.13*/("""position:absolute;
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
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""

        """),format.raw/*88.9*/("""h1
        """),format.raw/*89.9*/("""{"""),format.raw/*89.10*/("""
            """),format.raw/*90.13*/("""text-align:center;
            color:white;
            font-size:20px;
            font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif;
            padding:12px 0px;
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/("""
    """),format.raw/*96.5*/("""</style>

    <head>
        <title>Register</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*100.54*/routes/*100.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*100.101*/("""">
    </head>
    <body class="mainPage">
        <header>
            <a href=""""),_display_(/*104.23*/routes/*104.29*/.HomeController.index),format.raw/*104.50*/("""" id="logo" class="button"><en>Back</en></a>
        </header>

        <div id="registerform">

            <form action =""""),_display_(/*109.29*/routes/*109.35*/.HomeController.index),format.raw/*109.56*/("""" method ="get">

                <div id="cancel">
                    <p>
                        <button>Cancel</button>
                    </p>
                </div>

            </form>

            <form action = """"),_display_(/*119.30*/routes/*119.36*/.HomeController.postRegister),format.raw/*119.64*/("""" method = "post">
                <h1>Register</h1>
                """),_display_(/*121.18*/if(userForm.hasGlobalErrors)/*121.46*/ {_display_(Seq[Any](format.raw/*121.48*/("""
                    """),format.raw/*122.21*/("""<p class="error">
                    """),_display_(/*123.22*/userForm/*123.30*/.globalError.message),format.raw/*123.50*/("""
                    """),format.raw/*124.21*/("""</p>
                """)))}),format.raw/*125.18*/("""  
                """),format.raw/*126.17*/("""<p>
                    <input type="email" name="email" placeholder="Email">
                </p>

                <p>
                    <input type="name" name="name" placeholder="Name">
                </p>

                <p>
                    <input type="password" name="password" placeholder="Password">
                </p>

                <p>
                    <input type="password" name="confirmPassword" placeholder="Confirm Password">
                </p>

                <p>
                    <button>Register</button>
                </p>

            </form>
        </div>

    </body>

</html>


"""))
      }
    }
  }

  def render(userForm:Form[controllers.HomeController.Registration]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[controllers.HomeController.Registration]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/register.scala.html
                  HASH: 994f0c13c4e445709f44eae76d20bcbeda22a2cf
                  MATRIX: 879->95|1031->152|1060->348|1088->350|1113->366|1153->368|1186->497|1219->559|1251->561|1280->563|1373->629|1402->630|1443->643|1914->1087|1943->1088|1980->1098|2017->1108|2046->1109|2087->1122|2141->1149|2170->1150|2207->1160|2250->1176|2279->1177|2320->1190|2582->1425|2611->1426|2648->1436|2690->1451|2719->1452|2760->1465|3326->2004|3355->2005|3392->2015|3430->2026|3459->2027|3500->2040|3707->2220|3736->2221|3768->2226|3902->2332|3918->2338|3982->2379|4092->2461|4108->2467|4151->2488|4304->2613|4320->2619|4363->2640|4614->2863|4630->2869|4680->2897|4778->2967|4816->2995|4857->2997|4907->3018|4974->3057|4992->3065|5034->3085|5084->3106|5138->3128|5186->3147
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->17|42->21|43->22|45->24|49->28|49->28|50->29|67->46|67->46|69->48|70->49|70->49|71->50|72->51|72->51|74->53|75->54|75->54|76->55|86->65|86->65|88->67|89->68|89->68|90->69|107->86|107->86|109->88|110->89|110->89|111->90|116->95|116->95|117->96|121->100|121->100|121->100|125->104|125->104|125->104|130->109|130->109|130->109|140->119|140->119|140->119|142->121|142->121|142->121|143->122|144->123|144->123|144->123|145->124|146->125|147->126
                  -- GENERATED --
              */
          