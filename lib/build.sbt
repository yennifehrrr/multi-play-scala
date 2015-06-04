libraryDependencies ++= Seq(ws, json) ++ Seq(
  "commons-io"            %   "commons-io"    % "2.4",
  "com.amazonaws"         %   "aws-java-sdk"  % "1.9.0",
  "com.github.tototoshi"  %%  "scala-csv"     % "1.0.0",
  "org.scalatestplus"     %% "play"           % "1.1.0" % "test"
)
