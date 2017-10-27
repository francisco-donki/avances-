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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.TextArea;

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
		
		ListaDoblementeEnlazada miLista=new ListaDoblementeEnlazada();
		
		JButton Agregar = new JButton("agregar adelante");
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{//boton agregar
				
				
				
				miLista.insertarDelante("musica "+musica.getText()+"  genero: "+ genero.getText()+
						"  album: "+album.getText()+"  artista: "+ artista.getText());
				
				
			}
		});
		Agregar.setBounds(78, 227, 126, 23);
		contentPane.add(Agregar);
		
		TextArea resultado = new TextArea();
		resultado.setBounds(10, 85, 398, 103);
		contentPane.add(resultado);
		
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
		imprimir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				resultado.setText(miLista.imprimir().toString());
			}
		});
		
	
		imprimir.setBounds(0, 194, 107, 23);
		contentPane.add(imprimir);
		
		JButton atras = new JButton("agregar atras");
		atras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{//agregar nodo trasero 
				
				
				miLista.insertarDetras("musica "+musica.getText()+"  genero: "+ genero.getText()+
						"  album: "+album.getText()+"  artista: "+ artista.getText());
				
			}
		});
		atras.setBounds(214, 227, 128, 23);
		contentPane.add(atras);
		
		JButton borrarD = new JButton("borrar adelante ");
		borrarD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{//borrar nodo para adelante 
				
				Object elementoRemovido=miLista.removerDeDelante();
				
				
			}
		});
		borrarD.setBounds(117, 194, 111, 23);
		contentPane.add(borrarD);
		
		JButton borrarA = new JButton("borrar atras ");
		borrarA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Object elementoRemovido=miLista.removerDeDetras();
			    
			}
		});
		borrarA.setBounds(256, 194, 107, 23);
		contentPane.add(borrarA);
		
		
	}
}
