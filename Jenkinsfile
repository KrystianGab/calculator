pipeline{
	agent any
	
	stages { 
		stage("Build") {
			steps {
			  bat "mvn - version"
				echo 'Building'
			}
		}
		stage("Test") {
			steps{
			
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
