class Datatype {
    public static void main(String[] args) {
        /*
        To string
        ToBinaryString
        valueOf
        PhraseInt
         */
        /*
        String s = Integer.toString(55);
        System.out.println(s);
        String x = Integer.toBinaryString(15); //integer to String
        System.out.println(x);
        int y = Integer.valueOf(x); //String to Integer returns object of Integer
        System.out.println(y);
        int z = Integer.parseInt(x); //String to Integer returns int
        System.out.println(z);
        //int a = Integer.toOctalString();
        //int a = Integer.toHexString();
        */
        String s = "Navin";
        System.out.println(s.equals("Navin"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.getBytes());
        System.out.println(s.charAt(1));
        System.out.println(s.concat("Kumaran"));
        char[] arr = s.toCharArray();
        System.out.println(arr[1]);
        String d = "5.00000";
        System.out.println(Double.parseDouble(d));
    }
}
