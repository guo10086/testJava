import java.io.UnsupportedEncodingException;
import java.util.TreeMap;

public class Test11 {
    public static void main(String[] args) throws UnsupportedEncodingException {
       /* int i =0;
        Object o = new Object();
        synchronized (o){
            for (int j = 0; j < 10; j++) {
                i++;
                System.out.println(i);
            }
        }*/
        String a = "abc";
        byte[] bytes = a.getBytes("utf-8");
        for (int j = 0; j < bytes.length; j++) {
            System.out.println(bytes[j]);
        }

        new TreeMap();
        System.out.println("1111");
    }
}
