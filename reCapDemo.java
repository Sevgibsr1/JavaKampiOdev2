public class reCapDemo {


        public int Topla(int sayi1, int sayi2){
            return sayi1+sayi2;
        }
        public int Cikar(int sayi1, int sayi2){
            return sayi1-sayi2;
    }
        public int Carp(int sayi1, int sayi2){
            return sayi1*sayi2;
        }
        public int Bol(int sayi1, int sayi2){
            return sayi1/sayi2;
        }

    public static void main(String[] args) {
        reCapDemo reCapDemo=new reCapDemo();
        int sonuc = reCapDemo.Topla(3,4);
        System.out.println(sonuc);

    }
}
