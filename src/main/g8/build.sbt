import sbt._

// Global metadata.
def projectName = "$name;format="normalize"$"
ThisBuild / name := projectName
ThisBuild / organization := "net.rouly"
ThisBuild / licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
ThisBuild / maintainer := "michel@rouly.net"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / scalacOptions ++= ScalacOptions.recommended
ThisBuild / resolvers += Release.bintrayResolver
ThisBuild / publishTo := Some(Release.bintrayResolver)

// Disable publishing for root project.
publish := {}
publishArtifact := false
publishLocal := {}
publishTo := None

// Common multi-project settings.
lazy val commonSettings = Seq(
  name := s"\$projectName-" + name.value,
) ++ Release.bintraySettings

// Core $name;format="normalize"$ package.
lazy val core = project
  .settings(commonSettings)
