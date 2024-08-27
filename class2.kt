
//making a class and create two diff objects with diff parameters for both objects
class data{

    var name :String=""
    var age: Int=0
    var reg_no:String=""

    fun info(name :String ,reg_no:String,age:Int){
        this.name = name
        this.age=age
        this.reg_no=reg_no

    }
    fun displayInfo(){
        println("name of student is "+name+"\n"+"age of student is "+age+"\n"+"registration no of student is "+reg_no)
    }

}

fun main(){

    var myData =data()
    myData.info("anshi","A123",20)

    myData.displayInfo()
    println()
    myData.info("vansh","A124",19)
    myData.displayInfo()


}
