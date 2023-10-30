fun main(){
  var nilai1:Int
  var nilai2:Int
  var hasil:Int

  println("------------------------------------------------------")
  println("Latihan Membuat Kalkulator Sederhana: Rizwan Elansyah")
  println("------------------------------------------------------")

  print("Nilai Pertama: ")
  val inputNilai1 = readLine()
  nilai1 = inputNilai1?.toInt() ?:0

  print("Nilai Kedua: ")
  val inputNilai2 = readLine()
  nilai2 = inputNilai2?.toInt() ?:0

  hasil = nilai1 * nilai2
  println("Hail Kali :\n$nilai1 X $nilai2 = $hasil \n")

  hasil = nilai1 / nilai2
  println("Hail Bagi :\n$nilai1 / $nilai2 = $hasil \n")

  hasil = nilai1 + nilai2
  println("Hail Tambah :\n$nilai1 + $nilai2 = $hasil \n")

  hasil = nilai1 - nilai2
  println("Hail Kurang :\n$nilai1 - $nilai2 = $hasil \n")
}