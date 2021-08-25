pipeline {
  agent any
  tools {
    nodejs 'nodejs' 
  }
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
      agent {
        node {
          label 'nodejs'
        }

      }
      steps {
        sh 'curl -fsSL https://deb.nodesource.com/setup_current.x | sudo -E bash -'
        sh 'sudo apt-get update'
        sh 'sudo apt install openjdk-8-jre-headless -y'
        sh 'sudo apt-get install openjdk-8-jdk -y'
        sh 'sudo apt install maven -y'
        sh 'sudo apt-get install -y nodejs'
        sh '''which npm
npm install -g appium

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
