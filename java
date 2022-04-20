import javax.swing.*;
import java.awt.event.*;

public class TablaMultiplicar extends JFrame implements ActionListener {
    private final JLabel lbl_f;
    private final JTextArea txt_a;
    private final JButton btn_OK;
    private JScrollPane scroll_panel;

    public TablaMultiplicar() {
        setLayout(null);
        lbl_f = new JLabel("Tablas de multiplicar del 1 al 10");
        lbl_f.setBounds(10, 10, 200, 30);
        add(lbl_f);
        txt_a = new JTextArea();
        scroll_panel = new JScrollPane(txt_a);
        scroll_panel.setBounds(10, 50, 400, 300);
        add(scroll_panel);
        btn_OK = new JButton("Ejecutar");
        btn_OK.setBounds(430, 50, 120, 30);
        add(btn_OK);
        btn_OK.addActionListener(this);
    }

    public void calcular_tabla_multiplicar() {
        int tabla;
        for (int i = 1; i <= 10; i++) {
            txt_a.append("Tabla de multiplicar del " + i + "\n");
            for (int j = 1; j <= 20; j++) {
                tabla = i * j;
                txt_a.append(i + " x " + j + " = " + tabla + "\n");
            }
        }
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn_OK) {
            calcular_tabla_multiplicar();
        }
    }

    public static void main(String[] args) {
        TablaMultiplicar tm = new TablaMultiplicar();
        tm.setBounds(500, 200, 600, 450);
        tm.setVisible(true);
        tm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tm.setTitle("Tabla de multiplicar");
    }
}
