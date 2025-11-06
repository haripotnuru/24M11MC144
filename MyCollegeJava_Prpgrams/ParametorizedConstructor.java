class VolumeOfThing
{
  double width;
  double height;
  double length;
  //Parametarized constructor with 3 parameters
  public VolumeOfThing(double width,double height,double length)
  {
    this.width=width;
    this.height=height;
    this.length=length;
  }
  public VolumeOfThing()// Default contructor
  {
    width=height=length=0;
  }
  //Parametarized constructor with 1 parameter
  public VolumeOfThing(double len)
  {
    width=height=length=len;
  }
  public double volume()
  {
    return height*width*length;
  }
}
public class ParametorizedConstructor {
  public static void main(String[] args) {
    VolumeOfThing quboid=new VolumeOfThing(10,5,10.3);
    VolumeOfThing obj=new VolumeOfThing();
    VolumeOfThing qube=new VolumeOfThing(4.5);
    System.out.println("Volume of default : "+obj.volume());
    System.out.println("Volume of Quboid : "+quboid.volume());
    System.out.println("Volume of Quboid : "+qube.volume());
  }
}
