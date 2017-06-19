
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/conf/routes
// @DATE:Mon Jun 19 00:41:56 EDT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:74
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:66
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def postassignAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postassignAdmin",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "assignusers" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:70
    def assignAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.assignAdmin",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assignusers" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:67
    def postsearchUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postsearchUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateusers"})
        }
      """
    )
  
    // @LINE:66
    def searchUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.searchUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchusers"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def postlogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.postlogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:22
    def posteditProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.posteditProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:10
    def content: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.content",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "content"})
        }
      """
    )
  
    // @LINE:19
    def postRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.postRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:16
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:18
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:21
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseItemController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def postaddItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.postaddItem",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "additems" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:49
    def printTags: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.printTags",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "printTags" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:48
    def postprintUniqueItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.postprintUniqueItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "printUniqueItem"})
        }
      """
    )
  
    // @LINE:35
    def addItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.addItem",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "additems" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:42
    def postsearchItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.postsearchItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchitems"})
        }
      """
    )
  
    // @LINE:39
    def getImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.getImage",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getImage" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:51
    def searchUnsoldedItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.searchUnsoldedItem",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchUnsoldedItems" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:45
    def searchUniqueItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.searchUniqueItem",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchUniqueItems" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:62
    def postupdateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.postupdateItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateitems"})
        }
      """
    )
  
    // @LINE:61
    def updateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.updateItem",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateitems" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("itemId", itemId0)])})
        }
      """
    )
  
    // @LINE:38
    def uploadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.uploadImage",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadimage" + _qS([(""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:46
    def postsearchUniqueItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.postsearchUniqueItem",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchUniqueItems" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:47
    def printUniqueItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.printUniqueItem",
      """
        function(itemname0,ID1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "printUniqueItem" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("itemname", itemname0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID1)])})
        }
      """
    )
  
    // @LINE:41
    def searchItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ItemController.searchItem",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchitems" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
  }

  // @LINE:76
  class ReverseEmailController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def sendReceipt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmailController.sendReceipt",
      """
        function(saleID0,transID1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sendmail" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("saleID", saleID0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("transID", transID1)])})
        }
      """
    )
  
  }

  // @LINE:54
  class ReverseTransactionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def printReceipt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.printReceipt",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "printReceipt" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:55
    def createTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.createTransaction",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createTransaction" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:54
    def createTransactionPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.createTransactionPage",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createTransactionPage" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:58
    def bookTransactions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.bookTransactions",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listAllTransactions" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:56
    def listTransactions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TransactionController.listTransactions",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listTransactions" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseSaleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def createSalePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.createSalePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createSalePage"})
        }
      """
    )
  
    // @LINE:33
    def viewAltFinancialReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.viewAltFinancialReport",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "printAltFinancialReport" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:27
    def createSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.createSale",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createsale"})
        }
      """
    )
  
    // @LINE:26
    def listSales: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.listSales",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activesales"})
        }
      """
    )
  
    // @LINE:30
    def deleteSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.deleteSale",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletesale" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:31
    def closeSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.closeSale",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "closeSale" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:29
    def updateSale: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.updateSale",
      """
        function(ID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatesale" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:28
    def saleInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.saleInfo",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "saleinfo" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
    // @LINE:32
    def viewFinancialReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.viewFinancialReport",
      """
        function(ID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "printFinancialReport" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("ID", ID0)])})
        }
      """
    )
  
  }


}
