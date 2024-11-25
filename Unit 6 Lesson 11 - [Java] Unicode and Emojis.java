public class Emoji {
    public static void main(String[] args) {
        int start = 0x1f600; // 😀
        int end = 0x1f64f; // 🙏
        int count = 0;

        for (int i = start; i <= end; i++) {
            String emoji = new String(Character.toChars(i));
            System.out.printf("%4x   %s  ", i, emoji);
            count++;
            if (count % 8 == 0) {
                System.out.println();
            }
        }
    }
}
