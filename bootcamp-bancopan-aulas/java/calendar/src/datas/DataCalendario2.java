package datas;

import javax.swing.*;
import java.util.Calendar;

public class DataCalendario2 {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        int ano_atual = calendario1.get(Calendar.YEAR);
        int idade = ano_atual - ano;
        JOptionPane.showMessageDialog(null,"Idade do usuário: " + idade);
        System.out.println(idade);
    }
}
