public class Main{
    public static void main(String[] args) {
        String str = "壱百満";

        try {
            int value = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("例外が発生しました : NumberFormatException");
            System.out.println("例外のメッセージ : " + e.getMessage());
        }
    }
}