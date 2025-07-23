import practice.Product

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val product = Product("cola", 1000, -1.1)
    println("상품명 : ${product.name}\n 상품가격 : ${product.price}\n 상품할인가 : ${product.discountRate}\n 최종가격 : ${product.finalPrice}")
}