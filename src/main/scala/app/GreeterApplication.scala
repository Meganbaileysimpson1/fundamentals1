
package app

import scala.io.StdIn



object GreeterApplication extends App {


//  def greet(name : String) : Unit = {
//
//    if (name == "adam") {
//      println(s"You dont get a hello!")
//    }
//     { println(s"""Hello $name""")
//    }
//
//  }


  val name : String = StdIn.readLine("what is your name \n")

  val person : Person = new Person(name)

  println(person.speak())


}
