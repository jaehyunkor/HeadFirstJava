public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles"; //복수형

        while (bottlesNum > 0) {

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green should accidentally fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum == 1) {
                word = "bottle"; //단수형인 경우
            }

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // else end
        } // while end
    } // main method end
} // class end
