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
	      lein uberjar
	   }
	   
	}
  }     
}