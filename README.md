### docker 설치하기[링크](https://github.com/docker/docker-install)
```shell
curl -fsSL https://get.docker.com -o get-docker.sh
sh get-docker.sh
```
### docker-compose 설치하기
1. docker-compose 설치
```shell
sudo curl -L "https://github.com/docker/compose/releases/download/v2.27.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
```
  - docker-compose 최신버전 확인하기
    [링크](https://github.com/docker/compose/releases)
    
2. 권한 변경
```shell
sudo chmod +x /usr/local/bin/docker-compose
```

3. 심볼릭 링크 설정
```shell
sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
```

4. docker-compose 버전확인
```shell
docker-compose --version
```

### 로컬에서 실행하기
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
