package practice

fun fizzbuzz(i : Int) = when {
    i % 15 == 0 -> "피즈버즈"
    i % 3 == 0 -> "피즈"
    i % 5 == 0 -> "버즈"
    else -> "$i"
}

fun main(){
//    for (i in 1..100) {
//        println(fizzbuzz(i))
//    }
//    for (i in 100 downTo 1 step 2) {
//        println(fizzbuzz(i))
//    }
    for (i in 1..<10){
        println(i)
    }
//    for (i in 0..<100){
//        println(fizzbuzz(i))
//    }
}