public abstract class Robot {

    protected double HEALTH;
    protected double ATTACK;
    protected double SPEED;
    protected String name;
    protected boolean isRedTeam;
    protected static int ID = 0;
     

    public abstract void attack(Simulation s);

    public boolean getHitAnfIsDestroyed(double damage){
        if(HEALTH<= damage){ 
            return true;
        }
        else{
            return false;
        }
    }
    public void decreaseHealth(double damage){
        if(HEALTH<= damage){ 
            this.HEALTH =0;
            System.out.printf("%s%s%.3f%s%.3f\n",this.getName(), 
            "receives ", damage," damage -> remaining health: ", HEALTH);
        }
        else{
            HEALTH = HEALTH - damage;
            System.out.printf("%s%s%.3f%s%.3f\n",this.getName(), 
            "receives ", damage," damage -> remaining health: ", HEALTH);
        }
    }


    public void setATTACK(double aTTACK) {
        ATTACK = aTTACK;
    }
    public void setHEALTH(double hEALTH) {
        HEALTH = hEALTH;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRedTeam(boolean isRedTeam) {
        this.isRedTeam = isRedTeam;
    }
    public void setSPEED(double sPEED) {
        SPEED = sPEED;
    }
    public double getATTACK() {
        return ATTACK;
    }
    public double getHEALTH() {
        return HEALTH;
    }
    public String getName() {
        return name;
    }
    public double getSPEED() {
        return SPEED;
    }
    public int getID() {
        return ID;
    }
    public void setID() {
        ID++;
    }
    public boolean getIsRedTeam(){
        return isRedTeam;
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
