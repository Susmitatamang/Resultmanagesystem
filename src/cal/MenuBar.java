package cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

public class MenuBar implements ActionListener {
    JFrame frame=new JFrame("Menu BAr");
    JMenuBar menubar;
    JMenu Student,Subject,ShowStudent,Show_Subject,AddResult,ShowResult,Find_Student;
    MenuBar(){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        frame.setBounds(150,150,650,300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font f= new Font("Serif",Font.BOLD,13);

        menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        Student=new JMenu("Student_Registration");
        menubar.add(Student);
        menubar.setVisible(true);
        Student.setFont(f);
        Student.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Student_regis();
                frame.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        Subject=new JMenu("Subject");
        menubar.add(Subject);
        menubar.setVisible(true);
        Subject.setFont(f);
        Subject.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new Subject();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        AddResult=new JMenu("Add_Result");
        menubar.add(AddResult);
        menubar.setVisible(true);
        AddResult.setFont(f);
        AddResult.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                    new Add_Result();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        ShowStudent=new JMenu("Show_Student");
        menubar.add(ShowStudent);
        menubar.setVisible(true);
        ShowStudent.setFont(f);
        ShowStudent.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new Show_Student();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        Show_Subject=new JMenu("Show_Subject");
        menubar.add(Show_Subject);
        menubar.setVisible(true);
        Show_Subject.setFont(f);
        Show_Subject.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new Show_Subject();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        ShowResult=new JMenu("Show_Result");
        menubar.add(ShowResult);
        menubar.setVisible(true);
        ShowResult.setFont(f);
        ShowResult.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new Show_Result();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        Find_Student=new JMenu("Find Student");
        menubar.add(Find_Student);
        Find_Student.setVisible(true);
        Find_Student.setFont(f);
        Find_Student.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                new Seacrch_Student();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }



    @Override
    public void actionPerformed(ActionEvent e) {
    String ch=e.getActionCommand();
//    if(ch=="Student Registration"){
//        new Student_regis();
//        frame.dispose();
//    }
    }
}
