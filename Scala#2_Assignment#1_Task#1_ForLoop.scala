// Scala function - Fibonacci numbers using For loop
def fib(n:Int):Int = {
      // first 2 terms
     var a = 1
     var b = 1
     // Sum of n terms
     var c = 0
     //For loop
     for (i <- 3 to n)
     {
     //Add the previous 2 terms in the series and store 
     c = a + b
     //Shift the previous terms
     a = b; b = c
     } 
     return c
}
