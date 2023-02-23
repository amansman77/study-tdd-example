# Test-Driven Development: By Example

`테스트 주도 개발`을 읽고 예제를 따라해보는 공간입니다.

## Money

다중 통화를 지원하는 보고서를 만들기 위해 통화 단위 및 환율 정보를 고려하는 객체를 생성하자.

보고서 예시

| 종목 | 주 | 가격 | 합계 |
|--|--|--|--|
| IBM | 1000 | 25USD | 25000USD |
| Novartis | 400 | 150CHF | 60000CHF |
|  |  | 합계 | 65000USD |

TODO List
- $5 + 10CHF = $10 (환율이 2:1 일 경우)
- ~~$5 * 2 = $10~~
- amount를 private으로 만들기
- Dollar 부작용(side effect)?
- Money 반올림?