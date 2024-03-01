public class Vehicle {
    private String modelName;
    private int id;
    private String modelYear;
    private double vehicleLength;
    private double vehicleLwidth;

    public Vehicle(String mN,String mY,int i,double l,double w){
        modelName = mN;
        modelYear = mY;
        id = i;
        vehicleLength = l;
        vehicleLwidth = w;
    }

    public void setModName(String modname){
        modelName = modname ;
    }
    public void setId(int i){
        id = i;
    }
    public void setModYear(String modyear){
        modelYear = modyear ;
    }
    public void setVLength(double vlen){
        vehicleLength = vlen ;
    }
    public void setVWidth(double vwid){
        vehicleLwidth = vwid ;
    }

    public String getModelName(){
        return modelName;
    }
    public int getId(){
        return id ;
    }
    public String getModelYear(){
        return modelYear ;
    }
    public double getVehicleLength(){
        return vehicleLength ;
    }
    public double getVehicleWidth(){
        return vehicleLwidth ;
    }

    void displyVehicleData(){
        System.out.print("Model Name: ");
        System.out.println(modelName + '\n');
        System.out.print("ID: ");
        System.out.println(id + '\n');
        System.out.print("Model Year: ");
        System.out.println(modelYear + '\n');
        System.out.print("Car Length: ");
        System.out.println(vehicleLength + '\n');
        System.out.print("Car width: ");
        System.out.println(vehicleLwidth + '\n');
    }
}
