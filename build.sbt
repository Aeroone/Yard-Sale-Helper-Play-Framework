import play.ebean.sbt.PlayEbean

name := """Yard_Sale_Helper"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  "org.avaje.ebeanorm" % "avaje-ebeanorm" % "4.6.2",
  "com.typesafe.play" %% "play-mailer" % "5.0.0",
  "it.innove" % "play2-pdf" % "1.5.1",
  "com.itextpdf" % "itextpdf" % "5.3.2",
  javaWs
)
