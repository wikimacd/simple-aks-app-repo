def commonChecks() {
  stage('Common: Lint & Test') {
    sh 'npm ci'
    sh 'npm run lint'
  }
}
