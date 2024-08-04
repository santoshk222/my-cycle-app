pipeline {
    agent any

//     tools {
//         maven 'Maven 3.9.8' // Adjust this to your Maven version
//     }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/santoshk222/my-cycle-app.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}
