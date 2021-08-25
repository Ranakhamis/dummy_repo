pipeline {
  agent any
  stages {
    stage('fetch from github') {
      steps {
        sh 'if cd dummy_repo; then git pull; else git clone https://github.com/alikoptan/dummy_repo; fi'
      }
      post {
        success {
          sh 'ls'
        }
      }
    }
    stage('install dependencies') {
      steps {
        sh 'sudo apt-get update'
        sh 'sudo apt install openjdk-8-jre-headless'
        sh 'sudo apt-get install openjdk-8-jdk'
        sh 'sudo apt install maven -y'
      }
    }
    stage('build project dependecies') {
        steps {
            sh 'cd dummy_repo && mvn clean compile'
        }
    }
    stage('run the test') {
        steps {
            sh 'cd dummy_repo && mvn test'
        }
    }
  }
}
