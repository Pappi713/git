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
        return presentYear - 1996;
=======

        System.out.println("08");
        return presentYear - birthyear;

>>>>>>> 2a09d7b2a9b56c8c5a96638e30fc7b7363cc73f1
    }
}
