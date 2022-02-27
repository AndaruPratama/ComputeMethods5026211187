import javax.swing.*;

public class TestClass5026211187 {
    public static void main (String[] args) {

        String SuhuF, a, b;
        int Inta, Intb, dadu1;
        double douSuhuF, SuhuC, hipo;

        //Menghitung suhu
        SuhuF = JOptionPane.showInputDialog( null, "How many degree to convert?");
        douSuhuF = Double.parseDouble (SuhuF);
        ComputeMethods5026211187 cm = new ComputeMethods5026211187();
        SuhuC = cm.fToC(douSuhuF);
        JOptionPane.showMessageDialog(null, "This is Celcius : " +SuhuC+ "\u00B0C");

        //Menghitung hipotenusa
        a = JOptionPane.showInputDialog(null, "Input the side length of a triangle");
        Inta = Integer.parseInt(a);
        b = JOptionPane.showInputDialog(null, "Input another side length");
        Intb = Integer.parseInt(b);
        hipo = cm.hypotenuse( Inta, Intb);
        JOptionPane.showMessageDialog(null, "This is the result : " +hipo+ " cm\u00B2");

        //Menghitung dadu
        dadu1 = cm.roll();
        JOptionPane.showMessageDialog(null, "Hasil penjumlahan dadu adalah : " +dadu1+ ".");


    }
}
