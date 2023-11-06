import java.util.Scanner
import java.util.Random

fun main() {
  val rand = Random()
  val input = Scanner(System.`in`)

  print("NOMOR ACAK\n")
  print("Masukkan Nilai MIN :")
  val nilaiAwal = input.nextInt()
  print("Masukkan Nilai MAX :")
  val nilaiAkhir = input.nextInt()

  val randomNumber = rand.nextInt(nilaiAkhir - nilaiAwal + 1) + nilaiAwal
  println("Nilai Acak : $randomNumber")
}