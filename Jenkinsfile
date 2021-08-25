pipeline {
  agent any
  stages {
    stage('fetch from github') {
      post {
        success {
          sh 'ls'
        }

      }
      steps {
        sh 'if cd dummy_repo; then git pull; else git clone https://github.com/alikoptan/dummy_repo; fi'
      }
    }

    stage('install dependencies') {
      steps {
        sh 'curl -fsSL https://deb.nodesource.com/setup_current.x | sudo -E bash -'
        sh 'sudo apt-get update'
        sh 'sudo apt install openjdk-8-jre-headless -y'
        sh 'sudo apt-get install openjdk-8-jdk -y'
        sh 'sudo apt install maven -y'
        sh 'sudo apt-get install -y nodejs'
        sh '''sudo npm install -g appium

'''
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