name := "sbt-git-hooks"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.3"

organization := "uk.co.randomcoding"

sbtPlugin := true

resolvers += Resolver.sonatypeRepo("snapshots")

licenses += ("AGPLv3", url("https://www.gnu.org/licenses/agpl-3.0.en.html"))

publishMavenStyle := false

bintrayRepository := "sbt-plugins"

bintrayOrganization in bintray := None

bintrayVcsUrl := Some("git@github.com:randomcoder/sbt-git-hooks.git")
