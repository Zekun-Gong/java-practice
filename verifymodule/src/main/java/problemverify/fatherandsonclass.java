package problemverify;

    class Base{
        public int id = 100;
        public void doSomething(){
            System.out.println("base");
        }
    }

    class child extends Base{
        public int id = 101;
        @Override
        public void doSomething() {
            System.out.println("child");
        }
        public static void main(String[] args) {
            Base baseexp = new child();
            System.out.println(baseexp.id);
            baseexp.doSomething();
        }
    }



