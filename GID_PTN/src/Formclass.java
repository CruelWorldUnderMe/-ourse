import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Formclass extends JFrame {
    private JPanel panel = new JPanel(new GridLayout(4, 4, 2, 2));
    private int[][] numbers = new int[4][4];

    public Formclass() {
        super("Pyatnashki by c0nst");

        setBounds(200, 200, 300, 300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        Container container = getContentPane();
        panel.setDoubleBuffered(true);
        container.add(panel);

        generate();
        repaintField();
    }
  //------------------------------------------------------
//   ���������
    public void generate() {
        Random generator = new Random();
        int[] invariants = new int[16];

        do {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    numbers[i][j] = 0;
                    invariants[i * 4 + j] = 0;
                }
            }

            for (int i = 1; i < 16; i++) {
                int k, l;
                do {
                    k = generator.nextInt(4);
                    l = generator.nextInt(4);
                }
                while (numbers[k][l] != 0);
                numbers[k][l] = i;
                invariants[k * 4 + l] = i;
            }
        }
        while (!canBeSolved(invariants));
    }
//------------------------------------------------------
    private boolean canBeSolved(int[] invariants) {
        int sum = 0;
        for (int i = 0; i < 16; i++) {
            if (invariants[i] == 0) {
                sum += i / 4;
                continue;
            }

            for (int j = i + 1; j < 16; j++) {
                if (invariants[j] < invariants[i])
                    sum ++;
            }
        }
        System.out.println(sum % 2 == 0);
        return sum % 2 == 0;
    }
  //------------------------------------------------------
    public void repaintField() {
        panel.removeAll();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton(Integer.toString(numbers[i][j]));
                button.setFocusable(false);
                panel.add(button);
                if (numbers[i][j] == 0) {
                    button.setVisible(false);
                } else
                    button.addActionListener(new ClickListener());
            }
        }

        panel.validate();
        panel.repaint();
    }
  //------------------------------------------------------
 
   
  //------------------------------------------------------
    private class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("exit".equals(command)) {
                System.exit(0);
            }
            if ("new".equals(command)) {
                generate();
                repaintField();
            }
        }
    }

    private class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            button.setVisible(false);
            String name = button.getText();
            change(Integer.parseInt(name));
        }
    }

    public void change(int num) {
        int i = 0, j = 0;
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 4; l++) {
                if (numbers[k][l] == num) {
                    i = k;
                    j = l;
                }
            }
        }
        if (i > 0) {
            if (numbers[i - 1][j] == 0) {
                numbers[i - 1][j] = num;
                numbers[i][j] = 0;
            }
        }
        if (i < 3) {
            if (numbers[i + 1][j] == 0) {
                numbers[i + 1][j] = num;
                numbers[i][j] = 0;
            }
        }
        if (j > 0) {
            if (numbers[i][j - 1] == 0) {
                numbers[i][j - 1] = num;
                numbers[i][j] = 0;
            }
        }
        if (j < 3) {
            if (numbers[i][j + 1] == 0) {
                numbers[i][j + 1] = num;
                numbers[i][j] = 0;
            }
        }

        repaintField();

      
    }
  //------------------------------------------------------
    // Main
    public static void main(String[] args) {
        JFrame app = new Formclass();
        app.setVisible(true);
    }
  //------------------------------------------------------
}