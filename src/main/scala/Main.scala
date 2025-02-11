import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.web.HTMLEditor
import javafx.stage.Stage

object Main extends App {
  Application.launch(classOf[Main], args: _*)
}

class Main extends Application {
  override def start(stage: Stage): Unit = {
    stage.setTitle("HTML Editor")
    stage.setWidth(650)
    stage.setHeight(300)
    val editor = new HTMLEditor()
    editor.setPrefHeight(245)
    stage.setScene(new Scene(editor))
    stage.show()
  }
}