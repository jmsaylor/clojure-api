pipeline {
     agent any

     stages {
     	stage("Hello") {
	   steps {
	      echo 'hello pipeline'  
	   }
	}
        stage("Build") {
	   steps {
	      sh 'lein uberjar'
	   }
	}
	stage("Deploy") {
	   steps {
	      ansiblePlaybook becomeUser: 'ec2-user', installation: 'ansible', inventory: './hosts', playbook: './playbook.yml'
	   }
	}
  }     
}