package chapter2

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun foo(int: Int) = {
    print(int)
}

fun main(args: Array<String>) {
    println("=============================")
    println(sum(3, 5))
    println("\n=============================")
    listOf(1, 2, 3).forEach { foo(it)() }
}