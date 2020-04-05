#!/bin/sh

## Adapted from
## https://raw.githubusercontent.com/foundweekends/conscript/master/setup.sh
## (see: http://www.foundweekends.org/giter8/setup.html)

mkdir -p /conscript/bin
curl "https://oss.sonatype.org/content/repositories/public/org/scala-sbt/launcher/1.1.3/launcher-1.1.3.jar" > /conscript/sbt-launch.jar
java -jar /conscript/sbt-launch.jar @/conscript/launchconfig "$@" foundweekends/giter8
