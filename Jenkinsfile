pipeline {
     agent any

     stages {
     	stage("Hello") {
	   steps {
	   	 echo 'hello pipeline'  
	   }
	}
	stage("Checkout") {
	   steps {
	      checkout poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/main']], extensions: [[$class: 'CleanBeforeCheckout']], userRemoteConfigs: [[url: 'https://github.com/jmsaylor/clojure-api']]]
	}
	
     }
  }     
}