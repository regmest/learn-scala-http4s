### Notes 

`$ sbt new http4s/http4s.g8`

`sbt run`

```
$ curl -i http://localhost:8080/hello/scala

HTTP/1.1 200 OK
Date: Tue, 02 May 2023 17:11:14 GMT
Connection: keep-alive
Content-Type: application/json
Content-Length: 26

{"message":"Hello, scala"}
```
