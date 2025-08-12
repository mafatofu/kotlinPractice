package practice
/**
 * 🧩 문제: 과일 재고 확인 프로그램 만들기
 * - Map<String, Int> 형태로 과일 이름과 재고 수량을 저장한다.
 * - 사용자에게 과일 이름을 입력받는다.
 * - 입력한 과일이 Map에 존재하면 "재고 있음"을 출력하고, 없으면 "재고 없음"을 출력한다.
 * - in 키워드를 사용해서 과일이 Map에 있는지 확인할 것.
 *
 * 출력 예시
 * 입력: apple
 * 출력: 재고 있음
 *
 * 입력: mango
 * 출력: 재고 없음
 * */

//입력한 과일이 Map에 존재하면 "재고 있음"을 출력하고, 없으면 "재고 없음"을 출력한다.
// in 키워드를 사용해서 과일이 Map에 있는지 확인할 것.
fun stockCheck(fruitBox : MutableMap<String, Int>, fruitName : String) : String {
    val stock = fruitBox[fruitName] ?: return "잘못된 과일 이름 입니다."
    return if (stock > 0) "재고 있음" else "재고 없음"
}

fun main(){
    //Map<String, Int> 형태로 과일 이름과 재고 수량을 저장한다.
    val fruitBox = mutableMapOf<String, Int>()

    fruitBox["Banana"] = 0
    fruitBox["Apple"] = 1
    fruitBox["Orange"] = 3
    fruitBox["mango"] = 2
    //사용자에게 과일 이름을 입력받는다.
    print("과일이름을 입력하세요(apple / mango / banana / orange): ")
    val input = readln()
    if (input in fruitBox) {
        println(stockCheck(fruitBox, input))
    } else {
        println("잘못된 과일이름입니다.")
    }
}