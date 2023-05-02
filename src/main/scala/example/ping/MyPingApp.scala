package example.ping

import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.server.Router
import org.http4s.implicits._
import org.http4s.blaze.server.BlazeServerBuilder


object MyPingApp extends IOApp {

  private val httpApp = Router(
    "/" -> new MyPingAPI().pingRoutes,
    "/" -> new MyPingAPI().anyRoutes
  ).orNotFound

  override def run(args: List[String]): IO[ExitCode] = stream.compile.drain.as(ExitCode.Success)

  private def stream: fs2.Stream[IO, ExitCode] =
    BlazeServerBuilder[IO]
      .bindHttp(8000, "0.0.0.0")
      .withHttpApp(httpApp)
      .serve

}
