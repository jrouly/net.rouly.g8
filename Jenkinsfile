@Library('net.rouly.jenkins') _

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
        dockerfile true
      }

      steps {
        script {
          sh 'g8 file://. -o . --force --name friendship'
        }
      }
    }

    stage('compile template') {
      agent {
        docker {
          image 'jrouly/sbt:1.3.8'
          args '-v $HOME/.sbt:/.sbt:ro'
        }
      }

      steps {
        script {
          sbt('clean reload compile test')
        }
      }
    }
  }
}
