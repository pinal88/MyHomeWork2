package myhomeworkpackage2;

public class MyHomeWorkClass5 {
    public static void main(String[] args) {
        //integer family
        //byte range is-128 to 127
        byte g = -100;
        System.out.println("g="+g);

        //short range is -32768 to 32767
        short h = 31768;
        System.out.println(h);


        //int range is -2147483648 to 2147483647
        int i = 2147483646;
        System.out.println("i="+i);

        //long range is -9223372036854775808 to -9223372036854775807
        long j = 9223372036854775807L;
        System.out.println("j="+j);


        //float family
        //float range is 3.4E-38 to 3.4E+38
        float k = 46466644484812411114444.11111111111111111111111111111f;
        System.out.println("k="+k);

        //Double range is approximately 1.8*10(308)
        double l = 11111111222222222222.222222222222222222222222222222222d;
        System.out.println("l="+l);


        //Character family
        //Character range is unicode value (single range value)
        char m = '7';
        System.out.println("m="+m);


        //boolean family
        //boolean don't have range . it's a fix value as true or false
        boolean n = false;
        System.out.println("n="+n);

        //arithmetic Operators
        int o=50;
        int p=90;
        //addition
        System.out.println(o+p);// =50+90=140
        //subtraction
        System.out.println(o-p);// =50-90=-40
        //multiplication
        System.out.println(o*p);// =50*90=4500
        //division
        System.out.println(o/p);// =50/90=0
        //modulus
        System.out.println(o%p);// =50%90=50


    }
}
