import java.util.concurrent.ConcurrentHashMap;

public class TestLock {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            synchronized(TestLock.class){
                count++;
                System.out.println(count);
            }
        }
        new ConcurrentHashMap();
    }
}
