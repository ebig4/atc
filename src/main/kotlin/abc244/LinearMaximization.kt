fun main(args: Array<String>) {
    val q = readLine()!!.toInt()
    val list = List(q) { readLine()!!.split(" ").map { it.toInt() } }
    list.indices.forEach { i ->
        val result = list.take(i+1).map { it[0] *list[i][2] + it[1] * list[i][3]  }.maxOrNull()
        println(result)
    }
}

fun <T : Comparable<T>> Iterable<T>.maxOrNull(): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var max = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (max < e) max = e
    }
    return max
}