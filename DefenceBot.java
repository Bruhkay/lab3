public class DefenceBot extends Robot {

    DefenceBot(boolean isRedTeam){
        this.setATTACK(Math.random()/2);
        this.setHEALTH(Math.random()*3+3);
        this.setSPEED(Math.random()/2);
        this.setName("D"+ getID());
        this.setRedTeam(isRedTeam);
        setID();
    }
    @Override
    public void attack(Simulation s) {
        System.out.println(this.getName() + " attacks "+ s.getLowestSpeed(!this.getIsRedTeam()).getName() );
        
        s.damageToBot(s.getLowestSpeed(!this.getIsRedTeam()), this.ATTACK); 
         
    }
    
}
