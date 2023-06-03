class CheckPalindrome {
    public static void main (String[] args) {
        String name = "yarsdfsqdgeray";
        System.out.println(checkRecursively(name,0,name.length() -1 ));
    }

    public static boolean check(String str) {
        int j = 0;
        if (str.length()%2 != 0) return false;
        for (int i= str.length() -1;i >= j;i-- ) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
                j++;
        }
        return true;
    }

    public static boolean checkRecursively(String str, int start, int end) {
        if (str.length()%2 != 0) return false;
        if(start > end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;
        else return checkRecursively(str, start +1, end -1);
    }

}
