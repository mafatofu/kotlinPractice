package practice
/*
* 다음 조건을 만족하는 Product 클래스를 코틀린으로 작성해보세요.
✅ 요구사항
- name(문자열), price(정수), discountRate(실수) 프로퍼티를 가진다.
- price는 0 이상만 허용되며, 음수가 들어오면 0으로 자동 설정된다. (커스텀 setter 사용)
- discountRate는 0.0 이상 1.0 이하의 값만 허용되며, 범위를 벗어나면 0.0으로 설정된다. (커스텀 setter 사용)
- finalPrice라는 읽기 전용 프로퍼티를 만들고, price * (1 - discountRate)로 계산된 값을 반환한다. (커스텀 getter 사용)

* */
class Product(
    val name : String,
    price : Int = 0,
    discountRate : Double = 0.0) {

    //price는 0 이상만 허용되며, 음수가 들어오면 0으로 자동 설정
    var price : Int = 0
        set(value) {
            field = if (value < 0) 0 else value  //field == price
        }
    //iscountRate는 0.0 이상 1.0 이하의 값만 허용되며, 범위를 벗어나면 0.0으로 설정
    var discountRate : Double = 0.0
        set(value) {
            field = if (value < 0.0 || value > 1.0) 0.0 else value
        }
    //최종가격
    val finalPrice : Double
        get() = price * (1 - discountRate)
    //유효성 검사 적용
    init {
        this.price = price
        this.discountRate = discountRate
    }
}