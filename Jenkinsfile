pipeline{
	agent any
	tools{
		maven 'Maven'
		}
	stages{
		stage('checkout'){
			steps{
				git branch:'master', url:'https://github.com/shreya20m/gu.git'
			}
			}
		stage('build'){
			steps{
				sh'mvn clean package'
			}
		}
		stage('test'){
			steps{
				sh'mvn test'
			}
		}
		stage('run application'){
			steps{
				sh'mvn exec:java -Dexec.mainClass="com.example.App"'
			}
		}
	}
	post{
		success{
			echo 'success'
		}
		failure{
			echo 'failure'
		}
}
}
