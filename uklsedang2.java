public class uklsedang2 {
    public static void hitungvolumetabung (int r, int t) {

        Double Volume = Math.PI * r * r * t;
        System.err.println(Volume);
    }
    public static void nama (String a) {

        System.out.println(a);
    }

    public static void main(String[] args) {
       nama("Volume Tabung");
       hitungvolumetabung(14, 30 );
    }


}
