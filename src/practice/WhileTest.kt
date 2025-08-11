package practice

fun main() {
    outer@ while (true){
        print("루프를 나가시겠습니까?(1 : 나가기 / 2 : 계속 유지)")
        val check = readln()
        if (check == "1") break@outer
        for (i in 1..10){
            println("$i 입니다")
        }

    }
}