fun main () {

  val hari = 2

  println("--------------------------------------------")
  println("Latihan Percabangan When Dengan Rentang : Rizwan Elansyah")
  println("--------------------------------------------")

  when (hari) {
    in 1..5 -> println("Hari Ke-$hari, Harinya Masuk Sekolah")
    else -> println("Hari Ke-$hari, Harinya Libur")
  }

}