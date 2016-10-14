object FooBar{
    /* This program takes an integer input from command line through args.
       If input is not a valid number, the program terminates with an error text 'Invalid Input! Please enter a number'
       Prints "foo" is number is divisible by 3
            "bar" if number is divisible by 7
            "foobar" if number is divisible by both 3 and 7
            otherwise the number itself is printed */
            
    def main(args : Array[String]){
        var in = 0
        try{
            in = args(0).toInt    
        }catch{
            case e: Exception => {
                println("Invalid input! Please enter a number")
                return
            }
        }
        
        if(in % 3 == 0 && in % 7 ==0){
            println("foobar")
        }else if(in % 3 == 0){
            println("foo")
        }else if(in % 7 ==0){
            println("bar")
        }else {
            println(in)
        }
    }
}
