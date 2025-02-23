## 🚀 기능 요구 사항

암호문을 좋아하는 괴짜 개발자 브라운이 이번에는 중복 문자를 이용한 새로운 암호를 만들었다. 예를 들어 "browoanoommnaon"이라는 암호문은 다음과 같은 순서로 해독할 수 있다.

1. "browoanoommnaon"
2. "browoannaon"
3. "browoaaon"
4. "browoon"
5. "brown"

임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메서드를 완성하라.

### 제한사항

- cryptogram은 길이가 1 이상 1000 이하인 문자열이다.
- cryptogram은 알파벳 소문자로만 이루어져 있다.

### 실행 결과 예시

| cryptogram | result |
| --- | --- |
| "browoanoommnaon" | "brown" |
| "zyelleyz" | "" |

### Problem 2. 요구사항 정리

- 연속된 중복문자를 제거한 문자열을 반환한다. (정규표현식 사용)
- 위 메서드를 입력과 메서드의 출력이 동일할 때 까지 재귀적으로 호출한다.(더 이상 해독이 불가능한 경우까지)
- 결과를 반환한다.

### 고려해야 하는 부분

- 하나의 메서드가 하나의 기능을 수행하는지?
- 문자열을 새로 작성하여 반환한다면 반복문 안에서 문자열 + 를 사용하는 것이 좋은 방법일지?
- 두 개 이상의 연속된 문자를 찾는 정규 표현식을 사용할 수 있지 않을까?
