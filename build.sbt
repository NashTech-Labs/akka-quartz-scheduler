name := "Quartz Scheduler"

version := "0.1"

scalaVersion := "2.13.6"
libraryDependencies ++= Seq (
  "com.typesafe.akka" %% "akka-actor" % "2.6.14",
  "com.typesafe.akka" %% "akka-http" % "10.2.4",
  "com.typesafe.akka" %% "akka-stream" % "2.6.14",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.4",
  "com.enragedginger" %% "akka-quartz-scheduler" % "1.8.1-akka-2.5.x",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.3",
  "org.scalatest" %% "scalatest" % "3.2.3" % Test,
  "org.mockito" % "mockito-core" % "3.6.28" % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % "10.2.4" % Test
)