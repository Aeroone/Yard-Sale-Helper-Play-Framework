
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[controllers.HomeController.Profile],User,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(userForm: Form[controllers.HomeController.Profile], user:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.65*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Register")/*12.18*/ {_display_(Seq[Any](format.raw/*12.20*/("""
""")))}),format.raw/*13.2*/("""
"""),format.raw/*14.1*/("""<!DOCTYPE>
<html>
    """),format.raw/*16.32*/("""

        """),format.raw/*18.25*/("""
        """),format.raw/*19.14*/("""
            """),format.raw/*20.36*/("""
            """),format.raw/*21.23*/("""
            """),format.raw/*22.27*/("""
            """),format.raw/*23.25*/("""
            """),format.raw/*24.26*/("""
            """),format.raw/*25.36*/("""

            """),format.raw/*27.31*/("""
            """),format.raw/*28.29*/("""
            """),format.raw/*29.30*/("""
            """),format.raw/*30.35*/("""
            """),format.raw/*31.36*/("""
            """),format.raw/*32.35*/("""
            """),format.raw/*33.36*/("""
            """),format.raw/*34.64*/("""
        """),format.raw/*35.14*/("""

        """),format.raw/*37.20*/("""
        """),format.raw/*38.14*/("""
            """),format.raw/*39.28*/("""
            """),format.raw/*40.28*/("""
            """),format.raw/*41.29*/("""
            """),format.raw/*42.35*/("""
            """),format.raw/*43.35*/("""
            """),format.raw/*44.27*/("""
            """),format.raw/*45.28*/("""
            """),format.raw/*46.34*/("""
            """),format.raw/*47.33*/("""
        """),format.raw/*48.14*/("""

        """),format.raw/*50.19*/("""
        """),format.raw/*51.14*/("""
            """),format.raw/*52.35*/("""
            """),format.raw/*53.27*/("""
            """),format.raw/*54.26*/("""
            """),format.raw/*55.34*/("""
            """),format.raw/*56.36*/("""
            """),format.raw/*57.38*/("""
            """),format.raw/*58.30*/("""
            """),format.raw/*59.37*/("""
            """),format.raw/*60.31*/("""
            """),format.raw/*61.30*/("""
            """),format.raw/*62.35*/("""
            """),format.raw/*63.34*/("""
            """),format.raw/*64.34*/("""
            """),format.raw/*65.36*/("""
            """),format.raw/*66.64*/("""
            """),format.raw/*67.33*/("""
            """),format.raw/*68.51*/("""
        """),format.raw/*69.14*/("""

        """),format.raw/*71.15*/("""
        """),format.raw/*72.14*/("""
            """),format.raw/*73.35*/("""
            """),format.raw/*74.29*/("""
            """),format.raw/*75.34*/("""
        """),format.raw/*76.14*/("""

        """),format.raw/*78.16*/("""
            """),format.raw/*79.36*/("""
            """),format.raw/*80.18*/("""
        """),format.raw/*81.14*/("""
    """),format.raw/*82.17*/("""
    """),format.raw/*83.5*/("""<head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*84.54*/routes/*84.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*84.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*85.54*/routes/*85.60*/.Assets.versioned("stylesheets/content.css")),format.raw/*85.104*/("""">
    </head>
    <body>

        <header>
            <dd>
                <a href=""""),_display_(/*91.27*/routes/*91.33*/.HomeController.content),format.raw/*91.56*/("""" style="float: left" class="button"><en>Back</en></a>
                <a href=""""),_display_(/*92.27*/routes/*92.33*/.HomeController.logout()),format.raw/*92.57*/("""" style="font-size: 12px; float:right" class="button">Logout</a>
            </dd>
        </header>
        <div>
            <form style="column-count:2" action = """"),_display_(/*96.53*/routes/*96.59*/.HomeController.posteditProfile),format.raw/*96.90*/("""" method="post">
                <div id="primary">
                    <h1 style="font-size: 2em">Profile</h1>
                    """),_display_(/*99.22*/if(userForm.hasGlobalErrors)/*99.50*/ {_display_(Seq[Any](format.raw/*99.52*/("""
                        """),format.raw/*100.25*/("""<p class="error">
                        """),_display_(/*101.26*/userForm/*101.34*/.globalError.message),format.raw/*101.54*/("""
                        """),format.raw/*102.25*/("""</p>
                    """)))}),format.raw/*103.22*/("""
                    """),format.raw/*104.21*/("""<p>
                        Name:  """),_display_(/*105.33*/user/*105.37*/.name),format.raw/*105.42*/("""
                    """),format.raw/*106.21*/("""</p>

                    <p>
                        Email: """),_display_(/*109.33*/user/*109.37*/.email),format.raw/*109.43*/("""
                    """),format.raw/*110.21*/("""</p>

                    <p>
                        Web Authority: """),_display_(/*113.41*/user/*113.45*/.getAuthority()),format.raw/*113.60*/("""
                    """),format.raw/*114.21*/("""</p>

                    <p>
                        Address: """),_display_(/*117.35*/user/*117.39*/.address),format.raw/*117.47*/("""
                    """),format.raw/*118.21*/("""</p>

                    <p>
                        Hobby: """),_display_(/*121.33*/user/*121.37*/.hobby),format.raw/*121.43*/("""
                    """),format.raw/*122.21*/("""</p>

                    <p>
                        Job: """),_display_(/*125.31*/user/*125.35*/.job),format.raw/*125.39*/("""
                    """),format.raw/*126.21*/("""</p>
                </div>

                <div id="secondary">
                        <h2 class="more-info">Add More Info</h2>
                        <p>
                            Address: <input type="address" name="address">
                        </p>

                        <p>
                            Hobby: <input type="hobby" name="hobby">
                        </p>

                        <p>
                            Job: <input type="job" name="job">
                        </p>
                        <p>
                            <button class="button">Update</button>
                        </p>
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

  def render(userForm:Form[controllers.HomeController.Profile],user:User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[controllers.HomeController.Profile],User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 00:42:01 EDT 2017
                  SOURCE: E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/app/views/profile.scala.html
                  HASH: ff5c2d059c069a82abb5807068977c4400837e92
                  MATRIX: 877->95|1035->158|1064->354|1092->356|1117->372|1157->374|1189->376|1217->377|1267->426|1305->452|1342->466|1383->502|1424->525|1465->552|1506->577|1547->603|1588->639|1630->671|1671->700|1712->730|1753->765|1794->801|1835->836|1876->872|1917->936|1954->950|1992->971|2029->985|2070->1013|2111->1041|2152->1070|2193->1105|2234->1140|2275->1167|2316->1195|2357->1229|2398->1262|2435->1276|2473->1296|2510->1310|2551->1345|2592->1372|2633->1398|2674->1432|2715->1468|2756->1506|2797->1536|2838->1573|2879->1604|2920->1634|2961->1669|3002->1703|3043->1737|3084->1773|3125->1837|3166->1870|3207->1921|3244->1935|3282->1951|3319->1965|3360->2000|3401->2029|3442->2063|3479->2077|3517->2094|3558->2130|3599->2148|3636->2162|3669->2179|3701->2184|3788->2244|3803->2250|3866->2291|3949->2347|3964->2353|4030->2397|4144->2484|4159->2490|4203->2513|4311->2594|4326->2600|4371->2624|4565->2791|4580->2797|4632->2828|4792->2961|4829->2989|4869->2991|4923->3016|4994->3059|5012->3067|5054->3087|5108->3112|5166->3138|5216->3159|5280->3195|5294->3199|5321->3204|5371->3225|5461->3287|5475->3291|5503->3297|5553->3318|5651->3388|5665->3392|5702->3407|5752->3428|5844->3492|5858->3496|5888->3504|5938->3525|6028->3587|6042->3591|6070->3597|6120->3618|6208->3678|6222->3682|6248->3686|6298->3707
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|39->13|40->14|42->16|44->18|45->19|46->20|47->21|48->22|49->23|50->24|51->25|53->27|54->28|55->29|56->30|57->31|58->32|59->33|60->34|61->35|63->37|64->38|65->39|66->40|67->41|68->42|69->43|70->44|71->45|72->46|73->47|74->48|76->50|77->51|78->52|79->53|80->54|81->55|82->56|83->57|84->58|85->59|86->60|87->61|88->62|89->63|90->64|91->65|92->66|93->67|94->68|95->69|97->71|98->72|99->73|100->74|101->75|102->76|104->78|105->79|106->80|107->81|108->82|109->83|110->84|110->84|110->84|111->85|111->85|111->85|117->91|117->91|117->91|118->92|118->92|118->92|122->96|122->96|122->96|125->99|125->99|125->99|126->100|127->101|127->101|127->101|128->102|129->103|130->104|131->105|131->105|131->105|132->106|135->109|135->109|135->109|136->110|139->113|139->113|139->113|140->114|143->117|143->117|143->117|144->118|147->121|147->121|147->121|148->122|151->125|151->125|151->125|152->126
                  -- GENERATED --
              */
          