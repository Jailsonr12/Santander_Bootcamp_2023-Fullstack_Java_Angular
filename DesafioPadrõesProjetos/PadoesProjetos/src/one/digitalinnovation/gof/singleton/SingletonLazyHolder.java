package one.digitalinnovation.gof.singleton;


//singleton Lazy Holder

public class SingletonLazyHolder {

    private static class InstanciaHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {

        return InstanciaHolder.instancia;
    }
}
