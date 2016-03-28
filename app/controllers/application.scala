package controllers

import javax.inject._
import play.api.mvc.{Action, Controller}

class Application @Inject() (webJarAssets: WebJarAssets) extends Controller {
  def index = Action {
    Ok(views.html.index("Hello Play Framework", webJarAssets))
  }
}