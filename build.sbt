name := "integration_shuffler"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "com.google.inject" % "guice" % "4.0-beta"
)     

play.Project.playJavaSettings
