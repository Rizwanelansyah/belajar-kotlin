fun main () {

  val usia: Int = 20

  println("--------------------------------------------")
  println("Latihan Percabangan If Bersarang : Rizwan Elansyah")
  println("--------------------------------------------")

  val hasilCek = if (usia > 12) {
    if (usia > 12 && usia < 20) {
      "Remaja"
    } else {
      "dewasa"
    }
  } else {
    "Anak-anak"
  }
  print("Nilai Hasil : ")
  println(hasilCek)

}