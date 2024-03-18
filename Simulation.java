import java.util.ArrayList;

/**
 * Simulation
 */
public class Simulation {

    protected ArrayList<Robot> robotList = new ArrayList<Robot>();

    public void initialize(int teamSize){

    }
    public Robot getRandomTarget(boolean isRedTeam){
        
    }
    public Robot getHighestHealth(boolean isRedTeam){

    }
    public Robot getLowestSpeed(boolean isRedTeam){
        
    }
    public Robot getLowestAttack(boolean isRedTeam){
        
    }
    public Robot getHighestHealth(boolean isRedTeam){
        
    }
    public Robot[] getLowestSpeed3(boolean isRedTeam){
        Robot[] x = new Robot[3];
        for (Robot k : robotList) {
            if(k.isRedTeam == isRedTeam){
                    
                if(k.getSPEED()< x[0].getSPEED()){
                    x[2]=x[1];
                    x[1]=x[0];
                    x[0] = k;
                }
                else if(k.getSPEED()< x[1].getSPEED()){
                    x[2]=x[1];
                    x[1]=k;
                }
                else if(k.getSPEED()< x[2].getSPEED()){
                    x[2]=k;
                }
            }
        }
        return x;
    }
}