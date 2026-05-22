package CRT.date_22_05_2026;

public class largestNumber {
    public static void main(String[] args) {
//        String str = "23dsa43dsa99";
//        String str="22-05-2026";
        String str="22052026";

        String[] ch = str.split("[^0-9]+");

        int maxNumber = 0;

        for (String c : ch) {
            if (!c.isEmpty()) {
                int currentNumber = Integer.parseInt(c);
                maxNumber = Math.max(maxNumber,currentNumber);
            }
        }

        System.out.println("Largest number is: " + maxNumber);
    }
}


//class largestNumber1{
//    public static void main(String[] args) {
//        String str = "23dsa43dsa99";
//        char[] ch = str.toCharArray();
//        StringBuilder sb = new StringBuilder("");
//        int max=0;
//        for(char c : ch){
//            if(Character.isDigit(c)){
//                sb.append(c);
//            }
//            else{
//                max=Math.max(max,Integer.parseInt(sb));
//            }
//
//        }
//        System.out.println("Largest number is: " + max);
//
//
//    }
//}
