package lectures.part2.oop

object OOBasics extends App {
  var person = new Person ("Jhon", 22)
  println(person.age)

  val author = new Writer("Charles", "Dickens", 1862)
  val impostor = new Writer("Charles", "Dickens", 1862)
  val novel = new Novel("The lord", 1890, author)


  println(author.fullName)
  println(novel.isWrittenBy(impostor))

  val c = new Counter(1)
  //c.inc.inc
  println(c.inc.inc)

}


//class parameters are NOT FIELDS
//Constructor
class Person (name :String, val age: Int = 0){
  //body
  val x = 2
  println(1+3)
  //method
  def greee(name : String ):Unit = println(s"${this.name} say him $name")
  //overloading
  def greet(): Unit = println(s"Hi, Im $name")

  //multiple constructors
  def this(name: String) = this(name,0)
  def this()= this("Jhon Doe")
}
class Writer(firstName: String, surname: String, val year: Int){
    def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author : Writer){
  def authorAge =  year - author.year
  def isWrittenBy(author: Writer) = author== this.author
  def copy(newYear: Int): Novel = new Novel(name,year,author)

}

/*
  Counter class
  - receives an int value
  - method current count
  - method to increment/decrement => new Counter
  - overload inc/dec to receive an amount
*/
  class Counter(val count:Int = 0){
    def inc = {
      println(" Incrementing")
      new Counter(count+1)
    }


    def dec ={
      println(" Decrementing")
      new Counter(count-1)
    }

    def inc(n: Int) = new Counter(count+n)
    def dec(n: Int) = new Counter(count-n)
}



