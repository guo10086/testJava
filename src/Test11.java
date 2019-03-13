public class Test11 {
    public static void main(String[] args) {
        int i =0;
        Object o = new Object();
        synchronized (o){
            for (int j = 0; j < 10; j++) {
                i++;
                System.out.println(i);
            }

        }
    }
}
