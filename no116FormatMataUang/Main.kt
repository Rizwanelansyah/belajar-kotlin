import java.text.NumberFormat
import java.util.*

fun main () {

  println("--------------------------------------------")
  println("Latihan Format Mata Uang (Built-in Library) : Rizwan Elansyah")
  println("--------------------------------------------")

  val indoLocale = Locale("in", "ID")

  val formater = NumberFormat.getCurrencyInstance(indoLocale)
  val money = 1_000_000

  val formatedMoney = formater.format(money.toLong())

  println(formatedMoney)

}