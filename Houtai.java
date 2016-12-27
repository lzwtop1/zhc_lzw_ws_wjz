package usst.zhc_lzw_ws_wjz.movieticketsale;

import java.util.ArrayList;

public class Houtai {
	ArrayList<Movie> repository = new ArrayList<Movie>();
	
	public boolean movieAdd(String name, String director, String actor, String screenTime, String showTime,
			String video_hall, int ticket) {	
		repository.add(new Movie(name, director, actor, screenTime, showTime, video_hall, ticket));
		
		return true;
	}

	public boolean moveRemove(String name, String showTime) {
		for (Movie m : repository) {
			if (m.getName().equals(name) && m.getShowTime().equals(showTime)) {
				m.show();
				System.out.println("是否需要删除");
				// 此处添加事件捕捉。
				// if(是)
				repository.remove(m);
				return true;
			} else {
				System.out.println("没有该电影");
			}
		}
		return false;
	}

}