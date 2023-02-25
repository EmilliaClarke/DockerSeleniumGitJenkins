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
                    bat "docker build -t emilliaclarke/selenium-docker'"
                }
    }
    stage('Push Image'){
        steps{
                    withCredentials([usernamePassword(credetialsId: 'emilliaclarke', passwordVariable: 'pass', usernameVariable: 'user')]){
                    bat "docker login --username=${user} --password=${pass}"
                    bat "docker push emilliaclarke/selenium-docker:latest"
                    }
    }
   }
}