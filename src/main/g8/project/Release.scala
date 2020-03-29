import bintray.BintrayKeys._
import sbt.Resolver

object Release {

  def bintrayResolver = Resolver.bintrayRepo("jrouly", "sbt-release")

  def bintraySettings = Seq(
    bintrayPackageLabels := Seq("scala"),
    bintrayRepository := "sbt-release",
    bintrayVcsUrl := Some("git@github.com:jrouly/$name;format="normalize"$"),
  )

}
