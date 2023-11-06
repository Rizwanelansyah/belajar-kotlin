fun main() {

  val a = 10
  val b = 20

  println("-------------------------------------------")
  println("Latihan Fungsi Dengen Nilai Kembali : Rizwan Elansyah")
  println("-------------------------------------------")

  val result = sumTwo(a, b)
  println("niai $a + $b : " + result)

}

fun sumTwo(a: Int, b: Int): Int {
  val x = a + b
  return x
}