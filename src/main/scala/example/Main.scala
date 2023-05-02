package example

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  val run = Scalahttp4sServer.run[IO]
}
