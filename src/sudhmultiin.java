class flower{
    void var(){System.out.println("We have different types of flowers");}
}

class rose extends flower{
    void rosecolor(){System.out.println("ROSE is in different different colors");}
}

class jasmine extends rose{
    void jasminecolor(){System.out.println("Jasmine is in White colour");}
}


class program1{
    public static void main(String args[]){
        jasmine c=new jasmine();
        c.var();
        c.rosecolor();
        c.jasminecolor();
    }
}
