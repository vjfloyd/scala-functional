package lectures.part1basics

object Expressions extends App {
  val  x = 1+2// EXPRESSION
  println(x)
  println(2+3*7)
  //+ - * / & | << >> >>>
  println(x == 34)

  println(!(1==x))
  var aVariable = 2
  aVariable += 3 // also work with *= , /=
  println(aVariable)

  // Instruccions(DO)   vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 10 else 20)

  var i = 0
  val aWhile = while (i<10){
    i += 1
    println(i)
  }


  // EVERYTHING IN SCALA IS AN EXPRESSION
  val aWeirdValue = (aVariable = 3)
  println(aWhile)

  // side affects : println(), whiles , reassigning

  //Code blocks

  val aCodeBlock = {
    val y =2
    val z = y + 1
    if (z>2) 2 else  3
  }

}
