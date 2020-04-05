FROM alpine:3.8

RUN apk update && \
  apk upgrade && \
  apk add --no-cache curl openjdk8

USER 1000

ADD conscript conscript

ENV CONSCRIPT_HOME=conscript

RUN sh conscript/setup.sh
