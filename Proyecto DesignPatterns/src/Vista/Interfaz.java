package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JButton btnSumar;
	private JScrollPane scrollPane;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 218, 299, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.requestFocusInWindow();
		
		btnSumar = new JButton("ENTER");
		btnSumar.setBounds(323, 217, 97, 25);
		contentPane.add(btnSumar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 408, 191);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		DefaultCaret caret = (DefaultCaret)textArea.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
				
	}
}
