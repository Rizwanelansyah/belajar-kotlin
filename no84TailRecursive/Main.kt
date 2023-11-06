fun main() {

  val a = 4

  println("-------------------------------------------")
  println("Latihan Fungsi Rekursif Ekor : Rizwan Elansyah")
  println("-------------------------------------------")

  val result = factorial(a)
  println(result)

}

fun factorial(a: Int, accum: Int = 1): Int {
  val res = a * accum
  return if ( a <= 1) {
    res
  } else {
    factorial(a - 1, res)
  }

}