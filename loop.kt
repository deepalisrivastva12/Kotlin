
fun main(){

//    var countEven=0
//    var countOdd=0
//    for(i in 1 .. 10){
//        if((i%2)==0){
//            println("$i is even ")
//            countEven+=i
//        }else{
//            println("$i is odd")
//            countOdd+=i
//        }
//
//    }
//    println(countEven)
//    println(countOdd)

    var even=0
    var odd=0
    var numbers=arrayOf(1,2,3,4,4)
    var size = numbers.size
    for(i in 0 until size){
        if((numbers.get(i)%2)==0){
            println( "${numbers.get(i)} is even")
            even+=i
        }else{
            println("${numbers.get(i)} is odd")
            odd+=i
        }
    }
    println("even sum is "+even)
    println("odd sum is "+odd)
}