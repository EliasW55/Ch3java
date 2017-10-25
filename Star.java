public class Star
{
    public static void main() {
        star5(); //Enter which star you want to see here
    }
    
    public static void star1() {
        for(int i=0; i<10; i++) {
            printItem(" ", 10-i);
            printItem("*", i);
            System.out.println();
        }
    }
    
    public static void printItem(String st, int num) {
        for(int j=0; j<num; j++) {
            System.out.print(st);
        }
    }
    
    public static void star2() {
        for(int i=0; i<10; i++) {
            printItem(" ", i);
            printItem("*", 10-i);
            System.out.println();
        }
    }
    
    public static void star3() {
        for(int i=0; i<10; i++) {
            printItem("*", 10-i);
            printItem(" ", i);
            System.out.println();
        }
    }
    
    public static void star4() {
        for(int i=0; i<10; i++) {
            printItem("*", i);
            printItem(" ", 10-i);
            System.out.println();
        }
    }
    
    public static void star5() {
        for(int i=1; i<10; i += 2) {
            for(int k=0; k < (4 - i / 2); k++) {
                    System.out.print(" ");
            }
                for(int j=0; j<i; j++) {
                    System.out.print("*");
                }
            System.out.println("");
        }
        int x, y;
        for (y = 5; y >= 1; y--) { //reverse here
            for (x = 0; x < 5 - y; x++)
                System.out.print(' ');
            for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++)
                System.out.print('*');
            System.out.print('\n');
        }
    }
}
