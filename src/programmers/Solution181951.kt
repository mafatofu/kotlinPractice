package programmers
//정수 a와 b가 주어집니다.
// 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
fun main(){
//    val input = readln();
//    val a = input.split(" ")[0];
//    val b = input.split(" ")[1];
//    println("a = $a");
//    println("b = $b");
    val (a, b) = readln().split(" ").map(String::toInt);
    //print("a = $a\nb = $b");
    val maxNum = if (a > b) a else b
    println("더 큰 수는 $maxNum 입니다.");
}