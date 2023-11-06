fun main () {

  val buah = arrayOf<String>("Mangga", "Jeruk Buruk", "Sirsak", "Lemon")
  var i = 0

  println("--------------------------------------------")
  println("Latihan Pernyataan Continue Pada Do While Loop : Rizwan Elansyah")
  println("--------------------------------------------")

  do {
    if (buah[i] == "Jeruk Buruk") {
      continue
    }
    println(buah[i])
  } while ( (i++) < (buah.size - 1))

}