package singelton.simple;

import singelton.simple.SimpleSingelton;

import java.lang.reflect.Constructor;

public class TestReflection {

    public static void main(String args[]) throws Exception{
        testSimpleReflection();
        testWithReflectionCheck();
    }

    private static void testSimpleReflection() throws Exception{
        System.out.println("Checking for SimpleSingelton ... ");
        SimpleSingelton s1= SimpleSingelton.getInstance();
        Constructor<SimpleSingelton> con = SimpleSingelton.class.getDeclaredConstructor();

        con.setAccessible(true);
        SimpleSingelton s2 = (SimpleSingelton)con.newInstance();

        System.out.println("s1:"+s1.hashCode());
        System.out.println("s2:"+s2.hashCode());
    }

    private static void testWithReflectionCheck() throws Exception{
        System.out.println("Checking for SingeltonWithReflectionCheck ... ");
        SingeltonWithReflectionCheck s1= SingeltonWithReflectionCheck.getInstance();
        Constructor<SingeltonWithReflectionCheck> con = SingeltonWithReflectionCheck.class.getDeclaredConstructor();

        con.setAccessible(true);
        SingeltonWithReflectionCheck s2 = (SingeltonWithReflectionCheck)con.newInstance();

        System.out.println("s1:"+s1.hashCode());
        System.out.println("s2:"+s2.hashCode());
    }

}
