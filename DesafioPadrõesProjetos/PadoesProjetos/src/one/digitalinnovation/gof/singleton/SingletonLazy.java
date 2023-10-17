package one.digitalinnovation.gof.singleton;


//singleton preguiçoso

public class SingletonLazy {
    private static SingletonLazy instancia;

    SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}
