package classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainScreen() {
		
		table_1 = new JTable();
		getContentPane().add(table_1, BorderLayout.WEST);
		
		table_2 = new JTable();
		getContentPane().add(table_2, BorderLayout.CENTER);
		
		table_3 = new JTable();
		getContentPane().add(table_3, BorderLayout.EAST);
	}

	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	 public static void main(String args[]) {
		    final Object rows[][] = {
		      {"0800", "NAL", "Packed"},
		    
		    };
		    final Object headers[] = {"Window Time", "Customer", "Status"};
		    //Constructor for JFrame with title
		    JFrame frame = new JFrame("Shipping Monitor");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //Setting Components for tables
		    JTable table_1 = new JTable(rows, headers);
		    JTable table_2 = new JTable(rows, headers);
		    JTable table_3 = new JTable(rows, headers);
		    
		    JScrollPane scrollPane2 = new JScrollPane(table_1);
		    JScrollPane scrollPane3 = new JScrollPane(table_2);
		    JScrollPane scrollPane = new JScrollPane(table_3);
		    
		    frame.setMinimumSize(new Dimension(1280, 1024));
		    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);		    	 
		    frame.setSize(1920, 1080);
		    frame.setVisible(true);
		    frame.getContentPane().add(scrollPane2, BorderLayout.CENTER);
		    frame.getContentPane().add(scrollPane3, BorderLayout.EAST);
		    frame.getContentPane().add(scrollPane, BorderLayout.WEST);
		      
	 }}
		