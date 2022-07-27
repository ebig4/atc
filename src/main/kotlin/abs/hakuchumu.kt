fun main(args: Array<String>) {
    var s = readLine()!!
    var r = true
    while (s.isNotEmpty() && r) {
        when {
            s.endsWith("dreamer") ->  s = s.substring(0, s.lastIndexOf("dreamer"))
            s.endsWith("eraser") -> s = s.substring(0, s.lastIndexOf("eraser"))
            s.endsWith("dream") -> s = s.substring(0, s.lastIndexOf("dream"))
            s.endsWith("erase") -> s = s.substring(0, s.lastIndexOf("erase"))
            else -> r = false
        }
    }
    println(if (r) "YES" else "NO")
}


