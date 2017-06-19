
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/conf/routes
// @DATE:Mon Jun 19 00:41:56 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:25
  SaleController_3: controllers.SaleController,
  // @LINE:35
  ItemController_4: controllers.ItemController,
  // @LINE:54
  TransactionController_0: controllers.TransactionController,
  // @LINE:66
  UserController_5: controllers.UserController,
  // @LINE:74
  Assets_6: controllers.Assets,
  // @LINE:76
  EmailController_1: controllers.EmailController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:25
    SaleController_3: controllers.SaleController,
    // @LINE:35
    ItemController_4: controllers.ItemController,
    // @LINE:54
    TransactionController_0: controllers.TransactionController,
    // @LINE:66
    UserController_5: controllers.UserController,
    // @LINE:74
    Assets_6: controllers.Assets,
    // @LINE:76
    EmailController_1: controllers.EmailController
  ) = this(errorHandler, HomeController_2, SaleController_3, ItemController_4, TransactionController_0, UserController_5, Assets_6, EmailController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, SaleController_3, ItemController_4, TransactionController_0, UserController_5, Assets_6, EmailController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """content""", """controllers.HomeController.content"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.postlogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.postRegister"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.editProfile"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.posteditProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createSalePage""", """controllers.SaleController.createSalePage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activesales""", """controllers.SaleController.listSales"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createsale""", """controllers.SaleController.createSale"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saleinfo""", """controllers.SaleController.saleInfo(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatesale""", """controllers.SaleController.updateSale(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletesale""", """controllers.SaleController.deleteSale(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """closeSale""", """controllers.SaleController.closeSale(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """printFinancialReport""", """controllers.SaleController.viewFinancialReport(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """printAltFinancialReport""", """controllers.SaleController.viewAltFinancialReport(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """additems""", """controllers.ItemController.addItem(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """additems""", """controllers.ItemController.postaddItem(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadimage""", """controllers.ItemController.uploadImage(ID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getImage""", """controllers.ItemController.getImage(ID:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchitems""", """controllers.ItemController.searchItem(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchitems""", """controllers.ItemController.postsearchItem()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUniqueItems""", """controllers.ItemController.searchUniqueItem(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUniqueItems""", """controllers.ItemController.postsearchUniqueItem(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """printUniqueItem""", """controllers.ItemController.printUniqueItem(itemname:String, ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """printUniqueItem""", """controllers.ItemController.postprintUniqueItem()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """printTags""", """controllers.ItemController.printTags(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUnsoldedItems""", """controllers.ItemController.searchUnsoldedItem(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createTransactionPage""", """controllers.TransactionController.createTransactionPage(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createTransaction""", """controllers.TransactionController.createTransaction(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listTransactions""", """controllers.TransactionController.listTransactions(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """printReceipt""", """controllers.TransactionController.printReceipt(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listAllTransactions""", """controllers.TransactionController.bookTransactions(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateitems""", """controllers.ItemController.updateItem(itemId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateitems""", """controllers.ItemController.postupdateItem"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchusers""", """controllers.UserController.searchUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateusers""", """controllers.UserController.postsearchUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assignusers""", """controllers.UserController.assignAdmin(ID:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assignusers""", """controllers.UserController.postassignAdmin(ID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendmail""", """controllers.EmailController.sendReceipt(saleID:String, transID:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_content1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("content")))
  )
  private[this] lazy val controllers_HomeController_content1_invoker = createInvoker(
    HomeController_2.content,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "content",
      Nil,
      "GET",
      """""",
      this.prefix + """content"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_2.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """login""",
      this.prefix + """login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_postlogin3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_postlogin3_invoker = createInvoker(
    HomeController_2.postlogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postlogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout4_invoker = createInvoker(
    HomeController_2.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """logout""",
      this.prefix + """logout"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_register5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register5_invoker = createInvoker(
    HomeController_2.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Nil,
      "GET",
      """register""",
      this.prefix + """register"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_postRegister6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_postRegister6_invoker = createInvoker(
    HomeController_2.postRegister,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_editProfile7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_editProfile7_invoker = createInvoker(
    HomeController_2.editProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editProfile",
      Nil,
      "GET",
      """profile""",
      this.prefix + """profile"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_posteditProfile8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_posteditProfile8_invoker = createInvoker(
    HomeController_2.posteditProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "posteditProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SaleController_createSalePage9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createSalePage")))
  )
  private[this] lazy val controllers_SaleController_createSalePage9_invoker = createInvoker(
    SaleController_3.createSalePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "createSalePage",
      Nil,
      "GET",
      """sale events""",
      this.prefix + """createSalePage"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SaleController_listSales10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activesales")))
  )
  private[this] lazy val controllers_SaleController_listSales10_invoker = createInvoker(
    SaleController_3.listSales,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "listSales",
      Nil,
      "GET",
      """""",
      this.prefix + """activesales"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_SaleController_createSale11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createsale")))
  )
  private[this] lazy val controllers_SaleController_createSale11_invoker = createInvoker(
    SaleController_3.createSale,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "createSale",
      Nil,
      "POST",
      """""",
      this.prefix + """createsale"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SaleController_saleInfo12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saleinfo")))
  )
  private[this] lazy val controllers_SaleController_saleInfo12_invoker = createInvoker(
    SaleController_3.saleInfo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "saleInfo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """saleinfo"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_SaleController_updateSale13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatesale")))
  )
  private[this] lazy val controllers_SaleController_updateSale13_invoker = createInvoker(
    SaleController_3.updateSale(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "updateSale",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """updatesale"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_SaleController_deleteSale14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletesale")))
  )
  private[this] lazy val controllers_SaleController_deleteSale14_invoker = createInvoker(
    SaleController_3.deleteSale(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "deleteSale",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deletesale"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_SaleController_closeSale15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("closeSale")))
  )
  private[this] lazy val controllers_SaleController_closeSale15_invoker = createInvoker(
    SaleController_3.closeSale(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "closeSale",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """closeSale"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_SaleController_viewFinancialReport16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("printFinancialReport")))
  )
  private[this] lazy val controllers_SaleController_viewFinancialReport16_invoker = createInvoker(
    SaleController_3.viewFinancialReport(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "viewFinancialReport",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """printFinancialReport"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_SaleController_viewAltFinancialReport17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("printAltFinancialReport")))
  )
  private[this] lazy val controllers_SaleController_viewAltFinancialReport17_invoker = createInvoker(
    SaleController_3.viewAltFinancialReport(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "viewAltFinancialReport",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """printAltFinancialReport"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ItemController_addItem18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("additems")))
  )
  private[this] lazy val controllers_ItemController_addItem18_invoker = createInvoker(
    ItemController_4.addItem(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "addItem",
      Seq(classOf[String]),
      "GET",
      """Add Items""",
      this.prefix + """additems"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ItemController_postaddItem19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("additems")))
  )
  private[this] lazy val controllers_ItemController_postaddItem19_invoker = createInvoker(
    ItemController_4.postaddItem(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "postaddItem",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """additems"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ItemController_uploadImage20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadimage")))
  )
  private[this] lazy val controllers_ItemController_uploadImage20_invoker = createInvoker(
    ItemController_4.uploadImage(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "uploadImage",
      Seq(classOf[Integer]),
      "POST",
      """Upload item's image""",
      this.prefix + """uploadimage"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ItemController_getImage21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getImage")))
  )
  private[this] lazy val controllers_ItemController_getImage21_invoker = createInvoker(
    ItemController_4.getImage(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "getImage",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """getImage"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ItemController_searchItem22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchitems")))
  )
  private[this] lazy val controllers_ItemController_searchItem22_invoker = createInvoker(
    ItemController_4.searchItem(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "searchItem",
      Seq(classOf[String]),
      "GET",
      """Search/Delete Items""",
      this.prefix + """searchitems"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ItemController_postsearchItem23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchitems")))
  )
  private[this] lazy val controllers_ItemController_postsearchItem23_invoker = createInvoker(
    ItemController_4.postsearchItem(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "postsearchItem",
      Nil,
      "POST",
      """""",
      this.prefix + """searchitems"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ItemController_searchUniqueItem24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUniqueItems")))
  )
  private[this] lazy val controllers_ItemController_searchUniqueItem24_invoker = createInvoker(
    ItemController_4.searchUniqueItem(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "searchUniqueItem",
      Seq(classOf[String]),
      "GET",
      """Search/Delete UniqueItem""",
      this.prefix + """searchUniqueItems"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ItemController_postsearchUniqueItem25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUniqueItems")))
  )
  private[this] lazy val controllers_ItemController_postsearchUniqueItem25_invoker = createInvoker(
    ItemController_4.postsearchUniqueItem(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "postsearchUniqueItem",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """searchUniqueItems"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_ItemController_printUniqueItem26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("printUniqueItem")))
  )
  private[this] lazy val controllers_ItemController_printUniqueItem26_invoker = createInvoker(
    ItemController_4.printUniqueItem(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "printUniqueItem",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """printUniqueItem"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ItemController_postprintUniqueItem27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("printUniqueItem")))
  )
  private[this] lazy val controllers_ItemController_postprintUniqueItem27_invoker = createInvoker(
    ItemController_4.postprintUniqueItem(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "postprintUniqueItem",
      Nil,
      "POST",
      """""",
      this.prefix + """printUniqueItem"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ItemController_printTags28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("printTags")))
  )
  private[this] lazy val controllers_ItemController_printTags28_invoker = createInvoker(
    ItemController_4.printTags(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "printTags",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """printTags"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_ItemController_searchUnsoldedItem29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUnsoldedItems")))
  )
  private[this] lazy val controllers_ItemController_searchUnsoldedItem29_invoker = createInvoker(
    ItemController_4.searchUnsoldedItem(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "searchUnsoldedItem",
      Seq(classOf[String]),
      "GET",
      """Search Unsolded Items""",
      this.prefix + """searchUnsoldedItems"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_TransactionController_createTransactionPage30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createTransactionPage")))
  )
  private[this] lazy val controllers_TransactionController_createTransactionPage30_invoker = createInvoker(
    TransactionController_0.createTransactionPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "createTransactionPage",
      Seq(classOf[String]),
      "GET",
      """Transaction""",
      this.prefix + """createTransactionPage"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_TransactionController_createTransaction31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createTransaction")))
  )
  private[this] lazy val controllers_TransactionController_createTransaction31_invoker = createInvoker(
    TransactionController_0.createTransaction(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "createTransaction",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """createTransaction"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_TransactionController_listTransactions32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listTransactions")))
  )
  private[this] lazy val controllers_TransactionController_listTransactions32_invoker = createInvoker(
    TransactionController_0.listTransactions(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "listTransactions",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """listTransactions"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_TransactionController_printReceipt33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("printReceipt")))
  )
  private[this] lazy val controllers_TransactionController_printReceipt33_invoker = createInvoker(
    TransactionController_0.printReceipt(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "printReceipt",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """printReceipt"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_TransactionController_bookTransactions34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listAllTransactions")))
  )
  private[this] lazy val controllers_TransactionController_bookTransactions34_invoker = createInvoker(
    TransactionController_0.bookTransactions(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TransactionController",
      "bookTransactions",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """listAllTransactions"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_ItemController_updateItem35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateitems")))
  )
  private[this] lazy val controllers_ItemController_updateItem35_invoker = createInvoker(
    ItemController_4.updateItem(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "updateItem",
      Seq(classOf[Int]),
      "GET",
      """Update Items""",
      this.prefix + """updateitems"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_ItemController_postupdateItem36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateitems")))
  )
  private[this] lazy val controllers_ItemController_postupdateItem36_invoker = createInvoker(
    ItemController_4.postupdateItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ItemController",
      "postupdateItem",
      Nil,
      "POST",
      """""",
      this.prefix + """updateitems"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_UserController_searchUser37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchusers")))
  )
  private[this] lazy val controllers_UserController_searchUser37_invoker = createInvoker(
    UserController_5.searchUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "searchUser",
      Nil,
      "GET",
      """Users Edit""",
      this.prefix + """searchusers"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_UserController_postsearchUser38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateusers")))
  )
  private[this] lazy val controllers_UserController_postsearchUser38_invoker = createInvoker(
    UserController_5.postsearchUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "postsearchUser",
      Nil,
      "POST",
      """""",
      this.prefix + """updateusers"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_UserController_assignAdmin39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assignusers")))
  )
  private[this] lazy val controllers_UserController_assignAdmin39_invoker = createInvoker(
    UserController_5.assignAdmin(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "assignAdmin",
      Seq(classOf[String]),
      "GET",
      """Assign users""",
      this.prefix + """assignusers"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_UserController_postassignAdmin40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assignusers")))
  )
  private[this] lazy val controllers_UserController_postassignAdmin40_invoker = createInvoker(
    UserController_5.postassignAdmin(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "postassignAdmin",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """assignusers"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_Assets_versioned41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned41_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_EmailController_sendReceipt42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendmail")))
  )
  private[this] lazy val controllers_EmailController_sendReceipt42_invoker = createInvoker(
    EmailController_1.sendReceipt(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmailController",
      "sendReceipt",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """sendmail"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:10
    case controllers_HomeController_content1_route(params) =>
      call { 
        controllers_HomeController_content1_invoker.call(HomeController_2.content)
      }
  
    // @LINE:13
    case controllers_HomeController_login2_route(params) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_2.login)
      }
  
    // @LINE:14
    case controllers_HomeController_postlogin3_route(params) =>
      call { 
        controllers_HomeController_postlogin3_invoker.call(HomeController_2.postlogin)
      }
  
    // @LINE:16
    case controllers_HomeController_logout4_route(params) =>
      call { 
        controllers_HomeController_logout4_invoker.call(HomeController_2.logout)
      }
  
    // @LINE:18
    case controllers_HomeController_register5_route(params) =>
      call { 
        controllers_HomeController_register5_invoker.call(HomeController_2.register)
      }
  
    // @LINE:19
    case controllers_HomeController_postRegister6_route(params) =>
      call { 
        controllers_HomeController_postRegister6_invoker.call(HomeController_2.postRegister)
      }
  
    // @LINE:21
    case controllers_HomeController_editProfile7_route(params) =>
      call { 
        controllers_HomeController_editProfile7_invoker.call(HomeController_2.editProfile)
      }
  
    // @LINE:22
    case controllers_HomeController_posteditProfile8_route(params) =>
      call { 
        controllers_HomeController_posteditProfile8_invoker.call(HomeController_2.posteditProfile)
      }
  
    // @LINE:25
    case controllers_SaleController_createSalePage9_route(params) =>
      call { 
        controllers_SaleController_createSalePage9_invoker.call(SaleController_3.createSalePage)
      }
  
    // @LINE:26
    case controllers_SaleController_listSales10_route(params) =>
      call { 
        controllers_SaleController_listSales10_invoker.call(SaleController_3.listSales)
      }
  
    // @LINE:27
    case controllers_SaleController_createSale11_route(params) =>
      call { 
        controllers_SaleController_createSale11_invoker.call(SaleController_3.createSale)
      }
  
    // @LINE:28
    case controllers_SaleController_saleInfo12_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_SaleController_saleInfo12_invoker.call(SaleController_3.saleInfo(ID))
      }
  
    // @LINE:29
    case controllers_SaleController_updateSale13_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_SaleController_updateSale13_invoker.call(SaleController_3.updateSale(ID))
      }
  
    // @LINE:30
    case controllers_SaleController_deleteSale14_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_SaleController_deleteSale14_invoker.call(SaleController_3.deleteSale(ID))
      }
  
    // @LINE:31
    case controllers_SaleController_closeSale15_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_SaleController_closeSale15_invoker.call(SaleController_3.closeSale(ID))
      }
  
    // @LINE:32
    case controllers_SaleController_viewFinancialReport16_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_SaleController_viewFinancialReport16_invoker.call(SaleController_3.viewFinancialReport(ID))
      }
  
    // @LINE:33
    case controllers_SaleController_viewAltFinancialReport17_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_SaleController_viewAltFinancialReport17_invoker.call(SaleController_3.viewAltFinancialReport(ID))
      }
  
    // @LINE:35
    case controllers_ItemController_addItem18_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_ItemController_addItem18_invoker.call(ItemController_4.addItem(ID))
      }
  
    // @LINE:36
    case controllers_ItemController_postaddItem19_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_ItemController_postaddItem19_invoker.call(ItemController_4.postaddItem(ID))
      }
  
    // @LINE:38
    case controllers_ItemController_uploadImage20_route(params) =>
      call(params.fromQuery[Integer]("ID", None)) { (ID) =>
        controllers_ItemController_uploadImage20_invoker.call(ItemController_4.uploadImage(ID))
      }
  
    // @LINE:39
    case controllers_ItemController_getImage21_route(params) =>
      call(params.fromQuery[Integer]("ID", None)) { (ID) =>
        controllers_ItemController_getImage21_invoker.call(ItemController_4.getImage(ID))
      }
  
    // @LINE:41
    case controllers_ItemController_searchItem22_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_ItemController_searchItem22_invoker.call(ItemController_4.searchItem(ID))
      }
  
    // @LINE:42
    case controllers_ItemController_postsearchItem23_route(params) =>
      call { 
        controllers_ItemController_postsearchItem23_invoker.call(ItemController_4.postsearchItem())
      }
  
    // @LINE:45
    case controllers_ItemController_searchUniqueItem24_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_ItemController_searchUniqueItem24_invoker.call(ItemController_4.searchUniqueItem(ID))
      }
  
    // @LINE:46
    case controllers_ItemController_postsearchUniqueItem25_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_ItemController_postsearchUniqueItem25_invoker.call(ItemController_4.postsearchUniqueItem(ID))
      }
  
    // @LINE:47
    case controllers_ItemController_printUniqueItem26_route(params) =>
      call(params.fromQuery[String]("itemname", None), params.fromQuery[String]("ID", None)) { (itemname, ID) =>
        controllers_ItemController_printUniqueItem26_invoker.call(ItemController_4.printUniqueItem(itemname, ID))
      }
  
    // @LINE:48
    case controllers_ItemController_postprintUniqueItem27_route(params) =>
      call { 
        controllers_ItemController_postprintUniqueItem27_invoker.call(ItemController_4.postprintUniqueItem())
      }
  
    // @LINE:49
    case controllers_ItemController_printTags28_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_ItemController_printTags28_invoker.call(ItemController_4.printTags(ID))
      }
  
    // @LINE:51
    case controllers_ItemController_searchUnsoldedItem29_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_ItemController_searchUnsoldedItem29_invoker.call(ItemController_4.searchUnsoldedItem(ID))
      }
  
    // @LINE:54
    case controllers_TransactionController_createTransactionPage30_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_TransactionController_createTransactionPage30_invoker.call(TransactionController_0.createTransactionPage(ID))
      }
  
    // @LINE:55
    case controllers_TransactionController_createTransaction31_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_TransactionController_createTransaction31_invoker.call(TransactionController_0.createTransaction(ID))
      }
  
    // @LINE:56
    case controllers_TransactionController_listTransactions32_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_TransactionController_listTransactions32_invoker.call(TransactionController_0.listTransactions(ID))
      }
  
    // @LINE:57
    case controllers_TransactionController_printReceipt33_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_TransactionController_printReceipt33_invoker.call(TransactionController_0.printReceipt(ID))
      }
  
    // @LINE:58
    case controllers_TransactionController_bookTransactions34_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_TransactionController_bookTransactions34_invoker.call(TransactionController_0.bookTransactions(ID))
      }
  
    // @LINE:61
    case controllers_ItemController_updateItem35_route(params) =>
      call(params.fromQuery[Int]("itemId", None)) { (itemId) =>
        controllers_ItemController_updateItem35_invoker.call(ItemController_4.updateItem(itemId))
      }
  
    // @LINE:62
    case controllers_ItemController_postupdateItem36_route(params) =>
      call { 
        controllers_ItemController_postupdateItem36_invoker.call(ItemController_4.postupdateItem)
      }
  
    // @LINE:66
    case controllers_UserController_searchUser37_route(params) =>
      call { 
        controllers_UserController_searchUser37_invoker.call(UserController_5.searchUser())
      }
  
    // @LINE:67
    case controllers_UserController_postsearchUser38_route(params) =>
      call { 
        controllers_UserController_postsearchUser38_invoker.call(UserController_5.postsearchUser())
      }
  
    // @LINE:70
    case controllers_UserController_assignAdmin39_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_UserController_assignAdmin39_invoker.call(UserController_5.assignAdmin(ID))
      }
  
    // @LINE:71
    case controllers_UserController_postassignAdmin40_route(params) =>
      call(params.fromQuery[String]("ID", None)) { (ID) =>
        controllers_UserController_postassignAdmin40_invoker.call(UserController_5.postassignAdmin(ID))
      }
  
    // @LINE:74
    case controllers_Assets_versioned41_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned41_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:76
    case controllers_EmailController_sendReceipt42_route(params) =>
      call(params.fromQuery[String]("saleID", None), params.fromQuery[String]("transID", None)) { (saleID, transID) =>
        controllers_EmailController_sendReceipt42_invoker.call(EmailController_1.sendReceipt(saleID, transID))
      }
  }
}
