public class SpeedBot extends Robot{
    SpeedBot(boolean isRedTeam){
        this.setHEALTH(Math.random()+1);
        this.setATTACK(Math.random()+1);
        this.setSPEED(Math.random()+3);
        this.setName("X"+ getID());
        this.setRedTeam(isRedTeam);
        setID();
    }
    @Override
    public void attack(Simulation s) {
        System.out.println(this.getName() + " attacks "+ s.getLowestAttack(!this.getIsRedTeam()).getName() );
        
        s.damageToBot(s.getLowestAttack(!this.getIsRedTeam()), this.ATTACK); 
    }
    
}
