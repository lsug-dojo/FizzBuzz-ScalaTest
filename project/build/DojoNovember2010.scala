import sbt._

/**
 * Main project class extends ParentProject because it will contain sub-projects.
 * See: http://code.google.com/p/simple-build-tool/wiki/SubProjects for details.
 */
//class DojoProjects(info: ProjectInfo) extends ParentProject(info) {
//
//  // Create a reference for the minesweeper sub-project
//  lazy val november2010 = project("LSug", "Dojo", new DojoNovember2010(_))
//
//  // Here is the actual configuration for the minesweeper project, note we extend DefaultProject here.
//  // This could also be defined as a separate project file inside the minesweeper project.
  class DojoNovember2010(info: ProjectInfo) extends DefaultProject(info) {

    // Specify sub-project specific dependencies using SBT's DSL for doing so.
    // If you need any other repositories apart from the default ones, these could be registered here also
    // or in the parent project. See: http://code.google.com/p/simple-build-tool/wiki/LibraryManagement
    // val junit = "junit" % "junit" % "4.8.1"
    val scalatest = "org.scalatest" % "scalatest" % "1.2"
    val scalacheck = "org.scala-tools.testing" % "scalacheck_2.8.1" % "1.8"

  }
//}