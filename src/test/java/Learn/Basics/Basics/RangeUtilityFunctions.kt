package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/5/2018
 */

fun main(args:Array<String>):Unit{
    /*******************************rangeTo**************/

    println("----------------rangeTo----------------")
    val range:IntRange=1.rangeTo(5)
    println(range)
    for (a in range){
        print(a)
    }

    println()
    val range2:CharRange='a'.rangeTo('e')
    println(range2)
    for (a in range2){
        print(a)
    }

    println()
    val range3:IntRange= IntRange(1,5)
    println(range3)
    for (a in range3){
        print(a)
    }

    println()

    val range4:CharRange= CharRange('j','z')
    println(range4)
    for (a in range4){
        print(a)
    }

    /************************downTo() function **********************/

    println("------------------downTo() function------------------")
    val range5= 5 downTo 1
    println(range5)
    for (a in range5){
        print(a)
    }

    println()
    val range6=5.downTo(1)
    print(range6)
    for (a in range6){
        print(a)
    }

    println()
    val range7:IntProgression= IntProgression.fromClosedRange(1,5,+1)
    println(range7)
    for (a in range7){
        print(a)
    }

    println()
    val range8:IntProgression= IntProgression.fromClosedRange(10,1,-2)
    println(range8)
    for (a in range8){
        print(a)
    }

    println()
    val range9:CharProgression= CharProgression.fromClosedRange('a','j',+1)
    println(range9)
    for (a in range9){
        print(a)
    }


    println()
    val range10:CharProgression= CharProgression.fromClosedRange('j','a',-2)
    println(range10)
    for (a in range10.reversed()){
        print(a)
    }


    /**********************step()*****************************/
    println()
    println("step()")
    val range11=1..10
    for(a in range11 step 2)
        // Below can also be used
    //for(a in range11.step(2))
        print(a)

}

