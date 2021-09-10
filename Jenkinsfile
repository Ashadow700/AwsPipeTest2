#!/usr/bin/env groovy

pipeline {
    agent any

        stages {
            stage ('Initialize') {
                steps {
                    sh '''
                        mvn -v
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                    '''
                }
            }
            stage('Build') {
                steps {
                    sh 'mvn -Dmaven.test.failure.ignore=true install'
                }
            }
        }
}
