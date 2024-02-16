ThisBuild / scalafixScalaBinaryVersion := "2.13"
ThisBuild / scalafixDependencies += "com.github.vovapolu" %% "scaluzzi" % "0.1.23"

lazy val root = project.in(file("."))
  .settings(
    name := "scalafix-issue-1801",
    organization := "com.example",
    scalaVersion := "3.4.0",
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    version      := "0.1.0-SNAPSHOT",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0",
  )
