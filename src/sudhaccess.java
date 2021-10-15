class colour {
        protected void display() {
        System.out.println("Many Colours are available, Rose is in Red Colour");
    }
}

class red extends colour {

}
public class sudhaccess {
    public static void main(String[] args) {

     red d = new red();
     d.display();
    }
}
