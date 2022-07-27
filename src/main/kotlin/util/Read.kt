package util

fun next() = readLine()!!
fun nextInt() = abs.next().toInt()
fun nextLong() = abs.next().toLong()
fun nextDouble() = abs.next().toDouble()
fun nextList() = abs.next().split(" ")
fun nextListOfInt() =nextList().map { it.toInt() }
fun nextListOfLong() =nextList().map { it.toLong() }
fun nextListOfDouble() =nextList().map { it.toDouble() }
fun newLineList(n: Int) = List(n) { readLine()!! }