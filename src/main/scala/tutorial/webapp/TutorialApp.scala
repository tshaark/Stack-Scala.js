package tutorial.webapp
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom.html

object TutorialApp {
    def appendPar(targetNode: dom.Node, text: String): Unit = {
        val parNode = document.createElement("tr")
        val textNode = document.createTextNode(text)
        parNode.appendChild(textNode)
        val stack = document.getElementById("stack-div").asInstanceOf[html.Input]
        stack.insertBefore(parNode,stack.childNodes.apply(0))
        // targetNode.insertBefore(parNode)
    }
    def delPar(targetNode: dom.Node): Unit = {
         val stack = document.getElementById("stack-div").asInstanceOf[html.Input]
         stack.removeChild(stack.childNodes.apply(0));
    }
    def main(args: Array[String]): Unit = {
        // appendPar(document.body, "Hello World")
    }
    @JSExportTopLevel("Push")
        def Push(): Unit = {
        appendPar(document.body, document.getElementById("num-input").asInstanceOf[html.Input].value)
    }
    @JSExportTopLevel("Pop")
        def Pop(): Unit = {
        delPar(document.body)
    }

}