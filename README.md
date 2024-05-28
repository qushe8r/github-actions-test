1. docker login 하기
```shell
docker login
```

2. 도커 허브에 이미지 업로드 하기
```shell
./gradlew dockerPush -PdUsername={{docker.Username}}
```

3. Docker Compose 실행시키기 
```shell
docker-compose -f ./docker/docker-compose.yml up -d --force-recreate --build
```