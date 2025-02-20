//how can use a parameterized constructor to make objects
class Bird2(var type:String,var color:String)

fun main()
{
    val b2 = Bird2("Parrot","Green")
    println(b2.type)
    println(b2.color)
}