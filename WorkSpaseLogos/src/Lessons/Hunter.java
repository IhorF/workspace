package Lessons;



public class Hunter extends Human{
	private int killedMammonts;
	

	
	public Hunter(int age, int killedMammonts){
		setAge(age);
		setKilledMammonts(killedMammonts);
	}
	
	
	void eatMeat(String meat){
		System.out.println("nyam-nyam "+meat);
	}
	void killMammont(){
		killedMammonts++;
		eatMeat("mammonts meat ");
	}
	
	
	public int getKilledMammonts(){
		return killedMammonts;
	}
	
	public void setKilledMammonts(int killedMammonts){
		killedMammonts = killedMammonts > 0 ? killedMammonts : 1;
		this.killedMammonts=killedMammonts;
	}


	@Override
	public void setAge(int age) {
		age=age<0 ? 1:age;
		super.setAge(age);
	}


	@Override
	public String toString() {
		return "Hunter [killedMammonts=" + killedMammonts + ",age=]"+getAge()+"]";
	}
	
}
