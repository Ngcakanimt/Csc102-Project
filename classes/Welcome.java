package com.project.classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Welcome {

	private JFrame frmCrazy; //attribute 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {    
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frmCrazy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrazy = new JFrame();
		frmCrazy.setTitle("Crazy 8");
		frmCrazy.getContentPane().setBackground(new Color(0, 128, 0));
		frmCrazy.setBounds(100, 100, 560, 404);
		frmCrazy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrazy.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmCrazy.dispose();
				Rules rules = new Rules();
				rules.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(68, 121, 114, 38);
		frmCrazy.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?","Select and option...", JOptionPane.YES_NO_OPTION);
				
				if(p == JOptionPane.YES_OPTION) {
					
					System.exit(0);
				}
				
				
			}
		});
		btnNewButton_1.setBounds(68, 214, 114, 38);
		frmCrazy.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.WHITE);
		Image img = new ImageIcon(this.getClass().getResource("/card symbols.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(300, 41, 215, 235);
		frmCrazy.getContentPane().add(label);
		
		JLabel lblCrazyEight = new JLabel("Crazy Eight");
		lblCrazyEight.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCrazyEight.setForeground(new Color(255, 250, 205));
		lblCrazyEight.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrazyEight.setBackground(new Color(0, 128, 0));
		lblCrazyEight.setBounds(46, 11, 171, 81);
		frmCrazy.getContentPane().add(lblCrazyEight);
		
		JLabel lblNewLabel = new JLabel("By Obtuse Minds");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(344, 316, 171, 38);
		frmCrazy.getContentPane().add(lblNewLabel);
	}
}
