public class FCFSGarage extends Garage {
    public void parkin(Vehicle v){
        for(int i=0;i<slotsNum;i++)
        {
            if(slots[i].isEmpty())
            {
                if(slots[i].getSlotWidth() >= v.getVehicleWidth() && slots[i].getSlotLength() >= v.getVehicleLength())
                {
                    slots[i].parkIn(v); //park in the first empty slot
                    break;
                }

            }
        }
    }
}