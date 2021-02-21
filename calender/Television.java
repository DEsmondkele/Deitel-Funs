public class Television{
	
private int volume = 0;
private int channel = 1;
private String productName;
private boolean isOn;



 public void setIsOn(boolean isOn){
	this.isOn = true;
}

 public boolean isOn(){
	return true;
 }  	
public void setVolume(){
}

public int getVolume(){
	return volume;
}
public void increaseVolume(){
	if(volume >= 0 && volume <= 100)
	   volume ++;
}
public void decreaseVolume(){	
	if(volume > 0 && volume <= 100)
	volume --;
}
public void setChannel(){
}

public int getChannel(){
	return channel;
}
public void increaseChannel(){
	if(channel >= 1 && channel <= 100)
	   channel ++;
}
public void decreaseChannel(){	
	if(channel> 1 && channel <= 100)
	channel --;
}

public void setProductName(String keleName) {							productName = keleName;
 	 
 }
public String getProductName(){
	return productName;
}

  public static void main(String...args) {

	Television desmondTv = new Television ();

        desmondTv.isOn();
	desmondTv.setVolume();
	desmondTv.getVolume();
	desmondTv.increaseVolume();
	desmondTv.decreaseVolume(); 
	desmondTv.setProductName("FUN:TV");
	desmondTv.getProductName();

	
	System.out.printf("The name of the Television is %s%n", desmondTv.getProductName());
	System.out.printf("The Volume of the Television is %d%n",desmondTv.getVolume());
	System.out.printf("The Television is %s%n",desmondTv.isOn());
}



}