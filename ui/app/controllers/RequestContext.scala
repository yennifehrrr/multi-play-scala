package controllers

import play.api.mvc.{ Flash, Request }

object RequestContext {

  def apply()(implicit request: Request[_]) = {
    new RequestContext(request)
  }

}

class RequestContext(
  request: Request[_]
) {

  lazy val flash: Flash = request.flash

}
