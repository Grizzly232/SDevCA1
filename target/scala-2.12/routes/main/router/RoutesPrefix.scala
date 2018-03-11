
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Downloads/JAva/SDevCA1-mickbranch/SDevCA1-mickbranch/play-java-seed/conf/routes
// @DATE:Sun Mar 11 15:44:36 GMT 2018


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
