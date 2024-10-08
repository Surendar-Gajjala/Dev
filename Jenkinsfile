pipeline {
    agent any

     environment {
        // Set up environment variables if needed (e.g., JAVA_HOME, MAVEN_HOME)
        MAVEN_HOME ='C:\\Program Files\\apache-maven-3.9.7' // Adjust the path to your Maven installation
        JAVA_HOME ='C:\\Program Files\\OpenLogic\\jdk-17.0.10.7-hotspot' // Adjust the path to your JDK
        PATH = "${MAVEN_HOME}/bin;${JAVA_HOME}/bin;${env.PATH}"
    }
    
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
                bat "\"${MAVEN_HOME}\\bin\\mvn clean compile"
            }
        }

        stage('Test') {
            steps {
                // Run the tests
                bat 'echo "Running tests..."'
                bat "\"${MAVEN_HOME}/bin/mvn test"
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
