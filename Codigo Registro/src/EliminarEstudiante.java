
 
 
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n1. Par\n2. Impar\n3. Salir"));
            switch (op) {
                case 1:
                    Par par = new Par();
                    par.mostrarNumeros();
                    JOptionPane.showMessageDialog(null, "La multiplicación de los números pares es: " + par.calcularMultiplicacion());
                    JOptionPane.showMessageDialog(null, "La suma de los números pares es: " + par.calcularSuma());
                    break;
                case 2:
                    Impar impar = new Impar();
                    impar.mostrarNumeros();
                    JOptionPane.showMessageDialog(null, "La multiplicación de los números impares es: " + impar.calcularMultiplicacion());
                    JOptionPane.showMessageDialog(null, "La suma de los números impares es: " + impar.calcularSuma());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (op != 3);
    }
}

class Par {
    public void mostrarNumeros() {
        StringBuilder numerosPares = new StringBuilder();
        for (int i = 2; i <= 100; i += 2) {
            numerosPares.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Números pares del 1 al 100:\n" + numerosPares.toString());
    }

    public int calcularSuma() {
        int suma = 0;
        for (int i = 2; i <= 100; i += 2) {
            suma += i;
        }
        return suma;
    }

    public int calcularMultiplicacion() {
        int multiplicacion = 1;
        for (int i = 2; i <= 100; i += 2) {
            multiplicacion *= i;
        }
        return multiplicacion;
    }
}

class Impar {
    public void mostrarNumeros() {
        StringBuilder numerosImpares = new StringBuilder();
        for (int i = 1; i <= 100; i += 2) {
            numerosImpares.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Números impares del 1 al 100:\n" + numerosImpares.toString());
    }

    public int calcularSuma() {
        int suma = 0;
        for (int i = 1; i <= 100; i += 2) {
            suma += i;
        }
        return suma;
    }

    public int calcularMultiplicacion() {
        int multiplicacion = 1;
        for (int i = 1; i <= 100; i += 2) {
            multiplicacion *= i;
        }
        return multiplicacion;
    }
}
 
 
