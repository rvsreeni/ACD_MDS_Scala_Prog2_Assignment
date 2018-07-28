// Scala function - Fibonacci numbers using Recursion
def fib(n:Int):Int = {
     // Declare an array to store Fibonacci numbers
     var f = new Array [Int] (n+2)	
     var i = 0
     // First 2 terms
     f(0) = 0
     f(1) = 1
     //Recursion loop
     for (i <- 2 to n)
     {
       //Add the previous 2 terms in the series and store 
       f(i) = f(i-1) + f(i-2)
     } 
     return f(n)
}

