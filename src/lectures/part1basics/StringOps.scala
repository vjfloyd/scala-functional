package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning scala"
  println(str.charAt(2))
  println(str.substring(1,3))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())

  println(str.length)

  val aNumberString = "12"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')

  println(str.reverse)
  println(str.take(4))


  // Scala-specific : String interpolators

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello , my nameis $name and I am $age "
  val anotherGreeting = s"hELLO $name  my age ${age + 1}"
  println(anotherGreeting)

  // F-interpolators
  val  speed = 111f
  val myth = f"$name%s can eat $speed%2.2f burger per minute"
  println(myth)

  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")


}
