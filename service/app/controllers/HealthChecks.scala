package controllers
import play.api.mvc._
import play.api.libs.json.Json

object HealthChecks extends Controller {

  def get = Action {
    Ok(Json.toJson(Seq(("healthy"))))
  }

}
