class Bird {

    var type = ""
    var color = ""
}

fun main()
{
    val b1 = Bird() //makes an object from Bird class (b1)

    //set the object attributes with . operator
    b1.type = "Parrot"
    b1.color = "Green"

    println(b1.type)//here this access the values of each attribute
    println(b1.color)

}