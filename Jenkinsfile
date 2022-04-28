pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t jenkins-dev:AwsPipeTest2 .'
            }
        }
        stage('Deliver') {
            steps {
                sh 'echo "at delivery step"'
            }
        }
    }
}
