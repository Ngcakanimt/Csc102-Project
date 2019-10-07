package com.project.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Crazy 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				Rules.main(null); 
			}
		});
		btnNewButton_1.setBounds(43, 282, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Play");
		btnNewButton_2.setBounds(333, 282, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("2 Players");
		rdbtnNewRadioButton.setBounds(192, 95, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("3 Players");
		rdbtnNewRadioButton_1.setBounds(192, 141, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnPlayers = new JRadioButton("4 Players");
		rdbtnPlayers.setBounds(192, 197, 109, 23);
		contentPane.add(rdbtnPlayers);
		
		JLabel lblNewLabel = new JLabel("How many players?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setBounds(132, 11, 233, 47);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/playing_cards.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(28, 80, 124, 140);
		contentPane.add(label);
	}
}
