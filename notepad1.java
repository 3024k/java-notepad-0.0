
package notepad1;

/*
 *notepad
 *@Humayun ahmed ashik
 *Version 1.00
 */
 
 import java.io.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.awt.print.*;
 import java.util.*;
 import javax.swing.*;
 
 public class notepad1 extends JFrame implements ActionListener {
 	private JFileChooser fc = new JFileChooser();
 	private JTextArea jtxtA;
        GregorianCalendar  gcalendar;
        //Font f;
        String months[]={
        "Jan","Feb","Mar","Apr",
        "May","Jun","Jul","Aug",
        "Sep","Oct","Nov","Dec"};
 	private JMenuBar menu = new JMenuBar();
 	private JMenu file, edit, format,font,fontname,fontstyle, fontsize, bg, fg, help,contact;
 	private JMenuItem nu, open, save, saveas, exit, copy,cut, paste, clear,time_date, sall, print, 
                printpreview, about, b8,b11, b14,b16, b18,b22, b25, b30,fname1,fname2,fname3,fname4,fstyle1,fstyle2,fstyle3,fstyle4, b_blue,
                b_red, b_green,b_black,b_grey,b_white, f_blue, f_red, f_green,f_black,f_grey,f_white,contact_me;
        PrinterJob prntr_M=PrinterJob.getPrinterJob();
 	
        //final static String LOOKANDFEEL = null;
 	
 	public notepad1() {
 		setLocation(200, 200);
 		setTitle("Articlepad 1.00");
 		setSize(new Dimension(700, 500));
 		setDefaultCloseOperation(EXIT_ON_CLOSE);
 		
 		file = new JMenu("File");
 		menu.add(file);
 		
 		nu = new JMenuItem("New...");
 		file.add(nu);
 		nu.addActionListener(this);
 		
 		open = new JMenuItem("Open...");
 		file.add(open);
 		open.addActionListener(this);
 		
 		save = new JMenuItem("Save...");
 		file.add(save);
 		save.addActionListener(this);
 		
 		saveas = new JMenuItem("Save as...");
 		file.add(saveas);
 		saveas.addActionListener(this);
 		
 		file.add(new JSeparator());
 		
 		print = new JMenuItem("Print...");
 		file.add(print);
 		print.addActionListener(this);
 		
 		printpreview = new JMenuItem("Page setup...");
 		file.add(printpreview);
 		printpreview.addActionListener(this);
 		
 		file.add(new JSeparator());
 		
 		exit = new JMenuItem("Exit~");
 		file.add(exit);
 		exit.addActionListener(this);
 		
 		edit = new JMenu("Edit");
 		menu.add(edit);
                
 		copy = new JMenuItem("Copy         ctrl+C");
 		edit.add(copy);
 		copy.addActionListener(this);
                cut = new JMenuItem("Cut            ctrl+X");
 		edit.add(cut);
 		cut.addActionListener(this);
                paste = new JMenuItem("Paste        ctrl+V");
 		edit.add(paste);
 		paste.addActionListener(this);
                clear = new JMenuItem("Clear        delete");
 		edit.add(clear);
 		clear.addActionListener(this);
 		sall = new JMenuItem("Select All  ctrl+A");
 		edit.add(sall);
 		sall.addActionListener(this);
 		time_date = new JMenuItem("Time/Date");
 		edit.add(time_date);
 		time_date.addActionListener(this);
                format = new JMenu("Format");
 		menu.add(format);
                font = new JMenu("Font");
 		format.add(font);
                fontname = new JMenu("Font Name");
 		font.add(fontname);
 		fontname.addActionListener(this);
                fname1 = new JMenuItem("Lucida Console");
 		fontname.add(fname1);
 		fname1.addActionListener(this);
                fname2 = new JMenuItem("Courier");
 		fontname.add(fname2);
 		fname2.addActionListener(this);
                fname3 = new JMenuItem("Sans Serif");
 		fontname.add(fname3);
 		fname3.addActionListener(this);
                fname4 = new JMenuItem("Times New Roman");
 		fontname.add(fname4);
 		fname4.addActionListener(this);
                
                fontstyle = new JMenu("Font Style");
 		font.add(fontstyle);
 		fontstyle.addActionListener(this);
                fstyle1 = new JMenuItem("Regular");
 		fontstyle.add(fstyle1);
 		fstyle1.addActionListener(this);
                fstyle2 = new JMenuItem("Bold");
 		fontstyle.add(fstyle2);
 		fstyle2.addActionListener(this);
                fstyle3 = new JMenuItem("Italic");
 		fontstyle.add(fstyle3);
 		fstyle3.addActionListener(this);
                fstyle4 = new JMenuItem("Bold Italic");
 		fontstyle.add(fstyle4);
 		fstyle4.addActionListener(this);
 		fontsize = new JMenu("Font Size");
 		font.add(fontsize);
 		fontsize.addActionListener(this);
 		
 		b8 = new JMenuItem("8");
 		fontsize.add(b8);
 		b8.addActionListener(this);
 		b11 = new JMenuItem("11");
 		fontsize.add(b11);
 		b11.addActionListener(this);
 		
 		b14 = new JMenuItem("14");
 		fontsize.add(b14);
 		b14.addActionListener(this);
                b16 = new JMenuItem("16");
 		fontsize.add(b16);
 		b16.addActionListener(this);
 		
 		
 		b18 = new JMenuItem("18");
 		fontsize.add(b18);
 		b18.addActionListener(this);
                b22 = new JMenuItem("22");
 		fontsize.add(b22);
 		b22.addActionListener(this);
 		
 		
 		b25 = new JMenuItem("25");
 		fontsize.add(b25);
 		b25.addActionListener(this);
 		
 		b30 = new JMenuItem("30");
 		fontsize.add(b30);
 		b30.addActionListener(this);
 		
 		bg = new JMenu("Background Color");
 		format.add(bg);
 		
 		b_blue = new JMenuItem("Blue");
 		b_blue.addActionListener(this);
 		bg.add(b_blue);
 		
 		b_red = new JMenuItem("Red");
 		b_red.addActionListener(this);
 		bg.add(b_red);
 		
 		b_green = new JMenuItem("Green");
 		b_green.addActionListener(this);
 		bg.add(b_green);
                b_black = new JMenuItem("Black");
 		b_black.addActionListener(this);
 		bg.add(b_black);
               
 		b_white = new JMenuItem("White");
 		b_white.addActionListener(this);
 		bg.add(b_white);
                b_grey = new JMenuItem("Gray");
 		b_grey.addActionListener(this);
 		bg.add(b_grey);
                
 		fg = new JMenu("Foreground Color");
 		format.add(fg);
 		
 		f_blue = new JMenuItem("Blue");
 		f_blue.addActionListener(this);
 		fg.add(f_blue);
 		
 		f_red = new JMenuItem("Red");
 		f_red.addActionListener(this);
 		fg.add(f_red);
 		
 		f_green = new JMenuItem("Green");
 		f_green.addActionListener(this);
 		fg.add(f_green);
 		f_black = new JMenuItem("Black");
 		f_black.addActionListener(this);
 		fg.add(f_black);
                
 		f_white = new JMenuItem("White");
 		f_white.addActionListener(this);
 		fg.add(f_white);
                f_grey = new JMenuItem("Gray");
 		f_grey.addActionListener(this);
 		fg.add(f_grey);
 		help = new JMenu("Help");
 		menu.add(help);
 		
 		
 		about = new JMenuItem("View Help");
 		help.add(about);
 		about.addActionListener(this);
 		contact = new JMenu("Contact");
 		menu.add(contact);
                contact_me = new JMenuItem("Contact me");
 		contact.add(contact_me);
 		contact_me.addActionListener(this);
 		jtxtA = new JTextArea(15, 20);
 		
 		JPanel panel = new JPanel(new GridLayout(1, 1));
 		panel.add(jtxtA);
 		
 		JScrollPane sp = new JScrollPane(panel);
 		
 		JPanel mpane = new JPanel(new GridLayout(1, 1));
 		getContentPane().add(sp);
 		setJMenuBar(menu);
 	}
 	public void actionPerformed(ActionEvent e) {
 		if (e.getSource() == nu) {
 			int nuask = JOptionPane.showConfirmDialog(notepad1.this,"Are you sure? This will make an erease of any unsaved documents!");
 			if (nuask == JOptionPane.YES_OPTION) {
 				jtxtA.setText("");
 			}
 		}
 		if (e.getSource() == open) {
                    int returnVal = fc.showOpenDialog(notepad1.this);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        File file = fc.getSelectedFile();
                        try {
                            BufferedReader inputStream = new BufferedReader(new FileReader(file.getPath()));
                            String inputLine;
                            jtxtA.setText("");
                            setTitle("Articlepad-"+file.getName());
                            while((inputLine = inputStream.readLine()) != null) {
                                  jtxtA.append(inputLine+"\n");
                            }
                        }
                        catch(FileNotFoundException ioe) {
                             JOptionPane.showMessageDialog(null, "Sorry,File Not Found", "", JOptionPane.WARNING_MESSAGE );
                        }
                        catch(IOException ioe) {
                             System.out.println(file.getAbsoluteFile());
                        }
                    }
 		}
 		if (e.getSource() == save) {
                    try {
                        File file = fc.getSelectedFile();
                        FileWriter outputStream=new FileWriter(file.getPath());
                        outputStream.write(jtxtA.getText());
                        outputStream.close();	
                        setTitle("Text Editor-"+file.getName());
                    }
                    catch(IOException ioe) {
                        System.out.println("IOException");
                    }
 		}
 		if (e.getSource() == saveas) {
                    int returnVal = fc.showSaveDialog(notepad1.this);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        try {
                            File file = fc.getSelectedFile();
                            FileWriter outputStream=new FileWriter(file.getPath()+".txt");        				
                            setTitle("Articlepad-"+file.getName());
                            outputStream.write(jtxtA.getText());
                            outputStream.close();
                        }
                        catch(IOException ioe) {
                             System.out.println("IOException");
                        }
                    }
 		}
                if(e.getSource()==printpreview){
                    prntr_M.printDialog();
                }
                if(e.getSource()==print){
                     try{
                            prntr_M.print();
			}
			catch(Exception ew){
                            
			}
                }
 		if (e.getSource() == exit) {
 			int aske = JOptionPane.showConfirmDialog(notepad1.this,"Are you sure you want to exit " +getTitle() + " ?");
 			if (aske == JOptionPane.YES_OPTION) {
 				System.exit(0);
 			}
 		}
 		if (e.getSource() == sall) {
                    jtxtA.selectAll();
 		}
                
 		if (e.getSource() == copy) {
 			jtxtA.copy();
 		}
                if (e.getSource() == cut) {
 			jtxtA.cut();
 		}
 		if (e.getSource() == paste) {
 			jtxtA.paste();
 		}
 		if (e.getSource() == clear) {
 			int cask = JOptionPane.showConfirmDialog(notepad1.this,"Are you sure you want to clear the document?");
 			if (cask == JOptionPane.YES_OPTION) {
 				jtxtA.setText("");
 				setTitle("Articlepad 1.00");
 			}
 		}
                if (e.getSource() == time_date) {
 			gcalendar=new GregorianCalendar();
                        String h=String.valueOf(gcalendar.get(Calendar.HOUR));
                        String m=String.valueOf(gcalendar.get(Calendar.MINUTE));
                        String s=String.valueOf(gcalendar.get(Calendar.SECOND));
                        String date=String.valueOf(gcalendar.get(Calendar.DATE));
                        String mon=months[gcalendar.get(Calendar.MONTH)];
                        String year=String.valueOf(gcalendar.get(Calendar.YEAR));
                        String hms="Time"+" - "+h+":"+m+":"+s+"  Date"+"  -  "+date+"  "+mon+" "+year;
                        int loc=jtxtA.getCaretPosition();
                        jtxtA.insert(hms,loc);
 		}
                if (e.getSource() == fname1) {
 			jtxtA.setFont(new Font("Lucida Console",jtxtA.getFont().getStyle(),jtxtA.getFont().getSize()));
 		}
                if (e.getSource() == fname2) {
 			jtxtA.setFont(new Font("Courier",jtxtA.getFont().getStyle(),jtxtA.getFont().getSize()));
 		}
                if (e.getSource() == fname3) {
 			jtxtA.setFont(new Font("Sans Serif",jtxtA.getFont().getStyle(),jtxtA.getFont().getSize()));
 		}
                if (e.getSource() == fname4) {
 			jtxtA.setFont(new Font("Times New Roman",jtxtA.getFont().getStyle(),jtxtA.getFont().getSize()));
 		}
                if (e.getSource() == fstyle1) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),Font.PLAIN,jtxtA.getFont().getSize()));
 		}
                if (e.getSource() == fstyle2) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),Font.BOLD,jtxtA.getFont().getSize()));
 		}
                if (e.getSource() == fstyle3) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),Font.ITALIC,jtxtA.getFont().getSize()));
 		}
                if (e.getSource() == fstyle4) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),Font.BOLD|Font.ITALIC,jtxtA.getFont().getSize()));
 		}
 		if (e.getSource() == b8) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),8));
 		}
                if (e.getSource() == b11) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),11));
 		}
 		if (e.getSource() == b14) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),14));
 		}
                if (e.getSource() == b16) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),16));
 		}
 		if (e.getSource() == b18) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),18));
 		}
                if (e.getSource() == b22) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),22));
 		}
 		if (e.getSource() == b25) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),25));
 		}
 		if (e.getSource() == b30) {
 			jtxtA.setFont(new Font(jtxtA.getFont().getName(),jtxtA.getFont().getStyle(),30));
 		}
 		if (e.getSource() == about) {
 			JOptionPane.showMessageDialog(null,"What is simple text editor?"
                                + "\nSimple text editor is a basic text-editing program and"
                                + " it's most commonly used to view or edit text files.\n"
                                + " A text file is a file type typically identified by the .txt file name extension.\n"
                                + " How do I cut, copy, paste, or delete text?\n"
                                +"Do one of the following:\n" +
                                "\n" +"To cut text so you can move it to another location, select the text, click the \n"+
                                "Edit menu, and then click Cut.\n" +
                                "\n" +"To an paste it in another location, select the text, click the Edit menu, and then click Copy.\n" +
                                "\n" +"To paste text you have cut or copied, click the location in the file \nwhere you want to paste the text, click the Edit menu, and then click Paste.\n" +
                                "\n" +"To delete text, select it, click the Edit menu, and then click Delete.\n" +
                                "\n"  +
                                "","",JOptionPane.INFORMATION_MESSAGE);
 		}
 		if (e.getSource() == b_blue) {
 			jtxtA.setBackground(Color.BLUE);
 		}
 		if (e.getSource() == b_red) {
 			jtxtA.setBackground(Color.RED);
 		}
 		if (e.getSource() == b_green) {
 			jtxtA.setBackground(Color.GREEN);
 		}
                if (e.getSource() == b_black) {
 			jtxtA.setBackground(Color.BLACK);
 		}
                if (e.getSource() == b_grey) {
 			jtxtA.setBackground(Color.GRAY);
 		}
                if (e.getSource() == b_white) {
 			jtxtA.setBackground(Color.WHITE);
 		}
 		if (e.getSource() == f_blue) {
 			jtxtA.setForeground(Color.BLUE);
 		}
 		if (e.getSource() == f_red) {
 			jtxtA.setForeground(Color.RED);
 		}
 		if (e.getSource() == f_green) {
 			jtxtA.setForeground(Color.GREEN);
 		}
                if (e.getSource() == f_black) {
 			jtxtA.setForeground(Color.BLACK);
 		}
                if (e.getSource() == f_grey) {
 			jtxtA.setForeground(Color.GRAY);
 		}
                if (e.getSource() == f_white) {
 			jtxtA.setForeground(Color.WHITE);
 		}
                if (e.getSource() == contact_me) {
 			JOptionPane.showMessageDialog(null,
					"This Article pad is developed by\nHUMAYUN AHMED ASHIK\nDepartment of Computer Science & Engineering"
                                                + "\nRajshahi University of Engineering & Technology(www.ruet.ac.bd)\nContact with me: 3024hik@gmail.com");
 		}
 	}
 	public static void main (String args[]) {
 		new notepad1().setVisible(true);
 	}
 }