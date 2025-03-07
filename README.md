DEVOPS PIPELINE EXAMPLES
```
devops-pipeline-examples/
├── java-maven/
│   ├── Jenkinsfile
│   └── pom.xml
├── docker-app/
│   ├── Jenkinsfile
│   └── Dockerfile
├── kubernetes-deploy/
│   ├── Jenkinsfile
│   └── deployment.yaml
├── shared-lib/
│   ├── vars/
│   │   └── buildDocker.groovy
│   └── Jenkinsfile
└── README.md
```
# DevOps Pipeline Examples 🚀

This repository contains multiple `Jenkinsfile` examples for different DevOps scenarios. Each subdirectory represents a specific use case with its own `Jenkinsfile` for Jenkins pipelines.

## Structure
- **java-maven/**: A Java project with Maven, featuring a pipeline for build, test, and SonarQube analysis.
- **docker-app/**: A Docker-based application with a pipeline for building and pushing images to DockerHub.
- **kubernetes-deploy/**: A pipeline for deploying applications to Kubernetes using ArgoCD.
- **shared-lib/**: A Jenkins Shared Library example with reusable pipeline steps.

## Prerequisites
- Jenkins with plugins: `Docker Pipeline`, `Kubernetes`, `Maven`, `SonarQube Scanner`, `GitHub Integration`.
- Credentials configured in Jenkins for GitHub, DockerHub, and Kubernetes.
- AWS CLI and ArgoCD CLI (for specific pipelines).

## How to Use
1. Clone this repository: `git clone https://github.com/serdardevops/devops-pipeline-examples.git`
2. Set up Jenkins pipelines for each subdirectory by pointing to the respective `Jenkinsfile`.
3. Configure credentials in Jenkins as needed (e.g., `github-cred`, `dockerhub-cred`).

## Contributions
Feel free to fork this repository and contribute by adding more `Jenkinsfile` examples!

---
Created by Serdar Selçuk | March 2025
