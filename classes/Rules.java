package com.project.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rules extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rules frame = new Rules();
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
	public Rules() {
		setTitle("Crazy 8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rules & how to play");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(121, 11, 246, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.setVisible(false);
				dispose();
				Welcome.main(null); 
			}
		});
		btnNewButton.setBounds(89, 271, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				Menu.main(null); 
			}
		});
		btnNewButton_1.setBounds(318, 271, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrMustPlay = new JTextArea();
		txtrMustPlay.setEditable(false);
		txtrMustPlay.setFont(new Font("Arial Black", Font.BOLD, 13));
		txtrMustPlay.setForeground(new Color(255, 250, 250));
		txtrMustPlay.setBackground(new Color(0, 128, 0));
		txtrMustPlay.setText("# Must play a card that is the same number or symbol of the \r\n   card on the deck\r\n# An eight of any suit can be played on anything\r\n# If player plays a two , next player draws two cards\r\n# If jack is played, next player is skipped\r\n# Max of 4 players can play\r\n# HAVE FUN!");
		txtrMustPlay.setBounds(21, 87, 447, 135);
		contentPane.add(txtrMustPlay);
	}
}
