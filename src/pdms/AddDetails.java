package pdms;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import pdms.*;

public class AddDetails extends JFrame implements ActionListener {

	JButton Add, back;
	JLabel l1;
	JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10;
	JTextField t2, t3, t4, t5, t6, t7, t8, t9, t10;

	public AddDetails() {
		l1 = new JLabel("PAISE CLINIC");
		l1.setBounds(300, 10, 500, 100);
		l1.setFont(new Font("Serif", Font.BOLD, 50));

		l2 = new JLabel("First Name");
		l2.setBounds(100, 80, 200, 100);
		l2.setFont(new Font("Serif", Font.BOLD, 30));

		l3 = new JLabel("Middle Name");
		l3.setBounds(100, 130, 200, 100);
		l3.setFont(new Font("Serif", Font.BOLD, 30));

		l4 = new JLabel("Last Name");
		l4.setBounds(100, 180, 200, 100);
		l4.setFont(new Font("Serif", Font.BOLD, 30));

		l5 = new JLabel("Gender");
		l5.setBounds(100, 230, 200, 100);
		l5.setFont(new Font("Serif", Font.BOLD, 30));

		l6 = new JLabel("Age");
		l6.setBounds(100, 280, 200, 100);
		l6.setFont(new Font("Serif", Font.BOLD, 30));

		l7 = new JLabel("Illness");
		l7.setBounds(100, 440, 200, 100);
		l7.setFont(new Font("Serif", Font.BOLD, 32));

		l8 = new JLabel("Remark");
		l8.setBounds(100, 490, 200, 100);
		l8.setFont(new Font("Serif", Font.BOLD, 32));

		l9 = new JLabel("Email");
		l9.setBounds(100, 330, 200, 100);
		l9.setFont(new Font("Serif", Font.BOLD, 30));

		l10 = new JLabel("Contact");
		l10.setBounds(100, 380, 200, 100);
		l10.setFont(new Font("Serif", Font.BOLD, 30));

		// ------------------------------------------------- Text Field
		t2 = new JTextField();
		t2.setBounds(350, 120, 220, 30);
		t2.setFont(new Font("Serif", Font.BOLD, 20));
		t2.setForeground(Color.BLACK);

		t3 = new JTextField();
		t3.setBounds(350, 170, 220, 30);
		t3.setFont(new Font("Serif", Font.BOLD, 20));
		t3.setForeground(Color.BLACK);

		t4 = new JTextField();
		t4.setBounds(350, 220, 220, 30);
		t4.setFont(new Font("Serif", Font.BOLD, 20));
		t4.setForeground(Color.BLACK);

		t5 = new JTextField();
		t5.setBounds(350, 270, 220, 30);
		t5.setFont(new Font("Serif", Font.BOLD, 20));
		t5.setForeground(Color.BLACK);

		t6 = new JTextField();
		t6.setBounds(350, 320, 220, 30);
		t6.setFont(new Font("Serif", Font.BOLD, 20));
		t6.setForeground(Color.BLACK);

		t7 = new JTextField();
		t7.setBounds(350, 470, 520, 50);
		t7.setFont(new Font("Serif", Font.BOLD, 15));
		t7.setForeground(Color.BLACK);

		t8 = new JTextField();
		t8.setBounds(350, 530, 520, 50);
		t8.setFont(new Font("Serif", Font.BOLD, 15));
		t8.setForeground(Color.BLACK);

		t9 = new JTextField();
		t9.setBounds(350, 370, 220, 30);
		t9.setFont(new Font("Serif", Font.BOLD, 20));
		t9.setForeground(Color.BLACK);

		t10 = new JTextField();
		t10.setBounds(350, 420, 220, 30);
		t10.setFont(new Font("Serif", Font.BOLD, 20));
		t10.setForeground(Color.BLACK);

		Add = new JButton("ADD");
		Add.addActionListener(this);
		Add.setBounds(300, 600, 100, 50);

		back = new JButton("BACK");
		back.addActionListener(this);
		back.setBounds(600, 600, 100, 50);

		l1.setForeground(Color.black);
		l2.setForeground(Color.black);
		l3.setForeground(Color.black);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);
		l6.setForeground(Color.black);
		l7.setForeground(Color.black);
		l8.setForeground(Color.black);
		l9.setForeground(Color.black);
		l10.setForeground(Color.black);
		t2.setForeground(Color.black);
		t3.setForeground(Color.black);
		t4.setForeground(Color.black);
		t5.setForeground(Color.black);
		t6.setForeground(Color.black);
		t7.setForeground(Color.black);
		t8.setForeground(Color.black);
		t9.setForeground(Color.black);
		t10.setForeground(Color.black);
		Add.setForeground(Color.black);
		back.setForeground(Color.black);

		add(l1);
		add(Add);
		add(back);

		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);

		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);

		Border border = BorderFactory.createLineBorder(Color.BLUE);

		Add.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		back.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		setLayout(null);
		setUndecorated(true);
		//setLocation(300, 100);
		setLocation(200, 20);
		setSize(900, 700);
		setVisible(true);

		key_enter();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void key_enter() {
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t3.requestFocus();
				}
			}
		});

		t3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t4.requestFocus();
				}
			}
		});

		t4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t5.requestFocus();
				}
			}
		});

		t5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t6.requestFocus();
				}
			}
		});

		t6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t9.requestFocus();
				}
			}
		});

		t9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t10.requestFocus();
				}
			}
		});

		t10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t7.requestFocus();
				}
			}
		});

		t7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					t8.requestFocus();
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Add) {
			mysql_connect();
			dispose();
			FrontPage obj = new FrontPage();
		}

		if (e.getSource() == back) {

			dispose();
			FrontPage obj = new FrontPage();
		}
	}

	public void mysql_connect() {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/PDMS";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, password);

			String full_Name = ((t2.getText() + " " + t3.getText() + " " + t4.getText()).toLowerCase()).trim();

			String sql = "SELECT * from patient_Details WHERE contact = '" + t10.getText() + "' and patient_Name = "
					+ "'" + full_Name + "'";

			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			String detials_all = "";

			if (rs.next()) {
				int patient_id_temp = rs.getInt("patient_Id");
				sql = "insert into view_Details (patient_Id,illness,remark) values (?,?,?)";
				ps = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);
				ps.setInt(1, patient_id_temp);
				ps.setString(2, ((t7.getText()).toLowerCase()).trim());
				ps.setString(3, ((t8.getText()).toLowerCase()).trim());
				ps.execute();

			} else {
				sql = "insert into patient_Details (patient_Name,gender,age,email,contact) values (?,?,?,?,?)";
				ps = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);
				ps.setString(1, full_Name);
				ps.setString(2, ((t5.getText()).toLowerCase()).trim());
				ps.setInt(3, Integer.parseInt(t6.getText()));
				ps.setString(4, ((t9.getText()).toLowerCase()).trim());
				ps.setString(5, ((t10.getText()).toLowerCase()).trim());
				ps.execute();

				rs = ps.getGeneratedKeys();
				int generatedKey = 0;
				if (rs.next()) {
					generatedKey = rs.getInt(1);
				}

				sql = "insert into view_Details (patient_Id,illness,remark) values (?,?,?)";
				ps = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);
				ps.setInt(1, generatedKey);
				ps.setString(2, ((t7.getText()).toLowerCase()).trim());
				ps.setString(3, ((t8.getText()).toLowerCase()).trim());
				ps.execute();

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
	}

	public static void main(String[] args) {
		new AddDetails().setVisible(true);
	}
}
