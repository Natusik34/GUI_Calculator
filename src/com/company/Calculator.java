package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;

public class Calculator extends JFrame implements WindowListener, ActionListener {

    private TextField text = new TextField();
    //создание кнопок
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton Delete = new JButton("c");
    private JButton button9 = new JButton("9");
    private JButton button6 = new JButton("6");
    private JButton button5 = new JButton("5");
    private JButton button4 = new JButton("4");
    private JButton button3 = new JButton("3");
    private JButton button2 = new JButton("2");
    private JButton button1 = new JButton("1");
    private JButton button0 = new JButton("0");
    private JButton equals = new JButton("=");
    private JButton plusMin = new JButton("+-");
    private JButton decrease = new JButton("<=");
    private JButton divide = new JButton("/");
    private JButton multiply = new JButton("x");
    private JButton minus = new JButton("-");
    private JButton plus = new JButton("+");
    private JButton sq = new JButton("sqrt");
    private JButton x2 = new JButton("^2");
    private String t = "";
    //переменнные для счета
    private int a = 0;
    private int b = 0;
    //высота и ширина кнопок
    private int width = 60;
    private int height = 60;
    private char z;
    int value;
    int powValue;

    public Calculator(){
        Font font = new Font("Helvetica", Font.BOLD, 40);
        //Font f = new Font(<? extends AttributedCharacterIterator.Attribute?> size);
        setLayout(null);
        setSize(400,600); //размеры
        setVisible(true); //приложение открыто
        setLocation(700,250);
        text.setFont(font);
        text.setSize(330,60);
        text.setLocation(25,25);
        text.setVisible(true);
        add(text);
        //клавиша 7
        button7.setFont(font);
        button7.setSize(width,height);
        button7.setLocation(25,225);
        button7.setVisible(true);
        add(button7);
        //клавиша 8
        button8.setFont(font);
        button8.setSize(width,height);
        button8.setLocation(105,225);
        button8.setVisible(true);
        add(button8);
        button7.addActionListener(this);
        button8.addActionListener(this);
        //клавиша удалить
        Delete.setFont(font);
        Delete.setSize(width,height);
        Delete.setLocation(185,145);
        Delete.setVisible(true);
        add(Delete);
        Delete.addActionListener(this);
        //клавиша 9
        button9.setFont(font);
        button9.setSize(width,height);
        button9.setLocation(185,225);
        button9.setVisible(true);
        add(button9);
        button9.addActionListener(this);
        //клавиша 6
        button6.setFont(font);
        button6.setSize(width,height);
        button6.setLocation(185,305);
        button6.setVisible(true);
        add(button6);
        button6.addActionListener(this);
        //клавиша 5
        button5.setFont(font);
        button5.setSize(width,height);
        button5.setLocation(105,305);
        button5.setVisible(true);
        add(button5);
        button5.addActionListener(this);
        //клавиша 4
        button4.setFont(font);
        button4.setSize(width,height);
        button4.setLocation(25,305);
        button4.setVisible(true);
        add(button4);
        button4.addActionListener(this);
        //клавиша 3
        button3.setFont(font);
        button3.setSize(width,height);
        button3.setLocation(185,385);
        button3.setVisible(true);
        add(button3);
        button3.addActionListener(this);
        //клавиша 2
        button2.setFont(font);
        button2.setSize(width,height);
        button2.setLocation(105,385);
        button2.setVisible(true);
        add(button2);
        button2.addActionListener(this);
        //клавиша 1
        button1.setFont(font);
        button1.setSize(width,height);
        button1.setLocation(25,385);
        button1.setVisible(true);
        add(button1);
        button1.addActionListener(this);
        //клавиша 0
        button0.setFont(font);
        button0.setSize(width,height);
        button0.setLocation(105,465);
        button0.setVisible(true);
        add(button0);
        button0.addActionListener(this);
        //клавиша равно
        equals.setFont(font);
        equals.setSize(width,height);
        equals.setLocation(185,465);
        equals.setVisible(true);
        add(equals);
        equals.addActionListener(this);
        //клавиша плюс/минус
        //plusMin.setFont(font);
        plusMin.setSize(width,height);
        plusMin.setLocation(25,465);
        plusMin.setVisible(true);
        add(plusMin);
        plusMin.addActionListener(this);
        //клавиша удалить символ
        //decrease.setFont(font);
        decrease.setSize(width,height);
        decrease.setLocation(265,145);
        decrease.setVisible(true);
        add(decrease);
        decrease.addActionListener(this);
        //клавиша деление
        divide.setFont(font);
        divide.setSize(width,height);
        divide.setLocation(265,225);
        divide.setVisible(true);
        add(divide);
        divide.addActionListener(this);
        //клавиша умножение
        multiply.setFont(font);
        multiply.setSize(width,height);
        multiply.setLocation(265,305);
        multiply.setVisible(true);
        add(multiply);
        multiply.addActionListener(this);
        //клавиша минус
        minus.setFont(font);
        minus.setSize(width,height);
        minus.setLocation(265,385);
        minus.setVisible(true);
        add(minus);
        minus.addActionListener(this);
        //клавиша плюс
        plus.setFont(font);
        plus.setSize(width,height);
        plus.setLocation(265,465);
        plus.setVisible(true);
        add(plus);
        plus.addActionListener(this);
        //квадратный корень
        //sq.setFont(font);
        sq.setSize(60,30);
        sq.setLocation(25,95);
        sq.setVisible(true);
        add(sq);
        sq.addActionListener(this);
        //возведение в квадрат
        //sq.setFont(font);
        x2.setSize(60,30);
        x2.setLocation(105,95);
        x2.setVisible(true);
        add(x2);
        x2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button7){
            t = t + button7.getText();
            text.setText(t);
        }
        if(e.getSource() == button8){
            t = t + button8.getText();
            text.setText(t);
        }
        if(e.getSource() == Delete){
            t = "";
            text.setText(t);
        }
        if(e.getSource() == button9){
            t = t + button9.getText();
            text.setText(t);
        }
        if(e.getSource() == button6){
            t = t + button6.getText();
            text.setText(t);
        }
        if(e.getSource() == button5){
            t = t + button5.getText();
            text.setText(t);
        }
        if(e.getSource() == button4){
            t = t + button4.getText();
            text.setText(t);
        }
        if(e.getSource() == button3){
            t = t + button3.getText();
            text.setText(t);
        }
        if(e.getSource() == button2){
            t = t + button2.getText();
            text.setText(t);
        }
        if(e.getSource() == button1){
            t = t + button1.getText();
            text.setText(t);
        }
        if(e.getSource() == button0){
            t = t + button0.getText();
            text.setText(t);
        }
        //писание плюса
        if(e.getSource() == plus){
            a = Integer.parseInt(t);
            text.setText(t+plus.getText());
            t = "";
            z = '+';
        }
        //писание минуса
        if(e.getSource() == minus){
            a = Integer.parseInt(t);
            text.setText(t+minus.getText());
            t = "";
            z = '-';
        }
        //писание умножения
        if(e.getSource() == multiply){
            a = Integer.parseInt(t);
            text.setText(t+multiply.getText());
            t = "";
            z = '*';
        }
        //писание деления
        if(e.getSource() == divide){
            a = Integer.parseInt(t);
            text.setText(t+divide.getText());
            t = "";
            z = '/';
        }
        //сложение
        if(e.getSource() == equals){
           if(z == '+'){
               b = Integer.parseInt(t);
               text.setText(String.valueOf(a+b));
           }//вычитание
            if(z == '-'){
                b = Integer.parseInt(t);
                text.setText(String.valueOf(a-b));
            }//умножение
            if(z == '*'){
                b = Integer.parseInt(t);
                text.setText(String.valueOf(a*b));
            }//деление
            if(z == '/'){
                b = Integer.parseInt(t);
                text.setText(String.valueOf(a/b));
            }
        }
        //удаление символа
        if(e.getSource() == decrease){
            int c = Integer.parseInt(text.getText());
            c = c/10;
            text.setText(String.valueOf(c));
            t = String.valueOf(c);
        }
        //добавить минус к числу или убрать его
        if(e.getSource() == plusMin){
            int c = Integer.parseInt(text.getText());
            c = c*-1;
            text.setText(String.valueOf(c));
            t = String.valueOf(c);
        }
        //вычисление корня
        if(e.getSource() == sq){
            double c = Integer.parseInt(text.getText());
            c = Math.sqrt(c);
            text.setText(String.valueOf(c));
            t = String.valueOf(c);
        }
        //возведение в квадрат
        if(e.getSource() == x2){
            int c = Integer.parseInt(text.getText());
            c = c*c;
            text.setText(String.valueOf(c));
            t = String.valueOf(c);
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
