# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)





## 문자열 계산기

#### 요구 사항

- [x] 계산하는 클래스 만들기
  - [x] 덧셈
  - [x] 뺄셈
  - [x] 나눗셈
  - [x] 곱셈

- [x] 사용자 문자열 처리 클래스
  - [x] 입력 받고
  
  - [x] 입력 값 검증
    - 입력값이 null이거나 빈 공백 문자일 경우, IllegalArgumentException throw
    - 사칙연산 기호가 아닌 경우, IllegalArgumentException throw
    
  - [x] 문자열 파싱
  
    - "2  + 3 * 4 / 123" > 
  
    - 입력 조건
  
        1. 계산이 가능한 형식
      2. 단, 공백은 처리 가능(연속 공백도 허용)
     - 결과 값    
         1. 정수로 반환

