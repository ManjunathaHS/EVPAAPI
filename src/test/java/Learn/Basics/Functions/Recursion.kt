package Learn.Basics.Functions

/**
 * @author jayaprakashs on 10/25/2018
 */

var count=0
tailrec fun rec(){
    println("is $count")
    count++
    if(count<=5){
        println("Hello is $count")
        rec()
    }
}


fun main(args:Array<String>){
    rec()

}