package hexlet.code;

public class RandomNum {
    public static int getRandomNum(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static int getRandomNum() {
        return getRandomNum(100);
    }
}
