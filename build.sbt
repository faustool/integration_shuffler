name := "integration_shuffler"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "com.google.inject" % "guice" % "4.0-beta",
  "org.mockito" % "mockito-core" % "1.9.5"
)     

play.Project.playJavaSettings
