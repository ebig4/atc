package abc242
import kotlin.math.*
fun main() {
    val s = nextInt()
    val q = nextInt()
    val list = List(q) { readLine()!!.split(" ").map { it.toInt() } }
    for (i in 1..q) {
        val t = list[i][0]
        val k = list[i][1]
        val w = k / (2.0.pow(t).toInt())

    }
}

fun next() = readLine()!!
fun nextInt() = abs.next().toInt()
fun nextLong() = abs.next().toLong()
fun nextDouble() = abs.next().toDouble()
fun nextList() = abs.next().split(" ")
fun nextListOfInt() =nextList().map { it.toInt() }
fun nextListOfLong() =nextList().map { it.toLong() }
fun nextListOfDouble() =nextList().map { it.toDouble() }
fun newLineList(n: Int) = List(n) { readLine()!! }