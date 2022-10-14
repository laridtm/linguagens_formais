import javax.swing.*;

public class Principal {
    public static void main(String args[]){
        String entrada = JOptionPane.showInputDialog("Digite uma palabra a ser avaliada:");

        int estado = 0;
        int i = 0;
        while((i < entrada.length()) && (estado != -1)){
            char avaliar = entrada.charAt(i);

            // if (avaliar == 'a'){
            //     estado = 1;
            // } else {
            //     estado = -1;
            // }
            // i = i + 1;

            if ((estado == 0) && (avaliar == 'a')) {
                estado = 1;
            }
            if ((estado == 1) && (avaliar == 'b')) {
                estado = 1;
            }
            if ((estado == 1) && (avaliar == 'a')) {
                estado = 2;
            }
            i = i + 1;
        }
        if (estado == -1) {
            System.out.println("Entrada invalida!");
        } else if (estado == 2) {
            System.out.println("Chegou ao estado final!");
        } else {
            System.out.println("Entrada valida!"); 
        }
    }
}