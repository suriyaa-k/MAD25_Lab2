enum class Day(val dayOfWeek:Int) {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)
}
fun printDay(day:Day)
{
    when(day)
    {
        Day.MONDAY -> println("Week Start from Monday")
        Day.TUESDAY -> println("Its the second Day of the Week")
        Day.WEDNESDAY -> println("Third Day")
        Day.THURSDAY -> println("Fourth Day")
        Day.FRIDAY -> println("Fifth Day")
        Day.SATURDAY -> println("Sixth Day")
        Day.SUNDAY -> println("This is the Last Day of the Week")
    }
}

fun main()
{
    val dayNum = Day.SATURDAY //this refers to one element of the collection to get the output
    printDay(dayNum)
}