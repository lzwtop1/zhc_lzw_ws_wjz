package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Shiyan extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btn1;
	JButton btn2;
	JButton btn3;

	public Shiyan() {

		setTitle("电影购票系统");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 0, 800, 800);
		setVisible(true);
		ImagePanel1 ip = new ImagePanel1();
		ip.setBounds(0, 0, 800, 600);
		getContentPane().add(ip);

		btn1 = new JButton("按上映时间查询");
		btn2 = new JButton("按电影名查询");
		btn3 = new JButton("购买");
		btn1.setBounds(50, 650, 200, 50);
		btn2.setBounds(550, 650, 200, 50);
		btn3.setBounds(300, 650, 200, 50);
		add(btn1);
		add(btn2);
		add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			SearchMovie fm = new SearchMovie();
			fm.searchmovieFrame1();
		}
		if (e.getSource() == btn2) {
			SearchMovie fm = new SearchMovie();
			fm.searchmovieFrame2();
		}
		if (e.getSource() == btn3) {
			SearchMovie fm = new SearchMovie();
			fm.searchmovieFrame3();
		}

	}

}

class SearchMovie extends QianTai {
	JFrame frm1;
	JFrame frm2;
	JButton myBtn1;
	JButton myBtn2;
	QianTai q;

	public SearchMovie() {
		q = new QianTai();
	}

	
	public void searchmovieFrame1() {
		frm1 = new JFrame();
		frm1.setTitle("欢迎使用电影自助购票系统");
		frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel topPanel = new JPanel();
		frm1.getContentPane().add(topPanel, BorderLayout.NORTH);
		JTextField input = new JTextField();
		myBtn1 = new JButton("按时间查询");
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(30);
		topPanel.add(input);
		topPanel.add(myBtn1);
		// 添加图片的对象
		ImagePanel2 ip = new ImagePanel2();
		ip.setBounds(0, 0, 800, 600);
		frm1.getContentPane().add(ip);
		frm1.setBounds(200, 0, 800, 800);
		frm1.setVisible(true);
		myBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q.searchByShowTime(input.getText());
			}
		});
	}

	public void searchmovieFrame2() {
		frm2 = new JFrame();
		frm2.setTitle("欢迎使用电影自助购票系统");
		frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel topPanel = new JPanel();
		frm2.getContentPane().add(topPanel, BorderLayout.NORTH);
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(30);
		myBtn2 = new JButton("按名称查询");

		topPanel.add(input);
		topPanel.add(myBtn2);
		ImagePanel2 ip = new ImagePanel2();
		ip.setBounds(0, 0, 800, 600);
		frm2.getContentPane().add(ip);
		frm2.setBounds(200, 0, 800, 800);
		frm2.setVisible(true);
		myBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q.searchByName(input.getText());

			}
		});
	}
	
	public void searchmovieFrame3() {
		JFrame frame = new JFrame("电影购票系统");
		Container c = frame.getContentPane();
		ImagePanel3 ip = new ImagePanel3();
		ip.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(ip);
		// frame.setBounds(200,100,800,600);
		// frame.setVisible(true);
		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(null);
		JLabel a1 = new JLabel("电影名:");
		a1.setBounds(200, 400, 100, 20);
		JLabel a2 = new JLabel("电影票数:");
		a2.setBounds(200, 450, 100, 20);
		fieldPanel.add(a1);
		fieldPanel.add(a2);
		JTextField moviename = new JTextField();
		JTextField account = new JTextField();
		moviename.setBounds(270, 400, 300, 20);
		account.setBounds(270, 450, 300, 20);
		fieldPanel.add(moviename);
		fieldPanel.add(account);
		c.add(fieldPanel, "Center");
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		JButton purchase = new JButton("购买");
		buttonPanel.add(purchase);
		c.add(buttonPanel, "South");
		frame.setBounds(200, 100, 800, 600);
		frame.setVisible(true);
		purchase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				q.purchase(moviename.getText(), new Integer(account.getText()));
			}
		});
	}


}

class ImagePanel1 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image img;

	public void paint(Graphics g) {
		try {
			img = ImageIO.read(new File(
					"E://Users//Administrator//Documents//GitHub//workspace//MovieTicketSale//bin//images//主界面.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		g.drawImage(img, 0, 0, 800, 600, null);
	}
}

class ImagePanel2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image img;

	public void paint(Graphics g) {
		try {
			img = ImageIO.read(new File(
					"E://Users//Administrator//Documents//GitHub//workspace//MovieTicketSale//bin//images//界面1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		g.drawImage(img, 0, 0, 800, 600, null);

	}
}

class ImagePanel3 extends JPanel {
	Image img;

	public void paint(Graphics g) {
		try {
			img = ImageIO.read(new File(
					"E://Users//Administrator//Documents//GitHub//workspace//MovieTicketSale//bin//images//界面3.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		g.drawImage(img, 0, 0, 800, 350, null);

	}
}

//class LoginInterface extends QianTai{
//
//	JFrame frame = new JFrame("电影购票系统");
//	Container c = frame.getContentPane();
//	JButton purchase = new JButton("购买");
//	QianTai q;
//	
//	public LoginInterface(){
//		q = new QianTai();
//	}
//	
//	public void loginInterface() {
//		ImagePanel3 ip = new ImagePanel3();
//		ip.setBounds(0, 0, 800, 600);
//		frame.getContentPane().add(ip);
//
//		frame.setBounds(200, 100, 800, 600);
//		c.setLayout(new BorderLayout());
//		initFrame();
//		frame.setVisible(true);
//	}
//
//	public void initFrame() {
//		
//		JPanel fieldPanel = new JPanel();
//		fieldPanel.setLayout(null);
//		JLabel a1 = new JLabel("电影名:");
//		a1.setBounds(200, 400, 100, 20);
//		JLabel a2 = new JLabel("电影票数:");
//		a2.setBounds(200, 450, 100, 20);
//		fieldPanel.add(a1);
//		fieldPanel.add(a2);
//		moviename.setBounds(270, 400, 300, 20);
//		account.setBounds(270, 450, 300, 20);
//		fieldPanel.add(moviename);
//		fieldPanel.add(account);
//		c.add(fieldPanel, "Center");
//		JPanel buttonPanel = new JPanel();
//		buttonPanel.setLayout(new FlowLayout());
//		buttonPanel.add(purchase);
//		c.add(buttonPanel, "South");
//		purchase.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				q.purchase(, ticket_num);
//			}
//		});
//	}



