package com.project.classes;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card {
	private String faceName, suit;
	private int faceValue;
	private BufferedImage cardImage;
	
	/**
	 * The constructor for Card class
	 * @param suit "spades", "diamonds", "clubs", "hearts"
	 * @param face = 2,3,4,...,9,10,J,Q,K,A
	 * @param value = 2,3,4,5,6,...,9,10,11,12,13,14
	 * @param card = image that represents the look of the card
	 */
	
	public Card(String suit, String face, int value, BufferedImage card) {
		this.faceName = face;
		this.suit = suit;
		this.faceValue = value;
		cardImage = card;	
	}
	
	/**
	 * Returns String representation of the card object
	 */
	public String toString() {
		return faceName + " of " + suit;
	}
	
	public static void main(String[] args) throws IOException {
		Card aceOfspades = new Card("spades","ace", 14, ImageIO.read(new File("C:\\Users\\Mtha Ngcakani\\eclipse-workspace\\Csc102_Project\\Cards\\AS.jpg")));
		
		System.out.println(aceOfspades.toString());
		
		//Create JFrame to display card 
		JFrame window = new JFrame("Title");
		window.setSize(400, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		//Create JPanel - similar to window
		JPanel contentPane = new JPanel(new BorderLayout());
		
		//Create JLabel - this is like a sticky note that you can write or draw
		JLabel cardLabel = new JLabel(new ImageIcon(aceOfspades.cardImage));
		cardLabel.setSize(50, 50);
		contentPane.add(cardLabel); 
		window.add(contentPane);
		
		window.setVisible(true);
	}

	
}
