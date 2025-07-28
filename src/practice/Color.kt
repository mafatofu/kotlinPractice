package practice

enum class Color {
    RED,
    BLUE,
    YELLOW,
    GREEN,
    PURPLE
}
//각 색상에 대한 감정 매핑
fun getEmotionByColor(color: Color): String {
    return when(color) {
        Color.RED -> "분노"
        Color.BLUE -> "차분함"
        Color.YELLOW -> "활발함"
        Color.GREEN -> "차분함"
        Color.PURPLE -> "어지러움"

    }
}