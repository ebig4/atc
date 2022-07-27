import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter

//https://atcoder.jp/contests/abc244/tasks/abc244_c

fun main(args: Array<String>) {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val out = PrintWriter(System.out)

    solve(br, out)

    out.flush()
}

private fun solve(br: BufferedReader, out: PrintWriter) {
    val n = br.readLine()!!.toInt()
    out.println(1)
    var set= (2..2*n+1).toMutableSet()
    out.flush()
    repeat(n) {
        val aoki = br.readLine()!!.toInt()
        set.remove(aoki)
        out.println(set.first())
        set.remove(set.first())
        out.flush()
    }
    val last = br.readLine()!!.toInt()
}