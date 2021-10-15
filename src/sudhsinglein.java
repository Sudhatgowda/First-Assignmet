class Watch{
    void var(){System.out.println("FOSSIL is one of the best brand in watch ...");}
}

class Fossil extends Watch{
    void model(){System.out.println("Model F4682 - Black Colour, Metallic...");}
}

class program2{
    public static void main(String[] args) {
        Fossil d=new Fossil();
        d.var();
        d.model();
    }
}
