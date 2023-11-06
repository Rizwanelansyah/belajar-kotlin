fun main () {

  println("--------------------------------------------")
  println("Latihan Pernyataan Continue Berlabel Kotlin : Rizwan Elansyah")
  println("--------------------------------------------")

  outerLoop@ for (i in 1..3) {
    println("Perulangan Ke : $i (outerLoop)")
    innerLoop@ for (j in 1..3) {
      if (i == 2) {
        continue@outerLoop
      }
      println("\t\tinnerLoop ke-$j : i = $i dan j = $j")
    }
  }

}