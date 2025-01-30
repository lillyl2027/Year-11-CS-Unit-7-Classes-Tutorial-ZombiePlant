public class ZombiePlant {
    private int potency;
    private int treatmentsNeeded;
    private boolean isDangerous = true;

    public ZombiePlant(int maxPotency, int initialTreatmentsNeeded){
        this.potency = maxPotency;
        this.treatmentsNeeded = initialTreatmentsNeeded;
    }

    public int getPotency(){
        return potency;
    }

    public int treatmentsNeeded(){
        return treatmentsNeeded;
    }

    public boolean isDangerous(){
        return isDangerous;
    }

    public void treat(int treatment){
        if (treatment > 0){
            if(treatment <= potency && isDangerous) {
                treatmentsNeeded--;
            }
            else if (treatment > potency){
                treatmentsNeeded++;
            }
            if(treatmentsNeeded == 0){
                isDangerous = false;
            }
        }
    }
}