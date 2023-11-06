fun main () {

  val buah = arrayOf<String>("Mangga", "Jeruk", "Sirsak", "Lemon")
  var i = 0

  println("--------------------------------------------")
  println("Latihan Pernyataan Break Pada Do While Loop : Rizwan Elansyah")
  println("--------------------------------------------")

  do {
    println(buah[i])
    if (buah[i] == "Jeruk") {
      break
    }
    i++
  } while (i <= 10)

}