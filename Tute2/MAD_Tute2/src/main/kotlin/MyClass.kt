sealed class MyClass {
    sealed class Shape{
        class Circle(var radius:Float):Shape()
        {
            fun calArea() : Float
            {
                return 22.0f/7 * radius * radius
            }
        }
        class Square(var length:Int):Shape()
        {
            fun calArea() : Int
            {
                return length * length
            }
        }
        class Rectangle(var length : Int,var breadth:Int):Shape()
        object NotAShape:Shape()
    }
}

fun main()
{
    val obCircle = MyClass.Shape.Circle(7.0f)
    var ans = obCircle.calArea() //calling statement for calArea Function defined in Circle class
    println("Area of the Circle is $ans")
}

