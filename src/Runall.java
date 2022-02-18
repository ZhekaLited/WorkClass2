import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Runall {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Application");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();
        JMenu menuHelloCli = new JMenu("HelloEvgesha");
        JMenuItem ItemHelloEn = new JMenuItem("HelloWorld");
        menuHelloCli.add(ItemHelloEn);
        JMenuItem ItemHelloRu = new JMenuItem("HelloWorld");
        menuHelloCli.add(ItemHelloRu);
        menu.add(menuHelloCli);
        frame.setJMenuBar(menu);


        ItemHelloEn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello, world!");
    }
});

        ItemHelloRu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Привет Мир!");
            }
        });

        frame.setVisible(true);
}
    }
