package practice

//주문 상태 처리
enum class OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED
}

fun handleOrderStatus(status: OrderStatus): String {
    return when(status){
        OrderStatus.PENDING -> "주문이 접수되었습니다."
        OrderStatus.PROCESSING -> "주문을 준비중입니다."
        OrderStatus.SHIPPED -> "주문이 배송 중입니다."
        OrderStatus.DELIVERED -> "주문이 배송 완료되었습니다."
        OrderStatus.CANCELED -> "주문이 취소되었습니다."
    }
}