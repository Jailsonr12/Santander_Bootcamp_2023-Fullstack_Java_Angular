package dio.priomeiropassos;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;


@Component
public class Calculadora {

   public  int somar(int num1, int num2){
       return num1 + num2;
   }

}
