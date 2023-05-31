class RemoveAllOccOfSubArr {
    public static void main(String[] args) {
    String arr = "daabcbaabcabc";
    System.out.println(rmAllOccOfSubArr(arr));
    }

    public static String rmAllOccOfSubArr(String str) {
        return str.replace("abc", "");
    }


}
