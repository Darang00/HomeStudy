/*
 일반적으로 휴대폰 번호는 세 자리로 나뉘어져 있다,
첫 세자리는 아래와 같은 번호들이 올 수 있다.
010
011
016
017
018
019

요즘은 대부분 010을 사용하지만 아직도 구 번호 체계를 사용하는 사람도 있어 무시할 수는 없다.

두 번째 자리수는 3~4개로, 임의의 숫자가 오면 된다.

세 번째 자리 수는 일반적으로 4자리로 지정을 많이 하고 있으니 그것을 따르도록 한다

자릿수 사이에 아무 표기도 사용하지 않거나 "-" 또는 "."로 구분하는 것을 허용하도록 한다.

01012345678
010-1234-5678
010.1234.5678


<첫 세 자리>
^01
정규 표현식 패턴의 시작을 의미하는 ^을 시작으로 01을 추가.
문자역의 시작을 01이라는 것을 의미

^01(?:0|1|[6-9])
01다음에 오는 값으로 0, 1 또는 6~9 사이의 값으로 지정한다.


<두 번째 자리>
^01(?:0|1|[6-9])(\\d{3}|\\d{4})
3자리 또는 4자리의 숫자를 허용한다


<세 번쨰 자리>
^01(?:0|1|[6-9])(\\d{3}|\\d{4})(\\d{4})$
마지막은 4자리 숫자로 지정한 후 표현식의 종료를 알리는 $로 마무리한다,


<구분값 추가>
휴대폰 번호 입력 시 "-"를 추가하거나 "."를 추가하는 경우를 위해 아무 표기를 하지 않거나 "-" 또는 "."를 허용하는 코드 추가
 ^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$
[.-]?
이 값은 "."또는 "-"값이 없거나 단 한개만 존재하는 것을 의미한다.


<<최종적인 휴대폰번호 정규 표현식>>
^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$
 */

package RegularExpression;

public class RegularExpression {
	String regExp = "^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$";
	String mobNum1 = "01040430164";
	//System.out.println("mobile number 테스트 결과: " + mobileNum1.matches(regExp));
}

/*
 Reference:
 https://jamesdreaming.tistory.com/197
 https://moonong.tistory.com/31
 */
