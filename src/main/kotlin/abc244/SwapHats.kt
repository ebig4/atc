package abc244
// https://atcoder.jp/contests/abc244/tasks/abc244_d

fun main(args: Array<String>) {
    val s = readLine()!!.split(" ")
    val t = readLine()!!.split(" ")
    val match = s.indices.count { s[it] == t[it] }

    val result = when(match) {
        0 -> true
        1 -> false
        else -> true
    }

    println(if (result) "Yes" else "No")
}
