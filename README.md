# simple-aks-app

This repo demonstrates:
- Branching & PR validation (Jenkins Multibranch pipeline)
- Conditional pipeline stages
- Static code analysis (ESLint + Sonar)
- Reusable pipelines (Jenkins Shared Library)
- Approval-based deployments
- AKS deployment with Helm, HPA, PVC, rollback

See `jenkins/Jenkinsfile`, `helm-chart/`, and `vars/ciPipeline.groovy`.
- Trying to work it out