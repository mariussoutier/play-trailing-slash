import sbt._
import Keys._
import play.Project._

object TrailingSlashBuild extends Build {

  val appName         = "play-trailing-slash"
  val appVersion      = "1.0.0"

  val appDependencies = Seq.empty

  val main = play.Project(appName, appVersion, appDependencies).settings(
    organization := "com.mariussoutier"
  )

}
