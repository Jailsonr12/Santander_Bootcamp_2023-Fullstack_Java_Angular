import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

//        Singleton

//        SingletonLazy lazy = SingletonLazy.getInstance();
//        System.out.println("SingletonLazy " + lazy);
//
//        SingletonLazyHolder lazy1 = SingletonLazyHolder.getInstance();
//        System.out.println("SingletonLazyHolder " + lazy1);
//
//        SingletonEager lazy2 = SingletonEager.getInstance();
//        System.out.println("SingletonEager " + lazy2);


//        Strategy

//        Comportamento desensivo = new ComportamentoDefensivo();
//        Comportamento agre = new ComportamentoAgressivo();
//        Comportamento nor = new ComportamentoNormal();
//
//        Robo robo = new Robo();
//        robo.setComportamento(nor);
//        robo.mover();
//
//        robo.mover();
//
//        robo.mover();
//        robo.mover();
//        robo.setComportamento(agre);
//
//        robo.mover();
//
//        robo.mover();
//        robo.setComportamento(desensivo);
//
//        robo.mover();


//        Facade

        Facade f = new Facade();
        f.migraCliente("jailson", "123");


    }
}