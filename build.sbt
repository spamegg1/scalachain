name := "scalachain"

version := "0.1"

scalaVersion := "2.13.14"

resolvers ++= Seq(
  "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/",
  "dnvriend" at "https://dl.bintray.com/dnvriend/maven",
  Resolver.jcenterRepo
)

lazy val akkaVersion = "2.5.23"
lazy val akkaHttpVersion = "10.1.10"
lazy val akkaPersistenceInmemoryVersion = "2.5.15.2"
lazy val scalaTestVersion = "3.0.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  "org.iq80.leveldb" % "leveldb" % "0.10",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8",
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "com.github.dnvriend" %% "akka-persistence-inmemory" % akkaPersistenceInmemoryVersion
)

Test / fork := true
