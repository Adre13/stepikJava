
class Test {
    public static void main(String[] args) {
        createRunnable("Max", 5).toString();
        System.out.println(createRunnable("Mmmm", 5));

    }

    public static Runnable createRunnable(String text, int repeats) {

        return new Runnable() {

            int count = 0;
            @Override
            public void run() {
                while (count < repeats) {
                    System.out.println(text);
                    count++;
                    
                }
            }
        };

    }
}

