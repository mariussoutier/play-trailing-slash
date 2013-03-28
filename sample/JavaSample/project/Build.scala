import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "JavaSample"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    javaCore,
    "com.mariussoutier" %% "play-trailing-slash" % "1.0.0"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
  )

}
