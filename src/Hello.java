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
        String tamilUnicodeText= "\u0ba4\u0bae\u0bbf\u0bb4\u0bcd \u0bb5\u0bbe\u0bb4\u0bcd\u0b95";
        System.out.println(unicodeValue);
        System.out.println(tamilUnicodeText);
        int demo = 12;
        System.out.println(demo);
        demo++;
        System.out.println("Demo ++ " + demo);

        boolean resultStatus = true;
        if (resultStatus == true)
            System.out.println("Displaying the Demo result!! " + resultStatus);

        boolean resultMark = false;
        if (resultMark == false )
            System.out.println("Result Mark " + resultMark);
            System.out.println("Checking the use of curly braes");

        int mark = 80;
        if (!(mark < 75)) {
            System.out.println("You have scored the higher marks !!");
                    }
        int correctedMark=85;
        if (correctedMark > 80 && correctedMark > mark ){
            System.out.println("Your score has been raised");
        }
        resultStatus = resultMark ? true : false ;
        if (resultStatus) {
            System.out.println("Condition Executed!!");
        }
        resultStatus = (!(resultMark) ) ? true : false ;
        if (resultStatus){
            System.out.println("False executed !!" + resultStatus);
        }

    }
}



