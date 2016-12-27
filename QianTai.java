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
				//JOptionPane.showMessageDialog(null,m.show(),"��Ӱ��Ϣ",1);
				System.out.println("------------");
			}
		}
		JOptionPane.showMessageDialog(null,str,"��Ӱ��Ϣ",-1);
		if(count==0)
			System.out.println("no this media,please search another");
	}
	
	public void searchByName(String input){
		for(Movie m : repository){
			if(m.getName().equals(input)){
				JOptionPane.showMessageDialog(null,m.show(),"��Ӱ��Ϣ",-1);
				System.out.println("-----------");
			}
		}
	}
	
	public void purchase(String movieName,int ticket_num){
		for(Movie m : repository){
			if(m.getName().equals(movieName)){
				Movie temp = repository.get(repository.indexOf(m));
				if( temp.getTickets() != 0 && temp.getTickets()-ticket_num < 0 ) {
					JOptionPane.showMessageDialog(null,"Ʊ�����㣬���޸�Ʊ�����¹���","������Ϣ",1);
					System.out.println("Ʊ�����㣬���޸�Ʊ�����¹���");
				}
				if(temp.getTickets()==0){
					JOptionPane.showMessageDialog(null,"��ӰƱ���ۿ�","������Ϣ",1);
					System.out.println("��ӰƱ���ۿ�");
				}
				if( temp.getTickets()!=0 && temp.getTickets()-ticket_num>=0 ){
					temp.tickets -= ticket_num;
					JOptionPane.showMessageDialog(null,"����ɹ�"+"\n"+"Ʊ��: "+ticket_num+"\n"+"��ӭ�´ι���"+"\n","������Ϣ",1);
					System.out.print(temp.getName()+" ");
					System.out.println("����ɹ�");
					System.out.println("Ʊ��: "+ticket_num);
					System.out.println("��ӭ�´ι���");
				}
			}
		}
	}
	
}
