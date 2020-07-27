public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World of Remastering");
        int initialValue = (7 + 8) * (6 / 2);
        int modifiedValue = (6 * 2);
        int updatedValue = initialValue * 2;
        int lastValue = initialValue + modifiedValue + updatedValue;
        int finalValue = 1000 - lastValue;
        System.out.println("The last Value is " + lastValue);
        System.out.println("The last Value dynamic " + (1000 - lastValue));
        System.out.println(finalValue);

        float findMinValue= Float.MIN_VALUE;
        float findMaxvalue = Float.MAX_VALUE;
        System.out.println("Min Value " + findMinValue + " Max value "+ findMaxvalue);
        float checkFloatNum = 1.78f ;
        System.out.println("float number is = "+checkFloatNum);

        int findMiniValue= Integer.MIN_VALUE;
        int findMaxivalue = Integer.MAX_VALUE;
        System.out.println("Min Value " + findMiniValue + " Max value "+ findMaxivalue);
        System.out.println("Min i value +1 = "+ (findMaxivalue-1));
        System.out.println("Min i value +1 = "+ (findMaxivalue+1));
        int checkintegerNum = 1 ;
        System.out.println(checkintegerNum);

        short checkMaxshortvalue=32767;
        char displayChar= 'e';
        char unicodeValue = '\u0B85';
        String tamilName= "\u0b85\u0b9f\u0bb2\u0bc7\u0bb1\u0bc1";
        System.out.println(unicodeValue);
        System.out.println(tamilName);
        int demo = 0;
        System.out.println(demo);

    }


}
