FROM alpine:3.8

ADD conscript /conscript

RUN apk update && \
  apk upgrade && \
  apk add --no-cache curl openjdk8 && \
  chown -R 1000:1000 /conscript

USER 1000

ENV CONSCRIPT_HOME=/conscript
RUN sh /conscript/setup.sh
