public class Dia {

    public static void main(String[] args) {
        System.out.println(count(1992, 2021));
        Kristof kristof = new Kristof();
        System.out.println(kristof.cheer("java"));
    }

    public static Integer count(int birthyear) {
        int presentYear = 2021;
        System.out.println("08");
        return presentYear - birthyear;
    }

    public static Integer count(int birthYear, int presentYear) {

        System.out.println("08");
        return presentYear - birthYear;

    }
}

