FROM maven:3.5-jdk-8-alpine as builder

# Copy local code to the container image.
WORKDIR /app

# 源码构建
# COPY pom.xml .
# COPY src ./src
# RUN mvn package -DskipTests

# 创建路径,拷贝jar包
#创建路径
RUN mkdir -p /app/target
COPY ./target/friend-finder-0.0.1-SNAPSHOT.jar /app/target

# Run the web service on container startup.
CMD ["java","-jar","/app/target/friend-finder-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]
#CMD ["bash","-c","tail -f /dev/null"]