fun main () {

  println("--------------------------------------------")
  println("Latihan Pernyataan Break Berlabel Kotlin : Rizwan Elansyah")
  println("--------------------------------------------")

  outerLoop@ for (i in 1..3) {
    println("Perulangan Ke : $i (outerLoop)")
    innerLoop@ for (j in 1..3) {
      println("\t\tinnerLoop ke-$j : i = $i dan j = $j")
      if (i == 2) {
        break@outerLoop
      }
    }
  }

}