fun main () {

  val hari = 2

  println("--------------------------------------------")
  println("Latihan Percabangan When Dengan Blok Kode : Rizwan Elansyah")
  println("--------------------------------------------")

  when (hari) {
    1 -> {
      println("Hari Pertama Dalam Seminggu")
      println("Senin")
    }
    2 -> {
      println("Hari Kedua Dalam Seminggu")
      println("Selasa")
    }
    3 -> {
      println("Hari KeTiga Dalam Seminggu")
      println("Rabu")
    }
    4 -> println("Kamis")
    5 -> println("Jumat")
    6 -> println("Sabtu")
    7 -> println("Minggu")
    else -> println("Hari Tidak Valid.")
  }

}