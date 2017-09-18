package clases;

public class C11 {
    
    public String m1() {
        //reparado error en método
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }
    
    public String m2() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
