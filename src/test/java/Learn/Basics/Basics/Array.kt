package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/10/2018
 */

fun main(args: Array<String>) {


    var array1 = arrayOf("test", "demo", "prod")

    for (i in array1) {
        println(i)
    }

    println("--------------------------------")

    for (i in 0..array1.size - 1) {
        println("index is $i:" + array1[i])

    }

    println("--------------------------------")

    var array2 = intArrayOf(10, 20, 30, 40)
    var array3 = charArrayOf('e', 'f', 'g')
    for (i in 0..array2.size - 1) {
        println(array2[i])
    }

    println("--------------------------------")

    for (e in array3) {
        println(e)
        println(array3.get(1))

    }

    println("--------------------------------")



    var array4= arrayOf("test",45,"demo",'a',4.5)
    for (a in array4){
        println(a)
    }

    println("--------------------------------")


    var array5=Array(5){1+ array4.size}
    for (a in array5){
        println(a)
    }

}