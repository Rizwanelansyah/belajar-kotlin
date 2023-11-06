import javax.swing.JOptionPane

fun main () {

  val str1 = "--------------------------------------------\n"
  val str2 = "Latihan Menampilkan Dialog Pesan (Built-in Library) : Rizwan Elansyah\n"
  val str3 = "--------------------------------------------\n"
  val title = str1 + str2 + str3

  JOptionPane.showMessageDialog(null, "Ini Adalah Dialog Informasi")
  JOptionPane.showMessageDialog(null, "Hello Rizwan", "Dialog Pesan", JOptionPane.PLAIN_MESSAGE)

  val input1 = JOptionPane.showInputDialog("Siapa Nama Kamu?")
  val input2 = JOptionPane.showInputDialog(null, "Kelas Berapa Kamu?", "Dialog Input")

  val input3 = JOptionPane.showInputDialog(null, "Inputkan Alamat :", "Dialog Input", JOptionPane.PLAIN_MESSAGE)
  val input4 = JOptionPane.showInputDialog(null, "Kontak Yang Dapat Hubungi :", "Dialog Input", JOptionPane.PLAIN_MESSAGE)

  val myData = "$title\nNama : $input1\nKelas : $input2\nAlamat : $input3\nKontak : $input4"

  JOptionPane.showMessageDialog(null, myData, "Biodata Singkat", JOptionPane.PLAIN_MESSAGE)

}