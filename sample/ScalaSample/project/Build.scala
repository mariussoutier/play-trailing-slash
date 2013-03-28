import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "ScalaSample"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "com.mariussoutier" %% "play-trailing-slash" % "1.0.0"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}
