package za.ac.cput.adpassignment;

public class Math {
    /**
     *this is a division of teo integer program that returns a results
     * @author : Mpumelelo Magagula
     *  Student no: 218136021
     * @param c
     * @param d
     */
//    public static int sum(final int c, final int d){
//
//        return c + d;
//    }
//    public static double dublesum(double c, double d){
//        return c + d;
//    }
//    public static void main(String[] args){
//
//        System.out.println(sum( 2,6));
//    }
    private int c, d;

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Math{" +
                "c=" + c +
                ", d=" + d +
                '}';
    }

}
