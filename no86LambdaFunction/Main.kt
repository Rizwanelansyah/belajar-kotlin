fun main() {

  println("-------------------------------------------")
  println("Latihan Fungsi Lambda : Rizwan Elansyah")
  println("-------------------------------------------")

  val upperCase = {str: String -> str.uppercase()}

  val total = {a: Int, b: Int -> a + b}

  val sayHelloWorld = {println("Hello Dunia!")}

  println(upperCase("hello world!"))
  println(total(5, 5))
  sayHelloWorld()

}