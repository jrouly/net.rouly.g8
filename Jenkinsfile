pipeline {
  agent any

  options {
    timeout(time: 15, unit: 'MINUTES')
    timestamps()
    ansiColor('xterm')
  }

  stages {
    stage('clean') {
      steps {
        script {
          sh """
            rm -rf ~/.ivy2
          """
        }
      }
    }

    stage('build template') {
      agent {
        docker {
          image "jrouly/sbt:1.3.8"
        }
      }

      steps {
        script {
          sh """
            sbt new file://./ -o . --force
          """
        }
      }
    }

    stage('compile and test template') {
      steps {
        script {
          sh """
            sbt clean reload compile test
          """
        }
      }
    }
  }
}
