package ex

data class Rmb(private val value: Int) {
    constructor(number: Double) : this((number * 100).toInt())

    operator fun plus(a: Rmb): Rmb {
        return Rmb(value + a.value)
    }

    operator fun minus(a: Rmb): Rmb {
        if (value - a.value < 0) {
            throw IllegalArgumentException("RMB can't be negative!")
        }
        return Rmb(value - a.value)
    }

    operator fun times(a: Int): Rmb {
        return Rmb(value * a)
    }

    operator fun div(a: Int): Rmb {
        return Rmb(value / a)
    }

    operator fun compareTo(a: Rmb): Int {
        return value - a.value
    }

    override fun toString(): String {
        return "¥ ${value / 100}.${value % 100}"
    }

}

fun main(args: Array<String>) {
    println(Rmb(12))
    val a = Rmb(12.34)
    println(a)
    println(a + Rmb(3.0))
    println(a - Rmb(3.0))
    println(a / 3)
    println(a * 4)
    println(a < Rmb(13.0))
    println(a - Rmb(23.0))
}

