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
                bat 'echo "Building the project..."'
                bat 'mvn clean install -DskipTests'
                bat 'mvn generate-sources'
            }
        }

        stage('Test') {
            steps {
                // Run the tests
                bat 'echo "Running tests..."'
                // Example: sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the application
                bat 'echo "Deploying the application..."'
                // Example: sh './deploy.sh'
            }
        }
    }
}
