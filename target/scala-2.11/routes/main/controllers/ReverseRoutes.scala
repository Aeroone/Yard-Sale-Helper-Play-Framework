
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/conf/routes
// @DATE:Mon Jun 19 00:41:56 EDT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:74
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:66
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def postassignAdmin(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "assignusers" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:70
    def assignAdmin(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "assignusers" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:67
    def postsearchUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateusers")
    }
  
    // @LINE:66
    def searchUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "searchusers")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def postlogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:22
    def posteditProfile(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:10
    def content(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "content")
    }
  
    // @LINE:19
    def postRegister(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:16
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:18
    def register(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:21
    def editProfile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:35
  class ReverseItemController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def postaddItem(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "additems" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:49
    def printTags(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "printTags" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:48
    def postprintUniqueItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "printUniqueItem")
    }
  
    // @LINE:35
    def addItem(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "additems" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:42
    def postsearchItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchitems")
    }
  
    // @LINE:39
    def getImage(ID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getImage" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("ID", ID)))))
    }
  
    // @LINE:51
    def searchUnsoldedItem(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "searchUnsoldedItems" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:45
    def searchUniqueItem(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "searchUniqueItems" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:62
    def postupdateItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateitems")
    }
  
    // @LINE:61
    def updateItem(itemId:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "updateitems" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("itemId", itemId)))))
    }
  
    // @LINE:38
    def uploadImage(ID:Integer): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uploadimage" + queryString(List(Some(implicitly[QueryStringBindable[Integer]].unbind("ID", ID)))))
    }
  
    // @LINE:46
    def postsearchUniqueItem(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchUniqueItems" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:47
    def printUniqueItem(itemname:String, ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "printUniqueItem" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("itemname", itemname)), Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:41
    def searchItem(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "searchitems" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
  }

  // @LINE:76
  class ReverseEmailController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def sendReceipt(saleID:String, transID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sendmail" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("saleID", saleID)), Some(implicitly[QueryStringBindable[String]].unbind("transID", transID)))))
    }
  
  }

  // @LINE:54
  class ReverseTransactionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def printReceipt(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "printReceipt" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:55
    def createTransaction(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "createTransaction" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:54
    def createTransactionPage(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "createTransactionPage" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:58
    def bookTransactions(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listAllTransactions" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:56
    def listTransactions(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listTransactions" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
  }

  // @LINE:25
  class ReverseSaleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def createSalePage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "createSalePage")
    }
  
    // @LINE:33
    def viewAltFinancialReport(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "printAltFinancialReport" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:27
    def createSale(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "createsale")
    }
  
    // @LINE:26
    def listSales(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "activesales")
    }
  
    // @LINE:30
    def deleteSale(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deletesale" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:31
    def closeSale(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "closeSale" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:29
    def updateSale(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatesale" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:28
    def saleInfo(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "saleinfo" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
    // @LINE:32
    def viewFinancialReport(ID:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "printFinancialReport" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("ID", ID)))))
    }
  
  }


}
