package practice


fun main() {
//    val binaryReps = mutableMapOf<Char, String>() //가변 map 생성
//    for (char in 'A'..'F') { // 반복문. A ~ F
//        val binary = char.code.toString(radix = 2) // 2진수를 String형태로 받음
//        binaryReps[char] = binary // binaryReps에 저장
//    }
//
//    for ((letter, binary) in binaryReps) {
//        println("$letter = $binary");
//    }

    val mapTest = mutableMapOf<Char, Int>()
    for (char in 'A'..'E') {//A ~ E까지
        mapTest[char] = char.code.toString().toInt() - 64
    }

    for ((key, value) in mapTest) {
        println("$key = $value")
    }
}