package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/5/2018
 */

fun main(args: Array<String>): Unit {
    val a = 7
    val result = a in 1..8
    println(result)

    for (a in 1..8) {
        print(a)
    }

    val b = 1.0..2.5
    println(b)
    println("2.1 is in range of ${2.1 in b}")

    /**************** down to ***********/

    val result2 = a in 8..1
    println(result2)

    for (a in 8..1) {
        println(a)
    }

    val result3 = a in 8 downTo 1
    println(result3)

    for (a in 8 downTo 1) {
        print(a)
    }


    /**************** Until Range ***********/
    println("--------------------Until range-------------");

    for (a in 1 until 8) {
        println(a)
    }


    // Desc order doesnt work in until range
    for (a in 8 until 1) {
        println("Until desc")
        print(a)
    }

    val result5 = a in 1 until 8
    println(result5)

    // Desc order doesnt work in until range
    val result6 = a in 8 until 1
    println(result6)

    /**************** Range OF***********/

    println("------------------Range Of---------------------------")
    val result7 = a in 1.rangeTo(8)
    println(result7)

    // Desc order doesnt work
    val result8 = a in 8.rangeTo(1)
    println(result8)

    for (a in 1.rangeTo(8)) {
        print(a)
    }

    /**************** range step***********/
    println("--------------range step1--------------------------")
    for (a in 1..8 step 2 * 2)
        print(a)

    println("--------------range step2--------------------------")

    for (a in 8 downTo 1 step 2)
        print(a)

    /*******************8 range iterator****************/
    println(" range iterator")

    // Range has be in asc order and only char

    val ab = 'a'..'g'
    val it = ab.iterator()
    while (it.hasNext()) {
        val temp = it.next()
        println(temp)
    }


}


