// Reusable function to build and push a Docker image
def call(String imageName) {
    // Build the Docker image
    sh "docker build -t ${imageName} ."
    // Push the Docker image to the registry
    sh "docker push ${imageName}"
}