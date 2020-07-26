public class Hello {
    public static void main(String [] args) {
        System.out.println("Hello World of Remastering");
        int initialValue = (7 + 8) * (6/2);
        int modifiedValue = (6*2);
        int updatedValue = initialValue * 2;
        int lastValue = initialValue+modifiedValue+updatedValue;
        int finalValue = 1000-lastValue;
        System.out.println("The last Value is "+ lastValue);
        System.out.println("The last Value dynamic "+ (1000- lastValue));
        System.out.println(finalValue);

    }
}
