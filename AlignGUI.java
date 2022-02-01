package ie.itcarlow.lab12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension; 
import java.awt.GridLayout; 
import java.awt.LayoutManager; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class AlignGUI extends JFrame {



	
	private JButton okButton = new JButton ("Ok");
	private JButton cancelButton = new JButton ("Cancel");
	private JButton helpButton = new JButton ("Help");
	private JCheckBox snapToGridCheckBox = new JCheckBox ("Snap to Grid");
	private JCheckBox showGridCheckBox = new JCheckBox ("Show to Grid ");
	private JLabel xLabel = new JLabel("X: ");
	private JLabel yLabel = new JLabel("Y: ");
	private JTextField xTextField = new JTextField();
	private JTextField yTextField = new JTextField();
	
	
	// Constructor
	public AlignGUI(String title)	{
		
		// Set title for frame and choose layout
		super(title);
		
		LayoutManager layout = new BorderLayout();
		getContentPane().setLayout(layout); 
		
		JPanel butttonPanel = new JPanel();
		AbstractButton buttonPanel;
		buttonPanel.setLayout(boxLayout);
		okButton.setMaximumSize(new Dimension(120, 30));
		cancelButton.setMaximumSize(new Dimension(120, 30));
		helpButton.setMaximumSize(new Dimension(120, 30));
		buttonPanel.add(Box.createVerticalGlue());
		buttonPanel.add(okButton);
		buttonPanel.add(Box.createVerticalStrut(10));
		buttonPanel.add(cancelButton);
		buttonPanel.add(Box.createVerticalStrut(10));
		buttonPanel.add(helpButton);
		buttonPanel.add(Box.createVerticalGlue());
		
		
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10 , 5, 10 , 30));
		getContentPane().add(buttonPanel, BorderLayout.EAST);

		
		JPanel mainPanel = new JPanel();
		LayoutManager gridLayout = new GridLayout (2 , 2);
		mainPanel.setLayout(gridLayout);
		
		
		mainPanel.add(snapToGridCheckBox);
		
		JPanel xPanel = new JPanel();
		LayoutManager boxLayout2 = new BoxLayout (xPanel, BoxLayout.X_AXIS);
		xPanel.setLayout(boxLayout2);
		xLabel.setForeground(Color.BLUE);
		xPanel.add(xLabel);
		xTextField.setMaximumSize(new Dimension (100, 30 ));
		xPanel.add(xTextField);
		mainPanel.add(xLabel);
		
		
		mainPanel.add(showGridCheckBox);
		
		
		JPanel yPanel = new JPanel();
		LayoutManager boxLayout3 = new BoxLayout (yPanel, BoxLayout.X_AXIS);
		yPanel.setLayout(boxLayout3);
		yPanel.add(yLabel);
		yPanel.add(yTextField);
		mainPanel.add(yLabel);
		
		
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
		getContentPane().add(buttonPanel, BorderLayout.CENTER);
		
		
		

		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end constructor


	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

}//end class

