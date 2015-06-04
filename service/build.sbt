name := "multi-play-scala-service"

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.postgresql" % "postgresql" % "9.3-1101-jdbc41",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.github.tototoshi" %% "scala-csv"   % "1.0.0",
  "org.scalatestplus" %% "play" % "1.1.0" % "test"
)

javaOptions in Test += "-Dconfig.file=conf/application.test.conf"
