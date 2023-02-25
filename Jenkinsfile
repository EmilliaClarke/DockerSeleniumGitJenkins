pipeline {

    agent any

    stages {
    stage('Build Jar'){
        steps{
            bat "mvn clean package -DskipTests"
        }
    }
    stage('Build Image'){
        steps{
                    bat "docker build -t selenium/hub:latest'"
                }
    }
    stage('Push Image'){
        steps{
                    withCredentials([usernamePassword(credetialsId: 'emilliaclarke', passwordVariable: 'pass', usernameVariable: 'user')]){
                    bat "docker login --username=${user} --password=${pass}"
                    bat "docker push selenium/hub:latest"
                    }
    }
   }
}}