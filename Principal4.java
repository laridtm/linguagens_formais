//Exercicio 1 

import javax.swing.JOptionPane;

public class Principal4 {
    public static final int S0 = 0;
    public static final int S1 = 1;
    public static final int S2 = 2;
    public static final int S3 = 3;

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite uma palavra a ser avaliada");
        boolean isValid = true;
        int state = S0;
        int i = 0;

        if(input.length() == 3) {
            while(i < input.length() && isValid) {
                char current = input.charAt(i);
    
                switch (state) {
                    case S0:
                        if(current == 'a' || current == 'b') {
                            state = S1;
                        } else {
                            isValid = false;
                        }
                        break;
                    case S1:
                        if(current == 'a' || current == 'b') {
                            state = S2;
                        } else {
                            isValid = false;
                        }
                        break;
                    case S2:
                        if(current == 'a' || current == 'b') {
                            state = S3;
                        } else {
                            isValid = false;
                        }
                        break;
                    case S3:
                        if (i < input.length()) {
                            isValid = false;
                        }
                        break;
                    default:
                        break;
                }
                i++;
            }
    
            System.out.println("O resultado do seu input é: " + isValid);
        } else {
            System.out.println("O resultado do seu input é inválido ");
        }
    }

}