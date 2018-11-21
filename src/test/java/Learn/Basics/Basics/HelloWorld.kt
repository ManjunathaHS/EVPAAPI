package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/3/2018

 */

fun  printHello(){
    println("Hello world")
}

fun printName(name:String){
    println(name)

}

fun returnName(name:String):String{
    return name+" return world"
}
fun main(args:Array<String>):Unit{
    println("Hello before")
    printName("hello")
    print(message = returnName("Hello"))
    printHello()
}