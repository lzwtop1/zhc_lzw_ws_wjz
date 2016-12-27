package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.util.ArrayList;
import java.util.List;

public class Houtaimanager extends Houtai{

	int userNumber;
	int passcode;
	List<Houtaimanager> managerList = new ArrayList<Houtaimanager>();
	
	

	public Houtaimanager(){
		this.movieAdd("速度与激情1", "罗伯·科恩", "保罗·沃克（已故），范·迪塞尔，乔丹娜·布鲁斯特", "2001-6-22", "1-1", "1号放映厅", 150);
		this.movieAdd("速度与激情2", "约翰·辛格顿", "保罗·沃克（已故），范·迪塞尔，乔丹娜·布鲁斯特", "2003-6-3", "1-1", "2号放映厅", 150);
		this.movieAdd("速度与激情3", "林诣彬", "保罗·沃克（已故），范·迪塞尔，乔丹娜·布鲁斯特", "2006-6-16", "1-1", "3号放映厅", 150);
		this.movieAdd("速度与激情4", "林诣彬", "保罗·沃克（已故），范·迪塞尔，乔丹娜·布鲁斯特", "2009-4-15", "1-1", "2号放映厅", 150);
		this.movieAdd("速度与激情5", "林诣彬", "保罗·沃克（已故），范·迪塞尔，乔丹娜·布鲁斯特", "2011-4-29", "1-2", "1号放映厅", 150);
		this.movieAdd("速度与激情6", "林诣彬", "保罗·沃克（已故），范·迪塞尔，乔丹娜·布鲁斯特", "2013-5-24", "1-2", "2号放映厅", 150);
		this.movieAdd("速度与激情7", "温子仁 ", "保罗·沃克（已故），范·迪塞尔，乔丹娜·布鲁斯特", "2015-4-3", "1-2", "3号放映厅", 150);
		
	}
	public boolean signUp(int userNumber,int passcode){
		for(Houtaimanager h : managerList){
			if(h.getUserNumber()==userNumber){
				System.out.println("用户已存在，请修改用户名");
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