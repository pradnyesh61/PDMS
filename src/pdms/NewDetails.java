package pdms;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.Border;

import pdms.*;

public class NewDetails extends JFrame implements ActionListener {

	JButton Add, Back;

	JLabel l1, l2, l3;

	JTextField t1, t2;

	int id = ViewDetails.share_id;

	public NewDetails() {

		l1 = new JLabel("ADD DETAILS");
		l1.setBounds(250, 20, 600, 100);
		l1.setFont(new Font("Serif", Font.BOLD, 50));

		l2 = new JLabel("Illness    :");
		l2.setBounds(100, 100, 100, 100);
		l2.setFont(new Font("Serif", Font.BOLD, 25));

		l3 = new JLabel("remarks :");
		l3.setBounds(100, 160, 100, 100);
		l3.setFont(new Font("Serif", Font.BOLD, 25));

		t1 = new JTextField();
		t1.setBounds(200, 130, 500, 40);
		t1.setFont(new Font("Serif", Font.BOLD, 15));

		t2 = new JTextField();
		t2.setBounds(200, 190, 500, 40);
		t2.setFont(new Font("Serif", Font.BOLD, 15));

		Add = new JButton("ADD");
		Add.addActionListener(this);
		Add.setBounds(250, 300, 100, 50);

		Back = new JButton("BACK");
		Back.addActionListener(this);
		Back.setBounds(450, 300, 100, 50);

		l1.setForeground(Color.black);
		l2.setForeground(Color.black);
		l3.setForeground(Color.black);
		t1.setForeground(Color.black);
		t2.setForeground(Color.black);
		Add.setForeground(Color.black);
		Back.setForeground(Color.black);

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(Add);
		add(Back);

		Border border = BorderFactory.createLineBorder(Color.BLUE);

		Add.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		Back.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		setLayout(null);
		setUndecorated(true);
		//setLocation(350, 200);
		setLocation(300, 150);
		setSize(800, 450);
		setVisible(true);

		key_enter();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void key_enter() {
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t2.requestFocus();
				}
			}
		});

		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					Add.requestFocus();
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Add) {
			add_patient_detail_to_database();
		}

		if (e.getSource() == Back) {
			ViewDetails viewDetails = new ViewDetails();
			viewDetails.mysql_view_data(id);
			dispose();
		}
	}

	public void add_patient_detail_to_database() {

		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/PDMS";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, password);

			String sql = "insert into view_Details (patient_Id,illness,remark) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);

			if (!t1.getText().equals("") && !t2.getText().equals("")) {
				ps.setInt(1, id);
				ps.setString(2, ((t1.getText()).toLowerCase()).trim());
				ps.setString(3, ((t2.getText()).toLowerCase()).trim());
				ps.execute();

			} else {
				JOptionPane.showMessageDialog(null, "Data not saved , please enter specific detials !");

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Data not saved , some enter specific detials !");
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}

		ViewDetails viewDetails = new ViewDetails();
		viewDetails.mysql_view_data(id);
		dispose();
	}

	public static void main(String[] args) {
		new NewDetails().setVisible(true);
	}
}
