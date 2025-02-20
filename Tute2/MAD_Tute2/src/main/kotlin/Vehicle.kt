interface Vehicle {
    fun start() //interfaces they just have the prototypes (signature) --> no implementation
    fun stop()
}

//the below one is the one who implements that
class car:Vehicle{

    override fun start() {
        println("Car Started!!!")
    }

    override fun stop() {
        println("Car stopped !!!")
    }
}

fun main()
{
    val obj = car()
    obj.start()
    obj.stop()
}

