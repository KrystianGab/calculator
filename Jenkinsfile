pipeline{
	agent any
	
	stages { 
		stage("Build") {
			steps {
			  	bat "mvn -v"
			  	bat "mvn clean"
			  	bat "mvn compile"
				echo 'Building'
			}
		}
		stage("Test") {
			steps{
				bat "mvn test"
				echo 'Testing.1.2.3'
			}
		}
	}
	
	post {
		always {
			cleanWs()
		}
	}
}
