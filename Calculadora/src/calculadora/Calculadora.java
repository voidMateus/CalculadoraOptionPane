package calculadora;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        double x1;
        double x2;
        double resultado;
         
        String op = 
                JOptionPane.showInputDialog(null,"Coloque a operação desejada (adição,subtração,multiplicação ou divisão): "
                ,"Operação", JOptionPane.PLAIN_MESSAGE);
        
        String n1 = 
                JOptionPane.showInputDialog(null,"Coloque o primeiro numero para operação: "
                ,"Primeiro Numero", JOptionPane.PLAIN_MESSAGE);
        String n2 =
                JOptionPane.showInputDialog(null,"Coloque o segundo numero para operação: "
                ,"Sugundo Numero", JOptionPane.PLAIN_MESSAGE);
        
        double nd1 = Double.parseDouble(n1);
        double nd2 = Double.parseDouble(n2);
       
        
        switch(op){
            case "adição":
                adicao ad = new adicao();
                ad.somar(nd1, nd2);
                break;
            case "subtração":
                subtracao sub = new subtracao();
                sub.subtrair(nd1, nd2);
                break;
            case "multiplicação":
                multiplicacao mult = new multiplicacao();
                mult.multiplicar(nd1, nd2);
                break;
            case "divisão":
                divisao div = new divisao();
                div.multiplicar(nd1, nd2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Invalida",
                        "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }  
}
