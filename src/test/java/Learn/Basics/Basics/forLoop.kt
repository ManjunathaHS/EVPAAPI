package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/10/2018
 */

fun main(args: Array<String>) {

    val marks = arrayOf(10, 20, 30, 40)
    for (a in marks) {
        println(a)
    }

    println("Indices")
    for (a in marks.indices) {
       // println("marks[$a]" + marks[a])
        println(a)
    }

    println("Range")
    for (i in 1..4){
        print(i)
    }

    for(i in 1..5 step (2))
        println(i)
}