fun main () {

  println("--------------------------------------------")
  println("Latihan Fungsi Inine : Rizwan Elansyah")
  println("--------------------------------------------")

  myFunction({println("Inline Function Paramaeter\n")})
  myFunction({jumlahkan(5, 6)})

}

inline fun myFunction(content: () -> Unit) {
  println("I am Inline Function - A")
  content()
}

fun jumlahkan(a: Int, b: Int) = println("Hasil $a + $b : " + (a + b))