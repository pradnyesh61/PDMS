package pdms;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.table.*;
import pdms.*;

public class ViewDetails extends JFrame implements ActionListener {

	JButton Back, Search, Add;
	JLabel l1;
	JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JTextField inputfield_search;
	JTextArea detail_field;
	JScrollPane scrollableTextArea;

	String country[] = { "Contact", "Name" };
	JComboBox cb;

	String input_field_combobox;

	ArrayList<ArrayList<String>> table_Data_List = new ArrayList<ArrayList<String>>();

	JFrame f;

	public static int share_id;

	public ViewDetails() {
		l1 = new JLabel("Patient Details");
		l1.setBounds(80, 10, 500, 100);
		l1.setFont(new Font("Serif", Font.BOLD, 40));

		inputfield_search = new JTextField();
		inputfield_search.setBounds(350, 50, 220, 30);
		inputfield_search.setFont(new Font("Serif", Font.BOLD, 20));
		inputfield_search.setForeground(Color.BLACK);

		cb = new JComboBox(country);
		cb.setBounds(600, 50, 90, 30);

		Search = new JButton("SEARCH");
		Search.addActionListener(this);
		Search.setBounds(720, 40, 100, 40);

		l2 = new JLabel("Name  : ");
		l2.setBounds(100, 80, 200, 100);
		l2.setFont(new Font("Serif", Font.BOLD, 30));

		l3 = new JLabel("Pradnyesh");
		l3.setBounds(210, 80, 700, 100);
		l3.setFont(new Font("Serif", Font.BOLD, 25));

		l9 = new JLabel("Email : ");
		l9.setBounds(100, 130, 700, 100);
		l9.setFont(new Font("Serif", Font.BOLD, 30));

		l10 = new JLabel("@gmail.com");
		l10.setBounds(210, 130, 600, 100);
		l10.setFont(new Font("Serif", Font.BOLD, 25));

		l4 = new JLabel("G :  ");
		l4.setBounds(780, 130, 200, 100);
		l4.setFont(new Font("Serif", Font.BOLD, 30));

		l5 = new JLabel("M");
		l5.setBounds(830, 130, 200, 100);
		l5.setFont(new Font("Serif", Font.BOLD, 25));

		l6 = new JLabel("Age  : ");
		l6.setBounds(750, 80, 200, 100);
		l6.setFont(new Font("Serif", Font.BOLD, 30));

		l7 = new JLabel("22");
		l7.setBounds(830, 80, 200, 100);
		l7.setFont(new Font("Serif", Font.BOLD, 25));

		l8 = new JLabel("Details  :");
		l8.setBounds(100, 180, 200, 100);
		l8.setFont(new Font("Serif", Font.BOLD, 30));

		l11 = new JLabel("Contact :");
		l11.setBounds(630, 180, 100, 100);
		l11.setFont(new Font("Serif", Font.BOLD, 25));

		l12 = new JLabel("1234567891");
		l12.setBounds(730, 180, 200, 100);
		l12.setFont(new Font("Serif", Font.BOLD, 25));

		// ------------------------------------------------- Text Field

		detail_field = new JTextArea();
		detail_field.setEditable(false);
		detail_field.setFont(new Font("Serif", Font.BOLD, 20));
		scrollableTextArea = new JScrollPane(detail_field, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollableTextArea.setBounds(100, 260, 750, 320);

		Back = new JButton("BACK");
		Back.addActionListener(this);
		Back.setBounds(300, 590, 100, 50);

		Add = new JButton("ADD");
		Add.addActionListener(this);
		Add.setBounds(600, 590, 100, 50);

		l1.setForeground(Color.black);
		l2.setForeground(Color.black);
		l3.setForeground(Color.black);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);
		l6.setForeground(Color.black);
		l7.setForeground(Color.black);
		l8.setForeground(Color.black);
		l10.setForeground(Color.black);
		l11.setForeground(Color.black);
		l12.setForeground(Color.black);
		Add.setForeground(Color.black);
		Back.setForeground(Color.black);
		Search.setForeground(Color.black);
		inputfield_search.setForeground(Color.black);
		detail_field.setForeground(Color.black);
		scrollableTextArea.setForeground(Color.black);
		cb.setForeground(Color.black);

		add(l1);
		add(Back);
		add(Add);
		add(inputfield_search);
		add(cb);
		add(Search);

		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(scrollableTextArea);

		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		l7.setVisible(false);
		l8.setVisible(false);
		l9.setVisible(false);
		l10.setVisible(false);
		l11.setVisible(false);
		l12.setVisible(false);
		scrollableTextArea.setVisible(false);
		Add.setVisible(false);

		Border border = BorderFactory.createLineBorder(Color.BLUE);

		Back.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		Add.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		Search.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		setLayout(null);
		setUndecorated(true);
		//setLocation(300, 100);
		setLocation(200, 20);
		setSize(900, 700);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			dispose();
			FrontPage obj = new FrontPage();
		}

