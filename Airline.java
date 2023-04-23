import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class Airline extends JDBC
{
    JButton Submit,Cancel,Confirm;
     String fname,lname,date;
    String fname_innerframe,lname_innerframe,mobNo_innerframe;
    String given_age,mob_number;
    Object source,destination,gender,flying_class,flights_avail,time_in_hours,time_in_minutes;

    public static void main(String args[])
    {

        String[] sources = {"Amritsar","Bangalore","Chennai","Delhi","Goa","Hyderabad","Indore","Jaipur","Kolkata","Lucknow","Mumbai","Nagpur","Patna","Srinagar","Trivandrum","Udaipur","Vizag","Aizawal","Bhopal","Ahmedabad","Gaya"};
        String[] destination={"Amritsar","Bangalore","Chennai","Delhi","Goa","Hyderabad","Indore","Jaipur","Kolkata","Lucknow","Mumbai","Nagpur","Patna","Srinagar","Trivandrum","Udaipur","Vizag","Aizawal","Bhopal","Ahmedabad","Gaya"};

        ImageIcon image = new ImageIcon("D:\\Java programming\\Programs\\Mcq_question\\src\\logo.jpeg");

        JLabel firstname_label = new JLabel();
        firstname_label.setText("First name:");
        firstname_label.setBounds(0,0,80,20);
        JLabel lastname_label = new JLabel("Last name:");
       lastname_label.setBounds(0,20,80,40);
       JLabel age_label = new JLabel("Age:");
       age_label.setBounds(0,60,80,40);
       JLabel gender_label = new JLabel("Gender:");
       gender_label.setBounds(0,100,80,40);
       JLabel mobilenumber_label= new JLabel("Mobile Number:");
       mobilenumber_label.setBounds(0,140,90,40);
       JLabel from_label = new JLabel("From:");
       from_label.setBounds(300,60,80,40);
       JLabel to_label =new JLabel("TO:");
       to_label.setBounds(500,60,80,40);
       JLabel class_s = new JLabel("Class:");
       class_s.setBounds(665,60,80,40);
       JLabel cancellation_label = new JLabel("Press on 'Cancel Booking' for cancellation of ticket");
       cancellation_label.setBounds(0,250,290,40);
       JLabel nameof_flights = new JLabel("Flights available:");
       nameof_flights.setBounds(850,60,100,40);
       JLabel date = new JLabel("Date:");
       date.setBounds(500,148,40,30);
       JLabel Time_hours = new JLabel("Time(in hours):");
       Time_hours.setBounds(763,141,100,40);
       JLabel Time_minutes = new JLabel("Time(in minutes):");
       Time_minutes.setBounds(980,141,100,40);

        JTextField first_name = new JTextField();
        first_name.setPreferredSize(new Dimension(200,22));
        first_name.setFont(new Font("Consolas",Font.PLAIN,16));
        first_name.setBounds(80,5,200,22);
        JTextField last_name= new JTextField();
        last_name.setPreferredSize(new Dimension(200,22));
        last_name.setFont(new Font("Consolas", Font.PLAIN,16));
        last_name.setBounds(80,32,200,22);
        JTextField age = new JTextField();
        age.setPreferredSize(new Dimension(200,22));
        age.setFont(new Font("Consolas",Font.PLAIN,16));
        age.setBounds(80,70,200,22);
        JTextField mobile_number = new JTextField();
        mobile_number.setPreferredSize(new Dimension(200,22));
        mobile_number.setFont(new Font("Consolas",Font.PLAIN,16));
        mobile_number.setBounds(92,152,200,22);
        JTextField date_field = new JTextField();
        date_field.setFont(new Font("Consolas",Font.PLAIN,16));
        date_field.setPreferredSize(new Dimension(200,22));
        date_field.setBounds(540,152,200,22);

        JComboBox gender_select = new JComboBox();
        gender_select.addItem("Male");
        gender_select.addItem("Female");
        gender_select.addItem("Other");
        gender_select.setBounds(80,110,80,20);
        JComboBox from_box = new JComboBox();
        for(int i=0;i< sources.length;i++)
        {
            from_box.addItem(sources[i]);
        }
        from_box.setBounds(340,71,120,20);
        JComboBox to_box= new JComboBox();
        for(int i=0;i<destination.length;i++)
        {
            to_box.addItem(destination[i]);
        }
        to_box.setBounds(530,71,120,20);
        JComboBox class_s_box= new JComboBox();
        class_s_box.addItem("Economy");
        class_s_box.addItem("Business");
        class_s_box.addItem("First");
        class_s_box.setBounds(710,71,120,20);
        JComboBox name_offlights_box = new JComboBox();
        name_offlights_box.addItem("Air India");
       name_offlights_box.addItem("Spice Jet");
       name_offlights_box.addItem("Vistara");
       name_offlights_box.addItem("Indigo");
       name_offlights_box.addItem("Air Aisa");
       name_offlights_box.setBounds(955,70,100,20);
       JComboBox hours_box = new JComboBox();
       for(int i=0;i<24;i++)
       {
           hours_box.addItem(i);
       }
       hours_box.setBounds(860,152,100,20);
       JComboBox minutes_box = new JComboBox();
       for(int i=0;i<60;i++)
       {
           minutes_box.addItem(i);
       }
       minutes_box.setBounds(1090,152,100,20);



        JFrame frame= new JFrame("Airline Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.setSize(1500,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(firstname_label);
        frame.add(lastname_label);
        frame.add(Time_hours);
        frame.add(Time_minutes);
        frame.add(age_label);
        frame.add(gender_label);
        frame.add(mobilenumber_label);
        frame.add(from_label);
        frame.add(to_label);
        frame.add(cancellation_label);
        frame.add(class_s);
        frame.add(nameof_flights);
        frame.add(date);
        frame.add(first_name);
        frame.add(last_name);
        frame.add(age);
        frame.add(gender_select);
        frame.add(mobile_number);
        frame.add(date_field);
        frame.add(from_box);
        frame.add(to_box);
        frame.add(class_s_box);
        frame.add(name_offlights_box);
        frame.add(hours_box);
        frame.add(minutes_box);


        Airline obj=new Airline();
        obj.Submit = new JButton("Confirm Booking");
        obj.Submit.setFocusable(false);
        obj.Submit.setBounds(320,200,200,30);
        obj.Submit.setFont(new Font("Consolas",Font.BOLD,16));
        obj.Submit.addActionListener(e -> {obj.fname=first_name.getText();
            obj.lname=last_name.getText();
            obj.given_age = age.getText();
            obj.mob_number= mobile_number.getText();
           obj.gender=gender_select.getItemAt(gender_select.getSelectedIndex());
           obj.source=from_box.getItemAt(from_box.getSelectedIndex());
           obj.destination=to_box.getItemAt(to_box.getSelectedIndex());
           obj.flying_class=class_s_box.getItemAt(class_s_box.getSelectedIndex());
           obj.flights_avail=name_offlights_box.getItemAt(name_offlights_box.getSelectedIndex());
           obj.date=date_field.getText();
           obj.time_in_hours=hours_box.getItemAt(hours_box.getSelectedIndex());
           obj.time_in_minutes=minutes_box.getItemAt(minutes_box.getSelectedIndex());
            JDBC insert1 = new JDBC();
            insert1.insertrow(obj.fname, obj.lname, obj.given_age, obj.mob_number,obj.gender,obj.source,obj.destination,obj.flying_class,obj.flights_avail,obj.date,obj.time_in_hours,obj.time_in_minutes);
            System.out.println("A ticket for "+obj.source+" to "+obj.destination+" has successfully been booked by you.Kindly enjoy your journey");
            JLabel thank_label = new JLabel("Booking done successfully");
            thank_label.setBounds(0,0,480,100);
            thank_label.setFont(new Font("Consolas",Font.BOLD,30));
            JFrame thank_frame= new JFrame();
            thank_frame.setSize(480,100);
            thank_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            thank_frame.add(thank_label);
            thank_frame.setVisible(true);
            thank_frame.setLayout(null);
        });

        obj.Cancel = new JButton("Cancel Booking");
        obj.Cancel.setFocusable(false);
        obj.Cancel.setBounds(320,290,200,30);
        obj.Cancel.setFont(new Font("Consolas",Font.BOLD,16));
        obj.Cancel.addActionListener(e->{


            JLabel firstname_label2 = new JLabel();
            firstname_label2.setText("First name:");
            firstname_label2.setBounds(0,0,80,20);
            JLabel lastname_label2 = new JLabel("Last name:");
            lastname_label2.setBounds(0,20,80,40);
            JLabel mobilenumber_label2= new JLabel("Mobile Number:");
            mobilenumber_label2.setBounds(0,60,90,40);

            JTextField first_name2 = new JTextField();
            first_name2.setPreferredSize(new Dimension(200,22));
            first_name2.setFont(new Font("Consolas",Font.PLAIN,16));
            first_name2.setBounds(80,5,200,22);
            JTextField last_name2= new JTextField();
            last_name2.setPreferredSize(new Dimension(200,22));
            last_name2.setFont(new Font("Consolas", Font.PLAIN,16));
            last_name2.setBounds(80,32,200,22);
            JTextField mobile_number2 = new JTextField();
            mobile_number2.setPreferredSize(new Dimension(200,22));
            mobile_number2.setFont(new Font("Consolas",Font.PLAIN,16));
            mobile_number2.setBounds(100,72,200,22);


            ImageIcon image2 = new ImageIcon("D:\\Java programming\\Programs\\Mcq_question\\src\\logo.jpeg");
           JFrame frame2 = new JFrame();
           frame2.setIconImage(image2.getImage());
           frame2.setSize(500,500);
           frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame2.setVisible(true);
           frame2.setLayout(null);

            obj.Confirm = new JButton("Confirm");
            obj.Confirm.setFocusable(false);
            obj.Confirm.setFont(new Font("Consolas",Font.PLAIN,16));
            obj.Confirm.setBounds(170,150,100,30);
            obj.Confirm.addActionListener(e2->{

                obj.fname_innerframe=first_name2.getText();
                obj.lname_innerframe=last_name2.getText();
                obj.mobNo_innerframe=mobile_number2.getText();
                JDBC delete1 = new JDBC();
                delete1.deleterow(obj.fname_innerframe,obj.lname_innerframe,obj.mobNo_innerframe);
            });

           frame2.add(firstname_label2);
           frame2.add(lastname_label2);
           frame2.add(mobilenumber_label2);
           frame2.add(first_name2);
           frame2.add(last_name2);
           frame2.add(mobile_number2);
           frame2.add(obj.Confirm);
        });

        frame.add(obj.Submit);
        frame.add(obj.Cancel);
    }

}
