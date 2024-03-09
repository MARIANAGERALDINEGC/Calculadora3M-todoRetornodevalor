import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        //Calculadora 3
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Digital el numero uno: " )); 
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero dos: "));

        Operaciones op=new Operaciones();
        int suma=op.sumar(num1, num2); 
        int resta=op.restar(num1, num2);
        int multiplicacion=op.multiplicar(num1, num2);
        int division=op.dividir(num1, num2);

        op.mostrarResultados(suma, resta, multiplicacion, division);
        op.mostrarResultados(op.sumar(num1, num2),op.restar(num1, num2),op.multiplicar(num1, num2),op.dividir(num1, num2));
    }
}