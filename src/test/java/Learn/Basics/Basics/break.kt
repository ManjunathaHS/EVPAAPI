package Learn.Basics.Basics

/**
 * @author jayaprakashs on 10/10/2018
 */

fun main(args:Array<String>){

    for ( i in 1..5){
        if(i<=4){
            println(i)
            break
        }else
        {
            println("Inside else")
        }
    }

    for(i in 1..4){
        println("inside for loop:"+i)
        break
    }

    breakForLoop1@for(j in 1..5 step (2)){
        breakForLoop2@for ( i in 8 downTo  1 step 1){
            if(j==i){
                println("values of j: $j and i: $i")
                break@breakForLoop1
            }

        }
    }
}