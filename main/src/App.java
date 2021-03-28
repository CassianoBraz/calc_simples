import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main (String args[]){ 
        Calc c = new Calc();  
    
        int opcao = 5;  
        int num1;  
        int num2;  
    
		Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma opção-");  
        System.out.println("1. Soma");    
        System.out.println("2. Subtracao");    
        System.out.println("3. Multiplicacao");    
        System.out.println("4. Divisao");    
        System.out.println("0. Sair");    
        System.out.println("Operação: ");    
        opcao = input.nextInt();  
        while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);    
			
			System.out.println("Qual o primeiro numero: ");  
			num1 = input1.nextInt();  
			System.out.println("Qual o segundo numero: ");  
			num2 = input1.nextInt();
			
			if ( opcao == 1 ) {
				double operacao = c.som(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado da soma é: "+operacao);
                break;  
            }  
            else if (opcao == 2) { 
				double operacao = c.sub(num1, num2); 
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: "+operacao);
				break;  
			}  
			else if (opcao == 3) {
				double operacao = c.mult(num1, num2); 
				JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+operacao);    
				break;  
			}  
			else if (opcao == 4) {  
				double operacao = c.div(num1, num2);  
				JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+operacao);  
				break;  
			}  
			else{  
				System.out.println("????");  
				break;  
			}      
        } 
    } 
}     


