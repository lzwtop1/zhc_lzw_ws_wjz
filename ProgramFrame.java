package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ProgramFrame extends JFrame{
	   Image img = PictureTools.getImage("images/43J58PICcxu.jpg");
	   @Override
	   public void paint(Graphics g) {
		    Container c = getContentPane();
			JButton btn1 = new JButton("按上映时间查询");
			JButton btn2 = new JButton("按电影名查询");
			btn1.setBounds(100,500,200,50);
			btn2.setBounds(500,500,200,50);
			c.add(btn1);
			c.add(btn2);
			g.drawImage(img, 0, 0, 800, 400, null); 
	}
	   
	public ProgramFrame(){
		setTitle("电影购票系统");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ProgramFrame();
	}
	
}
