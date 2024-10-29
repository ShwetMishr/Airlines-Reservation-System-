import javax.swing.*;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.awt.*;
import java.awt.event.*;
import java.lang.invoke.CallSite;
import java.sql.*;
import java.util.*;

public class Airlines_Reservation_System extends JFrame {

    public static void main(String[] args){

        JFrame frame=new JFrame("Airline  Reservation System");
        frame.setResizable(true);
        frame.setBounds(100,100 ,1400,700);
        ;

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);

        ImageIcon image=new ImageIcon("C:\\Users\\HP\\Desktop\\BCA\\airplane.jpg");

        JLabel airplane=new JLabel("",image,JLabel.RIGHT);
        airplane.setBounds(990,200,500,350);
        c.add(airplane);
        airplane.setFocusable(true);

        Font font=new Font("Georgia",Font.BOLD,20);
        Font font1=new Font("Georgia",Font.PLAIN,35);
        Font font2=new Font("Times new Roman",Font.PLAIN,35);

        JLabel airlines=new JLabel("Air");
        airlines.setBounds(80,20,150,100);
        c.add(airlines);
        airlines.setFont(font2);
        airlines.setForeground(Color.BLUE);

        JLabel lines=new JLabel("lines");
        lines.setBounds(126,20,150,100);
        c.add(lines);
        lines.setFont(font2);
        lines.setForeground(Color.BLACK);

        JButton Home=new JButton("Home");
        Home.setBounds(280,55,200,30);
        c.add(Home);
        Home.setFont(font);

        JButton About=new JButton("About");
        About.setBounds(480,55,200,30);
        c.add(About);
        About.setFont(font);

        JButton Services=new JButton("View Ticket");
        Services.setBounds(680,55,200,30);
        c.add(Services);
        Services.setFont(font);

        JButton Contact=new JButton("Contact");
        Contact.setBounds(880,55,200,30);
        c.add(Contact);
        Contact.setFont(font);

        JButton Login=new JButton("Log in");
        Login.setBounds(1080,55,200,30);
        c.add(Login);
        Login.setFont(font);

        JButton Signup=new JButton("Signup");
        Signup.setBounds(1280,55,200,30);
        c.add(Signup);
        Signup.setFont(font);

        JLabel Hi=new JLabel("Hi,");
        Hi.setBounds(80,200,100,100);
        c.add(Hi);
        Hi.setFont(font1);

        JLabel Where=new JLabel("where");
        Where.setBounds(155,200,200,100);
        c.add(Where);
        Where.setForeground(Color.BLUE);
        Where.setFont(font1);

        JLabel would=new JLabel("would you ");
        would.setBounds(270,200,200,100);
        c.add(would);
        would.setFont(font1);

        JLabel like=new JLabel("like to go ? ");
        like.setBounds(80,260,200,100);
        c.add(like);
        like.setFont(font1);

        JLabel quote=new JLabel("The sky is not the limit,");
        quote.setBounds(80,320,1000,100);
        c.add(quote);
        quote.setFont(font1);
        quote.setForeground(Color.BLUE);

        JLabel quote2=new JLabel("it's just the beginning.");
        quote2.setBounds(80,370,1000,100);
        c.add(quote2);
        quote2.setFont(font1);

        JButton Book_now=new JButton("Book Now");
        Book_now.setBounds(80,500,150,30);
        c.add(Book_now);
        Book_now.setFont(font);
        Book_now.setBackground(Color.BLUE);
        Book_now.setForeground(Color.white);
        frame.setBackground(Color.BLUE);

        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame loginframe=new JFrame("Login Now");
                loginframe.setResizable(true);
                loginframe.setBounds(100,100 ,1400,700);
                loginframe.setBackground(Color.BLUE);
                loginframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                Container clogin=loginframe.getContentPane();
                clogin.setLayout(null);

                JLabel username=new JLabel("Username:");
                username.setBounds(80,20,150,100);
                clogin.add(username);
                username.setFont(font);

                JTextField userfield=new JTextField();
                userfield.setBounds(400,60,250,30);
                clogin.add(userfield);
                userfield.setFont(font);
                userfield.setForeground(Color.BLUE);


                JLabel Password=new JLabel("Password:");
                Password.setBounds(80,100,150,100);
                clogin.add(Password);
                Password.setFont(font);

                JPasswordField passwordfield=new JPasswordField();
                passwordfield.setBounds(400,130,250,30);
                clogin.add(passwordfield);
                passwordfield.setFont(font);
                passwordfield.setForeground(Color.BLUE);

                JButton Loginbutton=new JButton("Login Now");
                Loginbutton.setBounds(80,220,150,30);
                clogin.add(Loginbutton);
                Loginbutton.setFont(font);
                Loginbutton.setForeground(Color.white);
                Loginbutton.setBackground(Color.BLUE);

                Loginbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loginframe.setVisible(false);
                    }

                });

                JButton ForgetPassword=new JButton("Forget Password");
                ForgetPassword.setBounds(300,220,230,30);
                clogin.add(ForgetPassword);
                ForgetPassword.setFont(font);
                ForgetPassword.setForeground(Color.white);
                ForgetPassword.setBackground(Color.BLUE);

                ForgetPassword.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loginframe.setVisible(false);
                    }
                });

                JButton Signupbutton=new JButton("Signup");
                Signupbutton.setBounds(600,220,150,30);
                clogin.add(Signupbutton);
                Signupbutton.setFont(font);
                Signupbutton.setForeground(Color.white);
                Signupbutton.setBackground(Color.BLUE);

                Signupbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loginframe.setVisible(false);
                    }
                });



                loginframe.setVisible(true);


            }

        });

        Signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Signupframe=new JFrame("Signup Now");
                Signupframe.setResizable(true);
                Signupframe.setBounds(100,100 ,1400,700);
                Signupframe.setBackground(Color.BLUE);
                Signupframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                Container csignup=Signupframe.getContentPane();
                csignup.setLayout(null);

                JLabel name=new JLabel("Name:");
                name.setBounds(80,20,150,100);
                csignup.add(name);
                name.setFont(font);

                JTextField userfieldsignup=new JTextField();
                userfieldsignup.setBounds(400,60,250,30);
                csignup.add(userfieldsignup);
                userfieldsignup.setFont(font);
                userfieldsignup.setForeground(Color.BLUE);

                JLabel Email=new JLabel("Email:");
                Email.setBounds(80,100,150,100);
                csignup.add(Email);
                Email.setFont(font);

                JTextField Emailfield=new JTextField();
                Emailfield.setBounds(400,130,250,30);
                csignup.add(Emailfield);
                Emailfield.setFont(font);
                Emailfield.setForeground(Color.BLUE);

                String emailanswerlogin=Emailfield.getText().toString();



                JLabel Passwordsignup=new JLabel("Password:");
                Passwordsignup.setBounds(80,180,150,100);
                csignup.add(Passwordsignup);
                Passwordsignup.setFont(font);

                JPasswordField passwordfieldsignup=new JPasswordField();
                passwordfieldsignup.setBounds(400,210,250,30);
                csignup.add(passwordfieldsignup);
                passwordfieldsignup.setFont(font);
                passwordfieldsignup.setForeground(Color.BLUE);

                JLabel CPasswordsignup=new JLabel(" Pin Code:");
                CPasswordsignup.setBounds(80,250,230,100);
                csignup.add(CPasswordsignup);
                CPasswordsignup.setFont(font);

                JPasswordField Cpasswordfieldsignup2=new JPasswordField();
                Cpasswordfieldsignup2.setBounds(400,290,250,30);
                csignup.add(Cpasswordfieldsignup2);
                Cpasswordfieldsignup2.setFont(font);
                Cpasswordfieldsignup2.setForeground(Color.BLUE);

                JLabel DOB=new JLabel(" Date of Birth:");
                DOB.setBounds(700,20,230,100);
                csignup.add(DOB);
                DOB.setFont(font);

                JLabel dd=new JLabel("Date");
                dd.setBounds(870,20,1501,100);
                csignup.add(dd);
                dd.setFont(font);




                String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","!6","17","18","19","20","21"
                        , "22","23","24","25","26","27","28","29","30","31"};


                JComboBox month=new JComboBox(date);
                month.setBounds(930,53,100,30);
                csignup.add(month);
                month.setFont(font);
                month.setForeground(Color.BLUE);


                JLabel mn=new JLabel(" Month");
                mn.setBounds(1030,20,150,100);
                csignup.add(mn);
                mn.setFont(font);


                String Months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};


                JComboBox monthss=new JComboBox(Months);
                monthss.setBounds(1130,53,130,30);
                csignup.add(monthss);
                monthss.setFont(font);
                monthss.setForeground(Color.BLUE);



                JLabel y=new JLabel(" Year");
                y.setBounds(1270,20,150,100);
                csignup.add(y);
                y.setFont(font);

                String years[]={"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2018","2019","2020","2021","2022","2023","2024"};

                JComboBox year=new JComboBox(years);
                year.setBounds(1330,53,130,30);
                csignup.add(year);
                year.setFont(font);
                year.setForeground(Color.BLUE);

                JLabel Gender=new JLabel(" Gender:");
                Gender.setBounds(700,90,230,100);
                csignup.add(Gender);
                Gender.setFont(font);

                JRadioButton male=new JRadioButton("Male");
                male.setBounds(870,90,100,100);
                csignup.add(male);
                male.setFont(font);


                JRadioButton female=new JRadioButton("Female");
                female.setBounds(1000,90,100,100);
                csignup.add(female);
                female.setFont(font);




                ButtonGroup gen=new ButtonGroup();
                gen.add(male);
                gen.add(female);



                JLabel phone_number=new JLabel(" Phone Number:");
                phone_number.setBounds(700,170,230,100);
                csignup.add(phone_number);
                phone_number.setFont(font);

                JTextField number=new JTextField("");
                number.setBounds(890,210,200,30);
                csignup.add(number);
                number.setForeground(Color.BLUE);


                JLabel Address=new JLabel("Address:");
                Address.setBounds(700,250,230,100);
                csignup.add(Address);
                Address.setFont(font);



                JTextArea area=new JTextArea();

                csignup.add(area);

                JScrollPane s=new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                s.setBounds(890,280,300,200);
                csignup.add(s);
                s.setFont(font);
                s.setForeground(Color.BLUE);

                JButton sign=new JButton("Signup");
                sign.setBounds(80,400,150,30);
                csignup.add(sign);
                sign.setBackground(Color.BLUE);
                sign.setFont(font);
                sign.setForeground(Color.white);

                JLabel datastored=new JLabel();
                datastored.setBounds(80,450,1200,100);
                csignup.add(datastored);
                datastored.setFont(font);
                datastored.setForeground(Color.RED);

                sign.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String n = userfieldsignup.getText().toString();
                        String e1 = Emailfield.getText().toString();
                        String p = passwordfieldsignup.getText().toString();
                        String cp = Cpasswordfieldsignup2.getText().toString();
                        String dob = month.getSelectedItem().toString() + " " + monthss.getSelectedItem().toString() + " " + year.getSelectedItem().toString();
                        String gender = "male";

                        if (female.isSelected()) {
                            gender = "Female";
                        }


                        String ph = number.getText().toString();
                        String add = area.getText().toString();



                        if(n.isEmpty()){
                            datastored.setText("Please Fill The Name...error");
                        }
                        else if(e1.isEmpty()){
                            datastored.setText("Please Fill The Email...error");
                        }
                        else if(p.isEmpty()){
                            datastored.setText("Please Fill The Password...error");
                        }
                        else if(cp.isEmpty()){
                            datastored.setText("Please Fill The Confirm password...error");
                        }
                        else if(ph.isEmpty()){
                            datastored.setText("Please Fill The Phone rror");
                        }
                        else if(add.isEmpty()){
                            datastored.setText("Please Fill The Address password...error");
                        }


                        else{
                            datastored.setText("");
                        }

                        String url="jdbc:mysql://localhost:3306/Airlines_Reservation_system";
                        String username="root";
                        String password="";
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection connection= DriverManager.getConnection(url,username,password);


                            Statement statement=connection.createStatement();

                            String query="INSERT INTO `sign_up_details`(`name`, `email`, `password`, `confirm_password`, `phone_number`, `address`) VALUES (?,?,?,?,?,?)";
                            PreparedStatement pst=connection.prepareStatement(query);
                            pst.setString(1,n);
                            pst.setString(2,e1);
                            pst.setString(3,p);
                            pst.setString(4,cp);
                            pst.setString(5,ph);
                            pst.setString(6,add);


                            pst.executeUpdate();




                        }
                        catch (Exception e2){
                            JOptionPane.showMessageDialog(null,e2);
                        }








                    }
                });






                Signupframe.setVisible(true);
            }
        });

        Contact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Contactframe=new JFrame("Contact_Details");
                Contactframe.setResizable(true);
                Contactframe.setBounds(100,100 ,1400,700);
                Contactframe.setBackground(Color.BLUE);
                Contactframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                Container co=Contactframe.getContentPane();
                co.setLayout(null);

                JLabel SearchTicket=new JLabel("Registered Office ");
                SearchTicket.setBounds(120,80,300,100);
                co.add(SearchTicket);
                SearchTicket.setFont(font);

                JLabel SearchTicket2=new JLabel("CIN : L62100DL2004PLC129768 ");
                SearchTicket2.setBounds(120,150,400,100);
                co.add(SearchTicket2);
                SearchTicket2.setFont(font);

                JLabel SearchTicket3=new JLabel("Upper Ground Floor, Thapar House, Gate No. 2, Western Wing, 124 Janpath, New Delhi – 110001 India");
                SearchTicket3.setBounds(120,220,1800,100);
                co.add(SearchTicket3);
                SearchTicket3.setFont(font);

                JLabel SearchTicket4=new JLabel("Fax : +91 11-43513200");
                SearchTicket4.setBounds(120,270,300,100);
                co.add(SearchTicket4);
                SearchTicket4.setFont(font);

                JLabel SearchTicket5=new JLabel("To share your feedback/complaints/suggestions or to reach out to our Customer Experience Team, ");
                SearchTicket5.setBounds(120,320,1800,100);
                co.add(SearchTicket5);
                SearchTicket5.setFont(font);

                JLabel SearchTicket6=new JLabel("For comments, concerning Civil Aviation Requirement, Section -3, please contact- Air Transport, Series M, Part IV. ");
                SearchTicket6.setBounds(120,370,1800,100);
                co.add(SearchTicket6);
                SearchTicket6.setFont(font);

                JLabel SearchTicket7=new JLabel("Nodal Officer, Isha Gandhi at nodalofficer@goindigo.in or Click Here");
                SearchTicket7.setBounds(120,420,1800,100);
                co.add(SearchTicket7);
                SearchTicket7.setFont(font);

                Contactframe.setVisible(true);

            }
        });
        Services.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Servicesframe=new JFrame("Services Provided by Our Airlines");
                Servicesframe.setResizable(true);
                Servicesframe.setBounds(100,100 ,1400,700);
                Servicesframe.setBackground(Color.BLUE);
                Servicesframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                Container ticketview=Servicesframe.getContentPane();
                ticketview.setLayout(null);



                JLabel SearchTicket=new JLabel(" We will Provide Update May Be Soon");
                SearchTicket.setBounds(340,80,600,100);
                ticketview.add(SearchTicket);
                SearchTicket.setFont(font);






                Servicesframe.setVisible(true);
            }
        });

        About.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Aboutframe=new JFrame("Signup Now");
                Aboutframe.setResizable(true);
                Aboutframe.setBounds(100,100 ,1400,700);
                Aboutframe.setBackground(Color.BLUE);
                Aboutframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                Container cr=Aboutframe.getContentPane();
                cr.setLayout(null);

                JLabel SearchTicket8=new JLabel("\n" +
                        "\n" +
                        "An airline can be defined as a company that offers regular services for transporting passengers or goods via the air. ");
                SearchTicket8.setBounds(120,80,1900,100);
                Aboutframe.add(SearchTicket8);
                SearchTicket8.setFont(font);

                JLabel SearchTicket9=new JLabel("companies are said to comprise the airline industry, which is also regarded as a sub-sector of the aviation sector and the");
                SearchTicket9.setBounds(120,150,1900,100);
                Aboutframe.add(SearchTicket9);
                SearchTicket9.setFont(font);

                JLabel SearchTicket10=new JLabel("wider travel industry. In this post, you will learn everything you need to know about airlines.");
                SearchTicket10.setBounds(120,220,1900,100);
                Aboutframe.add(SearchTicket10);
                SearchTicket10.setFont(font);

                Aboutframe.setVisible(true);
            }
        });

        Book_now.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                JFrame Book_now_frame=new JFrame("Book_Now_Here");
                Book_now_frame.setResizable(true);
                Book_now_frame.setBounds(100,100 ,1400,700);
                Book_now_frame.setBackground(Color.BLUE);
                Book_now_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                Container cbook_now=Book_now_frame.getContentPane();
                cbook_now.setLayout(null);

                JButton b=new JButton("Search Flight");
                b.setBounds(40,40,170,30);
                cbook_now.add(b);
                b.setForeground(Color.white);
                b.setBackground(Color.DARK_GRAY);
                b.setFont(font);

                JLabel from=new JLabel("from");
                from.setBounds(40,70,100,100);
                cbook_now.add(from);
                from.setFont(font);


                String f[]={"Kadapa -- Kadapa Airport -- CDP",
                        "Kurnool	-- Kurnool Airport -- KJB",
                        "Puttaparthi -- Sri Sathya Sai Airport -- PUT",
                        "Rajahmundry -- Rajahmundry Airport -- RJA",
                        "Tirupati -- Tirupati International Airport -- TIR",
                        "Vijayawada -- Vijayawada International Airport -- VGA",
                        "Visakhapatnam -- Visakhapatnam International Airport -- VTZ",
                        "Daporijo -- Daporijo Airport -- DEP",
                        "Itanagar -- Donyi Polo Airport -- HGI",
                        "Pasighat -- Pasighat Airport -- IXT",
                        "Tezu -- Tezu Airport -- TEI",
                        "Ziro -- Ziro Airport -- ZER",
                        "Dhubri -- Rupsi Airport -- RUP",
                        "Dibrugarh -- Dibrugarh Airport -- DIB",
                        "Guwahati -- Lokpriya Gopinath Bordoloi International Airport -- GAU",
                        "Jorhat -- Jorhat Airport -- JRH",
                        "North Lakhimpur -- Lilabari Airport -- IXI",
                        "Silchar -- Silchar Airport -- IXS",
                        "Tezpur -- Tezpur Airport -- TEZ",
                        "Darbhanga -- Darbhanga Airport -- DBR",
                        "Gaya -- Gaya Airport -- GAY",
                        "Muzaffarpur -- Muzaffarpur Airport -- MZU",
                        "Patna -- Jay Prakash Narayan Airport -- PAT",
                        "Raipur -- Swami Vivekananda Airport -- RPR",
                        "Bilaspur -- Bilaspur Airport -- PAB",
                        "Jagdalpur -- Jagdalpur Airport -- JGB",
                        "Dabolim -- Dabolim Airport -- GOI	",
                        "Mopa -- Manohar International Airport -- GOX",
                        "Ahmedabad -- Sardar Vallabhbhai Patel International Airport -- AMD",
                        "Bhavnagar -- Bhavnagar Airport -- BHU",
                        "Bhuj -- Bhuj Airport -- BHJ",
                        "Jamnagar -- Jamnagar Airport -- JGA",
                        "Junagadh -- Keshod Airport -- IXK",
                        "Kandla -- Kandla Airport -- IXY",
                        "Porbandar -- Porbandar Airport -- PBD",
                        "Rajkot -- Rajkot International Airport -- HSR",
                        "Rajkot  -- Rajkot Airport -- RAJ",
                        "Surat -- Surat International Airport -- STV",
                        "Vadodara -- Vadodara Airport -- BDQ",
                        "Hisar -- Hisar Airport -- HSS",
                        "Kangra -- Kangra Airport -- DHM",
                        "Kullu-Manali -- Kullu–Manali Airport -- KUU",
                        "Shimla -- Shimla Airport -- SLV",
                        "Deoghar -- Deoghar Airport -- DGH",
                        "Jamshedpur  -- Sonari Airport -- IXW",
                        "Ranchi -- Birsa Munda Airport -- IXR",
                        "Belgavi -- Belgavi Airport -- IXG",
                        "Ballari -- Jindal Vijaynagar Airport -- VDY",
                        "Bengaluru -- Kempegowda International Airport -- BLR",
                        "Bidar -- Bidar Airport -- IXX",
                        "Hubli -- Hubli Airport -- HBX",
                        "Kalaburagi -- Kalaburagi Airport -- GBI",
                        "Mangaluru -- Mangalore International Airport -- IXE",
                        "Mysuru -- Mysore Airport -- MYQ",
                        "Shivamogga -- Kuvempu Airport -- RQY",
                        "Kannur -- Kannur International Airport -- CNN",
                        "Kochi -- Cochin International Airport -- COK",
                        "Kozhikode / Malappuram -- Kozhikode International Airport -- CCJ",
                        "Thiruvananthapuram -- Thiruvananthapuram International Airport -- TRV",
                        "Bhopal -- Raja Bhoj Airport -- BHO",
                        "Indore -- Devi Ahilyabai Holkar International Airport -- IDR",
                        "Jabalpur -- Jabalpur Airport -- JLR",
                        "Khajuraho -- Khajuraho Airport -- HJR",
                        "Satna -- Satna Airport -- TNI",
                        "Gwalior -- Rajmata Vijaya Raje Scindia Airport -- GWL",
                        "Akola -- Akola Airport -- AKD",
                        "Aurangabad -- Aurangabad Airport -- IXU",
                        "Gondia -- Gondia Airport -- GDB",
                        "Jalgaon -- Jalgaon Airport -- JLG",
                        "Kolhapur -- Kolhapur Airport -- KLH",
                        "Latur -- Latur Airport -- LTU",
                        "Mumbai -- Chhatrapati Shivaji Maharaj International Airport -- BOM",
                        "Nagpur -- Dr. Babasaheb Ambedkar International Airport -- NAG",
                        "Nanded -- Shri Guru Gobind Singh Ji Airport -- NDC",
                        "Nashik -- Nashik Airport -- ISK",
                        "Osmanabad -- Osmanabad Airport -- OMN",
                        "Pune -- Pune Airport -- PNQ",
                        "Ratnagiri -- Ratnagiri Airport -- RTC",
                        "Shirdi -- Shirdi Airport -- SAG",
                        "Solapur -- Solapur Airport -- SSE",
                        "Sindhudurg -- Sindhudurg Airport -- SDW",
                        "Yavatmal -- Sant Gadge Baba Yavatmal Airport -- YTL",
                        "Imphal -- Imphal International Airport -- IMF",
                        "Shillong -- Shillong Airport -- SHL",
                        "Aizawl -- Lengpui Airport -- AJL",
                        "Dimapur -- Dimapur Airport -- DMU",
                        "Berhampur -- Rangeilunda Airport -- QBM",
                        "Bhubaneswar -- Biju Patnaik International Airport -- BBI",
                        "Jeypore -- Jeypore Airport -- PYB",
                        "Jharsuguda -- Veer Surendra Sai Airport -- JRG",
                        "Rourkela -- Rourkela Airport -- RRK",
                        "Utkela -- Utkela Airport -- UKE",
                        "Amritsar  -- Sri Guru Ram Dass Jee International Airport -- ATQ",
                        "Bathinda -- Bathinda Airport -- BUP",
                        "Jalandhar -- Adampur Airport -- AIP",
                        "Ludhiana -- Ludhiana Airport -- LUH",
                        "Pathankot -- Pathankot Airport -- IXP",
                        "Ajmer -- Kishangarh Airport -- KQH",
                        "Bikaner -- Bikaner Airport -- BKB",
                        "Jaipur -- Jaipur International Airport -- JAI",
                        "Jaisalmer -- Jaisalmer Airport -- JSA",
                        "Jodhpur -- Jodhpur Airport -- JDH",
                        "Kota -- Kota Airport -- KTU",
                        "Udaipur -- Maharana Pratap Airport -- UDR",
                        "Gangtok -- Pakyong Airport -- PYG",
                        "Chennai -- Chennai International Airport -- MAA",
                        "Coimbatore -- Coimbatore International Airport -- CJB",
                        "Madurai -- Madurai Airport -- IXM",
                        "Neyveli -- Neyveli Airport -- NVY",
                        "Salem -- Salem Airport -- SXV",
                        "Thanjavur -- Thanjavur Airport -- TJV",
                        "Thoothukkudi -- Tuticorin Airport -- TCR",
                        "Tiruchirappalli -- Tiruchirappalli International Airport -- TRZ",
                        "Hyderabad -- Begumpet Airport -- BPM",
                        "Hyderabad -- Rajiv Gandhi International Airport -- HYD",
                        "Warangal -- Warangal Airport -- WGC",
                        "Agartala -- Maharaja Bir Bikram Airport -- IXA",
                        "Kailashahar -- Kailashahar Airport -- IXH",
                        "Kamalpur -- Kamalpur Airport -- IXQ",
                        "Khowai -- Khowai Airport -- IXN",
                        "Agra -- Agra Airport -- AGR",
                        "Ayodhya -- Maharishi Valmiki International Airport -- AYJ",
                        "Bareilly -- Bareilly Airport -- BEK",
                        "Ghaziabad -- Hindon Airport -- HDO",
                        "Gorakhpur -- Gorakhpur Airport -- GOP",
                        "Kanpur  -- Kanpur Airport -- KNU",
                        "Kushinagar -- Kushinagar International Airport -- KBK",
                        "Lucknow -- Chaudhary Charan Singh International Airport -- LKO",
                        "Prayagraj -- Prayagraj Airport -- IXD",
                        "Varanasi -- Lal Bahadur Shastri International Airport -- VNS",
                        "Jewar -- Noida International Airport -- DXN",
                        "Dehradun -- Dehradun Airport -- DED",
                        "Pantnagar -- Pantnagar Airport -- PGH",
                        "Pithoragarh -- Pithoragarh Airport -- NNS",
                        "Balurghat -- Balurghat Airport -- RGH",
                        "Cooch Behar -- Cooch Behar Airport -- COH",
                        "Durgapur -- Kazi Nazrul Islam Airport -- RDP",
                        "Kolkata  -- Netaji Subhas Chandra Bose International Airport -- CCU",
                        "Malda -- Malda Airport -- LDA",
                        "Siliguri -- Bagdogra International Airport -- IXB",
                        "Port Blair -- Veer Savarkar International Airport -- IXZ",
                        "Chandigarh -- Shaheed Bhagat Singh International Airport -- IXC",
                        "Diu -- Diu Airport -- DIU",
                        "Delhi NCR -- Indira Gandhi International Airport -- DEL",
                        "Jammu -- Jammu Airport -- IXJ",
                        "Srinagar -- Srinagar International Airport -- SXR",
                        "Leh -- Kushok Bakula Rimpochee Airport -- IXL",
                        "Agatti Island -- Agatti Airport -- AGX",
                        "Puducherry -- Puducherry Airport -- PNY"
                };

                JComboBox box1=new JComboBox(f);
                box1.setBounds(110,110,750,30);
                cbook_now.add(box1);
                box1.setFont(font);

                JLabel to=new JLabel("TO");
                to.setBounds(40,170,200,100);
                cbook_now.add(to);
                to.setFont(font);



                String too[]={"Kadapa -- Kadapa Airport -- CDP",
                        "Kurnool	-- Kurnool Airport -- KJB",
                        "Puttaparthi -- Sri Sathya Sai Airport -- PUT",
                        "Rajahmundry -- Rajahmundry Airport -- RJA",
                        "Tirupati -- Tirupati International Airport -- TIR",
                        "Vijayawada -- Vijayawada International Airport -- VGA",
                        "Visakhapatnam -- Visakhapatnam International Airport -- VTZ",
                        "Daporijo -- Daporijo Airport -- DEP",
                        "Itanagar -- Donyi Polo Airport -- HGI",
                        "Pasighat -- Pasighat Airport -- IXT",
                        "Tezu -- Tezu Airport -- TEI",
                        "Ziro -- Ziro Airport -- ZER",
                        "Dhubri -- Rupsi Airport -- RUP",
                        "Dibrugarh -- Dibrugarh Airport -- DIB",
                        "Guwahati -- Lokpriya Gopinath Bordoloi International Airport -- GAU",
                        "Jorhat -- Jorhat Airport -- JRH",
                        "North Lakhimpur -- Lilabari Airport -- IXI",
                        "Silchar -- Silchar Airport -- IXS",
                        "Tezpur -- Tezpur Airport -- TEZ",
                        "Darbhanga -- Darbhanga Airport -- DBR",
                        "Gaya -- Gaya Airport -- GAYA",
                        "Muzaffarpur -- Muzaffarpur Airport -- MZU",
                        "Patna -- Jay Prakash Narayan Airport -- PAT",
                        "Raipur -- Swami Vivekananda Airport -- RPR",
                        "Bilaspur -- Bilaspur Airport -- PAB",
                        "Jagdalpur -- Jagdalpur Airport -- JGB",
                        "Dabolim -- Dabolim Airport -- GOI	",
                        "Mopa -- Manohar International Airport -- GOX",
                        "Ahmedabad -- Sardar Vallabhbhai Patel International Airport -- AMD",
                        "Bhavnagar -- Bhavnagar Airport -- BHU",
                        "Bhuj -- Bhuj Airport -- BHJ",
                        "Jamnagar -- Jamnagar Airport -- JGA",
                        "Junagadh -- Keshod Airport -- IXK",
                        "Kandla -- Kandla Airport -- IXY",
                        "Porbandar -- Porbandar Airport -- PBD",
                        "Rajkot -- Rajkot International Airport -- HSR",
                        "Rajkot  -- Rajkot Airport -- RAJ",
                        "Surat -- Surat International Airport -- STV",
                        "Vadodara -- Vadodara Airport -- BDQ",
                        "Hisar -- Hisar Airport -- HSS",
                        "Kangra -- Kangra Airport -- DHM",
                        "Kullu-Manali -- Kullu–Manali Airport -- KUU",
                        "Shimla -- Shimla Airport -- SLV",
                        "Deoghar -- Deoghar Airport -- DGH",
                        "Jamshedpur  -- Sonari Airport -- IXW",
                        "Ranchi -- Birsa Munda Airport -- IXR",
                        "Belgavi -- Belgavi Airport -- IXG",
                        "Ballari -- Jindal Vijaynagar Airport -- VDY",
                        "Bengaluru -- Kempegowda International Airport -- BLR",
                        "Bidar -- Bidar Airport -- IXX",
                        "Hubli -- Hubli Airport -- HBX",
                        "Kalaburagi -- Kalaburagi Airport -- GBI",
                        "Mangaluru -- Mangalore International Airport -- IXE",
                        "Mysuru -- Mysore Airport -- MYQ",
                        "Shivamogga -- Kuvempu Airport -- RQY",
                        "Kannur -- Kannur International Airport -- CNN",
                        "Kochi -- Cochin International Airport -- COK",
                        "Kozhikode / Malappuram -- Kozhikode International Airport -- CCJ",
                        "Thiruvananthapuram -- Thiruvananthapuram International Airport -- TRV",
                        "Bhopal -- Raja Bhoj Airport -- BHO",
                        "Indore -- Devi Ahilyabai Holkar International Airport -- IDR",
                        "Jabalpur -- Jabalpur Airport -- JLR",
                        "Khajuraho -- Khajuraho Airport -- HJR",
                        "Satna -- Satna Airport -- TNI",
                        "Gwalior -- Rajmata Vijaya Raje Scindia Airport -- GWL",
                        "Akola -- Akola Airport -- AKD",
                        "Aurangabad -- Aurangabad Airport -- IXU",
                        "Gondia -- Gondia Airport -- GDB",
                        "Jalgaon -- Jalgaon Airport -- JLG",
                        "Kolhapur -- Kolhapur Airport -- KLH",
                        "Latur -- Latur Airport -- LTU",
                        "Mumbai -- Chhatrapati Shivaji Maharaj International Airport -- BOM",
                        "Nagpur -- Dr. Babasaheb Ambedkar International Airport -- NAG",
                        "Nanded -- Shri Guru Gobind Singh Ji Airport -- NDC",
                        "Nashik -- Nashik Airport -- ISK",
                        "Osmanabad -- Osmanabad Airport -- OMN",
                        "Pune -- Pune Airport -- PNQ",
                        "Ratnagiri -- Ratnagiri Airport -- RTC",
                        "Shirdi -- Shirdi Airport -- SAG",
                        "Solapur -- Solapur Airport -- SSE",
                        "Sindhudurg -- Sindhudurg Airport -- SDW",
                        "Yavatmal -- Sant Gadge Baba Yavatmal Airport -- YTL",
                        "Imphal -- Imphal International Airport -- IMF",
                        "Shillong -- Shillong Airport -- SHL",
                        "Aizawl -- Lengpui Airport -- AJL",
                        "Dimapur -- Dimapur Airport -- DMU",
                        "Berhampur -- Rangeilunda Airport -- QBM",
                        "Bhubaneswar -- Biju Patnaik International Airport -- BBI",
                        "Jeypore -- Jeypore Airport -- PYB",
                        "Jharsuguda -- Veer Surendra Sai Airport -- JRG",
                        "Rourkela -- Rourkela Airport -- RRK",
                        "Utkela -- Utkela Airport -- UKE",
                        "Amritsar  -- Sri Guru Ram Dass Jee International Airport -- ATQ",
                        "Bathinda -- Bathinda Airport -- BUP",
                        "Jalandhar -- Adampur Airport -- AIP",
                        "Ludhiana -- Ludhiana Airport -- LUH",
                        "Pathankot -- Pathankot Airport -- IXP",
                        "Ajmer -- Kishangarh Airport -- KQH",
                        "Bikaner -- Bikaner Airport -- BKB",
                        "Jaipur -- Jaipur International Airport -- JAI",
                        "Jaisalmer -- Jaisalmer Airport -- JSA",
                        "Jodhpur -- Jodhpur Airport -- JDH",
                        "Kota -- Kota Airport -- KTU",
                        "Udaipur -- Maharana Pratap Airport -- UDR",
                        "Gangtok -- Pakyong Airport -- PYG",
                        "Chennai -- Chennai International Airport -- MAA",
                        "Coimbatore -- Coimbatore International Airport -- CJB",
                        "Madurai -- Madurai Airport -- IXM",
                        "Neyveli -- Neyveli Airport -- NVY",
                        "Salem -- Salem Airport -- SXV",
                        "Thanjavur -- Thanjavur Airport -- TJV",
                        "Thoothukkudi -- Tuticorin Airport -- TCR",
                        "Tiruchirappalli -- Tiruchirappalli International Airport -- TRZ",
                        "Hyderabad -- Begumpet Airport -- BPM",
                        "Hyderabad -- Rajiv Gandhi International Airport -- HYD",
                        "Warangal -- Warangal Airport -- WGC",
                        "Agartala -- Maharaja Bir Bikram Airport -- IXA",
                        "Kailashahar -- Kailashahar Airport -- IXH",
                        "Kamalpur -- Kamalpur Airport -- IXQ",
                        "Khowai -- Khowai Airport -- IXN",
                        "Agra -- Agra Airport -- AGR",
                        "Ayodhya -- Maharishi Valmiki International Airport -- AYJ",
                        "Bareilly -- Bareilly Airport -- BEK",
                        "Ghaziabad -- Hindon Airport -- HDO",
                        "Gorakhpur -- Gorakhpur Airport -- GOP",
                        "Kanpur  -- Kanpur Airport -- KNU",
                        "Kushinagar -- Kushinagar International Airport -- KBK",
                        "Lucknow -- Chaudhary Charan Singh International Airport -- LKO",
                        "Prayagraj -- Prayagraj Airport -- IXD",
                        "Varanasi -- Lal Bahadur Shastri International Airport -- VNS",
                        "Jewar -- Noida International Airport -- DXN",
                        "Dehradun -- Dehradun Airport -- DED",
                        "Pantnagar -- Pantnagar Airport -- PGH",
                        "Pithoragarh -- Pithoragarh Airport -- NNS",
                        "Balurghat -- Balurghat Airport -- RGH",
                        "Cooch Behar -- Cooch Behar Airport -- COH",
                        "Durgapur -- Kazi Nazrul Islam Airport -- RDP",
                        "Kolkata  -- Netaji Subhas Chandra Bose International Airport -- CCU",
                        "Malda -- Malda Airport -- LDA",
                        "Siliguri -- Bagdogra International Airport -- IXB",
                        "Port Blair -- Veer Savarkar International Airport -- IXZ",
                        "Chandigarh -- Shaheed Bhagat Singh International Airport -- IXC",
                        "Diu -- Diu Airport -- DIU",
                        "Delhi NCR -- Indira Gandhi International Airport -- DEL",
                        "Jammu -- Jammu Airport -- IXJ",
                        "Srinagar -- Srinagar International Airport -- SXR",
                        "Leh -- Kushok Bakula Rimpochee Airport -- IXL",
                        "Agatti Island -- Agatti Airport -- AGX",
                        "Puducherry -- Puducherry Airport -- PNY"
                };

                JComboBox box2=new JComboBox(too);
                box2.setBounds(110,200,750,30);
                cbook_now.add(box2);
                box2.setFont(font);
                box1.setForeground(Color.BLUE);


                JLabel time=new JLabel("Date:");
                time.setBounds(670,70,100,100);
                cbook_now.add(time);
                time.setFont(font);

                String hrs[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","!5","16","17","18","19","20","21","22","23","24",
                        "25","26","27","28","29","30","31"};
                JComboBox hours=new JComboBox(hrs);
                hours.setBounds(1000,200,100,30);
                cbook_now.add(hours);
                hours.setFont(font);
                hours.setForeground(Color.BLUE);

                JLabel hr=new JLabel("Day");
                hr.setBounds(900,170,100,100);
                cbook_now.add(hr);
                hr.setFont(font);

                String min[]={"01","02","03","04","05","06","07","08","09","10","11","12"};


                JComboBox mind=new JComboBox(min);
                mind.setBounds(1000,105,100,30);
                cbook_now.add(mind);
                mind.setFont(font);
                mind.setForeground(Color.BLUE);


                JLabel mi=new JLabel("Month");
                mi.setBounds(900,70,100,100);
                cbook_now.add(mi);
                mi.setFont(font);

                JButton go=new JButton("Go");
                go.setBounds(1120,105,100,30);
                cbook_now.add(go);
                go.setFont(font);
                go.setBackground(Color.BLUE);

                JLabel result=new JLabel();
                result.setBounds(40,260,500,100);
                cbook_now.add(result);
                result.setFont(font1);


                JButton Flight1=new JButton();
                Flight1.setBounds(40,330,300,50);
                cbook_now.add(Flight1);
                Flight1.setFont(font1);
                Flight1.setVisible(false);


                JButton Flight2=new JButton();
                Flight2.setBounds(40,430,300,50);
                cbook_now.add(Flight2);
                Flight2.setFont(font1);
                Flight2.setVisible(false);


                JButton Flight3=new JButton();
                Flight3.setBounds(370,330,300,50);
                cbook_now.add(Flight3);
                Flight3.setFont(font1);
                Flight3.setVisible(false);


                JButton Flight4=new JButton();
                Flight4.setBounds(370,430,300,50);
                cbook_now.add(Flight4);
                Flight4.setFont(font1);
                Flight4.setVisible(false);


                JButton Flight5=new JButton();
                Flight5.setBounds(700,330,300,50);
                cbook_now.add(Flight5);
                Flight5.setFont(font1);
                Flight5.setVisible(false);


                go.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String froms=box1.getSelectedItem().toString();
                        String toos=box2.getSelectedItem().toString();

                        if(froms==toos){
                            result.setText("Flight Not Available,Error ????");
                            Flight1.setText("");
                            Flight1.setVisible(false);
                            Flight2.setText("");
                            Flight2.setVisible(false);
                            Flight3.setText("");
                            Flight3.setVisible(false);
                            Flight4.setText("");
                            Flight4.setVisible(false);
                            Flight5.setText("");
                            Flight5.setVisible(false);


                        }
                        else{
                            result.setText("Available Flight are As...");
                            Flight1.setText("Indigo");
                            Flight1.setForeground(Color.white);
                            Flight1.setBackground(Color.blue);
                            Flight1.setVisible(true);
                            Flight2.setText("AirIndia");
                            Flight2.setBackground(Color.blue);
                            Flight2.setVisible(true);
                            Flight2.setForeground(Color.white);
                            Flight3.setBackground(Color.blue);
                            Flight3.setText("Spice Jet");
                            Flight3.setVisible(true);
                            Flight4.setBackground(Color.blue);
                            Flight3.setForeground(Color.white);
                            Flight4.setText("Vistara");
                            Flight4.setVisible(true);
                            Flight4.setForeground(Color.white);
                            Flight5.setText("British Airways");
                            Flight5.setBackground(Color.blue);
                            Flight5.setVisible(true);
                            Flight5.setForeground(Color.white);



                        }

                    }
                });




                Flight1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame flight1details=new JFrame("Indigo Airways");
                        flight1details.setBounds(100,100 ,1400,700);
                        flight1details.setResizable(true);
                        flight1details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                        Container flight1add=flight1details.getContentPane();
                        flight1details.setLayout(null);

                        JButton traveller=new JButton("Indigo Airlines");
                        traveller.setBounds(40,40,220,30);
                        flight1add.add(traveller);
                        traveller.setFont(font);
                        traveller.setForeground(Color.white);
                        traveller.setBackground(Color.MAGENTA);


                        JButton Notice=new JButton("Traveller Details");
                        Notice.setBounds(360,40,220,30);
                        flight1add.add(Notice);
                        Notice.setFont(font);
                        Notice.setForeground(Color.white);
                        Notice.setBackground(Color.ORANGE);



                        JLabel Nameflight1=new JLabel("Name:");
                        Nameflight1.setBounds(40,80,100,100);
                        flight1details.add(Nameflight1);
                        Nameflight1.setFont(font);

                        JTextField Nameflight1field=new JTextField();
                        Nameflight1field.setBounds(360,120,220,30);
                        flight1add.add(Nameflight1field);
                        Nameflight1field.setFont(font);

                        JLabel ageflight1=new JLabel("Age:");
                        ageflight1.setBounds(40,140,100,100);
                        flight1details.add(ageflight1);
                        ageflight1.setFont(font);

                        JTextField Ageflight1field=new JTextField();
                        Ageflight1field.setBounds(360,170,220,30);
                        flight1add.add(Ageflight1field);
                        Ageflight1field.setFont(font);

                        JLabel Genderflight1=new JLabel("Gender");
                        Genderflight1.setBounds(40,200,100,100);
                        flight1details.add(Genderflight1);
                        Genderflight1.setFont(font);


                        JTextField Genderflight1field=new JTextField();
                        Genderflight1field.setBounds(360,230,220,30);
                        flight1add.add(Genderflight1field);
                        Genderflight1field.setFont(font);

                        JLabel contactflight1=new JLabel("Contact No:");
                        contactflight1.setBounds(40,260,200,100);
                        flight1details.add(contactflight1);
                        contactflight1.setFont(font);


                        JTextField contactflight1field=new JTextField();
                        contactflight1field.setBounds(360,290,220,30);
                        flight1add.add(contactflight1field);
                        contactflight1field.setFont(font);


                        JLabel Stateflight1=new JLabel("Your State:");
                        Stateflight1.setBounds(40,320,200,100);
                        flight1details.add(Stateflight1);
                        Stateflight1.setFont(font);


                        JTextField Stateflight1field=new JTextField();
                        Stateflight1field.setBounds(360,350,220,30);
                        flight1add.add(Stateflight1field);
                        Stateflight1field.setFont(font);

                        JLabel emailflight1=new JLabel("Email:");
                        emailflight1.setBounds(40,380,100,100);
                        flight1details.add(emailflight1);
                        emailflight1.setFont(font);


                        JTextField emailflight1field=new JTextField();
                        emailflight1field.setBounds(360,410,220,30);
                        flight1add.add(emailflight1field);
                        emailflight1field.setFont(font);

                        JButton proceedtopaymentflight1=new JButton("Proceed To Payment");
                        proceedtopaymentflight1.setBounds(40,520,300,30);
                        flight1details.add(proceedtopaymentflight1);
                        proceedtopaymentflight1.setFont(font);
                        proceedtopaymentflight1.setBackground(Color.blue);

                        JButton canceltopaymentflight1=new JButton("Back");
                        canceltopaymentflight1.setBounds(400,520,150,30);
                        flight1details.add(canceltopaymentflight1);
                        canceltopaymentflight1.setFont(font);
                        canceltopaymentflight1.setBackground(Color.blue);
                        canceltopaymentflight1.setForeground(Color.WHITE);

                        canceltopaymentflight1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                flight1details.setVisible(false);
                            }
                        });

                        proceedtopaymentflight1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                String getname=Nameflight1field.getText().toString();
                                String getage=Ageflight1field.getText().toString();
                                String getemail=emailflight1field.getText().toString();
                                String getcontact=contactflight1field.getText().toString();
                                String getgender=Genderflight1field.getText().toString();
                                String getyourstate=Stateflight1field.getText().toString();

                                String url="jdbc:mysql://localhost:3306/Airlines_Reservation_system";
                                String username="root";
                                String password="";
                                try {
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                    Connection connection= DriverManager.getConnection(url,username,password);


                                    Statement statement=connection.createStatement();

                                    String query="INSERT INTO `indiago_traveller_details`(`name`, `age`, `email`, `contact_no`, `gender`, `Your state`) VALUES (?,?,?,?,?,?)";
                                    PreparedStatement pst=connection.prepareStatement(query);
                                    pst.setString(1,getname);
                                    pst.setString(2,getage);
                                    pst.setString(3,getemail);
                                    pst.setString(4,getcontact);
                                    pst.setString(5,getgender);
                                    pst.setString(6,getyourstate);


                                    pst.executeUpdate();

                                    JOptionPane.showMessageDialog(null,"Registered Successfully");


                                }
                                catch (Exception e2){
                                    JOptionPane.showMessageDialog(null,e2);
                                }





                                JFrame payment1=new JFrame("Payment gateway");
                                payment1.setBounds(100,100 ,1400,700);
                                payment1.setResizable(true);
                                payment1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                                Container paymentflight1=payment1.getContentPane();
                                paymentflight1.setLayout(null);

                                JLabel confirmflight1=new JLabel("Confirm Ticket");
                                confirmflight1.setBounds(500,20,400,100);
                                paymentflight1.add(confirmflight1);
                                confirmflight1.setForeground(Color.BLUE);
                                confirmflight1.setFont(font1);


                                JLabel Sourceflight1=new JLabel("Source:");
                                Sourceflight1.setBounds(125,100,400,100);
                                paymentflight1.add(Sourceflight1);

                                Sourceflight1.setFont(font1);

                                JLabel Answersourceflight1=new JLabel("");
                                Answersourceflight1.setBounds(250,100,400,100);
                                paymentflight1.add(Answersourceflight1);
                                Answersourceflight1.setFont(font1);
                                Answersourceflight1.setForeground(Color.BLUE);

                                String sourceinfoflight1=box1.getSelectedItem().toString();
                                Answersourceflight1.setText(sourceinfoflight1);

                                JLabel Destinationflight1=new JLabel("Destination:");
                                Destinationflight1.setBounds(700,100,400,100);
                                paymentflight1.add(Destinationflight1);

                                Destinationflight1.setFont(font1);


                                JLabel Answerdestination1=new JLabel("");
                                Answerdestination1.setBounds(930,100,400,100);
                                paymentflight1.add(Answerdestination1);
                                Answerdestination1.setFont(font1);
                                Answerdestination1.setForeground(Color.BLUE);

                                String destinationinfoflight1=box2.getSelectedItem().toString();
                                Answerdestination1.setText(destinationinfoflight1);

                                JLabel Departuredateflight1=new JLabel("Departure Date:");
                                Departuredateflight1.setBounds(125,200,400,100);
                                paymentflight1.add(Departuredateflight1);
                                Departuredateflight1.setFont(font1);

                                JLabel Answerdepartureflight1=new JLabel("");
                                Answerdepartureflight1.setBounds(390,200,200,100);
                                paymentflight1.add(Answerdepartureflight1);
                                Answerdepartureflight1.setFont(font1);

                                String day=hours.getSelectedItem().toString()+"/"+mind.getSelectedItem();
                                Answerdepartureflight1.setText(day+"/"+"2024");
                                Answerdepartureflight1.setForeground(Color.BLUE);

                                JLabel flightnumberflight1=new JLabel("Flight Number:");
                                flightnumberflight1.setBounds(700,200,400,100);
                                paymentflight1.add(flightnumberflight1);

                                flightnumberflight1.setFont(font1);

                                JLabel flightn=new JLabel("1001");
                                flightn.setBounds(950,200,200,100);
                                paymentflight1.add(flightn);
                                flightn.setFont(font1);
                                flightn.setForeground(Color.BLUE);

                                JLabel companyflight11=new JLabel("Company:");
                                companyflight11.setBounds(125,300,400,100);
                                paymentflight1.add(companyflight11);
                                companyflight11.setFont(font1);

                                JLabel companynameflight11=new JLabel("IndiGo");
                                companynameflight11.setBounds(390,300,200,100);
                                paymentflight1.add(companynameflight11);
                                companynameflight11.setFont(font1);
                                companynameflight11.setForeground(Color.BLUE);

                                JLabel Priceflight1=new JLabel("Price:");
                                Priceflight1.setBounds(700,300,400,100);
                                paymentflight1.add(Priceflight1);

                                Priceflight1.setFont(font1);

                                JLabel answerpriceflight1=new JLabel("6990/-");
                                answerpriceflight1.setBounds(950,300,200,100);
                                paymentflight1.add(answerpriceflight1);
                                answerpriceflight1.setFont(font1);
                                answerpriceflight1.setForeground(Color.BLUE);

                                JLabel Nameflight11=new JLabel("Name:");
                                Nameflight11.setBounds(125,400,400,100);
                                paymentflight1.add(Nameflight11);
                                Nameflight11.setFont(font1);

                                JLabel nameflight11=new JLabel("");
                                nameflight11.setBounds(390,400,200,100);
                                paymentflight1.add(nameflight11);



                                String ns=Nameflight1field.getText().toString();
                                nameflight11.setText(ns);
                                nameflight11.setForeground(Color.BLUE);
                                nameflight11.setFont(font1);

                                JLabel emailanswerpriceflight1=new JLabel("Email:");
                                emailanswerpriceflight1.setBounds(700,400,200,100);
                                paymentflight1.add(emailanswerpriceflight1);
                                emailanswerpriceflight1.setFont(font1);

                                JLabel emailansweranswerpriceflight1=new JLabel("");
                                emailansweranswerpriceflight1.setBounds(900,400,200,100);
                                paymentflight1.add(emailansweranswerpriceflight1);
                                emailansweranswerpriceflight1.setFont(font1);
                                emailansweranswerpriceflight1.setForeground(Color.BLUE);

                                String emaislanswers=emailflight1field.getText().toString();
                                emailansweranswerpriceflight1.setText(emaislanswers);
                                emailansweranswerpriceflight1.setForeground(Color.BLUE);






                                JButton Confirmbookingflight1=new JButton("Confirm Booking");
                                Confirmbookingflight1.setBounds(125,500,400,45);
                                paymentflight1.add(Confirmbookingflight1);
                                Confirmbookingflight1.setFont(font1);
                                Confirmbookingflight1.setBackground(Color.blue);
                                Confirmbookingflight1.setForeground(Color.white);


                                JButton Cancelbookingflight1=new JButton("Cancel Booking:");
                                Cancelbookingflight1.setBounds(700,500,400,45);
                                paymentflight1.add(Cancelbookingflight1);
                                Cancelbookingflight1.setForeground(Color.white);



                                Cancelbookingflight1.setFont(font1);
                                Cancelbookingflight1.setBackground(Color.blue);
                                Cancelbookingflight1.setForeground(Color.white);

                                Cancelbookingflight1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        payment1.setVisible(false);
                                    }
                                });
                                Confirmbookingflight1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String source=Answersourceflight1.getText().toString();
                                        String destination1=Answerdestination1.getText().toString();
                                        String departure=Answerdepartureflight1.getText().toString();
                                        String flight_numer=flightn.getText().toString();
                                        String company_name=nameflight11.getText().toString();
                                        String price1=answerpriceflight1.getText().toString();
                                        String emailsanswerflightss=emailflight1field.getText().toString();


                                        String url="jdbc:mysql://localhost:3306/Airlines_Reservation_system";
                                        String username="root";
                                        String password="";
                                        try {
                                            Class.forName("com.mysql.cj.jdbc.Driver");
                                            Connection connection= DriverManager.getConnection(url,username,password);


                                            Statement statement=connection.createStatement();

                                            String query="INSERT INTO `indigo_confirm_ticket_traveelers_details`(`Source`, `Destination`, `Departure_Details`, `Flight_Number`, `Name`, `Price`, `email`) VALUES (?,?,?,?,?,?,?)";
                                            PreparedStatement pst=connection.prepareStatement(query);
                                            pst.setString(1,source);
                                            pst.setString(2,destination1);
                                            pst.setString(3,departure);
                                            pst.setString(4,flight_numer);
                                            pst.setString(5,company_name);
                                            pst.setString(6,price1);
                                            pst.setString(7,emailsanswerflightss);


                                            pst.executeUpdate();

                                            JOptionPane.showMessageDialog(null,"Booked Successfully");
                                            flight1details.setVisible(false);
                                            flight1details.setVisible(false);


                                        }
                                        catch (Exception e2){
                                            JOptionPane.showMessageDialog(null,e2);
                                        }




                                    }
                                });






                                About.setFont(font);



                                payment1.setVisible(true);

                            }
                        });
                        flight1details.setVisible(true);
                    }
                });
                Flight2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame flight2detail=new JFrame("AirIndia");
                        flight2detail.setBounds(100,100 ,1400,700);
                        flight2detail.setResizable(true);

                        Container flight2details=flight2detail.getContentPane();
                        flight2details.setLayout(null);

                        JButton traveller2=new JButton("AirIndia");
                        traveller2.setBounds(40,40,220,30);
                        flight2details.add(traveller2);
                        traveller2.setFont(font);
                        traveller2.setForeground(Color.white);
                        traveller2.setBackground(Color.MAGENTA);

                        JButton Notice2=new JButton("Traveller Details");
                        Notice2.setBounds(360,40,220,30);
                        flight2details.add(Notice2);
                        Notice2.setFont(font);
                        Notice2.setForeground(Color.white);
                        Notice2.setBackground(Color.ORANGE);

                        JLabel Nameflight2=new JLabel("Name:");
                        Nameflight2.setBounds(40,80,100,100);
                        flight2details.add(Nameflight2);
                        Nameflight2.setFont(font);


                        JLabel ageflight2=new JLabel("Age:");
                        ageflight2.setBounds(40,140,100,100);
                        flight2details.add(ageflight2);
                        ageflight2.setFont(font);

                        JLabel Genderflight2=new JLabel("Gender");
                        Genderflight2.setBounds(40,200,100,100);
                        flight2details.add(Genderflight2);
                        Genderflight2.setFont(font);

                        JLabel contactflight2=new JLabel("Contact No:");
                        contactflight2.setBounds(40,260,200,100);
                        flight2details.add(contactflight2);
                        contactflight2.setFont(font);

                        JLabel Stateflight2=new JLabel("Your State:");
                        Stateflight2.setBounds(40,320,200,100);
                        flight2details.add(Stateflight2);
                        Stateflight2.setFont(font);

                        JLabel emailflight2=new JLabel("Email:");
                        emailflight2.setBounds(40,380,100,100);
                        flight2details.add(emailflight2);
                        emailflight2.setFont(font);

                        JTextField Nameflight2field=new JTextField();
                        Nameflight2field.setBounds(360,120,220,30);
                        flight2details.add(Nameflight2field);
                        Nameflight2field.setFont(font);


                        JTextField Ageflight2field=new JTextField();
                        Ageflight2field.setBounds(360,170,220,30);
                        flight2details.add(Ageflight2field);
                        Ageflight2field.setFont(font);

                        JTextField Genderflight2field=new JTextField();
                        Genderflight2field.setBounds(360,230,220,30);
                        flight2details.add(Genderflight2field);
                        Genderflight2field.setFont(font);

                        JTextField contactflight2field=new JTextField();
                        contactflight2field.setBounds(360,290,220,30);
                        flight2details.add(contactflight2field);
                        contactflight2field.setFont(font);

                        JTextField Stateflight2field=new JTextField();
                        Stateflight2field.setBounds(360,350,220,30);
                        flight2details.add(Stateflight2field);
                        Stateflight2field.setFont(font);

                        JTextField emailflight2field=new JTextField();
                        emailflight2field.setBounds(360,410,220,30);
                        flight2details.add(emailflight2field);
                        emailflight2field.setFont(font);

                        JButton proceedtopaymentflight2=new JButton("Proceed To Payment");
                        proceedtopaymentflight2.setBounds(40,520,300,30);
                        flight2details.add(proceedtopaymentflight2);
                        proceedtopaymentflight2.setFont(font);
                        proceedtopaymentflight2.setBackground(Color.blue);

                        JButton canceltopaymentflight2=new JButton("Back");
                        canceltopaymentflight2.setBounds(400,520,150,30);
                        flight2details.add(canceltopaymentflight2);
                        canceltopaymentflight2.setFont(font);
                        canceltopaymentflight2.setBackground(Color.blue);
                        canceltopaymentflight2.setForeground(Color.WHITE);

                        canceltopaymentflight2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                flight2detail.setVisible(false);


                            }
                        });










                        flight2detail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        flight2detail.setVisible(true);


                    }
                });
                Flight3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame flight3details=new JFrame("Spice Jet");
                        flight3details.setBounds(100,100 ,1400,700);
                        flight3details.setResizable(true);
                        flight3details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                        Container flight3add=flight3details.getContentPane();
                        flight3add.setLayout(null);

                        JButton traveller3=new JButton("Spice Jet");
                        traveller3.setBounds(40,40,220,30);
                        flight3details.add(traveller3);
                        traveller3.setFont(font);
                        traveller3.setForeground(Color.white);
                        traveller3.setBackground(Color.MAGENTA);

                        JButton Notice3=new JButton("Traveller Details");
                        Notice3.setBounds(360,40,220,30);
                        flight3details.add(Notice3);
                        Notice3.setFont(font);
                        Notice3.setForeground(Color.white);
                        Notice3.setBackground(Color.ORANGE);

                        JLabel Nameflight3=new JLabel("Name:");
                        Nameflight3.setBounds(40,80,100,100);
                        flight3add.add(Nameflight3);
                        Nameflight3.setFont(font);


                        JLabel ageflight3=new JLabel("Age:");
                        ageflight3.setBounds(40,140,100,100);
                        flight3add.add(ageflight3);
                        ageflight3.setFont(font);

                        JLabel Genderflight3=new JLabel("Gender");
                        Genderflight3.setBounds(40,200,100,100);
                        flight3add.add(Genderflight3);
                        Genderflight3.setFont(font);

                        JLabel contactflight3=new JLabel("Contact No:");
                        contactflight3.setBounds(40,260,200,100);
                        flight3add.add(contactflight3);
                        contactflight3.setFont(font);

                        JLabel Stateflight3=new JLabel("Your State:");
                        Stateflight3.setBounds(40,320,200,100);
                        flight3add.add(Stateflight3);
                        Stateflight3.setFont(font);

                        JLabel emailflight3=new JLabel("Email:");
                        emailflight3.setBounds(40,380,100,100);
                        flight3add.add(emailflight3);
                        emailflight3.setFont(font);

                        JButton proceedtopaymentflight3=new JButton("Proceed To Payment");
                        proceedtopaymentflight3.setBounds(40,520,300,30);
                        flight3add.add(proceedtopaymentflight3);
                        proceedtopaymentflight3.setFont(font);
                        proceedtopaymentflight3.setBackground(Color.blue);


                        JTextField Nameflight3field=new JTextField();
                        Nameflight3field.setBounds(360,120,220,30);
                        flight3add.add(Nameflight3field);
                        Nameflight3field.setFont(font);


                        JTextField Ageflight3field=new JTextField();
                        Ageflight3field.setBounds(360,170,220,30);
                        flight3add.add(Ageflight3field);
                        Ageflight3field.setFont(font);

                        JTextField Genderflight3field=new JTextField();
                        Genderflight3field.setBounds(360,230,220,30);
                        flight3add.add(Genderflight3field);
                        Genderflight3field.setFont(font);

                        JTextField contactflight3field=new JTextField();
                        contactflight3field.setBounds(360,290,220,30);
                        flight3add.add(contactflight3field);
                        contactflight3field.setFont(font);

                        JTextField Stateflight3field=new JTextField();
                        Stateflight3field.setBounds(360,350,220,30);
                        flight3add.add(Stateflight3field);
                        Stateflight3field.setFont(font);

                        JTextField emailflight3field=new JTextField();
                        emailflight3field.setBounds(360,410,220,30);
                        flight3add.add(emailflight3field);
                        emailflight3field.setFont(font);

                        JButton canceltopaymentflight3=new JButton("Back");
                        canceltopaymentflight3.setBounds(400,520,150,30);
                        flight3add.add(canceltopaymentflight3);
                        canceltopaymentflight3.setFont(font);
                        canceltopaymentflight3.setBackground(Color.blue);
                        canceltopaymentflight3.setForeground(Color.WHITE);

                        canceltopaymentflight3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                flight3details.setVisible(false);

                            }
                        });






                        flight3details.setVisible(true);


                    }
                });

                Flight4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame flight4details=new JFrame("Vistara");
                        flight4details.setBounds(100,100 ,1400,700);
                        flight4details.setResizable(true);
                        flight4details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                        Container flight4add=flight4details.getContentPane();
                        flight4add.setLayout(null);

                        JButton traveller4=new JButton("Vistara");
                        traveller4.setBounds(40,40,220,30);
                        flight4add.add(traveller4);
                        traveller4.setFont(font);
                        traveller4.setForeground(Color.white);
                        traveller4.setBackground(Color.MAGENTA);

                        JButton Notice4=new JButton("Traveller Details");
                        Notice4.setBounds(360,40,220,30);
                        flight4add.add(Notice4);
                        Notice4.setFont(font);
                        Notice4.setForeground(Color.white);
                        Notice4.setBackground(Color.ORANGE);

                        JLabel Nameflight4=new JLabel("Name:");
                        Nameflight4.setBounds(40,80,100,100);
                        flight4add.add(Nameflight4);
                        Nameflight4.setFont(font);


                        JLabel ageflight4=new JLabel("Age:");
                        ageflight4.setBounds(40,140,100,100);
                        flight4add.add(ageflight4);
                        ageflight4.setFont(font);

                        JLabel Genderflight4=new JLabel("Gender");
                        Genderflight4.setBounds(40,200,100,100);
                        flight4add.add(Genderflight4);
                        Genderflight4.setFont(font);

                        JLabel contactflight4=new JLabel("Contact No:");
                        contactflight4.setBounds(40,260,200,100);
                        flight4add.add(contactflight4);
                        contactflight4.setFont(font);

                        JLabel Stateflight4=new JLabel("Your State:");
                        Stateflight4.setBounds(40,320,200,100);
                        flight4add.add(Stateflight4);
                        Stateflight4.setFont(font);

                        JLabel emailflight4=new JLabel("Email:");
                        emailflight4.setBounds(40,380,100,100);
                        flight4add.add(emailflight4);
                        emailflight4.setFont(font);

                        JButton proceedtopaymentflight4=new JButton("Proceed To Payment");
                        proceedtopaymentflight4.setBounds(40,520,300,30);
                        flight4add.add(proceedtopaymentflight4);
                        proceedtopaymentflight4.setFont(font);
                        proceedtopaymentflight4.setBackground(Color.blue);


                        JTextField Nameflight4field=new JTextField();
                        Nameflight4field.setBounds(360,120,220,30);
                        flight4add.add(Nameflight4field);
                        Nameflight4field.setFont(font);


                        JTextField Ageflight4field=new JTextField();
                        Ageflight4field.setBounds(360,170,220,30);
                        flight4add.add(Ageflight4field);
                        Ageflight4field.setFont(font);

                        JTextField Genderflight4field=new JTextField();
                        Genderflight4field.setBounds(360,230,220,30);
                        flight4add.add(Genderflight4field);
                        Genderflight4field.setFont(font);

                        JTextField contactflight4field=new JTextField();
                        contactflight4field.setBounds(360,290,220,30);
                        flight4add.add(contactflight4field);
                        contactflight4field.setFont(font);

                        JTextField Stateflight4field=new JTextField();
                        Stateflight4field.setBounds(360,350,220,30);
                        flight4add.add(Stateflight4field);
                        Stateflight4field.setFont(font);

                        JTextField emailflight4field=new JTextField();
                        emailflight4field.setBounds(360,410,220,30);
                        flight4add.add(emailflight4field);
                        emailflight4field.setFont(font);

                        JButton canceltopaymentflight4=new JButton("Back");
                        canceltopaymentflight4.setBounds(400,520,150,30);
                        flight4add.add(canceltopaymentflight4);
                        canceltopaymentflight4.setFont(font);
                        canceltopaymentflight4.setBackground(Color.blue);
                        canceltopaymentflight4.setForeground(Color.WHITE);

                        canceltopaymentflight4.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                flight4details.setVisible(false);

                            }
                        });








                        flight4details.setVisible(true);


                    }
                });
                Flight5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame flight5details=new JFrame("British Airways");
                        flight5details.setBounds(100,100 ,1400,700);
                        flight5details.setResizable(true);

                        flight5details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


                        Container flight5add=flight5details.getContentPane();
                        flight5add.setLayout(null);

                        JButton traveller5=new JButton("British Airways");
                        traveller5.setBounds(40,40,220,30);
                        flight5add.add(traveller5);
                        traveller5.setFont(font);
                        traveller5.setForeground(Color.white);
                        traveller5.setBackground(Color.MAGENTA);

                        JButton Notice5=new JButton("Traveller Details");
                        Notice5.setBounds(360,40,220,30);
                        flight5add.add(Notice5);
                        Notice5.setFont(font);
                        Notice5.setForeground(Color.white);
                        Notice5.setBackground(Color.ORANGE);

                        JLabel Nameflight5=new JLabel("Name:");
                        Nameflight5.setBounds(40,80,100,100);
                        flight5add.add(Nameflight5);
                        Nameflight5.setFont(font);


                        JLabel ageflight5=new JLabel("Age:");
                        ageflight5.setBounds(40,140,100,100);
                        flight5add.add(ageflight5);
                        ageflight5.setFont(font);

                        JLabel Genderflight5=new JLabel("Gender");
                        Genderflight5.setBounds(40,200,100,100);
                        flight5add.add(Genderflight5);
                        Genderflight5.setFont(font);

                        JLabel contactflight5=new JLabel("Contact No:");
                        contactflight5.setBounds(40,260,200,100);
                        flight5add.add(contactflight5);
                        contactflight5.setFont(font);

                        JLabel Stateflight5=new JLabel("Your State:");
                        Stateflight5.setBounds(40,320,200,100);
                        flight5add.add(Stateflight5);
                        Stateflight5.setFont(font);

                        JLabel emailflight5=new JLabel("Email:");
                        emailflight5.setBounds(40,380,100,100);
                        flight5add.add(emailflight5);
                        emailflight5.setFont(font);

                        JButton proceedtopaymentflight5=new JButton("Proceed To Payment");
                        proceedtopaymentflight5.setBounds(40,520,300,30);
                        flight5add.add(proceedtopaymentflight5);
                        proceedtopaymentflight5.setFont(font);
                        proceedtopaymentflight5.setBackground(Color.blue);



                        JTextField Nameflight5field=new JTextField();
                        Nameflight5field.setBounds(360,120,220,30);
                        flight5add.add(Nameflight5field);
                        Nameflight5field.setFont(font);


                        JTextField Ageflight5field=new JTextField();
                        Ageflight5field.setBounds(360,170,220,30);
                        flight5add.add(Ageflight5field);
                        Ageflight5field.setFont(font);

                        JTextField Genderflight5field=new JTextField();
                        Genderflight5field.setBounds(360,230,220,30);
                        flight5add.add(Genderflight5field);
                        Genderflight5field.setFont(font);

                        JTextField contactflight5field=new JTextField();
                        contactflight5field.setBounds(360,290,220,30);
                        flight5add.add(contactflight5field);
                        contactflight5field.setFont(font);

                        JTextField Stateflight5field=new JTextField();
                        Stateflight5field.setBounds(360,350,220,30);
                        flight5add.add(Stateflight5field);
                        Stateflight5field.setFont(font);

                        JTextField emailflight5field=new JTextField();
                        emailflight5field.setBounds(360,410,220,30);
                        flight5add.add(emailflight5field);
                        emailflight5field.setFont(font);

                        JButton canceltopaymentflight5=new JButton("Back");
                        canceltopaymentflight5.setBounds(400,520,150,30);
                        flight5add.add(canceltopaymentflight5);
                        canceltopaymentflight5.setFont(font);
                        canceltopaymentflight5.setBackground(Color.blue);
                        canceltopaymentflight5.setForeground(Color.WHITE);

                        canceltopaymentflight5.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                flight5details.setVisible(false);
                            }
                        });




                        flight5details.setVisible(true);


                    }
                });


                JButton canceltopaymentflight6=new JButton("Back");
                canceltopaymentflight6.setBounds(40,530,150,30);
                cbook_now.add(canceltopaymentflight6);
                canceltopaymentflight6.setFont(font);
                canceltopaymentflight6.setBackground(Color.blue);
                canceltopaymentflight6.setForeground(Color.WHITE);

                canceltopaymentflight6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Book_now_frame.setVisible(false);

                    }
                });

                Book_now_frame.setVisible(true);
            }

        });


        frame.setVisible(true);
    }

}
