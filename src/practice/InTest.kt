package practice

fun isLetter(c : Char) = when (c){
    in 'a'..'z', in 'A'..'Z' -> "$c 는 문자입니다."
    in '0'..'9' -> "$c 는 숫자입니다."
    else -> "문자도 숫자도 아니입니다."
}

fun main(){
    println(isLetter('1'))

}