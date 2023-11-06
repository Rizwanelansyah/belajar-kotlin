package app.src
import javax.swing.JOptionPane

fun main() {

  val str1 = "--------------------------------------------\n"
  val str2 = "Latihan Kalkulator Dengan Dialog : Rizwan Elansyah\n"
  val str3 = "--------------------------------------------\n"
  val title = str1 + str2 + str3

  val x = JOptionPane.showInputDialog("Masukkan Bilangan Ke-1 :").toInt()
  val y = JOptionPane.showInputDialog("Masukkan Bilangan Ke-2 :").toInt()

  val addRes = add(x, y)
  val subRes = sub(x, y)
  val mulRes = mul(x, y)
  val divRes = div(x, y)
  val output = "$addRes\n$subRes\n$mulRes\n$divRes"

  JOptionPane.showMessageDialog(null, "$title $output", "Hasil Kalkulator", JOptionPane.PLAIN_MESSAGE)

}

fun add(a: Int, b: Int): String {
  val result = a + b
  val strRes = "$a + $b = $result"
  return strRes
}
fun sub(a: Int, b: Int): String {
  val result = a - b
  val strRes = "$a - $b = $result"
  return strRes
}
fun mul(a: Int, b: Int): String {
  val result = a * b
  val strRes = "$a * $b = $result"
  return strRes
}
fun div(a: Int, b: Int): String {
  val result = a / b
  val strRes = "$a / $b = $result"
  return strRes
}