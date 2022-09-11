ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "Hypervector",
    libraryDependencies += "be.adamv" %% "macroloop-core" % "0.13.0",
    libraryDependencies += "be.adamv" %% "macroloop-collection" % "0.13.0",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,

  )