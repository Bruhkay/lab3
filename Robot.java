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
            HEALTH =0;
            
            return true;
        }
        else{
            HEALTH = HEALTH - damage;
            return false;
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
}
