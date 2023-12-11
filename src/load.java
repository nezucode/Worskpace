import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	JComboBox cmbGenre = new JComboBox();
	
	JLabel lstatus = new JLabel(" Status ");
	
	JCheckBox cbSingle = new JCheckBox(" Single ");
	JCheckBox cbAlbum = new JCheckBox(" Album ");
	
	JButton btnSave = new JButton("OK");
	
	public GUI() {
		setTitle("Biodata");
		setDefaultCloseOperation(3);
		setSize(500, 350);
		
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
		
		lname.setBounds(20, 20, 120, 20);
		fname.setBounds(120, 20, 240, 20);
		lgender.setBounds(20, 52, 120, 20);
		rbMale.setBounds(120, 52, 120, 20);
		rbFemale.setBounds(240, 52, 120, 20);
//		lgenre.setBounds(10, 10, 120, 20);
//		cmbGenre.setBounds(10, 10, 120, 20);
//		lstatus.setBounds(10, 10, 120, 20);
//		cbSingle.setBounds(10, 10, 120, 20);
//		cbAlbum.setBounds(10, 10, 120, 20);
//		btnSave.setBounds(10, 10, 120, 20);
		
		
		setVisible(true);
	}
}

