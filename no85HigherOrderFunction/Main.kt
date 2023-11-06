fun main() {

  val a:Int = 5
  val b:Int = 7

  println("-------------------------------------------")
  println("Latihan Fungsi Tingkat Tinggi : Rizwan Elansyah")
  println("-------------------------------------------")

  val result = calc(a, b, ::sum)
  println("Hasil $a + $b : $result")

}

fun sum(a: Int, b: Int) = a + b

fun calc(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
  return operation(a, b)
}