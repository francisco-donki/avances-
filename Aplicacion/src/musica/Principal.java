package musica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField musica;
	private JTextField genero;
	private JTextField album;
	private JTextField artista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Agregar = new JButton("agregar nodo ");
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{//boton agregar
				
				ListaDoblementeEnlazada miLista=new ListaDoblementeEnlazada();
				
				miLista.setmusica(musica.getText());
				
				
				
			}
		});
		Agregar.setBounds(164, 106, 114, 23);
		contentPane.add(Agregar);
		
		musica = new JTextField();
		musica.setBounds(78, 28, 86, 20);
		contentPane.add(musica);
		musica.setColumns(10);
		String musica1 = (musica.getText());
		
		JLabel lblMusica = new JLabel("musica");
		lblMusica.setBounds(22, 31, 46, 14);
		contentPane.add(lblMusica);
		
		JLabel lblGenero = new JLabel("genero");
		lblGenero.setBounds(200, 31, 46, 14);
		contentPane.add(lblGenero);
		
		genero = new JTextField();
		genero.setBounds(256, 28, 86, 20);
		contentPane.add(genero);
		genero.setColumns(10);
		String genero1 = (genero.getText());
		
		JLabel lblNewLabel = new JLabel("album\r\n");
		lblNewLabel.setBounds(22, 62, 46, 14);
		contentPane.add(lblNewLabel);
		
		album = new JTextField();
		album.setBounds(78, 59, 86, 20);
		contentPane.add(album);
		album.setColumns(10);
		String album1 = (album.getText());
		
		artista = new JTextField();
		artista.setBounds(256, 59, 86, 20);
		contentPane.add(artista);
		artista.setColumns(10);
		String artista1 = (artista.getText());
		
		JLabel lblArtista = new JLabel("artista");
		lblArtista.setBounds(200, 62, 46, 14);
		contentPane.add(lblArtista);
		
		JButton imprimir = new JButton("imprimir lista");
		imprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{//boton imprimir lista. 
				
				
				
			}
		});
		imprimir.setBounds(10, 227, 107, 23);
		contentPane.add(imprimir);
		
		JTextPane resultado = new JTextPane();
		resultado.setBounds(78, 140, 264, 76);
		contentPane.add(resultado);
	}
}
