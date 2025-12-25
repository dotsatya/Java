//a. Stopping Overriding with Final

class A {
      final public void show() {
        System.out.println("A");
    }
}

class one_a extends A {
     public void show() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        one_a obj = new one_a();
        obj.show();
    }
}