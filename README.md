# Test-Driven Development: By Example

`테스트 주도 개발`을 읽고 화폐 예제를 따라해보는 공간입니다.

## Money

다중 통화를 지원하는 보고서를 만들기 위해 통화 단위 및 환율 정보를 고려하는 객체를 생성하자.

보고서 예시

| 종목 | 주 | 가격 | 합계 |
|--|--|--|--|
| IBM | 1000 | 25USD | 25000USD |
| Novartis | 400 | 150CHF | 60000CHF |
|  |  | 합계 | 65000USD |

TODO List
- ~~$5 + 10CHF = $10 (환율이 2:1 일 경우)~~
- ~~$5 + $5 = $10~~
- ~~$5 + $5에서 Money 반환하기~~
- ~~Bank.reduce(Money)~~
- ~~Money에 대한, 통화 변환을 수행하는 Reduce~~
- ~~Reduce(Bank, String)~~
- ~~Sum.plus~~
- ~~Expression.times~~
- ~~$5 * 2 = $10~~
- ~~amount를 private으로 만들기~~
- ~~Dollar 부작용(side effect)?~~
- Money 반올림?
- ~~equals()~~
- ~~hashCode()~~
- Equal null
- Equal object
- ~~5CHF * 2 = 10CHF~~
- ~~Dollar/Franc 중복~~
- ~~공용 equals~~
- ~~공용 times~~
- ~~Franc 과 Dollar 비교하기~~
- ~~통화?~~
- ~~testFrancMultiplication 제거~~
