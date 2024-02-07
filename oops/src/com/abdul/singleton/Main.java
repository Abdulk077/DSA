package com.abdul.singleton;
import com.abdul.access.A;


public class Main {
    public static <Singleton> void main(String[] args) {
        Singleton obj1 = new singleton.getInstance() ;
        Singleton obj2 = new singleton.getInstance() ;
        Singleton obj3 = new singleton.getInstance();
        // all 3 ref variable are pointimg to just one object
        A a = new A(10,"kunal");
        a.getNum();
        int n = a.num;
    }

    private record getInstance() extends Singleton {
    }

    private static class getInstance extends Singleton {
    }
}