		if (e.getSource() == Search) {
			// String data = "" + inputfield_search.getText() +
			// cb.getItemAt(cb.getSelectedIndex());
			get_data();
			table_data();
			// mysql_view_data();
		}

		if (e.getSource() == Add) {
			NewDetails obj = new NewDetails();
			dispose();
		}

		// if (e.getSource() == Add_patient_Details_buttonf) {
		// add_patient_detail_to_database();
		// }
	}

	public void get_data() {
		table_Data_List.clear();
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/PDMS";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, password);

			String sql;

			if (cb.getItemAt(cb.getSelectedIndex()) == "Name") {
				input_field_combobox = "patient_Name";
				sql = "select * from patient_Details where " + input_field_combobox + " = " + "'"
						+ inputfield_search.getText() + "'";
			} else {
				input_field_combobox = "contact";
				sql = "select * from patient_Details where " + input_field_combobox + " = "
						+ inputfield_search.getText();
			}

			sql = "select * from patient_Details where " + input_field_combobox + " = " + "'"
					+ inputfield_search.getText() + "'";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			String detials_all = "";
			while (rs.next()) {
				ArrayList<String> temp = new ArrayList<String>();
				temp.add("" + rs.getInt("patient_Id"));
				temp.add(rs.getString("patient_Name"));
				temp.add("" + rs.getString("Contact"));

				table_Data_List.add(temp);

			}
		} catch (Exception e) {
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
	}

	public void table_data() {
		{
			f = new JFrame();

			String[][] data1 = table_Data_List.stream().map(l -> l.stream().toArray(String[]::new))
					.toArray(String[][]::new);

			String column[] = { "ID", "NAME", "CONTACT" };

			JTable jt = new JTable(data1, column);
			jt.setForeground(Color.black);

			DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			centerRenderer.setHorizontalAlignment(JLabel.CENTER);
			jt.setDefaultRenderer(String.class, centerRenderer);

			jt.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
			jt.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
			jt.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

			jt.getColumnModel().getColumn(0).setPreferredWidth(10);
			jt.getColumnModel().getColumn(1).setPreferredWidth(300);
			jt.getColumnModel().getColumn(2).setPreferredWidth(50);

			jt.setRowHeight(25);

			jt.setFont(new Font("Serif", Font.BOLD, 15));

			jt.setBounds(30, 40, 200, 300);

			JScrollPane sp = new JScrollPane(jt);

			jt.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					int row = jt.rowAtPoint(e.getPoint());

					int col = jt.columnAtPoint(e.getPoint());

					String abc = "" + (jt.getValueAt(row, 0));
					int a = Integer.parseInt(abc);

					mysql_view_data(a);
					f.dispose();

					// JOptionPane.showMessageDialog(
					// null,
					// "Value in the cell clicked :" +
					// " " +
					// jt.getValueAt(row, col).toString()
					// );

				}
			});

			f.add(sp);
			f.setLocation(200, 20);
			f.setSize(1050, 700);
			// f.setUndecorated(true);
			f.setVisible(true);
		}
	}

	public void mysql_view_data(int key_id) {

		share_id = key_id;

		l2.setVisible(true);
		l3.setVisible(true);
		l4.setVisible(true);
		l5.setVisible(true);
		l6.setVisible(true);
		l7.setVisible(true);
		l8.setVisible(true);
		l9.setVisible(true);
		l10.setVisible(true);
		l11.setVisible(true);
		l12.setVisible(true);
		scrollableTextArea.setVisible(true);
		Add.setVisible(true);

		share_id = key_id;

		// f.dispose();

		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/PDMS";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, username, password);

			// sql = "select * from patient_Details where patient_id = 1";
			if (cb.getItemAt(cb.getSelectedIndex()) == "Name") {
				input_field_combobox = "patient_Name";
			} else {
				input_field_combobox = "contact";
			}
			String sql = "select * from patient_details as p inner join view_details v on p.patient_Id = v.patient_Id where p.patient_Id ="
					+ key_id;
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			String detials_all = "";
			while (rs.next()) {
				l3.setText(rs.getString("patient_Name"));
				l5.setText(rs.getString("gender").toUpperCase());
				l7.setText("" + rs.getInt("age"));
				l10.setText("" + rs.getString("email"));
				l12.setText(rs.getString("contact"));
				// detail_field.setText(rs.getString("illness"));
				detials_all += rs.getString("report_time") + "\nIllness : " + rs.getString("illness") + "\nRemark : "
						+ rs.getString("remark") + "\n\n";
			}
			detail_field.setText(detials_all);
		} catch (Exception e) {
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
		new ViewDetails().setVisible(true);
	}
}
