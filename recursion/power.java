class Power {
    public static void main (String[] args) {
        System.out.println(powerOf(2,3));
    }
    public static int powerOf(int num, int exp) {   
        if (exp == 0) return 1;
        if (exp == 1) return num;

        int frm = powerOf(num, exp/2);
        if(exp % 2 == 0) return frm * frm;
        else return num*(frm*frm);
    }
}
