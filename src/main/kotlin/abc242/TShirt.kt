package abc242

fun main() {
    val (a, b, c, x) = readLine()!!.split(" ").map { it.toDouble() }
    if(x <=  a) {
        println(1)
        return
    }
    if (x > b) {
        println(0)
        return
    }
    val n = b - a
    val result = c / n
    println(result)
}