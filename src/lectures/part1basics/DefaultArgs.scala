package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int , acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

    var fact10 = trFact(10,2)

  def savePicture(format: String = "jpg", width : Int= 1080, height: Int =1024): Unit = println("saving picture")
  savePicture(width = 100)
  savePicture(height = 19,width = 22, format = "bpm")
  savePicture(height = 22)


  def greet(name: String = "superman", age: Int = 20): String =
    s"Hi, I'm $name and my age $age"

  println(greet("pedro",11))
  println(greet( age=12,name="richi"))




}
