import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;  
import javax.swing.*;

public class load {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI g = new GUI();	
	}
}

class GUI extends JFrame {
	final JTextField fname = new JTextField(10);
	
	JLabel lname = new JLabel(" Name : ");
	JLabel lgender = new JLabel(" Gender : ");
	
	JRadioButton rbMale = new JRadioButton(" Male ");
	JRadioButton rbFemale = new JRadioButton(" Female ");
	
	JLabel lgenre = new JLabel(" Genre ");
	String[] jenisGenre = {"Action","Sci-fi", "Comedy", "Romance", "Horror"};
	JComboBox cmbGenre = new JComboBox(jenisGenre);
	
	JLabel lstatus = new JLabel(" Status : ");
	
	JCheckBox cbSingle = new JCheckBox(" Single ");
	JCheckBox cbAlbum = new JCheckBox(" Album ");
	
	JButton btnSave = new JButton("OK");
	
	public GUI() {
		setTitle("Biodata");
		setDefaultCloseOperation(3);
		setSize(420, 280);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbMale);
		group.add(rbFemale);
		
		setLayout(null);
		add(lname);
		add(fname);
		add(lgender);
		add(rbMale);
		add(rbFemale);
		add(lgenre);
		add(cmbGenre);
		add(lstatus);
		add(cbSingle);
		add(cbAlbum);
		add(btnSave);
		
//		elements.setBounds(y, x, (panjang), (lebar);
		
		lname.setBounds(20, 20, 120, 28);
		fname.setBounds(120, 20, 240, 28);
		lgender.setBounds(20, 52, 120, 28);
		rbMale.setBounds(120, 52, 122, 28);
		rbFemale.setBounds(200, 52, 122, 28);
		lgenre.setBounds(20, 84, 120, 28);
		cmbGenre.setBounds(120, 84, 120, 28);
		lstatus.setBounds(20, 116, 120, 28);
		cbSingle.setBounds(120, 118, 120, 28);
		cbAlbum.setBounds(200, 118, 120, 28);
		btnSave.setBounds(180, 170, 120, 28);
		
		
		setVisible(true);
	}
}

