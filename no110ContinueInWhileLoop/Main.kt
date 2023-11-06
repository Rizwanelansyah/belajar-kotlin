fun main () {

  println("--------------------------------------------")
  println("Latihan Pernyataan Continue Pada While Loop : Rizwan Elansyah")
  println("--------------------------------------------")

  var i = 0
  while (i++ <= 10) {
    if( i % 2 == 0) {
      continue
    }
    println(i)
  }

}