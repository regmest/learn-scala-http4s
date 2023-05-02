### Notes 

- Created by: `$ sbt new http4s/http4s.g8`

- Run by: `sbt run`

- run Main: 
```
$ curl -i http://localhost:8080/hello/scala

HTTP/1.1 200 OK
Date: Tue, 02 May 2023 17:11:14 GMT
Connection: keep-alive
Content-Type: application/json
Content-Length: 26

{"message":"Hello, scala"}


$ curl -i http://localhost:8080/joke 

HTTP/1.1 200 OK
Date: Tue, 02 May 2023 17:48:17 GMT
Connection: keep-alive
Content-Type: application/json
Content-Length: 122

{"joke":"Cosmetic surgery used to be such a taboo subject.\r\nNow you can talk about Botox and nobody raises an eyebrow."}
```


- For logs used:
`"ch.qos.logback"  %  "logback-classic"     % LogbackVersion         % Runtime,` + configurations in src/main/resources/logback.xml


- run MyPingApp:
```
$ curl -i http://localhost:8000/ping

HTTP/1.1 200 OK
Content-Type: text/plain; charset=UTF-8
Date: Tue, 02 May 2023 18:57:54 GMT
Content-Length: 4

pong


$ curl -i -X POST http://localhost:8000/ping 

HTTP/1.1 404 Not Found
Content-Type: text/plain; charset=UTF-8
Date: Tue, 02 May 2023 19:01:08 GMT
Content-Length: 9

Not found
```
