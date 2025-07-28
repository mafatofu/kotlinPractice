package practice

enum class Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE
}

fun calculate(a: Double, b: Double, op: Operation): Double {
    return when(op){
        Operation.ADD -> a + b
        Operation.SUBTRACT -> a - b
        Operation.MULTIPLY -> a * b
        Operation.DIVIDE -> a / b

    }
}