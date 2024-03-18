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
        if(s.getHighestHealth(!this.getIsRedTeam()).getHitAnfIsDestroyed(this.ATTACK)){
        s.remove(s.getHighestHealth(!this.getIsRedTeam()));
        s.getHighestHealth(!this.getIsRedTeam()).getHitAnfIsDestroyed(this.ATTACK);
    }  
        
    }
    
}
