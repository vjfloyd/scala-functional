package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b:Int): String = {
    a + " " + b
  }
  println(aFunction("aaa",33))
  def aParameterlessFunction(): Int = 55
  println(aParameterlessFunction)
  println(aParameterlessFunction)

  def aRepeatedFunction(aString:String, n: Int):String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("fuck",4))
  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String ): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b:Int): Int = a + b

    aSmallerFunction(n,n-1)
  }

  def greeting (name:String , age:Int):String = {
     "hi my name is " + name + " and I am " + age + " years old"
   }

  println(greeting("perro",11))


  def factorial(n: Int): Int = {
    if (n==1) 1
    else n * factorial(n-1)
  }
  println(factorial(5))

  def fibonacci(n: Int): Int ={
    if (n > 2)
      fibonacci(n-1) + fibonacci(n-2)
    else 1
  }
  println(fibonacci(8));

  def isPrime(n: Int ): Boolean = {
    def subPrime(t : Int): Boolean={
      if(t<=1) true
      else n%t!=0 && subPrime(t-1)
    }
    subPrime(n/2)
  }
  println(isPrime(33));

}
