name := "akka-watson"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.0" % "test",

  "com.ibm.watson.developer_cloud" % "java-sdk" % "2.7.0"
)

