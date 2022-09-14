public class conversion {
    public static void main(String[] args) {
        //calcFeetAndInchesToCentimetres(6,10);
        System.out.println(calcFeetAndInchesToCentimetres(6,10));
    }

    public static double calcFeetAndInchesToCentimetres(double feet,double inches){

        if ((feet>=0) && (inches>=0 && inches<=12 )){

            double feetcenti=feet/(2.54*12) + inches*12*2.54;
            return feetcenti;

        }

        else{
            return -1;
        }


    }
}
