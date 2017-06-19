
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.HomeController.Login],play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(userForm: Form[controllers.HomeController.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.52*/("""

"""),format.raw/*9.1*/("""<html>
    <style type="text/css">

    #loginform """),format.raw/*12.16*/("""{"""),format.raw/*12.17*/("""
        """),format.raw/*13.9*/("""position: absolute;
        top:0;
        bottom: 0;
        left: 0;
        right: 0;

        margin: 250px auto;

        float:center;
        width:350px;
        height:220px;
        padding:10px 15px;
        background: #316ba9;
        border: #9219ff;
        border-style: ridge;
        border-radius: 100px;
        box-shadow: 0px 0px 5px 5px rgba(255, 255, 255, 0.22);
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/("""

    """),format.raw/*32.5*/("""h1 """),format.raw/*32.8*/("""{"""),format.raw/*32.9*/("""
        """),format.raw/*33.9*/("""text-align:center;
        color:white;
        font-size:15px;
        padding: 5px 0px;
    """),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""

    """),format.raw/*39.5*/("""button """),format.raw/*39.12*/("""{"""),format.raw/*39.13*/("""
        """),format.raw/*40.9*/("""position:absolute;
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
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""

    """),format.raw/*59.5*/("""#cancel """),format.raw/*59.13*/("""{"""),format.raw/*59.14*/("""
        """),format.raw/*60.9*/("""float:left;
        width:40px;
        height:9px;
        padding:10px 15px;
        position:absolute;
        left: 48%;
        top: 45%;
        margin-left:10px;
        margin-top:40px;
    """),format.raw/*69.5*/("""}"""),format.raw/*69.6*/("""

    """),format.raw/*71.5*/("""p """),format.raw/*71.7*/("""{"""),format.raw/*71.8*/("""
        """),format.raw/*72.9*/("""text-align:center;
        margin: 15px auto;
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/("""

    """),format.raw/*76.5*/(""".error """),format.raw/*76.12*/("""{"""),format.raw/*76.13*/("""
        """),format.raw/*77.9*/("""text-align: center;
        color: red;
        font-size: 1.125em;
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""
    """),format.raw/*81.5*/("""</style>

    <head>
        <title>Login</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*85.54*/routes/*85.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*85.101*/("""">
    </head>
    <body class="mainPage">
        <header>
            <a href=""""),_display_(/*89.23*/routes/*89.29*/.HomeController.index),format.raw/*89.50*/("""" id="logo" class="button"><en>Back</en></a>
        </header>

        <div id="loginform">
           <form action = """"),_display_(/*93.29*/routes/*93.35*/.HomeController.index),format.raw/*93.56*/("""" method = "get">

                <div id="cancel">
                    <p>
                        <button>Cancel</button>
                    </p>
                </div>

           </form>

           <form action = """"),_display_(/*103.29*/routes/*103.35*/.HomeController.postlogin),format.raw/*103.60*/("""" method = "post">
                <h1>Sign in</h1>

                """),_display_(/*106.18*/if(userForm.hasGlobalErrors)/*106.46*/ {_display_(Seq[Any](format.raw/*106.48*/("""
                    """),format.raw/*107.21*/("""<p class="error">
                    """),_display_(/*108.22*/userForm/*108.30*/.globalError.message),format.raw/*108.50*/("""
                    """),format.raw/*109.21*/("""</p>
                """)))}),format.raw/*110.18*/("""
                """),_display_(/*111.18*/if(flash.contains("success"))/*111.47*/ {_display_(Seq[Any](format.raw/*111.49*/("""
                    """),format.raw/*112.21*/("""<p class="success">
                    """),_display_(/*113.22*/flash/*113.27*/.get("success")),format.raw/*113.42*/("""
                    """),format.raw/*114.21*/("""</p>
                """)))}),format.raw/*115.18*/("""

                """),format.raw/*117.17*/("""<p>
                    <input type="email" name="email" placeholder="Email">
                </p>

                <p>
                    <input type="password" name="password" placeholder="Password">
                </p>

                <p>
                    <button type="submit">Login</button>
                </p>

           </form>
        </div>

    </body>

</html>



"""))
      }
    }
  }

  def render(userForm:Form[controllers.HomeController.Login]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((Form[controllers.HomeController.Login]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/login.scala.html
                  HASH: 3dfe059d086075eb147b9bed09f5afb721c590f9
                  MATRIX: 1031->260|1176->310|1204->312|1283->363|1312->364|1348->373|1766->764|1794->765|1827->771|1857->774|1885->775|1921->784|2042->878|2070->879|2103->885|2138->892|2167->893|2203->902|2701->1373|2729->1374|2762->1380|2798->1388|2827->1389|2863->1398|3088->1596|3116->1597|3149->1603|3178->1605|3206->1606|3242->1615|3319->1665|3347->1666|3380->1672|3415->1679|3444->1680|3480->1689|3579->1761|3607->1762|3639->1767|3769->1870|3784->1876|3847->1917|3956->1999|3971->2005|4013->2026|4161->2147|4176->2153|4218->2174|4468->2396|4484->2402|4531->2427|4629->2497|4667->2525|4708->2527|4758->2548|4825->2587|4843->2595|4885->2615|4935->2636|4989->2658|5035->2676|5074->2705|5115->2707|5165->2728|5234->2769|5249->2774|5286->2789|5336->2810|5390->2832|5437->2850
                  LINES: 32->7|37->7|39->9|42->12|42->12|43->13|60->30|60->30|62->32|62->32|62->32|63->33|67->37|67->37|69->39|69->39|69->39|70->40|87->57|87->57|89->59|89->59|89->59|90->60|99->69|99->69|101->71|101->71|101->71|102->72|104->74|104->74|106->76|106->76|106->76|107->77|110->80|110->80|111->81|115->85|115->85|115->85|119->89|119->89|119->89|123->93|123->93|123->93|133->103|133->103|133->103|136->106|136->106|136->106|137->107|138->108|138->108|138->108|139->109|140->110|141->111|141->111|141->111|142->112|143->113|143->113|143->113|144->114|145->115|147->117
                  -- GENERATED --
              */
          