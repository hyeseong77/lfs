FROM openjdk:17-slim

ENV APP_HOME=/app

COPY ./target/shoppingmall-0.0.1-SNAPSHOT.jar $APP_HOME/

WORKDIR $APP_HOME

EXPOSE 80

CMD ["java", "-jar", "shoppingmall-0.0.1-SNAPSHOT.jar", "--server.port=80"]

