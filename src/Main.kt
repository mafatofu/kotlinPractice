import practice.*

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    //val product = Product("cola", 1000, -1.1)
    //println("상품명 : ${product.name}\n 상품가격 : ${product.price}\n 상품할인가 : ${product.discountRate}\n 최종가격 : ${product.finalPrice}")
    val status = OrderStatus.SHIPPED
    println(handleOrderStatus(status))

    val emotion = Color.RED
    println(getEmotionByColor(emotion))

    val result = (calculate(11.7, 2.2, Operation.MULTIPLY))
    println(result)

    val result1 = when (val x = 5) {
        in 1..10 -> "1~10 사이"
        else -> "그 외"
    }
    println(result1)

    println(describe(11.11))
}

fun describe(obj: Any): String {
    return when (obj) {
        is String -> "문자열 길이: ${obj.length}"       // String으로 자동 캐스트됨
        is Int -> "정수 + 1: ${obj + 1}"               // Int로 자동 캐스트됨
        is List<*> -> "리스트 크기: ${obj.size}"       // List로 자동 캐스트됨
        else -> "알 수 없는 타입"
    }
}