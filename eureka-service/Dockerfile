# Docker image for springboot application
# VERSION 0.0.1
# Author: yans

#### 基础镜像，使用alpine操作系统，openjkd使用8u201
#FROM openjdk:8u201-jdk-alpine3.9

#使用的基础镜像
FROM java:8

#作者
MAINTAINER yans <yansu0505@gmail.com>

#系统编码
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

# 设置时区
RUN echo "Asia/Shanghai" > /etc/timezone

# 挂载/home/file目录到主机
#VOLUME 指向了一个/tmp的目录，由于 Spring Boot 使用内置的Tomcat容器，Tomcat 默认使用/tmp作为工作目录。
#这个命令的效果是：在宿主机的/var/lib/docker目录下创建一个临时文件并把它链接到容器中的/tmp目录
VOLUME /tmp

#应用构建成功后的jar文件被复制到镜像内，名字也改成了app.jar
COPY *.jar /app.jar

#
CMD ["--server.port=8761"]

#声明需要暴露的端
EXPOSE 8761

#启动容器时的进程
ENTRYPOINT ["java","-jar","/app.jar"]