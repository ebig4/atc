package abs

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (a * b % 2 == 0) println("Even") else println("Odd")
}

// 入力
fun next() = readLine()!!
fun nextInt() = next().toInt()
fun nextLong() = next().toLong()
fun nextDouble() = next().toDouble()
fun nextList() = next().split(" ")
fun nextListOfInt() =nextList().map { it.toInt() }
fun nextListOfLong() =nextList().map { it.toLong() }
fun nextListOfDouble() =nextList().map { it.toDouble() }
fun newLineList(n: Int) = List(n) { readLine()!! }


val x = nextInt()
val ye = nextLong()
val aaShapePipe = nextDouble()
val xxx = nextListOfInt()

val xasdf = nextListOfLong()
val xasddaf = nextListOfDouble()
val dadsa = newLineList(2)

