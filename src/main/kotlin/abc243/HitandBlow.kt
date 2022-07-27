fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val listA = readLine()!!.split(" ").map { it.toInt() }
    val listB = readLine()!!.split(" ").map { it.toInt() }

    val ans1 = listA.filterIndexed { index, c -> c == listB[index] }.count()
    val ans2 = listA.filter { listB.contains(it) }.count()

    println(ans1)
    println(ans2 - ans1)
}
