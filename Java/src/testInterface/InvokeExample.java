package testInterface;
  
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class InvokeExample {
  private static JButton good = new JButton("Good");

  private static JButton bad = new JButton("Bad");

  private static JButton bad2 = new JButton("Bad2");

  private static JLabel resultLabel = new JLabel("Ready", JLabel.CENTER);

  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    p.add(good);
    p.add(bad);
    p.add(bad2);

    Container c = f.getContentPane();
    c.setLayout(new BorderLayout());
    c.add(p, BorderLayout.CENTER);
    c.add(resultLabel, BorderLayout.SOUTH);

    good.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
    	  
        resultLabel.setText("Working . . .");
        setEnabled(false);
        
        Thread worker = new Thread() {
          public void run() {
        	  
            try {
              Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }

            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                resultLabel.setText("Ready");
                setEnabled(true);
              }
            });
            
          }
        };
        worker.start();
      }
    });

    bad.addActionListener(new ActionListener() {
    	
      public void actionPerformed(ActionEvent ev) {
    	  
        resultLabel.setText("Working . . .");
        setEnabled(false);
        
        try {
          Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }
        
        resultLabel.setText("Ready");
        setEnabled(true);
      }
    });

    bad2.addActionListener(new ActionListener() {
    	
      public void actionPerformed(ActionEvent ev) {
    	  
        resultLabel.setText("Working . . . ");
        setEnabled(false);
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            try {
              Thread.sleep(5000); // Dispatch thread is starving!
            } catch (InterruptedException ex) {
            }

            resultLabel.setText("Ready");
            setEnabled(true);
          }
        });
        
      }
    });

    f.setSize(300, 100);
    f.setVisible(true);
  }

  // Allows us to turn the buttons on or off while we work.
  static void setEnabled(boolean b) {
    good.setEnabled(b);
    bad.setEnabled(b);
    bad2.setEnabled(b);
  }
}

        