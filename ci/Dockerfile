FROM alpine:3.8

ADD conscript /conscript

RUN apk update && \
  apk add --no-cache curl openjdk8 && \
  chown -R 1000:1000 /conscript

USER 1000:1000

WORKDIR /conscript
ENV CONSCRIPT_HOME=/conscript
RUN sh setup.sh
ENV PATH=$PATH:/conscript/bin
