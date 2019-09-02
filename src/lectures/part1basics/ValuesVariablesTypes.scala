package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 20
  println(x)
  // VAL ARE INMUTABLE
 // COMPILER can infert types
  val y: String = "scala"
  val anotherString = "java"

  val aBooleano:Boolean = false;
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4639
  val aLong: Long = 423423423423423L
  val aDouble: Double = 3.21

  //variables
  var aVariable: Int = 33
  aVariable = 44 // Side effects
}
