import java.util.Scanner

fun main () {

  println("--------------------------------------------")
  println("Latihan Mengakses Class Pada Package (Built-in Java) : Rizwan Elansyah")
  println("--------------------------------------------")

  val nama: String 
  val usia: Int 

  var key = Scanner(System.`in`)
  print("Nama Siswa :")
  nama = key.nextLine()

  print("Masukkan Usia :")
  usia = key.nextInt()

  println("Data Siswa Baru :$nama Berusia $usia, Berhasil Ditambahkan!")

}