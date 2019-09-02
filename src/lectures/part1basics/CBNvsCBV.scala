package lectures.part1basics

object CBNvsCBV extends App{

  def callByValue(x : Long):Unit={
    println(" by value "+ x)
    println(" by value "+ x)

  }

  def callByName(x: => Long):Unit={
    println("by name: "+ x);
    println("by name: " + x)
  }

  callByValue(121312312312L)
  callByName(System.nanoTime())

  def infinite():Int = infinite()+1

  def printFirst(x : Int, y: => Int) =  println(x)

  //printFirst(34, infinite()) Get an error : stackoverflow

  printFirst(34, infinite())



}
