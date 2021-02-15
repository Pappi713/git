public class Dia {
    public static void main(String[] args) {
        System.out.println(count(1992));
    }

    public static Integer count(int birthyear) {
        int presentYear = 2021;
        return presentYear - birthyear;
    }
}
