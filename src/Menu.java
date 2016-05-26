import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		
		String aux1, aux2;
		int s1,s2,y;
		double x1,x2,soma,soma2;
	
		
		aux1 = JOptionPane.showInputDialog("Digite um valor para a entrada 1");
		x1 = Double.parseDouble(aux1);
		
		aux2 = JOptionPane.showInputDialog("Digite um valor para a entrada 2");
		x2 = Double.parseDouble(aux2);
		
		soma = x1+x2;
		
		if(soma < 0.5)
			s1=0;
		else
			s1=1;
		
		if(soma < 1.5)
			s2=1;
		else
			s2=0;
	
		soma2 = s1+s2;
		
		if(soma2 > 0.5)
			y=0;
		else
			y=1;
		
		JOptionPane.showMessageDialog(null, "A saida é: "+ y);
		
		 
	}

}
