public class OneBot extends Robot {
    OneBot(boolean isRedTeam){
        this.setHEALTH(Math.random()/2);
        this.setATTACK(Math.random()+4);
        this.setSPEED(Math.random()/2);
        this.setName("O"+ getID());
        this.setRedTeam(isRedTeam);
        setID();
    }
    @Override
    public void attack(Simulation s) {
        System.out.println(this.getName() + " attacks "+ s.getLowestHealth(!this.getIsRedTeam()).getName() );
        
        s.damageToBot(s.getLowestHealth(!this.getIsRedTeam()), this.ATTACK); 
    }
    
}
