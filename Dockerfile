FROM openjdk:8-jre-alpine
MAINTAINER michel@rouly.net

ENV CONSCRIPT_HOME="$HOME/.conscript"
ENV CONSCRIPT_OPTS="-XX:MaxPermSize=512M -Dfile.encoding=UTF-8"
ENV PATH=$CONSCRIPT_HOME/bin:$PATH

RUN apk add --update-cache wget && \
    wget https://raw.githubusercontent.com/foundweekends/conscript/master/setup.sh -O - | sh || true && \
    cs foundweekends/giter8

ENTRYPOINT ["g8"]
