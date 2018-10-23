class Chick implements Animal 
{
  private String myType;
  private String mySound;
  private String mySoundTwo;
  
  public Chick(String type, String sound, String soundTwo){
    myType = type;
    mySound = sound;
    mySoundTwo = soundTwo;

  }
  
  public String getSound(){
    boolean a = true;
    if (a == true){
      return mySound;
    } else {
      return mySoundTwo;
    }
  }
  public String getType(){
    return myType;
  }
  
  
}
