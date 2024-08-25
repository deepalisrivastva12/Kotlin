fun main(){

    //ways of initializing the array

    //firts way
    var numbers=arrayOf(1,2,3,4,4)
    println(numbers[0])

    //second way using generic class
    var words : Array<String> = arrayOf("Kotlin","java")
    println(words[1])

    //third way using lambda expression
    var sq=Array(5){i->i*i}
    println(sq[3])

    // in-build way to find the size of array
    println(sq.size)

    //empty array
    var word : Array<String> =arrayOf()

    if(word.isEmpty()){
        println("array is empty")
    }else{
        println(word.size)
    }

    println(sq.indexOf(9)) //finding the element at desired index
    println("Element at first index "+words.first())
    println("Element at last index "+words.last()) 



}