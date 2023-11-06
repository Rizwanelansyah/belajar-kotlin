fun main () {

  val hari: Int = 2

  println("--------------------------------------------")
  println("Latihan Prcabangan When Dengan Multi Kondisi : Rizwan Elansyah")
  println("--------------------------------------------")

  when (hari) {
    1, 2, 3, 4, 5 -> println("Hari Ke-$hari Adalah, Harinya Bekerja")
    else -> println("Hari Ke-$hari Adalah, Harinya Libur")
  }

}