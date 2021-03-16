pipeline{
	agent any
	
	stages { 
		stage("Build") {
			steps {
			  	bat "mvn -v"
				echo 'Building'
			}
		}
		stage("Test") {
			steps{
				bat "mvn test"
				echo 'Testing'
			}
		}
	}
	
	post {
		always {
			cleanWs()
		}
	}
}
