import java.util.ArrayList;

/**
 * Simulation
 */
public class Simulation {

    protected ArrayList<Robot> robotList = new ArrayList<Robot>();
    protected int starter= 0;
    /**
     * this method constructs teams randomly
     * @param teamSize
     */
    public void initialize(int teamSize){
        boolean switcher = true;
        ArrayList<Robot> temp = new ArrayList<Robot>();
        for(int k = 0; k< 2 ; k++){
            for(int i = 0; i< teamSize; i++){
                int random = (int)(Math.random()*6);
                Robot robot;
                if( i == 0){
                     robot = new SimpleBot(switcher);
                }
                else if( i == 1){
                     robot = new PredatorBot(switcher);
                }
                else if( i == 2){
                     robot = new DefenceBot(switcher);
                }
                else if( i == 3){
                     robot = new SpeedBot(switcher);
                }
                else if( i == 4){
                     robot = new SpreadBot(switcher);
                }
                else{
                     robot = new OneBot(switcher);
                }
                temp.add(robot);
            }
            
            switcher = false;
        }

        int size = 2*teamSize;
        for(int g = 0; g<size-1; g++){
            
            String maxSpeedName= "null";
            int maxIndex = 0;
            for(int i = temp.size()-1; i>=0; i--){
                
                if(temp.get(i).SPEED >= temp.get(maxIndex).getSPEED()){
                    maxIndex = i;
                    maxSpeedName = temp.get(i).getName();
                    
                }
            }
            for(int v = 0; v<temp.size(); v++){
                if(maxSpeedName.equals(temp.get(v).getName())){
                    robotList.add(temp.get(maxIndex));
                    temp.remove(maxIndex);
                }
            }
        }
        robotList.add(temp.get(0));
    }
    /**
     * this method returns random robot 
     * @param isRedTeam
     * @return
     */
    public Robot getRandomTarget(boolean isRedTeam){
        ArrayList<Robot> team = new ArrayList<>();
        if(isRedTeam){
            for (Robot robot : robotList) {
                team.add(robot);
            }
            int random = (int)(Math.random()*team.size());
            return team.get(random);
        }
        else{
            for (Robot robot : robotList) {
                team.add(robot);
            }
            int random = (int)(Math.random()*team.size());
            return team.get(random);
        }
    }
    /**
     * this method finds the robot that has lowest speed
     * @param isRedTeam
     * @return
     */
    public Robot getLowestSpeed(boolean isRedTeam){
        double lowestSpeed = 10;
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(lowestSpeed > robot.getSPEED()){
                    lowestSpeed = robot.getSPEED();
                }
            }
        }
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(lowestSpeed == robot.getSPEED()){
                    return robot;
                }
            }
        }
        return null;
    }
    /**
     * this method find the robot that has lowest attack point
     * @param isRedTeam
     * @return
     */
    public Robot getLowestAttack(boolean isRedTeam){
        double lowestAttack = 10;
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(lowestAttack > robot.getATTACK()){
                    lowestAttack = robot.getATTACK();
                }
            }
        }
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(lowestAttack == robot.getATTACK()){
                    return robot;
                }
            }
        }
        return null;
    }
    /**
     * this method finds the robot that has highest health 
     * @param isRedTeam
     * @return
     */
    public Robot getHighestHealth(boolean isRedTeam){
        double maxHealth = 0;
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(maxHealth < robot.getHEALTH()){
                    maxHealth = robot.getHEALTH();
                }
            }
        }
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(maxHealth == robot.getHEALTH()){
                    return robot;
                }
            }
        }
        return null;
        
    }
    /**
     * this method finds the robot that has lowest health 
     * @param isRedTeam
     * @return
     */

    public Robot getLowestHealth(boolean isRedTeam){
        double lowestHealth = 10;
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(lowestHealth > robot.getHEALTH()){
                    lowestHealth = robot.getHEALTH();
                }
            }
        }
        for (Robot robot : robotList) {
            if(robot.isRedTeam == isRedTeam){
                if(lowestHealth == robot.getHEALTH()){
                    return robot;
                }
            }
        }
        return null;
        
    }
    /**
     * this method returns array of 3 robots that have lowest health points
     * @param isRedTeam
     * @return
     */
    public Robot[] getLowestSpeed3(boolean isRedTeam){
        
        ArrayList<Robot> temp = new ArrayList<Robot>();

        for (Robot k : robotList) {
            if(k.isRedTeam == isRedTeam){
                temp.add(k);
            }
        }
        if(temp.size()>=3){
            Robot[] lowestThree = new Robot[3];

            for (int i = 0; i < 3; i++) {
                lowestThree[i] = temp.get(i);
            }

            for (int i = 3; i < temp.size(); i++) {
                Robot currentRobot = temp.get(i);
                for (int j = 0; j < 3; j++) {
                    if (currentRobot.getSPEED() < lowestThree[j].getSPEED()) {
                        for (int k = 2; k > j; k--) {
                            lowestThree[k] = lowestThree[k - 1];
                        }
                        lowestThree[j] = currentRobot;
                        break;
                    }
                }
            }
            return lowestThree;
        }
        else{
            Robot[] lowestThree = new Robot[temp.size()];

            for (int i = 0; i < temp.size(); i++) {
                lowestThree[i] = temp.get(i);
            }
            for (int i = 3; i < temp.size(); i++) {
                Robot currentRobot = temp.get(i);
                for (int j = 0; j < temp.size(); j++) {
                    if (currentRobot.getSPEED() < lowestThree[j].getSPEED()) {
                        for (int k = 2; k > j; k--) {
                            lowestThree[k] = lowestThree[k - 1];
                        }
                        lowestThree[j] = currentRobot;
                        break;
                    }
                }
            }
            return lowestThree;
        }
    }
    /**
     * this method lists all robots in order
     */
    public void listAll(){
        //bigger to smaller
        double redSum = 0;
        double blueSum = 0;
        System.out.println("\nRed team:");
        for (Robot robot : robotList) {
            if(robot.isRedTeam){
                System.out.printf("%s%s%.3f%s%.3f%s%.3f\n",robot.getName(), " Health: ", robot.getHEALTH(), " Attack: ", robot.getATTACK()
                , " Speed: ", robot.getSPEED());
                redSum += robot.getSPEED();
            }
        }
        System.out.println("\nBlue team:");
        for (Robot robot : robotList) {
            if(!robot.isRedTeam){
                System.out.printf("%s%s%.3f%s%.3f%s%.3f\n",robot.getName(), " Health: ", robot.getHEALTH(), " Attack: ", robot.getATTACK()
                , " Speed: ", robot.getSPEED());
                blueSum += robot.getSPEED();
            }
        }
        System.out.printf("%s%.3f","\nSpeed sum of Red  : ", redSum);
        System.out.printf("%s%.3f\n","\nSpeed sum of Blue : ", blueSum);
        System.out.println();

        if(redSum>= blueSum && blueSum !=0){
            System.out.println("Red starts first");
            this.starter = 0;
        }
        else if(blueSum > redSum && redSum !=0){
            this.starter = 1;
            System.out.println("Blue starts first");
        }
        System.out.println();
    }
    /**
     * this method removes  desired robot from the list in case of robots health is 0
     * @param r
     */
    public void remove(Robot r){
        int index = 0;
        for (int i = 0; i< robotList.size(); i++) {
            if(robotList.get(i).getName()==r.getName()){
                index = i;
            }
        }
        robotList.remove(index);
    }
    /**
     * in order to carry damage tasks, we need this method
     * @param r
     * @param damage
     */
    public void damageToBot(Robot r, double damage){
        for(int i = 0; i < robotList.size(); i++){
            if(r.getName().equals(robotList.get(i).getName())){
                if(robotList.get(i).getHitAnfIsDestroyed(damage)){
                    robotList.get(i).decreaseHealth(damage);
                    this.remove(r);
                }
                else{
                    robotList.get(i).decreaseHealth(damage);
                }
            }
        }
    }
}