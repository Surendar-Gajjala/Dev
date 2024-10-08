pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Fetch code from version control
                git branch: 'main', url: 'https://github.com/Surendar-Gajjala/Dev.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'echo "Building the project..."'
                sh 'mvn clean install -DskipTests'
                sh 'mvn generate-sources'
            }
        }

        stage('Test') {
            steps {
                // Run the tests
                sh 'echo "Running tests..."'
                // Example: sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the application
                sh 'echo "Deploying the application..."'
                // Example: sh './deploy.sh'
            }
        }
    }
}
