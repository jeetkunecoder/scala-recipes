Fast-Reference recipes to solve typical issues.

- Play Framework / Slick

**************************************
**** Cannot resolve slick.driver
**************************************

(The versions for slick and slf4 should be taken 
accordingly to our development environment.)
In the build.sbt we must include:

libraryDependencies ++= Seq(
    "com.typesafe.slick" %% "slick" % "3.1.1",
    "org.slf4j" % "slf4j-nop" % "1.6.4" )

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

*****************************************
**** Adding ScalaTest to Eclipse IDE
*****************************************

Download scalatest jar -->
Right Click in --> "Project" Folder --> Build Path --> Add External Archives --> Select the downloaded jar file
--> Then, we must import this package in our class: import org.scalatest._
