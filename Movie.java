package usst.zhc_lzw_ws_wjz.movieticketsale;


public class Movie {

	String name;
	String director;
	String actor;
	String screenTime;
	String showTime; 
	String video_hall;
	int tickets;
	public Movie() {
	}
	

	public Movie(String name, String director, String actor, String screenTime, String showTime, String video_hall,int tickets) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.screenTime = screenTime;
		this.showTime = showTime;
		this.tickets = tickets;
		this.video_hall = video_hall;
	}
	public String show(){
		System.out.println("name:"+this.getName());
		System.out.println("director:"+this.getDirector());
		System.out.println("actor"+this.getActor());
		System.out.println("scrreTime"+this.getScreenTime());
		System.out.println("showTime"+this.getShowTime());
		System.out.println("Video_Hall"+this.getVideo_hall());
		System.out.println("ticket"+this.getTickets());
		return this.getName()+"\n"+"导演 : "+this.getDirector()+"\n"+"演员 : "+this.getActor()+"  "+"\n"+"放映时间 : "+this.getShowTime()
					+"\n"+"上映时间 : "+this.getScreenTime()+"\n"+"当前票数 : "+this.getTickets()+"\n"+this.getVideo_hall()+"\n\n";
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getScreenTime() {
		return screenTime;
	}

	public void setScreenTime(String screenTime) {
		this.screenTime = screenTime;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}


	public String getVideo_hall() {
		return video_hall;
	}


	public void setVideo_hall(String video_hall) {
		this.video_hall = video_hall;
	}

}



