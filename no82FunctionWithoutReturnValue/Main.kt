fun main() {

  val a = 10
  val b = 20

  println("-------------------------------------------")
  println("Latihan Fungsi Tanpa Nilai Kembali : Rizwan Elansyah")
  println("-------------------------------------------")

  printSum(a, b)
  printSum(5, 5)

}

fun printSum(a: Int, b: Int): Unit {
  println("\nHasil Penjumlahan $a + $b : " + (a + b))
}