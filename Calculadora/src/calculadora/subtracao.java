package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class subtracao {
    public void subtrair(double x1,double x2){
        double resultado = x1 - x2;
        
        if(((resultado%1)==0)){
            DecimalFormat formatador = new DecimalFormat("0");
            JOptionPane.showMessageDialog (null, "A Soma dos numeros é igual a: " + formatador.format(resultado),
                "Resultado", JOptionPane.PLAIN_MESSAGE );
        }else{
            JOptionPane.showMessageDialog (null, "A Subtração dos numeros é igual a: " + resultado,
                "Resultado", JOptionPane.PLAIN_MESSAGE );  
        }
    }
}
