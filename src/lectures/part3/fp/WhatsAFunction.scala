package lectures.part3.fp

object WhatsAFunction extends  App {

  //DREAM : use function as first class elements
  // problema : OPP
  val doubler = new MyFunction[Int,Int] {
    override def apply(element: Int): Int = element*2
  }
  println(doubler(2))

  val stringToIntConverter = new Function1[String,Int] {
    override def apply(string: String): Int = string.toInt;
  }
  println(stringToIntConverter("3")+4)

  val adder :((Int, Int) => Int) = new Function2[Int,Int,Int] {
    override def apply(a: Int, b: Int): Int = a+b
  }

  println(adder(19,20))

  // Function types Function2[A,B,R] === (A,B) => R
  // ALL SCALA FUNCTIONS ARE OBJECTS

  var concat : ((String , String) => String) = new Function2[String,String,String] {
    override def apply(a: String, b: String): String = a+b
  }

  println(concat("hola"," bitch"))


}

trait MyFunction[A,B]{
  def apply(element: A):B
}