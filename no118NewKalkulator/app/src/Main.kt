package app.src
import javax.swing.JOptionPane
import com.formdev.flatlaf.FlatDarkLaf
import rizwan.elansyah.kalkulator.*

fun main() {
  FlatDarkLaf.setup()

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