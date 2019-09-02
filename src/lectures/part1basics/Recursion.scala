package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends  App {

  def factorial(n : Int): Int ={
    if (n<=1) 1
    else {
      println("computing factorial of " + n + " - first need factorial of " + (n-1))
      val result = n*factorial(n-1)
      println(" computed factorial of "+n)
      result
    };
  }

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelp(n: Int, acumulator : BigInt): BigInt = {
      if(n <= 1) acumulator
      else factHelp(n-1,n*acumulator) // TAIL RECURSION = User recursive call as the LAST expresion
    }
    factHelp(n, 1)
  }


  def isPrime(n:Int): Boolean = {
    @tailrec
    def subPrime(t : Int , memoBool : Boolean): Boolean = {
      if (t<=1) memoBool
      else subPrime(t-1, n%t!=0 && memoBool)
    }
    subPrime(n/2,true)
  }

  println(isPrime(11))

  // println(factorial(100))
  // println(factorial(5000))
  //println(anotherFactorial(5000))
  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  def fibonacci(n: Int): Int ={
    if (n > 2)
      fibonacci(n-1) + fibonacci(n-2)
    else 1
  }
  println(fibonacci(5));


}
