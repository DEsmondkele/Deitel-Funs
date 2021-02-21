public class Date{
	private int day;
	private int month;
	private int year;

public Date(int day, int month, int year){

	this.day = day;
	this.month = month;
	this.year = year;
}
 public void setDay(int day){
  this.day = day;
}

public int getDay(){
	return day;
}
public  void setMonth(int month){
   this.month = month;
}
public int getMonth(){
	return month;
}
public void setYear(int year){
  this.year = year;
}
public int getYear(){
	return year;
}
  //this method test the date class
public static void main(String... args){
  
 Date toDay = new Date(23, 04, 1998);
 toDay.setDay(22);
 toDay.setMonth(02);
 toDay.setYear(2021);
 System.out.print("today's date is"+" "+ toDay.getDay()+"/"+toDay.getMonth()+"/"+toDay.getYear());
}

}