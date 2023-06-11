# Spring Multi Module App

![springgradle](https://user-images.githubusercontent.com/52229154/147441016-dde6ab37-0412-4664-8e61-4237ac29081b.png)

## Runbook

모듈 별로 각각 실행 시킬 수 있다.

<img width="391" alt="스크린샷 2021-12-27 오후 7 01 06" src="https://user-images.githubusercontent.com/53357210/147460584-fbf9611a-14ad-44cc-b32d-3a8b45402082.png">

## Spec
- spring boot 2.6.2
- java 11 ~ 13
- gradle

## Description

그레들을 이용한 멀티 모듈 구성

### 디렉토리 구조

Admin, Common, User 로 3가지로 모듈 구조 구성

<img width="377" alt="스크린샷 2021-12-26 오후 6 34 17" src="https://user-images.githubusercontent.com/53357210/147404250-5bc773bb-d312-4d67-8714-e94b936dd6de.png">

### 모듈별로 gradle bootJar 실행

```cmd
./gradlew clean jar -p ./admin
```

<img width="604" alt="스크린샷 2021-12-26 오후 6 40 35" src="https://user-images.githubusercontent.com/53357210/147404404-0fab271c-7f9f-4520-8305-1e2514de66cd.png">
<img width="662" alt="스크린샷 2021-12-26 오후 6 40 11" src="https://user-images.githubusercontent.com/53357210/147404402-f8f5623a-fb35-4abd-a860-433760a94e3b.png">

### FatJar Releases

not releases

### 클레스를 찾지 못할 때

클래스 파일을 찾지 못하거나 인텔리제이 내에서 클래스 파일이 빨간 불이 떠서 에러가 발생이 될 때 

`Annotation Processors` -> `Enable annotaion processing`

<img width="950" alt="스크린샷 2021-12-26 오후 2 15 28" src="https://user-images.githubusercontent.com/53357210/147399589-918e1af7-83c7-483e-bc5c-5f13b2488d5e.png">

