package myNewApps;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 GUI for 
*/
@SuppressWarnings("serial")
public class Menu extends JFrame
						   implements ActionListener
{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 200;

    private JTextField inOutField;
    private int sum = 0;
    private String sumText="";

    public Menu ()
    {
        setTitle("Number Conversions");
        setSize(WIDTH, HEIGHT);
        Container contentPane = getContentPane( );
        contentPane.setLayout(new BorderLayout( ));

        JPanel buttonPanel = new JPanel( );
        
        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout( ));
        
        JButton BinToDecButton = new JButton("BinToDec");
        BinToDecButton.addActionListener(this);        
        buttonPanel.add(BinToDecButton);
        
        JButton BinToHexButton = new JButton("BinToHex");
        BinToHexButton.addActionListener(this);
        buttonPanel.add(BinToHexButton);
        
        JButton DecToBinButton = new JButton("DecToBin");
        DecToBinButton.addActionListener(this);
        buttonPanel.add(DecToBinButton);
        
        JButton DecToHexButton = new JButton("DecToHex");
        DecToHexButton.addActionListener(this);
        buttonPanel.add(DecToHexButton);
        
        JButton HexToBinButton = new JButton("HexToBin");
        HexToBinButton.addActionListener(this);
        buttonPanel.add(HexToBinButton);        
        
        JButton HexToDecButton = new JButton("HexToDec");
        HexToDecButton.addActionListener(this);
        buttonPanel.add(HexToDecButton); 
 
        
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JPanel textPanel = new JPanel( );
        textPanel.setBackground(Color.BLUE);
        textPanel.setLayout(new FlowLayout( ));

        inOutField = new JTextField("", 30);
        inOutField.setBackground(Color.WHITE);
        textPanel.add(inOutField);
        contentPane.add(textPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            tryingCorrectNumberFormats(e);
        }
        catch (NumberFormatException e2)
        {
            inOutField.setText("Error: Reenter Number.");
        }
    }

    //This method can throw NumberFormatExceptions.
    public void tryingCorrectNumberFormats(ActionEvent e)
    {
        if (e.getActionCommand().equals("BinToDec"))
        {
            sum= Integer.parseInt(inOutField.getText(),2);
            inOutField.setText(Binary.binToDec(sum));
        }
        else if (e.getActionCommand().equals("BinToHex"))
        {
            sum= Integer.parseInt(inOutField.getText(),2);
            inOutField.setText(Binary.binToHex(sum));
        }
        else if (e.getActionCommand().equals("DecToBin")) 
        {
        	sum= Integer.parseInt(inOutField.getText(),10);
        	inOutField.setText(Decimal.decToBin(sum));
    	}
    	else if  (e.getActionCommand().equals("DecToHex"))
    	{
    		sum= Integer.parseInt(inOutField.getText(),10);
    		inOutField.setText(Decimal.decToHex(sum));
		}
    	else if  (e.getActionCommand().equals("HexToDec"))
    	{
    		sumText= inOutField.getText();
    		inOutField.setText(Hexedecimal.hexToDec(sumText));
    	} 
    	else if  (e.getActionCommand().equals("HexToBin"))
    	{
    		sumText= inOutField.getText();
    		inOutField.setText(Hexedecimal.hexToBin(sumText));
    	} 
    }
}



