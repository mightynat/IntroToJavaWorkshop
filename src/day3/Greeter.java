package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog("Greetings fellow earthling, what is the series of letters and or numbers that you are to respond to?");
JOptionPane.showMessageDialog(null,"Hello "+answer);

}
}
