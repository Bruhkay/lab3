public class PredatorBot extends Robot {
    PredatorBot(boolean isRedTeam){
        this.setHEALTH(Math.random()+2);
        this.setATTACK(Math.random()+2);
        this.setSPEED(Math.random()/2);
        this.setName("P"+ getID());
        this.setRedTeam(isRedTeam);
        setID();
    }
    @Override
    public void attack(Simulation s) {
        System.out.println(this.getName() + " attacks "+ s.getHighestHealth(!this.getIsRedTeam()).getName() );
        
        s.damageToBot(s.getHighestHealth(!this.getIsRedTeam()), this.ATTACK); 
        
    }
    
}
