fun main() {

  println("-------------------------------------------")
  println("Latihan Fungsi Rekursifi : Rizwan Elansyah")
  println("-------------------------------------------")

  loopOneTo(10)

}

fun loopOneTo(max: Int, i: Int = 1) {
  println("Perulangan ke-$i")

  if (i < max) {
    loopOneTo(max, i + 1)
  }

}