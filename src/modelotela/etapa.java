package modelotela; 
import javax.swing.*; 
import java.awt.*; 

public class etapa { 
	public static void main(String[] args) { 
	
		// Criando a janela AWT Test
		JFrame frame = new JFrame("AWT Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o app ao fechar a janela
		frame.setSize(400, 200); // Define o tamanho da janela
		frame.setLayout(new BorderLayout()); // Usando BorderLayout para organizar os componentes

		JLabel label1 = new JLabel("Label1"); // Nome da caixa para digitar
		JTextField textField1 = new JTextField(15); // Campo de texto com 15 colunas
		
		// Painel para os componentes do topo
		JPanel topPanel = new JPanel(); 
		topPanel.setLayout(new FlowLayout()); // Layout que alinha os componentes em linha
		topPanel.add(label1); // Adicionando o rótulo ao painel
		topPanel.add(textField1); // Adicionando o campo de texto ao painel
		
		// Criando botões
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2"); 
		JButton button3 = new JButton("Button 3");
		
		// Painel para os botões
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout()); //alinha os botões em linha
		//botões adicionados
		buttonPanel.add(button1); 
		buttonPanel.add(button2); 
		buttonPanel.add(button3); 
		
		// Adicionando os painéis à janela
		frame.add(topPanel, BorderLayout.NORTH); // Painel do topo
		frame.add(buttonPanel, BorderLayout.CENTER); // Painel dos botões no centro
		
		frame.setVisible(true); // Tornando a janela visível
	}
}
