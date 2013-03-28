Play Trailing Slash
===================

What is this?
-------------

This is a Play Framework 2 module that generates a 401 Moved Permanently redirect for request
paths that end with a slash, redirecting to a path without a trailing slash.


Why is this useful?
-------------------

Consider a simple URL such as http://www.example.com/login that displays a login page. If the user
enters http://www.example.com/login/ by accident, Play will generate a 404 result. If you define both
routes, Google will treat this as duplicate content. Play's default router only offers a 302 redirect
which doesn't solve the duplicate content problem.


How do you use it?
------------------

Build.scala:

    val trailingSlash = RootProject(uri("git://github.com/mariussoutier/play-trailing-slash.git"))
    val main = play.Project(...).dependsOn(trailingSlash)

Scala:

    import com.mariussoutier.play._
    object Global extends GlobalSettings with TrailingSlash


Java:

    import com.mariussoutier.play.*;
    public class Global extends TrailingSlashSettings {
    }
