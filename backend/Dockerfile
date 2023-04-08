FROM maven:3.5-jdk-8-alpine as builder

# Copy local code to the container image.
WORKDIR /app

RUN mkdir -p /app/target

COPY ./target/open-api-0.0.1-SNAPSHOT.jar /app/target
COPY ./openapi-gateway/target/openapi-gateway-0.0.1-SNAPSHOT.jar /app/target
COPY ./openapi-interface/target/openapi-interface-0.0.1-SNAPSHOT.jar /app/target
COPY ./build/start.sh /app/target

RUN chmod +x /app/target/start.sh

# Run the web service on container startup.
CMD ["bash","-c","cd /app/target && ./start.sh"]