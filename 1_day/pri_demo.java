
class pri {

    int a = 5;
    private  int b = 6;
    private  int c = 7;

    void show() {
        System.out.println("b=" + b);
    }

    void display() {
        System.out.println("c=" + c);
    }

    void showfinal() {
        display();
    }
}

class pri_demo {

    public static void main(String[] args) {
        pri ob = new pri();
        // System.out.println("a=" + ob.a);
        // System.out.println("b=" + ob.b);
        // System.out.println("c=" + ob.c);
        ob.show();
        ob.display();
        ob.showfinal();
    }
}

