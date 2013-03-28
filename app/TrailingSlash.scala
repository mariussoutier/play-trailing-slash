package com.mariussoutier.play

import play.api._
import play.api.mvc._
import play.api.mvc.Results._

/**
 * Mix this trait in your GlobalSettings object to generate a 401 Moved Permanently
 * from any /url/ to /url.
 */
trait TrailingSlash extends GlobalSettings {
  override def onHandlerNotFound(request: RequestHeader): Result =
    if (request.path.endsWith("/"))
      MovedPermanently(request.path.dropRight(1))
    else
      super.onHandlerNotFound(request)
}

abstract class TrailingSlashSettings extends TrailingSlash
