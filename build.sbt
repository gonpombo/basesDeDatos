name := "BaseDeDatos"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val sprayV = "1.3.3"
  Seq(
    "io.spray"                        %%  "spray-can"                   % sprayV,
    "io.spray"                        %%  "spray-routing"               % sprayV,
    "io.spray"                        %%  "spray-testkit"               % sprayV,
    "com.typesafe.slick"              %%  "slick"                       % "3.0.2"
  )
}

mainClass := Some("db.Main")