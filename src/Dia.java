public class Dia {

    public static void main(String[] args) {
        System.out.println(count(1992));
        Kristof kristof = new Kristof();
        System.out.println(kristof.cheer("java"));
    }

    public static Integer count(int birthyear) {
        int presentYear = 2021;
<<<<<<< HEAD
        System.out.println("08");
        return presentYear - birthYear;
=======
        return presentYear - birthyear;
>>>>>>> 198e712e4fe3edd8564d5e0802ff05f2d08b05bd
    }
}
