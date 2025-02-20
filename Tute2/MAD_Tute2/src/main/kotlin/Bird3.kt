//parent class that defines common attributes belongs to birds
open class Bird3 {

    var color = "Green"
}

//child class inherits the parent properties and methods
class Parrot:Bird3()
{
    fun myFunction()
    {
        println(color) //this access the parent attribute inherited to the child
    }
}

fun main()
{
    var myObj = Parrot() //This makes the object from child
    myObj.myFunction()
}