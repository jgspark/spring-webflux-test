# spring-webflux-test
Spring MVC and Webflux Test Repository


### Ab Test Command 

* spring mvc project endpoint ab test command 

```bash
ab -n 1600 -c 40 localhost:8081/async_result
```

* spring webflux project endpoint ab test command 

```bash
ab -n 1600 -c 40 localhost:8082/flux_result
```
