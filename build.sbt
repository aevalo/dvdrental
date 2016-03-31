name := "dvdrental"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
//  "org.webjars" %% "webjars-play" % "2.5.0",
//  "org.webjars"  % "bootstrap"    % "2.3.1",
  "com.typesafe.play" %% "play-slick" % "1.1.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.1.0",
  "com.h2database" % "h2" % "1.4.190",
  specs2 % Test
)

//scalacOptions in Test ++= Seq("-Yrangepos")
// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

lazy val root = (project in file(".")).enablePlugins(PlayScala)

