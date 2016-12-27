package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.awt.Button;
import java.awt.Label;

import javax.swing.JOptionPane;

public class QianTai extends Houtaimanager{
	
	//ArrayList<Movie> repository = new ArrayList<Movie>();
	public QianTai(){
	}
	public void searchByShowTime(String input) {
		int count = 0;
		String str = "";
		for (Movie m : repository) {
			if (m.getShowTime().equals(input)) {
				count++;
				str += m.show();
				//JOptionPane.showMessageDialog(null,m.show(),"电影信息",1);
				System.out.println("------------");
			}
		}
		JOptionPane.showMessageDialog(null,str,"电影信息",-1);
		if(count==0)
			System.out.println("no this media,please search another");
	}
	
	public void searchByName(String input){
		for(Movie m : repository){
			if(m.getName().equals(input)){
				JOptionPane.showMessageDialog(null,m.show(),"电影信息",-1);
				System.out.println("-----------");
			}
		}
	}
	
	public void purchase(String movieName,int ticket_num){
		for(Movie m : repository){
			if(m.getName().equals(movieName)){
				Movie temp = repository.get(repository.indexOf(m));
				if( temp.getTickets() != 0 && temp.getTickets()-ticket_num < 0 ) {
					JOptionPane.showMessageDialog(null,"票数不足，请修改票数重新购买","购买信息",1);
					System.out.println("票数不足，请修改票数重新购买");
				}
				if(temp.getTickets()==0){
					JOptionPane.showMessageDialog(null,"电影票已售空","购买信息",1);
					System.out.println("电影票已售空");
				}
				if( temp.getTickets()!=0 && temp.getTickets()-ticket_num>=0 ){
					temp.tickets -= ticket_num;
					JOptionPane.showMessageDialog(null,"购买成功"+"\n"+"票数: "+ticket_num+"\n"+"欢迎下次光临"+"\n","购买信息",1);
					System.out.print(temp.getName()+" ");
					System.out.println("购买成功");
					System.out.println("票数: "+ticket_num);
					System.out.println("欢迎下次光临");
				}
			}
		}
	}
	
}
