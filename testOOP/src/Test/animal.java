package Test;

public class animal {
	public int hunt  = 0 ;
	public int sleep = 0 ;
	public int move = 0 ;
	
	
	private  void move(){
		System.out.println("Animal Move now ") ;
		move = move +1 ;
		hunt = hunt +1 ;
		if (hunt>=10){
			System.out.println("Animal hunt now");
		}
	}
	private  void stop(){
		System.out.println("Animal Stop now");
		move = move + 0 ;
		
	}
	private  void sleep(){
		System.out.println("Animal Sleep now");
		sleep = sleep +1;
	}
	private  void hunt(){
		if (hunt>=15){
			System.out.println("Animal dead now");
		}
	}
}
