fun main() {

  val a = 10
  val b = 20

  println("-------------------------------------------")
  println("Latihan Fungsi Berparameter : Rizwan Elansyah")
  println("-------------------------------------------")

  printResultOf(a, b)
  printResultOf(5, 5)

}

fun printResultOf(a: Int, b: Int) {
  println("\nHasil Penjumlahan $a + $b : " + (a + b))
}