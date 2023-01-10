import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.lang.*;
import java.util.*;
import classes.*;
import javax.swing.*;
public class Main {
    static Hospital h = new Hospital();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        new HospitalFr();
    }

    public static class HospitalFr extends JFrame implements ActionListener {
        private JButton pat, Doc, Ambu, Stf, Emg_pat, pharma, Exit1;
        private JPanel panel1;
        private Font myFont;

        public HospitalFr() {
            super("Hospital Management System");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            pat = new JButton("Patient Management");
            pat.setFont(myFont);
            pat.setBounds(350, 125, 300, 50);
            pat.setBackground(new Color(0xA9E5EF));
            pat.addActionListener(this);
            panel1.add(pat);

            Doc = new JButton("Doctor Management");
            Doc.setFont(myFont);
            Doc.setBounds(350, 200, 300, 50);
            Doc.setBackground(new Color(0xA9E5EF));
            Doc.addActionListener(this);
            panel1.add(Doc);

            Ambu = new JButton("Ambulance Section");
            Ambu.setFont(myFont);
            Ambu.setBounds(350, 275, 300, 50);
            Ambu.setBackground(new Color(0xA9E5EF));
            Ambu.addActionListener(this);
            panel1.add(Ambu);


            Stf = new JButton("Staff Management Section");
            Stf.setFont(myFont);
            Stf.setBounds(350, 350, 300, 50);
            Stf.setBackground(new Color(0xA9E5EF));
            Stf.addActionListener(this);
            panel1.add(Stf);


            Emg_pat = new JButton("Emergency Unit");
            Emg_pat.setFont(myFont);
            Emg_pat.setBounds(350, 425, 300, 50);
            Emg_pat.setBackground(new Color(0xA9E5EF));
            Emg_pat.addActionListener(this);
            panel1.add(Emg_pat);


            Exit1 = new JButton("Exit");
            Exit1.setFont(myFont);
            Exit1.setBounds(350, 625, 300, 50);
            Exit1.setBackground(new Color(0xD70303));
            Exit1.addActionListener(this);
            panel1.add(Exit1);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == pat) {
                PatFr e1 = new PatFr();
                e1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == Doc) {
                DocFr r1 = new DocFr();
                r1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == Ambu) {
                AmbuFr rf1 = new AmbuFr();
                rf1.setVisible(true);
                this.setVisible(false);

            } else if (ae.getSource() == Stf) {
                StfFr fadd1 = new StfFr();
                fadd1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == Emg_pat) {
                Emg_patFr fadd1 = new Emg_patFr();
                fadd1.setVisible(true);
                this.setVisible(false);
            }
//            else if (ae.getSource() == pharma) {
//                StfFrfadd1 = new StfFr();
//                fadd1.setVisible(true);
//                this.setVisible(false);
//            }
            else if (ae.getSource() == Exit1) {
                this.dispose();
                System.exit(1);
            }
        }
    }

    public static class PatFr extends JFrame implements ActionListener {

        private JButton addpat, revpat, SowAll, srcpat, back;
        private JPanel panel1;
        private Font myFont;
        private int opt1;

        public PatFr() {
            super("Patient Management");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            addpat = new JButton("Insert New Patient");
            addpat.setFont(myFont);
            addpat.setBounds(350, 125, 300, 50);
            addpat.setBackground(new Color(0xA9E5EF));
            addpat.addActionListener(this);
            panel1.add(addpat);


            revpat = new JButton("Remove Existing Patient");
            revpat.setFont(myFont);
            revpat.setBounds(350, 225, 300, 50);
            revpat.setBackground(new Color(0xA9E5EF));
            revpat.addActionListener(this);
            panel1.add(revpat);

            SowAll = new JButton("Show All Patient");
            SowAll.setFont(myFont);
            SowAll.setBounds(350, 325, 300, 50);
            SowAll.setBackground(new Color(0xA9E5EF));
            SowAll.addActionListener(this);
            panel1.add(SowAll);

            srcpat = new JButton("Search Patient");
            srcpat.setFont(myFont);
            srcpat.setBounds(350, 425, 300, 50);
            srcpat.setBackground(new Color(0xA9E5EF));
            srcpat.addActionListener(this);
            panel1.add(srcpat);

            back = new JButton("Go Back");
            back.setFont(myFont);
            back.setBounds(350, 525, 300, 50);
            back.setBackground(new Color(0xA9E5EF));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();

            if (ae.getSource() == addpat) {
                addpatFr e1 = new addpatFr();
                e1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == revpat) {
                revpatFr r1 = new revpatFr();
                r1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == SowAll) {
                ShowAllpatFr rf1 = new ShowAllpatFr();
                rf1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == srcpat) {
                srcpatFr fadd1 = new srcpatFr();
                fadd1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == back) {
                HospitalFr hf1 = new HospitalFr();
                hf1.setVisible(true);
                this.setVisible(false);
            }

        }
    }

    static class addpatFr extends JFrame implements ActionListener {
        private JTextField patName, patID, patDiseases, patSex, patAdmitstatus, patAge, patNIDNumber;
        private JButton AddNewpat, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel patname, patid, patdiseases, patsex, patadmitstatus, patage, patnidnumber;

        public addpatFr() {
            super("Insert Patient");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);


            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));


            patName = new JTextField("Patient's name");
            patName.setFont(myFont);
            patName.setBounds(300, 20, 400, 40);
            panel1.add(patName);

            patID = new JTextField("Patient ID");
            patID.setFont(myFont);
            patID.setBounds(300, 70, 400, 40);
            panel1.add(patID);

            patSex = new JTextField("Patient Sex");
            patSex.setFont(myFont);
            patSex.setBounds(300, 120, 400, 40);
            panel1.add(patSex);

            patAge = new JTextField("Patient age");
            patAge.setFont(myFont);
            patAge.setBounds(300, 170, 400, 40);
            panel1.add(patAge);

            patDiseases = new JTextField("Patient Disease");
            patDiseases.setFont(myFont);
            patDiseases.setBounds(300, 220, 400, 40);
            panel1.add(patDiseases);

            patAdmitstatus = new JTextField("Patient Admit Status");
            patAdmitstatus.setBounds(300, 270, 400, 40);
            panel1.add(patAdmitstatus);

            patNIDNumber = new JTextField("patNIDNumber");
            patNIDNumber.setBounds(300, 320, 400, 40);
            panel1.add(patNIDNumber);

            AddNewpat = new JButton("Insert New Patient");
            AddNewpat.setFont(myFont);
            AddNewpat.setBounds(400, 400, 200, 30);
            AddNewpat.setBackground(new Color(0x058CA2));
            AddNewpat.addActionListener(this);
            panel1.add(AddNewpat);

            patname = new JLabel("Patient name");
            patname.setFont(myFont);
            patname.setBounds(50, 20, 150, 40);
            panel1.add(patname);

            patid = new JLabel("Patient ID");
            patid.setFont(myFont);
            patid.setBounds(50, 70, 150, 40);
            panel1.add(patid);

            patsex = new JLabel("Patient SEX");
            patsex.setFont(myFont);
            patsex.setBounds(50, 120, 150, 40);
            panel1.add(patsex);

            patage = new JLabel("Patient age");
            patage.setFont(myFont);
            patage.setBounds(50, 170, 150, 40);
            panel1.add(patage);

            patdiseases = new JLabel("Patient Diseases ");
            patdiseases.setFont(myFont);
            patdiseases.setBounds(50, 220, 150, 40);
            panel1.add(patdiseases);

            patadmitstatus = new JLabel("Patient Admit Status");
            patadmitstatus.setFont(myFont);
            patadmitstatus.setBounds(50, 270, 150, 40);
            panel1.add(patadmitstatus);

            patnidnumber = new JLabel("Patient nid number");
            patnidnumber.setFont(myFont);
            patnidnumber.setBounds(50, 320, 150, 40);
            panel1.add(patnidnumber);


            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(400, 500, 200, 30);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            String a1 = patName.getText();
            String a2 = patID.getText();
            String a3 = patDiseases.getText();
            String a4 = patsex.getText();
            String a5 = patAdmitstatus.getText();
            String a6 = patAge.getText();
            String a7 = patNIDNumber.getText();

            if (ae.getSource() == AddNewpat) {
                Patient p1 = new Patient(a2, a1, a3, a4, a5, a7);
                h.InsertPatient(p1);
            } else if (ae.getSource() == back) {
                PatFr p1 = new PatFr();
                p1.setVisible(true);
                this.setVisible(false);

            }

        }
    }

    static class DocFr extends JFrame implements ActionListener {

        private JButton addDoc, revDoc, SowAll, srcDoc, back;
        private JPanel panel1;
        private Font myFont;
        private int opt1;

        public DocFr() {
            super("Doctor Management");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            addDoc = new JButton("Insert New Doctor");
            addDoc.setFont(myFont);
            addDoc.setBounds(350, 125, 300, 50);
            addDoc.setBackground(new Color(0xA9E5EF));
            addDoc.addActionListener(this);
            panel1.add(addDoc);


            revDoc = new JButton("Remove Existing Doctor");
            revDoc.setFont(myFont);
            revDoc.setBounds(350, 225, 300, 50);
            revDoc.setBackground(new Color(0xA9E5EF));
            revDoc.addActionListener(this);
            panel1.add(revDoc);

            SowAll = new JButton("Show All Doctor");
            SowAll.setFont(myFont);
            SowAll.setBounds(350, 325, 300, 50);
            SowAll.setBackground(new Color(0xA9E5EF));
            SowAll.addActionListener(this);
            panel1.add(SowAll);

            srcDoc = new JButton("Search Doctor");
            srcDoc.setFont(myFont);
            srcDoc.setBounds(350, 425, 300, 50);
            srcDoc.setBackground(new Color(0xA9E5EF));
            srcDoc.addActionListener(this);
            panel1.add(srcDoc);

            back = new JButton("Go Back");
            back.setFont(myFont);
            back.setBounds(350, 525, 300, 50);
            back.setBackground(new Color(0xA9E5EF));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == addDoc) {
                addDocFr e1 = new addDocFr();
                e1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == revDoc) {
                revDocFr r1 = new revDocFr();
                r1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == SowAll) {
                ShowAlldocFr rf1 = new ShowAlldocFr();
                rf1.setVisible(true);
                this.setVisible(false);

            } else if (ae.getSource() == srcDoc) {
                srchDocFr fadd1 = new srchDocFr();
                fadd1.setVisible(true);
                this.setVisible(false);


            } else if (ae.getSource() == back) {
                HospitalFr hf1 = new HospitalFr();
                hf1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class addDocFr extends JFrame implements ActionListener {
        private JTextField DocName, DocId, DocRoom, DocQualification, DocSpecialist, DocAppoinment;
        private JButton AddNewDoc, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel Docname, Docid, Docroom, Docqualification, Docspecialist, Docappoinment;

        public addDocFr() {
            super("Insert Doctor");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);


            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));


            DocName = new JTextField("Doctor Name");
            DocName.setFont(myFont);
            DocName.setBounds(300, 20, 400, 50);
            panel1.add(DocName);

            DocId = new JTextField("Doctor Id");
            DocId.setFont(myFont);
            DocId.setBounds(300, 80, 400, 50);
            panel1.add(DocId);

            DocRoom = new JTextField("Doctor Room No");
            DocRoom.setFont(myFont);
            DocRoom.setBounds(300, 140, 400, 50);
            panel1.add(DocRoom);

            DocQualification = new JTextField("Doctor Qualification");
            DocQualification.setFont(myFont);
            DocQualification.setBounds(300, 200, 400, 50);
            panel1.add(DocQualification);

            DocSpecialist = new JTextField("Doctor Specialist");
            DocSpecialist.setFont(myFont);
            DocSpecialist.setBounds(300, 260, 400, 50);
            panel1.add(DocSpecialist);

            DocAppoinment = new JTextField("Enter Doctor Appointment Time");
            DocAppoinment.setFont(myFont);
            DocAppoinment.setBounds(300, 320, 400, 50);
            panel1.add(DocAppoinment);

            AddNewDoc = new JButton("Insert new Doctor");
            AddNewDoc.setFont(myFont);
            AddNewDoc.setBounds(400, 400, 200, 40);
            AddNewDoc.setBackground(new Color(0x058CA2));
            AddNewDoc.addActionListener(this);
            panel1.add(AddNewDoc);

            Docname = new JLabel("Doctor Name");
            Docname.setFont(myFont);
            Docname.setBounds(50, 20, 150, 50);
            panel1.add(Docname);

            Docid = new JLabel("Doctor ID");
            Docid.setFont(myFont);
            Docid.setBounds(50, 80, 150, 50);
            panel1.add(Docid);

            Docroom = new JLabel("Doctor Room No.");
            Docroom.setFont(myFont);
            Docroom.setBounds(50, 130, 150, 50);
            panel1.add(Docroom);

            Docqualification = new JLabel("Doctor Qualification");
            Docqualification.setFont(myFont);
            Docqualification.setBounds(50, 190, 150, 50);
            panel1.add(Docqualification);

            Docspecialist = new JLabel("Doctor Speciality Division");
            Docspecialist.setFont(myFont);
            Docspecialist.setBounds(50, 250, 150, 50);
            panel1.add(Docspecialist);

            Docappoinment = new JLabel("Doctor Appointment Time");
            Docappoinment.setFont(myFont);
            Docappoinment.setBounds(50, 310, 150, 50);
            panel1.add(Docappoinment);


            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(400, 500, 200, 40);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            String c1 = DocName.getText();
            String c2 = DocId.getText();
            String c3 = DocRoom.getText();
            String c4 = DocQualification.getText();
            String c5 = DocSpecialist.getText();
            String c6 = DocAppoinment.getText();
            if (ae.getSource() == AddNewDoc) {
                Doctor d1 = new Doctor(c1, c2, c3, c4, c5, c6);
                h.InsertDoctor(d1);
            } else if (ae.getSource() == back) {
                DocFr d1 = new DocFr();
                d1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class StfFr extends JFrame implements ActionListener {

        private JButton addStf, revStf, SowAll, srcStf, back;
        private JPanel panel1;
        private Font myFont;
        private int opt1;

        public StfFr() {
            super("Staff  Management");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            addStf = new JButton("Insert New Staff");
            addStf.setFont(myFont);
            addStf.setBounds(350, 125, 300, 50);
            addStf.setBackground(new Color(0xA9E5EF));
            addStf.addActionListener(this);
            panel1.add(addStf);


            revStf = new JButton("Remove Existing Staff");
            revStf.setFont(myFont);
            revStf.setBounds(350, 225, 300, 50);
            revStf.setBackground(new Color(0xA9E5EF));
            revStf.addActionListener(this);
            panel1.add(revStf);

            SowAll = new JButton("Show All Staff");
            SowAll.setFont(myFont);
            SowAll.setBounds(350, 325, 300, 50);
            SowAll.setBackground(new Color(0xA9E5EF));
            SowAll.addActionListener(this);
            panel1.add(SowAll);

            srcStf = new JButton("Search Staff");
            srcStf.setFont(myFont);
            srcStf.setBounds(350, 425, 300, 50);
            srcStf.setBackground(new Color(0xA9E5EF));
            srcStf.addActionListener(this);
            panel1.add(srcStf);

            back = new JButton("Go Back");
            back.setFont(myFont);
            back.setBounds(350, 525, 300, 50);
            back.setBackground(new Color(0xA9E5EF));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == addStf) {
                addStfFr e1 = new addStfFr();
                e1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == revStf) {
                revStfFr r1 = new revStfFr();
                r1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == SowAll) {
                ShowAllstaffFr rf1 = new ShowAllstaffFr();
                rf1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == srcStf) {
                srcStfFr fadd1 = new srcStfFr();
                fadd1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == back) {
                HospitalFr Stf1 = new HospitalFr();
                Stf1.setVisible(true);
                this.setVisible(false);
            }

        }
    }

    static class addStfFr extends JFrame implements ActionListener {
        private JTextField staff_ID, staff_Name, staff_Post, staff_Salary, staff_PhoneNumber;
        private JButton addNewstf, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel staff_id, staff_name, staff_post, staff_salary, staff_phoneNumber;

        public addStfFr() {
            super("Insert STAFF");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);


            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));


            staff_ID = new JTextField("Enter Staff ID");
            staff_ID.setFont(myFont);
            staff_ID.setBounds(300, 20, 400, 40);
            panel1.add(staff_ID);

            staff_Name = new JTextField("Enter Staff Name");
            staff_Name.setFont(myFont);
            staff_Name.setBounds(300, 70, 400, 40);
            panel1.add(staff_Name);

            staff_Post = new JTextField("Post of Stuff");
            staff_Post.setFont(myFont);
            staff_Post.setBounds(300, 120, 400, 40);
            panel1.add(staff_Post);

            staff_Salary = new JTextField("Enter the Salary");
            staff_Salary.setFont(myFont);
            staff_Salary.setBounds(300, 170, 400, 40);
            panel1.add(staff_Salary);


            staff_PhoneNumber = new JTextField("Enter Staff Mobile No.");
            staff_PhoneNumber.setFont(myFont);
            staff_PhoneNumber.setBounds(300, 220, 400, 40);
            panel1.add(staff_PhoneNumber);

            addNewstf = new JButton("Add New Stuff");
            addNewstf.setFont(myFont);
            addNewstf.setBounds(400, 400, 200, 70);
            addNewstf.setBackground(new Color(0x058CA2));
            addNewstf.addActionListener(this);
            panel1.add(addNewstf);

            staff_id = new JLabel("Staff ID");
            staff_id.setFont(myFont);
            staff_id.setBounds(50, 20, 150, 40);
            panel1.add(staff_id);

            staff_name = new JLabel("Staff Name");
            staff_name.setFont(myFont);
            staff_name.setBounds(50, 70, 150, 40);
            panel1.add(staff_name);

            staff_post = new JLabel("Post of Stuff");
            staff_post.setFont(myFont);
            staff_post.setBounds(50, 120, 150, 40);
            panel1.add(staff_post);


            staff_salary = new JLabel("Staff Salary");
            staff_salary.setFont(myFont);
            staff_salary.setBounds(50, 170, 150, 40);
            panel1.add(staff_salary);


            staff_phoneNumber = new JLabel("Staff Mobile No.");
            staff_phoneNumber.setFont(myFont);
            staff_phoneNumber.setBounds(50, 220, 150, 40);
            panel1.add(staff_phoneNumber);


            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(400, 500, 200, 40);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            String a1 = staff_ID.getText();
            String a2 = staff_Name.getText();
            String a3 = staff_Post.getText();
            String a4 = staff_Salary.getText();
            String a5 = staff_PhoneNumber.getText();

            if (ae.getSource() == addNewstf) {
                Staff s1 = new Staff(a1, a2, a3, Double.parseDouble(a4), a5);
                h.InsertStaff(s1);
            } else if (ae.getSource() == back) {
                StfFr s1 = new StfFr();
                s1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class AmbuFr extends JFrame implements ActionListener {

        private JButton addAmbu, revAmbu, SowAll, srcAmbu, back;
        private JPanel panel1;
        private Font myFont;
        private int opt1;

        public AmbuFr() {
            super("Ambulance Management");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            addAmbu = new JButton("Insert New Ambulance ");
            addAmbu.setFont(myFont);
            addAmbu.setBounds(350, 125, 300, 50);
            addAmbu.setBackground(new Color(0xA9E5EF));
            addAmbu.addActionListener(this);
            panel1.add(addAmbu);


            revAmbu = new JButton("Remove Existing Ambulance ");
            revAmbu.setFont(myFont);
            revAmbu.setBounds(350, 225, 300, 50);
            revAmbu.setBackground(new Color(0xA9E5EF));
            revAmbu.addActionListener(this);
            panel1.add(revAmbu);

            SowAll = new JButton("Show All Ambulance ");
            SowAll.setFont(myFont);
            SowAll.setBounds(350, 325, 300, 50);
            SowAll.setBackground(new Color(0xA9E5EF));
            SowAll.addActionListener(this);
            panel1.add(SowAll);

            srcAmbu = new JButton("Search Ambulance ");
            srcAmbu.setFont(myFont);
            srcAmbu.setBounds(350, 425, 300, 50);
            srcAmbu.setBackground(new Color(0xA9E5EF));
            srcAmbu.addActionListener(this);
            panel1.add(srcAmbu);

            back = new JButton("Go Back");
            back.setFont(myFont);
            back.setBounds(350, 525, 300, 50);
            back.setBackground(new Color(0xA9E5EF));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == addAmbu) {
                addAmbuFr e1 = new addAmbuFr();
                e1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == revAmbu) {
                revAmbuFr r1 = new revAmbuFr();
                r1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == SowAll) {
                ShowAllambuFr rf1 = new ShowAllambuFr();
                rf1.setVisible(true);
                this.setVisible(false);

            } else if (ae.getSource() == srcAmbu) {
                srcAmbuFr fadd1 = new srcAmbuFr();
                fadd1.setVisible(true);
                this.setVisible(false);


            } else if (ae.getSource() == back) {
                HospitalFr amb1 = new HospitalFr();
                amb1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class addAmbuFr extends JFrame implements ActionListener {
        private JTextField Driver_Name, Phone_Number, Id, Ambulance_Num;
        private JButton AddNewAmbu, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel driver_name, phone_number, id, ambulance_num;

        public addAmbuFr() {
            super("Add New Ambulance");
            this.setSize(1000, 1000);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);


            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));


            Driver_Name = new JTextField("Enter the Driver's Name");
            Driver_Name.setFont(myFont);
            Driver_Name.setBounds(300, 30, 400, 50);
            panel1.add(Driver_Name);

            Phone_Number = new JTextField("Driver's Mobile No.");
            Phone_Number.setFont(myFont);
            Phone_Number.setBounds(300, 90, 400, 50);
            panel1.add(Phone_Number);

            Id = new JTextField("Enter Driver's ID ");
            Id.setFont(myFont);
            Id.setBounds(300, 150, 400, 50);
            panel1.add(Id);

            Ambulance_Num = new JTextField("Ambulance Number");
            Ambulance_Num.setFont(myFont);
            Ambulance_Num.setBounds(300, 210, 400, 50);
            panel1.add(Ambulance_Num);


            AddNewAmbu = new JButton("Add New Ambulance");
            AddNewAmbu.setFont(myFont);
            AddNewAmbu.setBounds(400, 400, 200, 40);
            AddNewAmbu.setBackground(new Color(0x058CA2));
            AddNewAmbu.addActionListener(this);
            panel1.add(AddNewAmbu);

            driver_name = new JLabel("Enter Driver's Name");
            driver_name.setFont(myFont);
            driver_name.setBounds(50, 30, 150, 50);
            panel1.add(driver_name);

            phone_number = new JLabel("Driver's Mobile No.");
            phone_number.setFont(myFont);
            phone_number.setBounds(50, 90, 150, 50);
            panel1.add(phone_number);

            id = new JLabel("Enter Driver's ID");
            id.setFont(myFont);
            id.setBounds(50, 150, 150, 50);
            panel1.add(id);

            ambulance_num = new JLabel("Ambulance Number");
            ambulance_num.setFont(myFont);
            ambulance_num.setBounds(50, 210, 150, 50);
            panel1.add(ambulance_num);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(400, 500, 200, 40);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            String b1 = Driver_Name.getText();
            String b2 = Phone_Number.getText();
            String b3 = Id.getText();
            String b4 = Ambulance_Num.getText();
            if (ae.getSource() == AddNewAmbu) {
                Ambulance a1 = new Ambulance(b1, b2, b3, b4);
                h.InsertAmbulance(a1);
            } else if (ae.getSource() == back) {
                AmbuFr a1 = new AmbuFr();
                a1.setVisible(true);
                this.setVisible(false);
            }
        }


    }

    static class Emg_patFr extends JFrame implements ActionListener {

        private JButton addEmg_pat, revEmg_pat, SowAll, srcEmg_pat, back;
        private JPanel panel1;
        private Font myFont;
        private int opt1;

        public Emg_patFr() {
            super("Emergency Patient Management");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);


            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            addEmg_pat = new JButton("Insert New Emergency Patient");
            addEmg_pat.setFont(myFont);
            addEmg_pat.setBounds(350, 125, 300, 50);
            addEmg_pat.setBackground(new Color(0xA9E5EF));
            addEmg_pat.addActionListener(this);
            panel1.add(addEmg_pat);


            revEmg_pat = new JButton("Remove Existing Emergency Patient");
            revEmg_pat.setFont(myFont);
            revEmg_pat.setBounds(350, 225, 300, 50);
            revEmg_pat.setBackground(new Color(0xA9E5EF));
            revEmg_pat.addActionListener(this);
            panel1.add(revEmg_pat);

            SowAll = new JButton("Show Emergency Patient");
            SowAll.setFont(myFont);
            SowAll.setBounds(350, 325, 300, 50);
            SowAll.setBackground(new Color(0xA9E5EF));
            SowAll.addActionListener(this);
            panel1.add(SowAll);

            srcEmg_pat = new JButton("Search Emergency Patient");
            srcEmg_pat.setFont(myFont);
            srcEmg_pat.setBounds(350, 425, 300, 50);
            srcEmg_pat.setBackground(new Color(0xA9E5EF));
            srcEmg_pat.addActionListener(this);
            panel1.add(srcEmg_pat);

            back = new JButton("Go Back");
            back.setFont(myFont);
            back.setBounds(350, 525, 300, 50);
            back.setBackground(new Color(0xA9E5EF));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == addEmg_pat) {
                addEmg_patFr e1 = new addEmg_patFr();
                e1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == revEmg_pat) {
                revEmg_patFr r1 = new revEmg_patFr();
                r1.setVisible(true);
                this.setVisible(false);
            } else if (ae.getSource() == SowAll) {
                ShowAllEm_patFr rf1 = new ShowAllEm_patFr();
                rf1.setVisible(true);
                this.setVisible(false);

            } else if (ae.getSource() == srcEmg_pat) {
                srcEm_patFr fadd1 = new srcEm_patFr();
                fadd1.setVisible(true);
                this.setVisible(false);


            } else if (ae.getSource() == back) {
                HospitalFr emp1 = new HospitalFr();
                emp1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class addEmg_patFr extends JFrame implements ActionListener {
        private JTextField EmPatName, EmPatID, EmPatPhoneNumber, EmPatAddress, EmpatBloodGroup, EmPatProbType;
        private JButton AddNewEmg_pat, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel empatname, empatid, empataddress, empatbloodgroup, empatprobtype, empatphonenumber;

        public addEmg_patFr() {
            super("Add Emergency Patient");
            this.setSize(1000, 1000);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);


            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));


            EmPatName = new JTextField("Patient Name");
            EmPatName.setFont(myFont);
            EmPatName.setBounds(300, 20, 400, 40);
            panel1.add(EmPatName);

            EmPatID = new JTextField("Patient's ID");
            EmPatID.setFont(myFont);
            EmPatID.setBounds(300, 70, 400, 40);
            panel1.add(EmPatID);

            EmPatPhoneNumber = new JTextField("Mobile Number");
            EmPatPhoneNumber.setFont(myFont);
            EmPatPhoneNumber.setBounds(300, 120, 400, 40);
            panel1.add(EmPatPhoneNumber);

            EmPatAddress = new JTextField("Address");
            EmPatAddress.setFont(myFont);
            EmPatAddress.setBounds(300, 170, 400, 40);
            panel1.add(EmPatAddress);

            EmpatBloodGroup = new JTextField("Blood Group");
            EmpatBloodGroup.setFont(myFont);
            EmpatBloodGroup.setBounds(300, 220, 400, 40);
            panel1.add(EmpatBloodGroup);

            EmPatProbType = new JTextField("Enter Your Problem");
            EmPatProbType.setFont(myFont);
            EmPatProbType.setBounds(300, 270, 400, 40);
            panel1.add(EmPatProbType);

            AddNewEmg_pat = new JButton("Add New Emergency Patient's");
            AddNewEmg_pat.setFont(myFont);
            AddNewEmg_pat.setBounds(400, 400, 300, 40);
            AddNewEmg_pat.setBackground(new Color(0x058CA2));
            AddNewEmg_pat.addActionListener(this);
            panel1.add(AddNewEmg_pat);

            empatname = new JLabel("Enter Patient's Name");
            empatname.setFont(myFont);
            empatname.setBounds(50, 20, 150, 40);
            panel1.add(empatname);

            empatid = new JLabel("Patient's ID");
            empatid.setFont(myFont);
            empatid.setBounds(50, 70, 150, 40);
            panel1.add(empatid);

            empatphonenumber = new JLabel("Patient's Mobile No.");
            empatphonenumber.setFont(myFont);
            empatphonenumber.setBounds(50, 120, 150, 40);
            panel1.add(empatphonenumber);

            empataddress = new JLabel("Give Address");
            empataddress.setFont(myFont);
            empataddress.setBounds(50, 170, 150, 40);
            panel1.add(empataddress);

            empatbloodgroup = new JLabel("Blood Group");
            empatbloodgroup.setFont(myFont);
            empatbloodgroup.setBounds(50, 220, 150, 40);
            panel1.add(empatbloodgroup);

            empatprobtype = new JLabel("Enter Your Problem");
            empatprobtype.setFont(myFont);
            empatprobtype.setBounds(50, 270, 150, 40);
            panel1.add(empatprobtype);



            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(400, 500, 150, 40);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);


            this.add(panel1);
            this.setVisible(true);


        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            String a1 = EmPatName.getText();
            String a2 = EmPatID.getText();
            String a3 = EmPatPhoneNumber.getText();
            String a4 = EmPatAddress.getText();
            String a5 = EmpatBloodGroup.getText();
            String a6 = EmPatProbType.getText();


            if (ae.getSource() == AddNewEmg_pat) {
                Emergency n1;
                n1 = new Emergency(a1, a2, a3, a4, a5, a6);
                h.InsertEmergency(n1);
            } else if (ae.getSource() == back) {
                Emg_patFr p1 = new Emg_patFr();
                p1.setVisible(true);
                this.setVisible(false);

            }

        }
    }

    static class revpatFr extends JFrame implements ActionListener {
        private JTextField patID;
        private JButton Removepat, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel patiD;

        public revpatFr() {
            super("Remove Patient");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            patID = new JTextField("Enter Patient ID");
            patID.setFont(myFont);
            patID.setBounds(250, 100, 550, 50);
            panel1.add(patID);

            Removepat = new JButton("Remove Existing Patients");
            Removepat.setFont(myFont);
            Removepat.setBounds(250, 300, 500, 60);
            Removepat.setBackground(new Color(0x8CEEEB));
            Removepat.addActionListener(this);
            panel1.add(Removepat);

            patiD = new JLabel("Enter Patient's ID");
            patiD.setFont(myFont);
            patiD.setBounds(250, 50, 200, 50);
            panel1.add(patiD);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 400, 300, 60);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == Removepat) {
                for (int i = 0; i < Hospital.patient.length; i++) {
                    if (Hospital.patient[i] != null) {
                        if (Hospital.patient[i].getpatID().equals(patID.getText())) {
                            Hospital.patient[i] = null;
                            break;
                        }
                    }
                }
            } else if (ae.getSource() == back) {
                PatFr p1 = new PatFr();
                p1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class revDocFr extends JFrame implements ActionListener {
        private JTextField DId;
        private JButton Removedoc, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel did;

        public revDocFr() {
            super("Remove Doctor");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            DId = new JTextField("Enter Doctor ID");
            DId.setFont(myFont);
            DId.setBounds(250, 100, 550, 50);
            panel1.add(DId);

            Removedoc = new JButton("Remove Doctor");
            Removedoc.setFont(myFont);
            Removedoc.setBounds(250, 300, 500, 60);
            Removedoc.setBackground(new Color(0x8CEEEB));
            Removedoc.addActionListener(this);
            panel1.add(Removedoc);

            did = new JLabel("Enter Doctor ID");
            did.setFont(myFont);
            did.setBounds(250, 50, 200, 50);
            panel1.add(did);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 400, 300, 60);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {

            String command = ae.getActionCommand();
            if (ae.getSource() == Removedoc) {
                for (int i = 0; i < Hospital.doctor.length; i++) {
                    if (Hospital.doctor[i] != null) {
                        if (Hospital.doctor[i].getDId().equals(DId.getText())) {
                            Hospital.doctor[i] = null;
                            break;
                        }
                    }
                }
            } else if (ae.getSource() == back) {
                DocFr d1 = new DocFr();
                d1.setVisible(true);
                this.setVisible(false);

            }
        }
    }

    static class revEmg_patFr extends JFrame implements ActionListener {
        private JTextField EmPatID;
        private JButton RemovEmPat, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel empatid;

        public revEmg_patFr() {
            super("Remove Emergency Patient");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            EmPatID = new JTextField("Enter Emergency Patient's ID");
            EmPatID.setFont(myFont);
            EmPatID.setBounds(250, 100, 550, 50);
            panel1.add(EmPatID);

            RemovEmPat = new JButton("Remove Doctor");
            RemovEmPat.setFont(myFont);
            RemovEmPat.setBounds(250, 300, 500, 60);
            RemovEmPat.setBackground(new Color(0x8CEEEB));
            RemovEmPat.addActionListener(this);
            panel1.add(RemovEmPat);

            empatid = new JLabel("Enter Emergency Patient's ID");
            empatid.setFont(myFont);
            empatid.setBounds(250, 50, 200, 50);
            panel1.add(empatid);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 400, 300, 60);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == RemovEmPat) {
                for (int i = 0; i < Hospital.emergency.length; i++) {
                    if (Hospital.emergency[i] != null) {
                        if (Hospital.emergency[i].get_EmPatientId().equals(EmPatID.getText())) {
                            Hospital.emergency[i] = null;
                            break;
                        }
                    }
                }
            } else if (ae.getSource() == back) {
                Emg_patFr e1 = new Emg_patFr();
                e1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class revStfFr extends JFrame implements ActionListener {
        private JTextField staff_ID;
        private JButton RemovStaff, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel staff_id;

        public revStfFr() {
            super("Remove Staff");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            staff_ID = new JTextField("Enter Staff ID");
            staff_ID.setFont(myFont);
            staff_ID.setBounds(250, 100, 550, 50);
            panel1.add(staff_ID);

            RemovStaff = new JButton("Remove Staff");
            RemovStaff.setFont(myFont);
            RemovStaff.setBounds(250, 300, 500, 60);
            RemovStaff.setBackground(new Color(0x8CEEEB));
            RemovStaff.addActionListener(this);
            panel1.add(RemovStaff);

            staff_id = new JLabel("Enter Staff ID");
            staff_id.setFont(myFont);
            staff_id.setBounds(250, 50, 200, 50);
            panel1.add(staff_id);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 400, 300, 60);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == RemovStaff) {
                for (int i = 0; i < Hospital.staff.length; i++) {
                    if (Hospital.staff[i] != null) {
                        if (Hospital.staff[i].get_staff_ID().equals(staff_ID.getText())) {
                            Hospital.staff[i] = null;
                            break;
                        }
                    }
                }
            } else if (ae.getSource() == back) {
                StfFr s1 = new StfFr();
                s1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class revAmbuFr extends JFrame implements ActionListener {
        private JTextField Ambulance_Num;
        private JButton RemoveAmbu, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel ambulance_num;

        public revAmbuFr() {
            super("Remove Ambulance");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            Ambulance_Num = new JTextField("");
            Ambulance_Num.setFont(myFont);
            Ambulance_Num.setBounds(250, 100, 550, 50);
            panel1.add(Ambulance_Num);

            RemoveAmbu = new JButton("Remove Ambulance");
            RemoveAmbu.setFont(myFont);
            RemoveAmbu.setBounds(250, 300, 500, 60);
            RemoveAmbu.setBackground(new Color(0x8CEEEB));
            RemoveAmbu.addActionListener(this);
            panel1.add(RemoveAmbu);

            ambulance_num = new JLabel("Enter Ambulance Number");
            ambulance_num.setFont(myFont);
            ambulance_num.setBounds(250, 50, 200, 50);
            panel1.add(ambulance_num);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 400, 300, 60);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == RemoveAmbu) {
                for (int i = 0; i < Hospital.ambulance.length; i++) {
                    if (Hospital.ambulance[i] != null) {
                        if (Hospital.ambulance[i].get_Ambulance_Num().equals(Ambulance_Num.getText())) {
                            Hospital.ambulance[i] = null;
                            break;
                        }
                    }
                }
            } else if (ae.getSource() == back) {
                AmbuFr a1 = new AmbuFr();
                a1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class srchDocFr extends JFrame implements ActionListener {
        private JTextField DocID;
        private JTextArea textBox;
        private JButton srchDoc, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel sDocid;

        public srchDocFr() {
            super("Search Doctor");
            this.setSize(900, 700);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 900, 700);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            srchDoc = new JButton("Search Doctor");
            srchDoc.setFont(myFont);
            srchDoc.setBounds(100, 600, 250, 50);
            srchDoc.setBackground(new Color(0xA9E5EF));
            srchDoc.addActionListener(this);
            panel1.add(srchDoc);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 600, 250, 50);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            sDocid = new JLabel("Search Doctor ID");
            sDocid.setFont(myFont);
            sDocid.setBounds(100, 50, 200, 50);
            panel1.add(sDocid);

            DocID = new JTextField("");
            DocID.setFont(myFont);
            DocID.setBounds(100, 100, 550, 50);
            panel1.add(DocID);

            textBox = new JTextArea();
            textBox.setFont(myFont);
            textBox.setBounds(100, 250, 550, 300);
            panel1.add(textBox);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == srchDoc) {
                for (int i = 0; i < Hospital.doctor.length; i++) {
                    if (Hospital.doctor[i].getDId().equals(DocID.getText())) {
                        String s = "Name : " + Hospital.showAlldoc_ID(i) +
                                "\nID :" + Hospital.showAlldoc_ID(i) +
                                "\nRoom : " + Hospital.showAlldoc_Room(i);
                        textBox.append(s);
                        break;
                    }
                }
            } else if (ae.getSource() == back) {
                DocFr d1 = new DocFr();
                d1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class srcpatFr extends JFrame implements ActionListener {
        private JTextField patID;
        private JTextArea textBox;
        private JButton srcpat, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel spatid;

        public srcpatFr() {
            super("Search Patient");
            this.setSize(900, 700);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 900, 700);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            srcpat = new JButton("Search Patient");
            srcpat.setFont(myFont);
            srcpat.setBounds(100, 600, 250, 50);
            srcpat.setBackground(new Color(0xA9E5EF));
            srcpat.addActionListener(this);
            panel1.add(srcpat);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 600, 250, 50);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            spatid = new JLabel("Search Patient ID");
            spatid.setFont(myFont);
            spatid.setBounds(100, 50, 200, 50);
            panel1.add(spatid);

            patID = new JTextField("Search Patient ID");
            patID.setFont(myFont);
            patID.setBounds(100, 100, 550, 50);
            panel1.add(patID);

            textBox = new JTextArea();
            textBox.setFont(myFont);
            textBox.setBounds(100, 250, 550, 300);
            panel1.add(textBox);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == srcpat) {
                for (int i = 0; i < Hospital.patient.length; i++) {
                    if (Hospital.patient[i].getpatID().equals(patID.getText())) {
                        String s = "Name : " + Hospital.showAllpat_Name(i) +
                                "\nID :" + Hospital.showAllpat_ID(i) +
                                "\nDisease : " + Hospital.showAllpat_Dis(i);
                        textBox.append(s);
                        break;
                    }
                }
            } else if (ae.getSource() == back) {
                PatFr p1 = new PatFr();
                p1.setVisible(true);
                this.setVisible(false);
            }

        }
    }

    static class srcEm_patFr extends JFrame implements ActionListener {
        private JTextField EmPatID;
        private JTextArea textBox;
        private JButton srcEmpat, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel sEmpatid;

        public srcEm_patFr() {
            super("Search Emergency Patient");
            this.setSize(900, 700);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 900, 700);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            srcEmpat = new JButton("Search Emergency Patient");
            srcEmpat.setFont(myFont);
            srcEmpat.setBounds(100, 600, 250, 50);
            srcEmpat.setBackground(new Color(0xA9E5EF));
            srcEmpat.addActionListener(this);
            panel1.add(srcEmpat);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 600, 250, 50);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            sEmpatid = new JLabel("Search Emergency Patient ID");
            sEmpatid.setFont(myFont);
            sEmpatid.setBounds(100, 50, 200, 50);
            panel1.add(sEmpatid);

            EmPatID = new JTextField("Search Patient ID");
            EmPatID.setFont(myFont);
            EmPatID.setBounds(100, 100, 550, 50);
            panel1.add(EmPatID);

            textBox = new JTextArea();
            textBox.setFont(myFont);
            textBox.setBounds(100, 250, 550, 300);
            panel1.add(textBox);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == srcEmpat) {
                for (int i = 0; i < Hospital.emergency.length; i++) {
                    if (Hospital.emergency[i].get_EmPatientId().equals(EmPatID.getText())) {
                        String s = "Name : " + Hospital.ShowEmr_pat_name(i) +
                                "\nID :" + Hospital.ShowEmr_pat_Id(i) +
                                "\nBlood Group : " + Hospital.ShowEmr_pat_bld_grp(i);
                        textBox.append(s);
                        break;
                    }
                }
            } else if (ae.getSource() == back) {
                Emg_patFr e1 = new Emg_patFr();
                e1.setVisible(true);
                this.setVisible(false);

            }

        }
    }

    static class srcStfFr extends JFrame implements ActionListener {
        private JTextField StfID;
        private JTextArea textBox;
        private JButton srcStf, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel sStfid;

        public srcStfFr() {
            super("Search Staff");
            this.setSize(900, 700);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 900, 700);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            srcStf = new JButton("Search Staff");
            srcStf.setFont(myFont);
            srcStf.setBounds(100, 600, 250, 50);
            srcStf.setBackground(new Color(0xA9E5EF));
            srcStf.addActionListener(this);
            panel1.add(srcStf);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 600, 250, 50);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            sStfid = new JLabel("Search Staff ID");
            sStfid.setFont(myFont);
            sStfid.setBounds(100, 50, 200, 50);
            panel1.add(sStfid);

            StfID = new JTextField("Search Staff ID");
            StfID.setFont(myFont);
            StfID.setBounds(100, 100, 550, 50);
            panel1.add(StfID);

            textBox = new JTextArea();
            textBox.setFont(myFont);
            textBox.setBounds(100, 250, 550, 300);
            panel1.add(textBox);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == srcStf) {
                for (int i = 0; i < Hospital.staff.length; i++) {
                    if (Hospital.staff[i].get_staff_ID().equals(StfID.getText())) {
                        String s = "Name : " + Hospital.showAllStaff_Name(i) +
                                "\nID :" + Hospital.showAllStaff_ID(i) +
                                "\nSalary : " + Hospital.showAllStaff_Salary(i);
                        textBox.append(s);
                        break;
                    }
                }
            } else if (ae.getSource() == back) {
                StfFr s1 = new StfFr();
                s1.setVisible(true);
                this.setVisible(false);
            }

        }
    }

    static class srcAmbuFr extends JFrame implements ActionListener {
        private JTextField Ambulance_Num;
        private JTextArea textBox;
        private JButton srcAmbu, back;
        private JPanel panel1;
        private Font myFont;
        private JLabel sambulance_num;

        public srcAmbuFr() {
            super("Search ambulance");
            this.setSize(900, 700);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);
            myFont = new Font("Cambria", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 900, 700);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            srcAmbu = new JButton("Search Ambulance");
            srcAmbu.setFont(myFont);
            srcAmbu.setBounds(100, 600, 250, 50);
            srcAmbu.setBackground(new Color(0xA9E5EF));
            srcAmbu.addActionListener(this);
            panel1.add(srcAmbu);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(350, 600, 250, 50);
            back.setBackground(new Color(0x8CEEEB));
            back.addActionListener(this);
            panel1.add(back);

            sambulance_num = new JLabel("Search Ambulance Number");
            sambulance_num.setFont(myFont);
            sambulance_num.setBounds(100, 50, 200, 50);
            panel1.add(sambulance_num);

            Ambulance_Num = new JTextField("Ambulance Number");
            Ambulance_Num.setFont(myFont);
            Ambulance_Num.setBounds(100, 100, 550, 50);
            panel1.add(Ambulance_Num);

            textBox = new JTextArea();
            textBox.setFont(myFont);
            textBox.setBounds(100, 250, 550, 300);
            panel1.add(textBox);

            this.add(panel1);
            this.setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == srcAmbu) {
                for (int i = 0; i < Hospital.ambulance.length; i++) {
                    if (Hospital.ambulance[i].get_Ambulance_Num().equals(Ambulance_Num.getText())) {
                        String s = "\nName : " + Hospital.showAlldri_Name(i) +
                                "\nID :" + Hospital.showAlldri_id(i) +
                                "\nAmb. Number : " + Hospital.showAllamu_num(i);
                        textBox.append(s);
                        break;
                    }
                }
            } else if (ae.getSource() == back) {
                AmbuFr a1 = new AmbuFr();
                a1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class ShowAlldocFr extends JFrame implements ActionListener {
        private JTextArea showAll;
        private JPanel panel1;
        private Font myFont;
        private JButton back;

        public ShowAlldocFr() {
            super("Show all Doctor.");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            showAll = new JTextArea();
            for (int i = 0; i < Hospital.doctor.length; i++) {
                if (Hospital.doctor[i] != null) {
                    String s = "\nNAME : " + Hospital.showAlldoc_Name(i) +
                            "\nID : " + Hospital.showAlldoc_ID(i) +
                            "\nRoom No. : " + Hospital.showAlldoc_Room(i) +
                            "\nQualification : " + Hospital.showAlldoc_Qualification(i) +
                            "\nAppointment Time: " + Hospital.showAlldoc_Appoinment(i) +
                            "\nSpecialist In : " + Hospital.showAlldoc_Specialist(i);
                    showAll.append(s);
                }
            }
            showAll.setFont(myFont);
            showAll.setBounds(25, 30, 700, 700);
            panel1.add(showAll);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(750, 50, 150, 50);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);
        }


        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == back) {
                DocFr d1 = new DocFr();
                d1.setVisible(true);
                this.setVisible(false);
            }

        }
    }

    static class ShowAllpatFr extends JFrame implements ActionListener {
        private JTextArea showAll;
        private JPanel panel1;
        private Font myFont;
        private JButton back;

        public ShowAllpatFr() {
            super("Show all Patient.");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            showAll = new JTextArea();
            for (int i = 0; i < Hospital.patient.length; i++) {
                if (Hospital.patient[i] != null) {
                    String s = "\nNAME : " + Hospital.showAllpat_Name(i) +
                            "\nID : " + Hospital.showAllpat_ID(i) +
                            "\nDisease: " + Hospital.showAllpat_Dis(i) +
                            "\nPatient Age: " + Hospital.showAllpat_Age(i) +
                            "\nNid No. : " + Hospital.showAllpat_NID(i);
                    showAll.append(s);
                }
            }

            showAll.setFont(myFont);
            showAll.setBounds(25, 30, 700, 700);
            panel1.add(showAll);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(750, 50, 150, 50);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == back) {
                PatFr p1 = new PatFr();
                p1.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    static class ShowAllstaffFr extends JFrame implements ActionListener {
        private JTextArea showAll;
        private JPanel panel1;
        private Font myFont;
        private JButton back;

        public ShowAllstaffFr() {
            super("Show all Staff.");
            this.setSize(1000, 800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(null);

            myFont = new Font("Times new Roman", Font.PLAIN, 18);
            panel1 = new JPanel();
            panel1.setBounds(0, 0, 1000, 800);
            panel1.setLayout(null);
            panel1.setBackground(new Color(250, 237, 205));

            showAll = new JTextArea();
            for (int i = 0; i < Hospital.staff.length; i++) {
                if (Hospital.staff[i] != null) {
                    String s = "\nNAME : " + Hospital.showAllStaff_Name(i) +
                            "\nID : " + Hospital.showAllStaff_ID(i) +
                            "\nPost : " + Hospital.showAllStaff_Post(i) +
                            "\nSalary : " + Hospital.showAllStaff_Salary(i) +
                            "\nMobile No.: " + Hospital.showAllStaff_PhoneNumber(i);
                    showAll.append(s);
                }
            }
            showAll.setFont(myFont);
            showAll.setBounds(25, 30, 700, 700);
            panel1.add(showAll);

            back = new JButton("Back");
            back.setFont(myFont);
            back.setBounds(750, 50, 150, 50);
            back.setBackground(new Color(0x058CA2));
            back.addActionListener(this);
            panel1.add(back);

            this.add(panel1);
            this.setVisible(true);
        }


        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (ae.getSource() == back) {
                StfFr s1 = new StfFr();
                s1.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    static class ShowAllambuFr extends JFrame implements ActionListener {
            private JTextArea showAll;
            private JPanel panel1;
            private Font myFont;
            private JButton back;

            public ShowAllambuFr() {
                super("Show All Ambulance");
                this.setSize(1000, 800);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setLayout(null);

                myFont = new Font("Times new Roman", Font.PLAIN, 18);
                panel1 = new JPanel();
                panel1.setBounds(0, 0, 1000, 800);
                panel1.setLayout(null);
                panel1.setBackground(new Color(250, 237, 205));

                showAll = new JTextArea();
                for (int i = 0; i < Hospital.ambulance.length; i++) {
                    if (Hospital.ambulance[i] != null) {
                        String s = "\nNAME : " + Hospital.showAlldri_Name(i) +
                                "\nDriverNumber : " + Hospital.showAlldri_num(i) +
                                "\nID : " + Hospital.showAlldri_id(i) +
                                "\nAmbulanceNumber : " + Hospital.showAllamu_num(i);
                        showAll.append(s);
                    }
                }
                showAll.setFont(myFont);
                showAll.setBounds(25, 30, 700, 700);
                panel1.add(showAll);

                back = new JButton("Back");
                back.setFont(myFont);
                back.setBounds(750, 50, 150, 50);
                back.setBackground(new Color(0x058CA2));
                back.addActionListener(this);
                panel1.add(back);

                this.add(panel1);
                this.setVisible(true);
            }


            @Override
            public void actionPerformed(ActionEvent ae) {

                String command = ae.getActionCommand();
                if (ae.getSource() == back) {
                    AmbuFr s1 = new AmbuFr();
                    s1.setVisible(true);
                    this.setVisible(false);
                }

            }
    }



    static class ShowAllEm_patFr extends JFrame implements ActionListener {
            private JTextArea showAll;
            private JPanel panel1;
            private Font myFont;
            private JButton back;

            public ShowAllEm_patFr() {
                super("Show All Emergency Patient");
                this.setSize(1000, 800);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                this.setLayout(null);

                myFont = new Font("Times new Roman", Font.PLAIN, 18);
                panel1 = new JPanel();
                panel1.setBounds(0, 0, 1000, 800);
                panel1.setLayout(null);
                panel1.setBackground(new Color(250, 237, 205));

                showAll = new JTextArea();
                for (int i = 0; i < Hospital.emergency.length; i++) {
                    if (Hospital.emergency[i] != null) {
                        String s = "\nNAME : " + Hospital.ShowEmr_pat_name(i) +
                                "\nID : " + Hospital.ShowEmr_pat_Id(i) +
                                "\nPhone No. : " + Hospital.ShowEmr_pat_phn(i) +
                                "\nAddress : " + Hospital.ShowEmr_pat_add(i) +
                                "\nBlood Group : " + Hospital.ShowEmr_pat_bld_grp(i);
                        showAll.append(s);
                    }
                }
                showAll.setFont(myFont);
                showAll.setBounds(25, 30, 700, 700);
                panel1.add(showAll);

                back = new JButton("Back");
                back.setFont(myFont);
                back.setBounds(750, 50, 150, 50);
                back.setBackground(new Color(0x058CA2));
                back.addActionListener(this);
                panel1.add(back);

                this.add(panel1);
                this.setVisible(true);
            }

            @Override
            public void actionPerformed(ActionEvent ae) {
                String command = ae.getActionCommand();
                if (ae.getSource() == back) {
                    Emg_patFr e1 = new Emg_patFr();
                    e1.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }





