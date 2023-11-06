fun main () {

  val x = 20
  val y = 10
  val z = 10

  println("--------------------------------------------")
  println("Latihan Percabangan When Dengan Ekspresi : Rizwan Elansyah")
  println("--------------------------------------------")

  when (x) {
    (y + z) -> print("y + z = x = $x (Kondisi Sesuai)")
    else -> print("Kondisi Tidak Sesuai")
  }

}