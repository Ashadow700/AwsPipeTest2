#!/usr/bin/env groovy

pipeline {
    agent any

        stages {
            stage('Build') {
                steps {
                    sh 'echo someTestEcho'
                    sh 'mvn clean install'
                }
            }
        }
}
