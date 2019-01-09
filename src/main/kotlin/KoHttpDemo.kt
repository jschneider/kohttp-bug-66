import io.github.rybalkinsd.kohttp.ext.httpGet
import okhttp3.Response

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
fun main(args: Array<String>) {
  val response: Response = "https://google.com/search?q=iphone".httpGet()

  println("Response $response")
}