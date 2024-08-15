
public class SingletonClass12 {

    private SingletonClass12() {
    }

    String str = "This is an example of the singeleton class";

    public static SingletonClass12 singletonClass12 = null;

    public static SingletonClass12 getInstance() {
        if (singletonClass12 == null)
            singletonClass12 = new SingletonClass12();
        return singletonClass12;
    }

    public static void main(String[] args) {
        SingletonClass12 singletonObject = SingletonClass12.getInstance();
        SingletonClass12 singletonObject2 = SingletonClass12.getInstance();

        singletonObject.str = singletonObject.str.toUpperCase();
        System.out.println(singletonObject.str.toUpperCase());
        System.out.println(singletonObject2.str);

    }
}
