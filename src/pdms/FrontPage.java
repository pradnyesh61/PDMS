package pdms;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.swing.border.Border;
import pdms.*;

//*
//*
//*
//{
//		Develop by Pradnyesh Balasaheb Salunke
//		Develop in September 2022
		
//		updatation 24 - december 2022


//}
//*
//*
//*

public class FrontPage extends JFrame implements ActionListener {

	JButton Add, View;
	JPanel p, p1;
	JLabel l1, copy_right,logo;

	public FrontPage() {
		p1 = new JPanel();
		p1.setBounds(100, 150, 300, 50);

		l1 = new JLabel("PAIS CLINIC");
		l1.setBounds(150, 30, 300, 100);
		l1.setFont(new Font("Serif", Font.BOLD, 30));

		copy_right = new JLabel("PDMS @Copyright Reserved...");
		copy_right.setBounds(140, 240, 300, 100);
		copy_right.setFont(new Font("Serif", Font.BOLD, 15));

		Add = new JButton("ADD");
		View = new JButton("VIEW");

		Add.addActionListener(this);
		View.addActionListener(this);

		p1.setLayout(new GridLayout(1, 2, 100, 10));

		p1.add(Add);
		p1.add(View);

		add(l1);
		add(copy_right);
		add(p1);
	

		
		
		JLabel label1 = new JLabel("");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(340, 5, 160, 120);
		add(label1);
		ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("logo_rgb.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)); //100, 100 add your own size
		label1.setIcon(imageIcon1);
	        

		l1.setForeground(Color.black);
		copy_right.setForeground(Color.black);
		Add.setForeground(Color.black);
		View.setForeground(Color.black);

		Border border = BorderFactory.createLineBorder(Color.BLUE);

		Add.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		View.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		setLayout(null);
	//	setLocation(550, 300);
		setLocation(430,200);
		setSize(500, 350);
		setVisible(true);
		setResizable(false);
		ImageIcon img = new ImageIcon("logo_rgb.png");
		setIconImage(img.getImage());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Add) {
			AddDetails obj = new AddDetails();
			dispose();
		}

		if (e.getSource() == View) {
			ViewDetails obj = new ViewDetails();
			dispose();
		}
	}

	public static void main(String[] args) {
		new FrontPage().setVisible(true);
	}
}
