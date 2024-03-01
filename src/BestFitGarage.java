public class BestFitGarage extends Garage {
    public void parkin(Vehicle v) {
        int min_index = 0;
        for (int i = 1; i < slotsNum; i++) {
            if (slots[i].isEmpty()) {
                if (slots[i].getSlotWidth() >= v.getVehicleWidth()
                        && slots[i].getSlotLength() >= v.getVehicleLength()) {
                    if (slots[i].getSlotWidth() <= slots[min_index].getSlotWidth()
                            && slots[i].getSlotLength() <= slots[min_index].getSlotLength()
                            && !slots[min_index].isEmpty()) {
                        min_index = i;
                    }
                }
            }
        }

        if (!slots[min_index].isEmpty()) {
            System.out.println("We can't parking");
        } else if (slots[min_index].getSlotWidth() >= v.getVehicleWidth()
                && slots[min_index].getSlotLength() >= v.getVehicleLength())
            slots[min_index].parkIn(v);
        else
            System.out.println("We can't parking");
    }
}