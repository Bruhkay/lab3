public abstract class Robot {

    protected double HEALTH;
    protected double ATTACK;
    protected double SPEED;
    protected String name;
    protected boolean isRedTeam;
    protected static int ID = 0;
     

    public abstract void attack(Simulation s);

    public boolean getHitAnfIsDestroyed(double damage){
        if(true){ 
            return false;
        }
        else{
            return true;
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
    public static int getID() {
        return ID;
    }
    public static void setID() {
        ID++;
    }
}
