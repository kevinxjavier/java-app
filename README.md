# Getting Started

### Create Project
```
$ curl https://start.spring.io/starter.zip?name=demo&groupId=com.kevinpina&artifactId=demo&version=0.0.1-SNAPSHOT&description=Demo+project+for+Spring+Boot&packageName=com.kevinpina.demo&type=maven-project&packaging=jar&javaVersion=17&language=java&bootVersion=3.3.5&dependencies=web
```

### Test Project
```
$ curl http://localhost:8000/test
```

### Build Docker 
```
$ sudo docker build -t kevinpina/java-app . --no-cache=true    
$ sudo docker run --name java-app -p 8080:8000 -d kevinpina/java-app
```

### Upload Docker Image
```
$ sudo docker login
$ sudo docker push kevinpina/java-app:latest
```

### Deploy a Pod on Openshift from Git repo source
```
$ oc new-app openshift/java https://github.com/kevinxjavier/java-app --name=java-app
$ oc expose deploy java-app --port=8000 --name=my-java-app-svc
$ oc expose svc my-java-app-svc --hostname=my-path --path=/test --name=my-java-app-route
```

# DockerHub
Image docker on: [Dockerhub](https://hub.docker.com/repository/docker/kevinpina/java-app/general)
