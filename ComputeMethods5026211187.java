import java.util.Random;

public class ComputeMethods5026211187 {

        public double fToC (double SuhuF) {
                double SuhuC = 5.0/9*(SuhuF-32);
                return SuhuC;
        }

        public double hypotenuse (int a, int b) {
                double hipo = Math.sqrt((Math.pow( a, 2)) + (Math.pow( b,2)));
                return hipo;
        }

        public int roll () {
                Random dadu = new Random();
                int dice = dadu.nextInt(6)+1;
                int dice2 = dadu.nextInt(6)+1;
                int total = dice + dice2;
                return total;
        }
}


