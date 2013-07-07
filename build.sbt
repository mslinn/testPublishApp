organization := "com.micronautics"

name := "TestPublishApp"

crossPaths := false

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8", "-feature", "-target:jvm-1.7", "-unchecked",
    "-Ywarn-adapted-args", "-Ywarn-value-discard", "-Xlint")

javacOptions ++= Seq("-Xlint:deprecation", "-Xlint:unchecked", "-source", "1.7", "-target", "1.7", "-g:vars")

resolvers ++= Seq(
  "awsSnapshots" at "http://www.mavenrepo.s3.amazonaws.com/snapshots",
  "Typesafe Releases"   at "http://repo.typesafe.com/typesafe/releases"
)

libraryDependencies ++= Seq(
  "com.micronautics" %  "test_publish_lib" % "0.1.0-SNAPSHOT" withSources()
)

publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath + "/.ivy2/local")))

publishMavenStyle := true

//logLevel := Level.Error

// define the statements initially evaluated when entering 'console', 'console-quick', or 'console-project'
initialCommands := """
                     |""".stripMargin

// Only show warnings and errors on the screen for compilations.
// This applies to both test:compile and compile and is Info by default
//logLevel in compile := Level.Warn
