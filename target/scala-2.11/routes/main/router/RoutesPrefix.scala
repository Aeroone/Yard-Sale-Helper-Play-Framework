
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/conf/routes
// @DATE:Mon Jun 19 00:41:56 EDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
