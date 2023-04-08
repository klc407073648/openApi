#! /bin/bash
# 命令后加入 & ，保持程序后台持续运行

nohup java -jar  /app/target/open-api-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod > /app/target/open-api.log 2>&1 &
nohup java -jar  /app/target/openapi-gateway-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod > /app/target/openapi-gateway.log 2>&1 &
nohup java -jar  /app/target/openapi-interface-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod > /app/target/openapi-interface.log 2>&1 