public class Main{
    public static void main(String[] args) {
        String str = null;
        
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("例外が発生しました : NullPointerException");
            System.out.println("例外のメッセージ : " + e.getMessage());
        }
    }
}