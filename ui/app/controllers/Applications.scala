package controllers

import play.api.mvc._

object Applications extends Controller {

  def index() = Action {
    Ok(views.html.index.render("hi this was successful!"))
  }

  def healthCheck = Action { implicit request =>
    Ok("healthy")
  }

}
