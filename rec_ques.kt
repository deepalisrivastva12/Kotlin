//find out factorial
fun fac(num:Int): Int{

    if(num==1){
        return 1
    }
    return num*fac(num-1)
}

//find out the sum of n numbers
fun sum(n:Int): Int{

    if(n==0){
        return 0
    }
    return n+sum(n-1)

}
//find out sum of even numbers for the givin range

fun sumEven(n:Int): Int{
    if(n==0){
        return 1
    }

    if(n%2==0)
        return n+sumEven(n-2)
    else
        return sumEven(n-1)
}

fun main(){
    println("factorial is"+fac(5))
    println("sum of 5 no.s is "+sum(5))
    println("sum of even numbers b/w the range 1 to 5 is "+sumEven(5))

}