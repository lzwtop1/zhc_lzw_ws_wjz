package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.util.ArrayList;
import java.util.List;

public class Houtaimanager extends Houtai{

	int userNumber;
	int passcode;
	List<Houtaimanager> managerList = new ArrayList<Houtaimanager>();
	
	

	public Houtaimanager(){
		this.movieAdd("�ٶ��뼤��1", "�޲����ƶ�", "���ޡ��ֿˣ��ѹʣ����������������ǵ��ȡ���³˹��", "2001-6-22", "1-1", "1�ŷ�ӳ��", 150);
		this.movieAdd("�ٶ��뼤��2", "Լ���������", "���ޡ��ֿˣ��ѹʣ����������������ǵ��ȡ���³˹��", "2003-6-3", "1-1", "2�ŷ�ӳ��", 150);
		this.movieAdd("�ٶ��뼤��3", "�����", "���ޡ��ֿˣ��ѹʣ����������������ǵ��ȡ���³˹��", "2006-6-16", "1-1", "3�ŷ�ӳ��", 150);
		this.movieAdd("�ٶ��뼤��4", "�����", "���ޡ��ֿˣ��ѹʣ����������������ǵ��ȡ���³˹��", "2009-4-15", "1-1", "2�ŷ�ӳ��", 150);
		this.movieAdd("�ٶ��뼤��5", "�����", "���ޡ��ֿˣ��ѹʣ����������������ǵ��ȡ���³˹��", "2011-4-29", "1-2", "1�ŷ�ӳ��", 150);
		this.movieAdd("�ٶ��뼤��6", "�����", "���ޡ��ֿˣ��ѹʣ����������������ǵ��ȡ���³˹��", "2013-5-24", "1-2", "2�ŷ�ӳ��", 150);
		this.movieAdd("�ٶ��뼤��7", "������ ", "���ޡ��ֿˣ��ѹʣ����������������ǵ��ȡ���³˹��", "2015-4-3", "1-2", "3�ŷ�ӳ��", 150);
		
	}
	public boolean signUp(int userNumber,int passcode){
		for(Houtaimanager h : managerList){
			if(h.getUserNumber()==userNumber){
				System.out.println("�û��Ѵ��ڣ����޸��û���");
				return false;
			}
		}
		managerList.add(this);
		return true;
	}
	
	public boolean signIn(int userName,int passcode){
		if(this.getUserNumber()==userName &&this.getPasscode() == passcode){
			return true;
		}else 
			return false;
	}
	

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public int getPasscode() {
		return passcode;
	}

	public void setPasscode(int passcode) {
		this.passcode = passcode;
	}
	
	
	
	


}