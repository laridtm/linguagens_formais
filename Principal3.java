//Exercicio 2

import javax.swing.JOptionPane;

public class Principal3 {
    public static final int S0 = 0;
    public static final int S1 = 1;
    public static final int S2 = 2;

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite uma palavra a ser avaliada");
        boolean isValid = true;
        int state = S0;
        int i = 0;

        while(i < input.length() && isValid) {
            char current = input.charAt(i);

            switch (state) {
                case S0:
                    if(current == 'a') {
                        state = S1;
                    } else {
                        isValid = false;
                    }
                    break;
                case S1:
                    if(current == 'a') {
                        state = S2;
                    } else if(current == 'b') { 
                        state = S1;
                    } else {
                        isValid = false;
                    }
                    break;
                case S2:
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
    }
}