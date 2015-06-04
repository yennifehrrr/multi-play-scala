# multi-play-scala

This is an example of a play app that is broken into 3 separate modules,
2 free standing, separately deployable apps (**ui** and **service** and 
one lib directory that both depend on.

## Dependencies
* activator

## Running the app
$ cd multi-play-scala

$ sbt

$ project ui

$ run

Navigate to localhost:9000

In a new terminal window:

$ cd multi-play-scala

$ sbt

$ project service

$ run 9001

Navigate to localhost:9001/health_checks

## Compiling
To compile run sbt from root and compile from root:
$ cd multi-play-scala
$ ~compile
