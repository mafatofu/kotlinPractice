package practice

import java.io.BufferedReader

/**
 * 다음 요구사항을 만족하는 코드를 작성하세요:
 * - 문자열 리스트 listOf("10", "20", "abc", "40")를 map을 사용해 정수 리스트로 변환합니다.
 * - 변환 과정에서 숫자로 변환할 수 없는 문자열이 있을 경우, 해당 값을 null로 처리합니다.
 * - 최종적으로 변환된 리스트를 출력합니다.
 *- 예외 처리를 위해 try와 catch를 사용하세요.
 * - 숫자로 변환할 수 없는 값은 NumberFormatException을 처리하여 null로 대체하세요.
 *
 *출력 예시
 * 입력 리스트: listOf("10", "20", "abc", "40")
 * 출력 리스트: [10, 20, null, 40]
 *
 *
 *
 *
 * */
fun readNumber(reader: BufferedReader){
    val enswer = try {
        Integer.parseInt(reader.readLine())
    } catch (e : NumberFormatException) {
        println("not a number")
        -999
    }
    println(enswer)
}

fun checkNumbers(list: List<String>) {
    //가변 정수리스트 생성
    var numList = mutableListOf<Int?>()
    //반복문을 돌며 list의 값 체크. 숫자가 아니면 -999
    for (element in list) {
        val num = try {
            Integer.parseInt(element)
        } catch (e : NumberFormatException){ //숫자가 아니라면
            null
        }
        numList.add(num)
    }
    println(numList)
}

fun main() {
//    val reader = BufferedReader(StringReader("not a number"))
//    readNumber(reader)
    val list = listOf("10","20","abc","40")
    checkNumbers(list)
}