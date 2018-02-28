
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/Documents/GitHub/SDevCA1/play-java-seed/conf/routes
// @DATE:Wed Feb 28 22:11:22 GMT 2018


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
