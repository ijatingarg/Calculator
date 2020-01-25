import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculator extends JFrame implements ActionListener {
	  JButton a, b, c, d, e, f, g, h, i, j, k, l, q, w, t, r;
	  JTextField tf = new JTextField();
	  int ab, ac, v1, v2, result;
	  char OP;

	  public Calculator() {

	    tf.setBounds(50, 50, 242, 60);
	    a = new JButton("1");
	    a.setBounds(50, 110, 60, 60);
	    b = new JButton("2");
	    b.setBounds(110, 110, 60, 60);
	    c = new JButton("3");
	    c.setBounds(170, 110, 60, 60);
	    q = new JButton("+");
	    q.setBounds(230, 110, 60, 60);
	    d = new JButton("4");
	    d.setBounds(50, 170, 60, 60);
	    e = new JButton("5");
	    e.setBounds(110, 170, 60, 60);
	    f = new JButton("6");
	    f.setBounds(170, 170, 60, 60);
	    w = new JButton("-");
	    w.setBounds(230, 170, 60, 60);
	    g = new JButton("7");
	    g.setBounds(50, 230, 60, 60);
	    h = new JButton("8");
	    h.setBounds(110, 230, 60, 60);
	    i = new JButton("9");
	    i.setBounds(170, 230, 60, 60);
	    t = new JButton("*");
	    t.setBounds(230, 230, 60, 60);
	    j = new JButton("clr");
	    j.setBounds(50, 290, 60, 60);
	    k = new JButton("0");
	    k.setBounds(110, 290, 60, 60);
	    l = new JButton("=");
	    l.setBounds(170, 290, 60, 60);
	    r = new JButton("/");
	    r.setBounds(230, 290, 60, 60);

	    a.addActionListener(this);
	    b.addActionListener(this);
	    c.addActionListener(this);
	    d.addActionListener(this);
	    e.addActionListener(this);
	    f.addActionListener(this);
	    g.addActionListener(this);
	    h.addActionListener(this);
	    i.addActionListener(this);
	    j.addActionListener(this);
	    k.addActionListener(this);
	    l.addActionListener(this);
	    q.addActionListener(this);
	    w.addActionListener(this);
	    t.addActionListener(this);
	    r.addActionListener(this);

	    add(tf);
	    add(a);
	    add(b);
	    add(c);
	    add(d);
	    add(e);
	    add(f);
	    add(g);
	    add(h);
	    add(i);
	    add(j);
	    add(k);
	    add(l);
	    add(q);
	    add(w);
	    add(t);
	    add(r);

	    setLayout(null);
	    setTitle("Calculator");
	    setSize(350, 430);
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  }

	  public void actionPerformed(ActionEvent e) {
	    String str = e.getActionCommand();
	    System.out.println("You clicked " + str + " JButton");

	    char ch = str.charAt(0);
	    if (Character.isDigit(ch))
	      tf.setText(tf.getText() + str); // for joining the numbers
	    else if (str.equals("+")) {
	      v1 = Integer.parseInt(tf.getText());
	      OP = '+';
	      tf.setText("");
	    } else if (str.equals("-")) {
	      v1 = Integer.parseInt(tf.getText());
	      OP = '-';
	      tf.setText("");
	    } else if (str.equals("*")) {
	      v1 = Integer.parseInt(tf.getText());
	      OP = '*';
	      tf.setText("");
	    } else if (str.equals("/")) {
	      v1 = Integer.parseInt(tf.getText());
	      OP = '/';
	      tf.setText("");
	    }

	    /////////////// CALCULATION////////////////////////

	    if (str.equals("=")) {
	      v2 = Integer.parseInt(tf.getText());

	      if (OP == '+')
	        result = v1 + v2;

	      else if (OP == '-')
	        result = v1 - v2;

	      else if (OP == '*')
	        result = v1 * v2;

	      else if (OP == '/')
	        result = v1 / v2;

	      else if (OP == '%')
	        result = v1 % v2;

	      tf.setText("" + result);
	    }

	    if (str.equals("clr")) {
	      tf.setText("0");
	    }

	  }

	  public static void main(String args[]) {
	    new Calculator();
	  }
	}