
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/PlayFramework/typesafe-activator-1.3.10/activator-dist-1.3.10/bin/Yard_Sale_Helper/conf/routes
// @DATE:Mon Jun 19 00:41:56 EDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseItemController ItemController = new controllers.ReverseItemController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmailController EmailController = new controllers.ReverseEmailController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTransactionController TransactionController = new controllers.ReverseTransactionController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSaleController SaleController = new controllers.ReverseSaleController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseItemController ItemController = new controllers.javascript.ReverseItemController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmailController EmailController = new controllers.javascript.ReverseEmailController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTransactionController TransactionController = new controllers.javascript.ReverseTransactionController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSaleController SaleController = new controllers.javascript.ReverseSaleController(RoutesPrefix.byNamePrefix());
  }

}
