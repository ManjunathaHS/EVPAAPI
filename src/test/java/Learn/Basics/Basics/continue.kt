package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/10/2018
 */

fun main(args: Array<String>) {
//
//
//    labelFor@ for (i in 1..5) {
//        if (i <= 4) {
//            println(i)
//            continue@labelFor
//            print("In if loop post continue")
//        } else {
//            println("message")
//        }
//    }


    for (a in 1..10 step (2)){
        labelagain@for (b in 1..20 step (5)){
            if(a==b){
                println("value of a: $a and b: $b")
                continue@labelagain
                print("Message in if post continue")
            }
        }
    }
}