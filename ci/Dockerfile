FROM alpine:3.8

USER 1000

ADD conscript /conscript

ENV CONSCRIPT_HOME=/conscript

RUN apk update && \
  apk upgrade && \
  apk add --no-cache curl openjdk8 && \
  sh /conscript/setup.sh
