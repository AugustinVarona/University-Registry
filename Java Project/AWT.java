package clase;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class AWT {
    AWT()
    {
        TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t4 = new TextField();
        t5 = new TextField();
        t6 = new TextField();
        t7 = new TextField();
        t8 = new TextField();
        t9 = new TextField();
        t10 = new TextField();
        t11 = new TextField();
        t12 = new TextField();
        t13 = new TextField();
        t14 = new TextField();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (dimension.getWidth()/2);
        int y = (int) (dimension.getHeight()/2);
        Frame f = new Frame();
        Frame f1 = new Frame("Cursuri");
        Frame f2 = new Frame("Studenti");
        Frame f3 = new Frame("Profesori");
        Frame f4 = new Frame("Adaugare curs");
        Frame f5 = new Frame("Editeaza curs");
        JFrame f6 = new JFrame("Vizualizare cursuri");
        Frame f7 = new Frame("Adaugare student");
        Frame f8 = new Frame("Editeaza student");
        JFrame f9 = new JFrame("Vizualizare studenti");
        Frame f10 = new Frame("Adaugare profesor");
        Frame f11 = new Frame("Editeaza profesor");
        JFrame f12 = new JFrame("Vizualizare profesori");
        Frame infor = new Frame("Informatii");
        Label l = new Label("Alegeti o categorie");
        Label nume = new Label("Nume:");
        Label nume1 = new Label("Nume:");
        Label nume2 = new Label("Nume:");
        Label nume3 = new Label("Nume:");
        Label nume4 = new Label("Nume:");
        Label nume5 = new Label("Nume:");
        Label prenume = new Label("Prenume:");
        Label prenume1 = new Label("Prenume:");
        Label prenume2 = new Label("Prenume:");
        Label prenume3 = new Label("Prenume:");
        Label grupa = new Label("Grupa:");
        Label grupa1 = new Label("Grupa:");
        Label descriere = new Label("Descriere:");
        Label descriere1 = new Label("Descriere:");
        Label in = new Label("De Varona Augustin!");
        Button b1 = new Button("Cursuri");
        Button b2 = new Button("Studenti");
        Button b3 = new Button("Profesori");
        Button b4 = new Button("Adaugare curs");
        Button b5 = new Button("Adaugare student");
        Button b6 = new Button("Adaugare profesor");
        Button b7 = new Button("Editeaza curs");
        Button b8 = new Button("Vizualizare cursuri");
        Button b9 = new Button("Editeaza student");
        Button b10 = new Button("Vizualizare studenti");
        Button b11 = new Button("Editeaza profesor");
        Button b12 = new Button("Vizualizare profesori");
        Button adaugare = new Button("Adaugare");
        Button adaugare1 = new Button("Adaugare");
        Button adaugare2 = new Button("Adaugare");
        MenuBar mb = new MenuBar();
        MenuBar mb1 = new MenuBar();
        MenuBar mb2 = new MenuBar();
        MenuBar mb3 = new MenuBar();
        MenuBar mb4 = new MenuBar();
        MenuBar mb5 = new MenuBar();
        MenuBar mb6 = new MenuBar();
        MenuBar mb7 = new MenuBar();
        MenuBar mb8 = new MenuBar();
        MenuBar mb9 = new MenuBar();
        MenuBar mb10 = new MenuBar();
        MenuBar mb11 = new MenuBar();
        MenuBar m = new MenuBar();
        MenuBar mn = new MenuBar();
        MenuItem prin = new MenuItem("Pagina principala");
        MenuItem prin1 = new MenuItem("Pagina principala");
        MenuItem prin2 = new MenuItem("Pagina principala");
        MenuItem prin3 = new MenuItem("Pagina principala");
        MenuItem prin4 = new MenuItem("Pagina principala");
        MenuItem prin5 = new MenuItem("Pagina principala");
        MenuItem prin6 = new MenuItem("Pagina principala");
        MenuItem prin7 = new MenuItem("Pagina principala");
        MenuItem prin8 = new MenuItem("Pagina principala");
        MenuItem prin9 = new MenuItem("Pagina principala");
        MenuItem prin10 = new MenuItem("Pagina principala");
        MenuItem prin11 = new MenuItem("Pagina principala");
        MenuItem prin12 = new MenuItem("Pagina principala");
        Menu info = new Menu("Informatii");
        MenuItem inf = new MenuItem("Informatii");
        Menu menu = new Menu("Meniu");
        Menu menu1 = new Menu("Meniu");
        Menu menu2 = new Menu("Meniu");
        Menu menu3 = new Menu("Meniu");
        Menu menu4 = new Menu("Meniu");
        Menu menu5 = new Menu("Meniu");
        Menu menu6 = new Menu("Meniu");
        Menu menu7 = new Menu("Meniu");
        Menu menu8 = new Menu("Meniu");
        Menu menu9 = new Menu("Meniu");
        Menu menu10 = new Menu("Meniu");
        Menu menu11 = new Menu("Meniu");
        Menu menu12 = new Menu("Meniu");
        Menu curs = new Menu("Cursuri");
        Menu curs1 = new Menu("Cursuri");
        Menu curs2 = new Menu("Cursuri");
        Menu curs3 = new Menu("Cursuri");
        Menu curs4 = new Menu("Cursuri");
        Menu curs5 = new Menu("Cursuri");
        Menu curs6 = new Menu("Cursuri");
        Menu curs7 = new Menu("Cursuri");
        Menu curs8 = new Menu("Cursuri");
        Menu curs9 = new Menu("Cursuri");
        Menu curs10 = new Menu("Cursuri");
        Menu curs11 = new Menu("Cursuri");
        Menu curs12 = new Menu("Cursuri");
        Menu student = new Menu("Studenti");
        Menu student1 = new Menu("Studenti");
        Menu student2 = new Menu("Studenti");
        Menu student3 = new Menu("Studenti");
        Menu student4 = new Menu("Studenti");
        Menu student5 = new Menu("Studenti");
        Menu student6 = new Menu("Studenti");
        Menu student7 = new Menu("Studenti");
        Menu student8 = new Menu("Studenti");
        Menu student9 = new Menu("Studenti");
        Menu student10 = new Menu("Studenti");
        Menu student11 = new Menu("Studenti");
        Menu student12 = new Menu("Studenti");
        Menu prof = new Menu("Profesori");
        Menu prof1 = new Menu("Profesori");
        Menu prof2 = new Menu("Profesori");
        Menu prof3 = new Menu("Profesori");
        Menu prof4 = new Menu("Profesori");
        Menu prof5 = new Menu("Profesori");
        Menu prof6 = new Menu("Profesori");
        Menu prof7 = new Menu("Profesori");
        Menu prof8 = new Menu("Profesori");
        Menu prof9 = new Menu("Profesori");
        Menu prof10 = new Menu("Profesori");
        Menu prof11 = new Menu("Profesori");
        Menu prof12 = new Menu("Profesori");
        MenuItem i = new MenuItem("Adaugare curs");
        MenuItem i1 = new MenuItem("Adaugare curs");
        MenuItem i2 = new MenuItem("Adaugare curs");
        MenuItem i3 = new MenuItem("Adaugare curs");
        MenuItem i4 = new MenuItem("Adaugare curs");
        MenuItem i5 = new MenuItem("Adaugare curs");
        MenuItem i6 = new MenuItem("Adaugare curs");
        MenuItem i7 = new MenuItem("Adaugare curs");
        MenuItem i8 = new MenuItem("Adaugare curs");
        MenuItem i9 = new MenuItem("Adaugare curs");
        MenuItem i10 = new MenuItem("Adaugare curs");
        MenuItem i11 = new MenuItem("Adaugare curs");
        MenuItem i12 = new MenuItem("Adaugare curs");
        MenuItem o = new MenuItem("Editeaza curs");
        MenuItem o1 = new MenuItem("Editeaza curs");
        MenuItem o2 = new MenuItem("Editeaza curs");
        MenuItem o3 = new MenuItem("Editeaza curs");
        MenuItem o4 = new MenuItem("Editeaza curs");
        MenuItem o5 = new MenuItem("Editeaza curs");
        MenuItem o6 = new MenuItem("Editeaza curs");
        MenuItem o7 = new MenuItem("Editeaza curs");
        MenuItem o8 = new MenuItem("Editeaza curs");
        MenuItem o9 = new MenuItem("Editeaza curs");
        MenuItem o10 = new MenuItem("Editeaza curs");
        MenuItem o11 = new MenuItem("Editeaza curs");
        MenuItem o12 = new MenuItem("Editeaza curs");
        MenuItem w = new MenuItem("Vizualizare cursuri");
        MenuItem w1 = new MenuItem("Vizualizare cursuri");
        MenuItem w2 = new MenuItem("Vizualizare cursuri");
        MenuItem w3 = new MenuItem("Vizualizare cursuri");
        MenuItem w4 = new MenuItem("Vizualizare cursuri");
        MenuItem w5 = new MenuItem("Vizualizare cursuri");
        MenuItem w6 = new MenuItem("Vizualizare cursuri");
        MenuItem w7 = new MenuItem("Vizualizare cursuri");
        MenuItem w8 = new MenuItem("Vizualizare cursuri");
        MenuItem w9 = new MenuItem("Vizualizare cursuri");
        MenuItem w10 = new MenuItem("Vizualizare cursuri");
        MenuItem w11 = new MenuItem("Vizualizare cursuri");
        MenuItem w12 = new MenuItem("Vizualizare cursuri");
        MenuItem p = new MenuItem("Adaugare student");
        MenuItem p1 = new MenuItem("Adaugare student");
        MenuItem p2 = new MenuItem("Adaugare student");
        MenuItem p3 = new MenuItem("Adaugare student");
        MenuItem p4 = new MenuItem("Adaugare student");
        MenuItem p5 = new MenuItem("Adaugare student");
        MenuItem p6 = new MenuItem("Adaugare student");
        MenuItem p7 = new MenuItem("Adaugare student");
        MenuItem p8 = new MenuItem("Adaugare student");
        MenuItem p9 = new MenuItem("Adaugare student");
        MenuItem p10 = new MenuItem("Adaugare student");
        MenuItem p11 = new MenuItem("Adaugare student");
        MenuItem p12 = new MenuItem("Adaugare student");
        MenuItem u = new MenuItem("Editeaza student");
        MenuItem u1 = new MenuItem("Editeaza student");
        MenuItem u2 = new MenuItem("Editeaza student");
        MenuItem u3 = new MenuItem("Editeaza student");
        MenuItem u4 = new MenuItem("Editeaza student");
        MenuItem u5 = new MenuItem("Editeaza student");
        MenuItem u6 = new MenuItem("Editeaza student");
        MenuItem u7 = new MenuItem("Editeaza student");
        MenuItem u8 = new MenuItem("Editeaza student");
        MenuItem u9 = new MenuItem("Editeaza student");
        MenuItem u10 = new MenuItem("Editeaza student");
        MenuItem u11 = new MenuItem("Editeaza student");
        MenuItem u12 = new MenuItem("Editeaza student");
        MenuItem a = new MenuItem("Vizualizare studenti");
        MenuItem a1 = new MenuItem("Vizualizare studenti");
        MenuItem a2 = new MenuItem("Vizualizare studenti");
        MenuItem a3 = new MenuItem("Vizualizare studenti");
        MenuItem a4 = new MenuItem("Vizualizare studenti");
        MenuItem a5 = new MenuItem("Vizualizare studenti");
        MenuItem a6 = new MenuItem("Vizualizare studenti");
        MenuItem a7 = new MenuItem("Vizualizare studenti");
        MenuItem a8 = new MenuItem("Vizualizare studenti");
        MenuItem a9 = new MenuItem("Vizualizare studenti");
        MenuItem a10 = new MenuItem("Vizualizare studenti");
        MenuItem a11 = new MenuItem("Vizualizare studenti");
        MenuItem a12 = new MenuItem("Vizualizare studenti");
        MenuItem r = new MenuItem("Adaugare profesor");
        MenuItem r1 = new MenuItem("Adaugare profesor");
        MenuItem r2 = new MenuItem("Adaugare profesor");
        MenuItem r3 = new MenuItem("Adaugare profesor");
        MenuItem r4 = new MenuItem("Adaugare profesor");
        MenuItem r5 = new MenuItem("Adaugare profesor");
        MenuItem r6 = new MenuItem("Adaugare profesor");
        MenuItem r7 = new MenuItem("Adaugare profesor");
        MenuItem r8 = new MenuItem("Adaugare profesor");
        MenuItem r9 = new MenuItem("Adaugare profesor");
        MenuItem r10 = new MenuItem("Adaugare profesor");
        MenuItem r11 = new MenuItem("Adaugare profesor");
        MenuItem r12 = new MenuItem("Adaugare profesor");
        MenuItem q =new MenuItem("Editeaza profesor");
        MenuItem q1 =new MenuItem("Editeaza profesor");
        MenuItem q2 =new MenuItem("Editeaza profesor");
        MenuItem q3 =new MenuItem("Editeaza profesor");
        MenuItem q4 =new MenuItem("Editeaza profesor");
        MenuItem q5 =new MenuItem("Editeaza profesor");
        MenuItem q6 =new MenuItem("Editeaza profesor");
        MenuItem q7 =new MenuItem("Editeaza profesor");
        MenuItem q8 =new MenuItem("Editeaza profesor");
        MenuItem q9 =new MenuItem("Editeaza profesor");
        MenuItem q10 =new MenuItem("Editeaza profesor");
        MenuItem q11 =new MenuItem("Editeaza profesor");
        MenuItem q12 =new MenuItem("Editeaza profesor");
        MenuItem s = new MenuItem("Vizualizare profesori");
        MenuItem s1 = new MenuItem("Vizualizare profesori");
        MenuItem s2 = new MenuItem("Vizualizare profesori");
        MenuItem s3 = new MenuItem("Vizualizare profesori");
        MenuItem s4 = new MenuItem("Vizualizare profesori");
        MenuItem s5 = new MenuItem("Vizualizare profesori");
        MenuItem s6 = new MenuItem("Vizualizare profesori");
        MenuItem s7 = new MenuItem("Vizualizare profesori");
        MenuItem s8 = new MenuItem("Vizualizare profesori");
        MenuItem s9 = new MenuItem("Vizualizare profesori");
        MenuItem s10= new MenuItem("Vizualizare profesori");
        MenuItem s11 = new MenuItem("Vizualizare profesori");
        MenuItem s12 = new MenuItem("Vizualizare profesori");
        Choice choice_curs = new Choice();
        Choice choice_student = new Choice();
        Choice choice_prof = new Choice();
        Label l_curs = new Label("Ce curs doriti sa modificati:");
        Label l_student = new Label("Ce student doriti sa modificati:");
        Label l_prof = new Label("Ce profesor doriti sa modificati:");
        l_curs.setBounds(10,45,250,25);
        l_student.setBounds(10,45,250,25);
        l_prof.setBounds(10,45,250,25);
        choice_curs.setBounds(10,70,150,30);
        choice_student.setBounds(10,70,150,30);
        choice_prof.setBounds(10,70,150,30);
        t8.setBounds(60,100,100,20);
        t9.setBounds(80,130,100,20);
        t10.setBounds(60,100,100,20);
        t11.setBounds(80,130,100,20);
        t12.setBounds(80,160,100,20);
        t13.setBounds(60,100,100,20);
        t14.setBounds(80,130,100,20);
        nume3.setBounds(10,90,40,30);
        nume4.setBounds(10,90,40,30);
        nume5.setBounds(10,90,40,30);
        prenume2.setBounds(10,120,60,30);
        prenume3.setBounds(10,120,60,30);
        grupa1.setBounds(10,150,60,30);
        descriere1.setBounds(10,120,60,30);
        Button modifica1 = new Button("Modifica");
        Button modifica2 = new Button("Modifica");
        Button modifica3 = new Button("Modifica");
        modifica1.setBounds(10,150,100,30);
        modifica2.setBounds(10,180,100,30);
        modifica3.setBounds(10,150,100,30);
        f5.add(l_curs);
        f5.add(choice_curs);
        f8.add(choice_student);
        f8.add(l_student);
        f11.add(choice_prof);
        f11.add(l_prof);
        f5.add(nume3);
        f5.add(descriere1);
        f5.add(t8);
        f5.add(t9);
        f5.add(modifica1);
        f8.add(nume4);
        f8.add(prenume2);
        f8.add(grupa1);
        f8.add(t10);
        f8.add(t11);
        f8.add(t12);
        f8.add(modifica2);
        f11.add(nume5);
        f11.add(prenume3);
        f11.add(t13);
        f11.add(t14);
        f11.add(modifica3);

        mb.add(menu);
        menu.add(prin);
        menu.add(curs);
        menu.add(student);
        menu.add(prof);
        curs.add(i);
        curs.add(o);
        curs.add(w);
        student.add(p);
        student.add(u);
        student.add(a);
        prof.add(r);
        prof.add(q);
        prof.add(s);

        mb1.add(menu1);
        menu1.add(prin1);
        menu1.add(curs1);
        menu1.add(student1);
        menu1.add(prof1);
        curs1.add(i1);
        curs1.add(o1);
        curs1.add(w1);
        student1.add(p1);
        student1.add(u1);
        student1.add(a1);
        prof1.add(r1);
        prof1.add(q1);
        prof1.add(s1);

        mb2.add(menu2);
        menu2.add(prin2);
        menu2.add(curs2);
        menu2.add(student2);
        menu2.add(prof2);
        curs2.add(i2);
        curs2.add(o2);
        curs2.add(w2);
        student2.add(p2);
        student2.add(u2);
        student2.add(a2);
        prof2.add(r2);
        prof2.add(q2);
        prof2.add(s2);

        mb3.add(menu3);
        menu3.add(prin3);
        menu3.add(curs3);
        menu3.add(student3);
        menu3.add(prof3);
        curs3.add(i3);
        curs3.add(o3);
        curs3.add(w3);
        student3.add(p3);
        student3.add(u3);
        student3.add(a3);
        prof3.add(r3);
        prof3.add(q3);
        prof3.add(s3);

        m.add(info);
        info.add(inf);
        infor.setMenuBar(mn);

        mn.add(menu4);
        menu4.add(prin4);
        menu4.add(curs4);
        menu4.add(student4);
        menu4.add(prof4);
        curs4.add(i4);
        curs4.add(o4);
        curs4.add(w4);
        student4.add(p4);
        student4.add(u4);
        student4.add(a4);
        prof4.add(r4);
        prof4.add(q4);
        prof4.add(s4);

        mb5.add(menu5);
        menu5.add(prin5);
        menu5.add(curs5);
        menu5.add(student5);
        menu5.add(prof5);
        curs5.add(i5);
        curs5.add(o5);
        curs5.add(w5);
        student5.add(p5);
        student5.add(u5);
        student5.add(a5);
        prof5.add(r5);
        prof5.add(q5);
        prof5.add(s5);

        mb6.add(menu6);
        menu6.add(prin6);
        menu6.add(curs6);
        menu6.add(student6);
        menu6.add(prof6);
        curs6.add(i6);
        curs6.add(o6);
        curs6.add(w6);
        student6.add(p6);
        student6.add(u6);
        student6.add(a6);
        prof6.add(r6);
        prof6.add(q6);
        prof6.add(s6);

        mb7.add(menu7);
        menu7.add(prin7);
        menu7.add(curs7);
        menu7.add(student7);
        menu7.add(prof7);
        curs7.add(i7);
        curs7.add(o7);
        curs7.add(w7);
        student7.add(p7);
        student7.add(u7);
        student7.add(a7);
        prof7.add(r7);
        prof7.add(q7);
        prof7.add(s7);

        mb8.add(menu8);
        menu8.add(prin8);
        menu8.add(curs8);
        menu8.add(student8);
        menu8.add(prof8);
        curs8.add(i8);
        curs8.add(o8);
        curs8.add(w8);
        student8.add(p8);
        student8.add(u8);
        student8.add(a8);
        prof8.add(r8);
        prof8.add(q8);
        prof8.add(s8);

        mb9.add(menu9);
        menu9.add(prin9);
        menu9.add(curs9);
        menu9.add(student9);
        menu9.add(prof9);
        curs9.add(i9);
        curs9.add(o9);
        curs9.add(w9);
        student9.add(p9);
        student9.add(u9);
        student9.add(a9);
        prof9.add(r9);
        prof9.add(q9);
        prof9.add(s9);

        mb10.add(menu10);
        menu10.add(prin10);
        menu10.add(curs10);
        menu10.add(student10);
        menu10.add(prof10);
        curs10.add(i10);
        curs10.add(o10);
        curs10.add(w10);
        student10.add(p10);
        student10.add(u10);
        student10.add(a10);
        prof10.add(r10);
        prof10.add(q10);
        prof10.add(s10);

        mb11.add(menu11);
        menu11.add(prin11);
        menu11.add(curs11);
        menu11.add(student11);
        menu11.add(prof11);
        curs11.add(i11);
        curs11.add(o11);
        curs11.add(w11);
        student11.add(p11);
        student11.add(u11);
        student11.add(a11);
        prof11.add(r11);
        prof11.add(q11);
        prof11.add(s11);

        mb4.add(menu12);
        menu12.add(prin12);
        menu12.add(curs12);
        menu12.add(student12);
        menu12.add(prof12);
        curs12.add(i12);
        curs12.add(o12);
        curs12.add(w12);
        student12.add(p12);
        student12.add(u12);
        student12.add(a12);
        prof12.add(r12);
        prof12.add(q12);
        prof12.add(s12);

        b1.setBounds(150, 100, 80, 30);
        b2.setBounds(150, 140, 80, 30);
        b3.setBounds(150, 180, 80, 30);
        b4.setBounds(150, 70, 120, 30);
        b5.setBounds(150, 70, 120, 30);
        b6.setBounds(150, 70, 120, 30);
        b7.setBounds(150,110,120,30 );
        b8.setBounds(150,150,120,30);
        b9.setBounds(150,110,120,30);
        b10.setBounds(150,150,120,30);
        b11.setBounds(150,110,120,30);
        b12.setBounds(150,150,120,30);
        nume.setBounds(10,40,40,30);
        nume1.setBounds(10,42,40,30);
        nume2.setBounds(10,40,40,30);
        prenume.setBounds(10,70,60,30);
        prenume1.setBounds(10,70,60,30);
        grupa.setBounds(10,100,40,30);
        t1.setBounds(60, 50, 100, 20);
        descriere.setBounds(10,70, 60,30);
        t2.setBounds(80, 80, 100, 20);
        adaugare.setBounds(10, 110, 100, 30);
        adaugare2.setBounds(10,110,100,30);
        adaugare1.setBounds(10,140,100,30);
        l.setBounds(139,20,200,100);
        in.setBounds(75,75,150,30);
        t3.setBounds(60,50,100,20);
        t4.setBounds(80,80,100,20);
        t5.setBounds(60,110,100,20);
        t6.setBounds(60,50,100,20);
        t7.setBounds(80,80,100,20);
        f7.add(t3);
        f7.add(prenume);
        f7.add(t4);
        f7.add(grupa);
        f7.add(t5);
        f7.add(nume1);
        f10.add(nume2);
        f10.add(prenume1);
        f10.add(t6);
        f10.add(t7);
        f10.add(adaugare2);
        f7.add(adaugare1);
        f.setLocation(x,y);
        f1.setLocation(x,y);
        f2.setLocation(x,y);
        f3.setLocation(x,y);
        f4.setLocation(x,y);
        f5.setLocation(x,y);
        f6.setLocation(x,y);
        f7.setLocation(x,y);
        f8.setLocation(x,y);
        f9.setLocation(x,y);
        f10.setLocation(x,y);
        f11.setLocation(x,y);
        f12.setLocation(x,y);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l);
        f.setMenuBar(m);
        f.setSize(400,300);
        f.setTitle("Aplicatie");
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f1.setSize(400, 300);
        f1.setResizable(false);
        f1.setLayout(null);
        f1.add(b4);
        f1.add(b7);
        f1.add(b8);
        f2.setSize(400, 300);
        f2.setResizable(false);
        f2.setLayout(null);
        f2.add(b5);
        f2.add(b9);
        f2.add(b10);
        f3.setSize(400, 300);
        f3.setResizable(false);
        f3.setLayout(null);
        f3.add(b6);
        f3.add(b11);
        f3.add(b12);
        f4.setSize(400,300);
        f4.setResizable(false);
        f4.setLayout(null);
        f4.add(nume);
        f4.add(descriere);
        f4.add(t1);
        f4.add(t2);
        f4.add(adaugare);
        f1.setMenuBar(mb);
        f2.setMenuBar(mb1);
        f3.setMenuBar(mb2);
        f4.setMenuBar(mb3);
        f5.setMenuBar(mb4);
        f6.setMenuBar(mb5);
        f7.setMenuBar(mb6);
        f8.setMenuBar(mb7);
        f9.setMenuBar(mb8);
        f10.setMenuBar(mb9);
        f11.setMenuBar(mb10);
        f12.setMenuBar(mb11);
        infor.setLayout(null);
        infor.setResizable(false);
        infor.add(in);
        infor.setSize(250,250);
        infor.setLocation(x, y);
        f5.setLayout(null);
        //f6.setLayout(null);
        f7.setLayout(null);
        f8.setLayout(null);
        //f9.setLayout(null);
        f10.setLayout(null);
        f11.setLayout(null);
        //f12.setLayout(null);
        f5.setSize(400,300);
        f6.setSize(400,300);
        f7.setSize(400,300);
        f8.setSize(400,300);
        f9.setSize(400,300);
        f10.setSize(400,300);
        f11.setSize(400,300);
        f12.setSize(400,300);
        f5.setResizable(false);
        f6.setResizable(false);
        f7.setResizable(false);
        f8.setResizable(false);
        f9.setResizable(false);
        f10.setResizable(false);
        f11.setResizable(false);
        f12.setResizable(false);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                f1.setLayout(null);
                f1.setVisible(true);
            }
        });
        f1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f1.dispose();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                f2.setLayout(null);
                f2.setVisible(true);
            }
        });
        f2.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f2.dispose();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                f3.setLayout(null);
                f3.setVisible(true);

            }
        });
        f3.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f3.dispose();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f4.setLayout(null);
                f4.setVisible(true);

            }
        });
        f4.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f4.dispose();
            }
        });
        f5.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f5.dispose();
            }
        });
        f6.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f6.dispose();
            }
        });
        f7.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f7.dispose();
            }
        });
        f8.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f8.dispose();
            }
        });
        f9.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f9.dispose();
            }
        });
        f10.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f10.dispose();
            }
        });
        f11.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f11.dispose();
            }
        });
        f12.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                f12.dispose();
            }
        });
        inf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                infor.setVisible(true);
            }
        });
        infor.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                infor.dispose();
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f7.setVisible(true);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f10.setVisible(true);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f5.setVisible(true);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f6.setVisible(true);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f8.setVisible(true);
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f9.setVisible(true);
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f11.setVisible(true);
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f12.setVisible(true);
            }
        });
        prin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f.setVisible(true);

            }
        });
        prin1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f.setVisible(true);

            }
        });
        prin2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f.setVisible(true);

            }
        });
        prin3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f.setVisible(true);

            }
        });
        prin4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f.setVisible(true);

            }
        });
        i.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f4.setVisible(true);
            }
        });
        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f4.setVisible(true);
            }
        });
        i2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f4.setVisible(true);
            }
        });
        i3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f4.setVisible(true);
            }
        });
        i4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f4.setVisible(true);
            }
        });
        i5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f4.setVisible(true);
            }
        });
        i6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f4.setVisible(true);
            }
        });
        i7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f4.setVisible(true);
            }
        });
        i8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f4.setVisible(true);
            }
        });
        i9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f4.setVisible(true);
            }
        });
        i10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f4.setVisible(true);
            }
        });
        i11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f4.setVisible(true);
            }
        });
        i12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f4.setVisible(true);
            }
        });
        o.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f5.setVisible(true);
            }
        });
        o1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f5.setVisible(true);
            }
        });
        o2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f5.setVisible(true);
            }
        });
        o3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f5.setVisible(true);
            }
        });
        o4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f5.setVisible(true);
            }
        });
        o5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f5.setVisible(true);
            }
        });
        o6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f5.setVisible(true);
            }
        });
        o7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f5.setVisible(true);
            }
        });
        o8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f5.setVisible(true);
            }
        });
        o9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f5.setVisible(true);
            }
        });
        o10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f5.setVisible(true);
            }
        });
        o11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f5.setVisible(true);
            }
        });
        o12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f5.setVisible(true);
            }
        });
        w.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f6.setVisible(true);
            }
        });
        w1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f6.setVisible(true);
            }
        });
        w2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f6.setVisible(true);
            }
        });
        w3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f6.setVisible(true);
            }
        });
        w4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f6.setVisible(true);
            }
        });
        w5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f6.setVisible(true);
            }
        });
        w6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f6.setVisible(true);
            }
        });
        w7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f6.setVisible(true);
            }
        });
        w8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f6.setVisible(true);
            }
        });
        w9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f6.setVisible(true);
            }
        });
        w10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f6.setVisible(true);
            }
        });
        w11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f6.setVisible(true);
            }
        });
        w12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f6.setVisible(true);
            }
        });
        p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f7.setVisible(true);
            }
        });
        p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f7.setVisible(true);
            }
        });
        p2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f7.setVisible(true);
            }
        });
        p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f7.setVisible(true);
            }
        });
        p4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f7.setVisible(true);
            }
        });
        p5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f7.setVisible(true);
            }
        });
        p6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f7.setVisible(true);
            }
        });
        p7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f7.setVisible(true);
            }
        });
        p8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f7.setVisible(true);
            }
        });
        p9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f7.setVisible(true);
            }
        });
        p10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f7.setVisible(true);
            }
        });
        p11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f7.setVisible(true);
            }
        });
        p12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f7.setVisible(true);
            }
        });
        u.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f8.setVisible(true);
            }
        });
        u1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f8.setVisible(true);
            }
        });
        u2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f8.setVisible(true);
            }
        });
        u3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f8.setVisible(true);
            }
        });
        u4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f8.setVisible(true);
            }
        });
        u5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f8.setVisible(true);
            }
        });
        u6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f8.setVisible(true);
            }
        });
        u7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f8.setVisible(true);
            }
        });
        u8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f8.setVisible(true);
            }
        });
        u9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f8.setVisible(true);
            }
        });
        u10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f8.setVisible(true);
            }
        });
        u11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f8.setVisible(true);
            }
        });
        u12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f8.setVisible(true);
            }
        });
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f9.setVisible(true);
            }
        });
        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f9.setVisible(true);
            }
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f9.setVisible(true);
            }
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f9.setVisible(true);
            }
        });
        a4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f9.setVisible(true);
            }
        });
        a5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f9.setVisible(true);
            }
        });
        a6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f9.setVisible(true);
            }
        });
        a7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f9.setVisible(true);
            }
        });
        a8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f9.setVisible(true);
            }
        });
        a9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f9.setVisible(true);
            }
        });
        a10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f9.setVisible(true);
            }
        });
        a11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f9.setVisible(true);
            }
        });
        a12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f9.setVisible(true);
            }
        });
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f10.setVisible(true);
            }
        });
        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f10.setVisible(true);
            }
        });
        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f10.setVisible(true);
            }
        });
        r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f10.setVisible(true);
            }
        });
        r4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f10.setVisible(true);
            }
        });
        r5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f10.setVisible(true);
            }
        });
        r6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f10.setVisible(true);
            }
        });
        r7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f10.setVisible(true);
            }
        });
        r8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f10.setVisible(true);
            }
        });
        r9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f10.setVisible(true);
            }
        });
        r10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f10.setVisible(true);
            }
        });
        r11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f10.setVisible(true);
            }
        });
        r12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f10.setVisible(true);
            }
        });
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f11.setVisible(true);
            }
        });
        q1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f11.setVisible(true);
            }
        });
        q2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f11.setVisible(true);
            }
        });
        q3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f11.setVisible(true);
            }
        });
        q4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f11.setVisible(true);
            }
        });
        q5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f11.setVisible(true);
            }
        });
        q6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f11.setVisible(true);
            }
        });
        q7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f11.setVisible(true);
            }
        });
        q8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f11.setVisible(true);
            }
        });
        q9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f11.setVisible(true);
            }
        });
        q10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f11.setVisible(true);
            }
        });
        q11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f11.setVisible(true);
            }
        });
        q12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f11.setVisible(true);
            }
        });
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                f12.setVisible(true);
            }
        });
        s1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.dispose();
                f12.setVisible(true);
            }
        });
        s2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.dispose();
                f12.setVisible(true);
            }
        });
        s3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.dispose();
                f12.setVisible(true);
            }
        });
        s4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infor.dispose();
                f12.setVisible(true);
            }
        });
        s5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.dispose();
                f12.setVisible(true);
            }
        });
        s6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f7.dispose();
                f12.setVisible(true);
            }
        });
        s7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f8.dispose();
                f12.setVisible(true);
            }
        });
        s8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f9.dispose();
                f12.setVisible(true);
            }
        });
        s9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f10.dispose();
                f12.setVisible(true);
            }
        });
        s10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f11.dispose();
                f12.setVisible(true);
            }
        });
        s11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f12.dispose();
                f12.setVisible(true);
            }
        });
        s12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.dispose();
                f12.setVisible(true);
            }
        });

        ManagerCursCSV manager = new ManagerCursCSV();
        Label curs_adaugat = new Label("Cursul a fost adaugat!");
        Label student_adaugat = new Label("Studentul a fost adaugat!");
        Label profesor_adaugat = new Label("Profesorul a fost adaugat!");
        Label curs_modificat = new Label("Cursul a fost modificat!");
        Label student_modificat = new Label("Studentul a fost modificat!");
        Label profesor_modificat = new Label("Profesorul a fost modificat!");
        Label eroare1 = new Label("Eroare! Nu s-au introdus date corecte!");
        Label eroare2 = new Label("Eroare! Nu s-au introdus date corecte!");
        Label eroare3 = new Label("Eroare! Nu s-au introdus date corecte!");
        Label eroare4 = new Label("Eroare! Nu s-au introdus date corecte!");
        Label eroare5 = new Label("Eroare! Nu s-au introdus date corecte!");
        Label eroare6 = new Label("Eroare! Nu s-au introdus date corecte!");
        Label lista_goala1 = new Label("Eroare! Lista e goala!");
        Label lista_goala2 = new Label("Eroare! Lista e goala!");
        Label lista_goala3 = new Label("Eroare! Lista e goala!");
        curs_adaugat.setBounds(10,200, 200,60);
        student_adaugat.setBounds(10,200,200,60);
        profesor_adaugat.setBounds(10,200,200,60);
        curs_modificat.setBounds(10,200,200,60);
        student_modificat.setBounds(10,200,200,60);
        profesor_modificat.setBounds(10,200,200,60);
        eroare1.setBounds(10,200,200,30);
        eroare2.setBounds(10,200,200,30);
        eroare3.setBounds(10,200,200,30);
        eroare4.setBounds(10,200,200,30);
        eroare5.setBounds(10,200,200,30);
        eroare6.setBounds(10,200,200,30);
        lista_goala1.setBounds(10,230,200,60);
        lista_goala2.setBounds(10,230,200,60);
        lista_goala3.setBounds(10,230,200,60);
        f4.add(curs_adaugat);
        f4.add(eroare1);
        f7.add(student_adaugat);
        f7.add(eroare2);
        f10.add(profesor_adaugat);
        f10.add(eroare3);
        f5.add(curs_modificat);
        f5.add(eroare4);
        f5.add(lista_goala1);
        f8.add(student_modificat);
        f8.add(eroare5);
        f8.add(lista_goala2);
        f11.add(profesor_modificat);
        f11.add(eroare6);
        f11.add(lista_goala3);
        curs_adaugat.setVisible(false);
        curs_modificat.setVisible(false);
        student_adaugat.setVisible(false);
        student_modificat.setVisible(false);
        profesor_adaugat.setVisible(false);
        profesor_modificat.setVisible(false);
        eroare1.setVisible(false);
        eroare2.setVisible(false);
        eroare3.setVisible(false);
        eroare4.setVisible(false);
        eroare5.setVisible(false);
        eroare6.setVisible(false);
        lista_goala1.setVisible(false);
        lista_goala2.setVisible(false);
        lista_goala3.setVisible(false);

        adaugare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = t1.getText();
                String descriere = t2.getText();
                String curs = nume + "," + descriere;
                if(nume.equals("") && descriere.equals(""))
                {
                    try{
                        eroare1.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException v)
                    {
                        v.printStackTrace();
                    }
                }
                Curs c1 = new Curs(nume, descriere);
                manager.AddCurs(c1);
                manager.ScrieCursuriInFisier();
                choice_curs.add(curs);
                try{
                    curs_adaugat.setVisible(true);
                    Thread.currentThread().sleep(1000);
                    curs_adaugat.setVisible(false);
                }catch (InterruptedException e1)
                {
                    e1.printStackTrace();
                }
               t1.setText("");
               t2.setText("");
            }
        });

        adaugare1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = t3.getText();
                String prenume = t4.getText();
                int grupa = Integer.parseInt(t5.getText());
                String student = nume + ";" + prenume + ";" + grupa;
                if(nume.equals("") && prenume.equals("") || t5.equals(""))
                {
                    try{
                        eroare2.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException v)
                    {
                        v.printStackTrace();
                    }
                }
                Student s1 = new Student(nume,prenume,grupa);
                manager.AddStudent(s1);
                manager.ScrieCursuriInFisier();
                choice_student.add(student);
                try{
                    student_adaugat.setVisible(true);
                    Thread.currentThread().sleep(1000);
                    student_adaugat.setVisible(false);
                }catch (InterruptedException e1)
                {
                    e1.printStackTrace();
                }
                t3.setText("");
                t4.setText("");
                t5.setText("");
            }
        });

        adaugare2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = t6.getText();
                String prenume = t7.getText();
                String prof = nume + ";" + prenume;
                if(nume.equals("") && prenume.equals(""))
                {
                    try{
                        eroare3.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException v)
                    {
                        v.printStackTrace();
                    }
                }
                Profesor p1 = new Profesor(nume,prenume);
                manager.AddProfesor(p1);
                manager.ScrieCursuriInFisier();
                choice_prof.add(prof);
                try{
                    profesor_adaugat.setVisible(true);
                    Thread.currentThread().sleep(1000);
                    profesor_adaugat.setVisible(false);
                }catch (InterruptedException e1)
                {
                    e1.printStackTrace();
                }
                t6.setText("");
                t7.setText("");
            }
        });

        modifica1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = t8.getText();
                String descriere = t9.getText();
                if(nume.equals("") && descriere.equals(""))
                {
                    try{
                        eroare4.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                }
                if(choice_curs.getItemCount() == 0)
                {
                    try{
                        lista_goala1.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException e3)
                    {
                        e3.printStackTrace();
                    }
                }
                String str = choice_curs.getSelectedItem();
                String[] split = str.split(",");
                Curs cs1 = new Curs(split[0], split[1].trim());
                Curs cs2 = new Curs(nume, descriere);
                int index = choice_curs.getSelectedIndex();
                choice_curs.remove(index);
                manager.UpdateCurs(cs1,cs2);
                manager.ScrieCursuriInFisier();
                choice_curs.insert(nume + "," + descriere, index);
                try{
                    curs_modificat.setVisible(true);
                    Thread.currentThread().sleep(1000);
                    curs_modificat.setVisible(false);
                }catch (InterruptedException e2)
                {
                    e2.printStackTrace();
                }
                t8.setText("");
                t9.setText("");
            }
        });

        modifica2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = t10.getText();
                String prenume = t11.getText();
                int grupa = Integer.parseInt(t12.getText());
                if((nume.equals("") && prenume.equals("")) || t12.equals(""))
                {
                    try{
                        eroare5.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                }
                if(choice_student.getItemCount() == 0)
                {
                    try{
                        lista_goala2.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException e3)
                    {
                        e3.printStackTrace();
                    }
                }
                String str = choice_student.getSelectedItem();
                String[] split = str.split(";");
                Student st1 = new Student(split[0], split[1].trim(), Integer.parseInt(split[2].trim()));
                Student st2 = new Student(nume,prenume,grupa);
                int index = choice_student.getSelectedIndex();
                choice_student.remove(index);
                manager.UpdateStudent(st1,st2);
                manager.ScrieCursuriInFisier();
                choice_student.insert(nume + ";" + prenume + ";" + grupa, index);
                try{
                    student_modificat.setVisible(true);
                    Thread.currentThread().sleep(1000);
                    student_modificat.setVisible(false);
                }catch (InterruptedException e2)
                {
                    e2.printStackTrace();
                }
                t10.setText("");
                t11.setText("");
                t12.setText("");
            }
        });

        modifica3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume = t13.getText();
                String prenume = t14.getText();
                if(nume.equals("") && prenume.equals(""))
                {
                    try{
                        eroare6.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException e1)
                    {
                        e1.printStackTrace();
                    }
                }
                if(choice_prof.getItemCount() == 0)
                {
                    try{
                        lista_goala3.setVisible(true);
                        Thread.currentThread().sleep(2000);
                        System.exit(0);
                    }catch (InterruptedException e3)
                    {
                        e3.printStackTrace();
                    }
                }
                String str = choice_prof.getSelectedItem();
                String[] split = str.split(";");
                Profesor pf1 = new Profesor(split[0], split[1].trim());
                Profesor pf2 = new Profesor(nume,prenume);
                int index = choice_prof.getSelectedIndex();
                choice_prof.remove(index);
                manager.UpdateProfesor(pf1,pf2);
                manager.ScrieCursuriInFisier();
                choice_prof.insert(nume + ";" + prenume, index);
                try{
                    profesor_modificat.setVisible(true);
                    Thread.currentThread().sleep(1000);
                    profesor_modificat.setVisible(false);
                }catch (InterruptedException e2)
                {
                    e2.printStackTrace();
                }
                t13.setText("");
                t14.setText("");
            }
        });
        f6.addWindowListener(new WindowAdapter()
                             {
                                 @Override
                                 public void windowActivated(WindowEvent e) {
                                     ArrayList<Curs> cursuri = manager.PopuleazaCursuri(manager.PopuleazaProfesori(), manager.PopuleazaStudenti());
                                     Iterator<Curs> iterator = cursuri.iterator();
                                     String[] st1 = {"Nume","Descriere"};
                                     String[][] str1 = new String[cursuri.size()][2];
                                     while(iterator.hasNext())
                                     {
                                         for (int j = 0; j < cursuri.size(); j++)
                                         {
                                             Curs c = iterator.next();
                                             str1[j][0] = c.GetNume();
                                             str1[j][1] = c.GetDescriere();
                                         }
                                     }
                                     JTable jt1 = new JTable(str1,st1);
                                     jt1.setBounds(30,60,200,300);
                                     JScrollPane sp1 = new JScrollPane(jt1);
                                     f6.add(sp1);
                                 }
                             });
        f9.addWindowListener(new WindowAdapter()
        {
                    @Override
                    public void windowActivated(WindowEvent e) {
                        ArrayList<Student> students = manager.PopuleazaStudenti();
                        String[] st2 = {"Nume", "Prenume", "Grupa"};
                        Iterator<Student> iterator = students.iterator();
                        String[][] str2 = new String[students.size()][3];
                        while (iterator.hasNext()) {
                            for (int h = 0; h < students.size(); h++) {
                                Student st = iterator.next();
                                str2[h][0] = st.getNume();
                                str2[h][1] = st.getPrenume();
                                str2[h][2] = String.valueOf(st.getGrupa());
                            }
                        }
                        JTable jt2 = new JTable(str2, st2);
                        jt2.setBounds(30, 60, 200, 300);
                        JScrollPane sp2 = new JScrollPane(jt2);
                        f9.add(sp2);
                    }
                });

        f12.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                ArrayList<Profesor> profesors = manager.PopuleazaProfesori();
                String[] st3 = {"Nume","Prenume"};
                Iterator<Profesor> iterator = profesors.iterator();
                String[][] str3 = new String[profesors.size()][2];
                while(iterator.hasNext())
                {
                    for(int k = 0;k< profesors.size();k++)
                    {
                        Profesor pr = iterator.next();
                        str3[k][0] = pr.getNume();
                        str3[k][1] = pr.getPrenume();
                    }

                }
                JTable jt3 = new JTable(str3,st3);
                jt3.setBounds(30,60,200,300);
                JScrollPane sp3 = new JScrollPane(jt3);
                f12.add(sp3);
            }
        });

    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    }