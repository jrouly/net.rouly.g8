@Library("net.rouly.jenkins") _

pipeline {
  agent any

  options {
    timeout(time: 15, unit: 'MINUTES')
    timestamps()
    ansiColor('xterm')
  }

  stages {
    stage('build template') {
      agent {
        docker {
          image 'jrouly/sbt:1.3.8'
          args '-v $HOME/.sbt:/.sbt'
        }
      }

      steps {
        script {
          sbt("new file://.")
          sbt("clean reload compile test")
        }
      }
    }
  }
}
