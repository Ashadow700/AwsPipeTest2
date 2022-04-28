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
                sh 'chmod 751 ./myDeliver.sh'
                sh './myDeliver.sh'
            }
        }
    }
}
