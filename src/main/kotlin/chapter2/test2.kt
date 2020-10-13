package chapter2

enum class Day {
    MON,
    TUE,
    WEN,
    THU,
    FRI,
    SAT,
    SUN
}

fun schedule(day: Day, sunny: Boolean) = when (day) {
    Day.SAT -> basketball()
    Day.SUN -> fishing()
    Day.FRI -> appointment()
    else -> when {
        sunny -> library()
        else -> study()
    }
}

fun basketball() { print("basketball") }
fun fishing() { print("fishing") }
fun appointment() { print("appointment") }
fun library() { print("library") }
fun study() { print("study") }

fun main(args: Array<String>) {
    schedule(Day.SAT, false)
}