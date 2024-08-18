public class Mathematics {
    //given a number, print its add, sub, div and mul
    public static void main(String[] args) {
        int x = 2;//defined variable x of type int
        int y = 4;
        //function
        //1. Invocation
        //2. Definition
        System.out.println("addition : " + sum(x, y));
        System.out.println("subtraction : " + sub(x, y));
        System.out.println("division : " + div(x, y));
        System.out.println("multiplication : " + mul(x, y));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static float div(int x, int y) {
        return (float) x / y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

}

