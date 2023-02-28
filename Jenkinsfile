pipeline {
  agent any
  stages {
    stage('compile') {
      steps {
        sh './gradlew compileJava'
      }
    }

    stage('test') {
      steps {
        sh './gradlew clean test aggregate'
      }
    }

    stage('static') {
      steps {
        withSonarQubeEnv(installationName: 'sonar', credentialsId: 'sonarqube') {
          waitForQualityGate(abortPipeline: true, credentialsId: 'sonarQube')
        }

      }
    }

    stage('tomarReporte') {
      steps {
        archiveArtifacts(artifacts: 'target/site/serenity/**', allowEmptyArchive: true)
      }
    }

  }
}