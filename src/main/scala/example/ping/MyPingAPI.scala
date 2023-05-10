package example.ping

import cats.effect.IO
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl

class MyPingAPI extends Http4sDsl[IO] {  // Http4sDsl provides DSL for matching HTTP requests

  // we need to provide a function from a request to a response wrapped in IO to define an instance of HttpRoutes.of[IO]
  val pingRoutes: HttpRoutes[IO] = HttpRoutes.of[IO] {
    case GET -> Root / "ping" => Ok("pong")
    case GET -> Root / "ping" / name => Ok(s"pong $name")
  }

  val anyRoutes: HttpRoutes[IO] = HttpRoutes.of[IO] {
    case POST -> Root / x => Ok(s"'/$x' is a nice route!")
  }

}
