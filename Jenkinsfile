pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                    chmod +x gradlew
                    ./gradlew build -x test
                '''
            }
        }
        stage('DockerSize') {
            steps {
                sh '''
                    docker stop review || true
                    docker rm review || true
                    docker rmi review || true
                    docker build -t review .
                    echo "review: build success"
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                docker run -e EUREKA_URL="${EUREKA_URL}" -e MASTER_DB_URL="${MASTER_DB_URL}/review" -e MASTER_DB_USERNAME="${MASTER_DB_USERNAME}" -e MASTER_DB_PASSWORD="${MASTER_DB_PASSWORD}" -d --name review --network gentledog review
                echo "review: run success"
                '''
                }
        }
    }
}