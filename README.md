# Spring native image generation error

This project reproduces the error
described [here](https://github.com/spring-projects-experimental/spring-native/issues/451). To build the image run the
command:

```shell script
./gradlew bootBuildImage
```

The application requires a connection to a mysql database. The configuration can be defined within the `application.properties`
