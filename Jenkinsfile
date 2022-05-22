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
  }     
}