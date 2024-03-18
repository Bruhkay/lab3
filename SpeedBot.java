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
        if(s.getLowestAttack(!this.getIsRedTeam()).getHitAnfIsDestroyed(this.ATTACK)){
            s.remove(s.getLowestAttack(!this.getIsRedTeam()));
            s.getLowestAttack(!this.getIsRedTeam()).getHitAnfIsDestroyed(this.ATTACK);
        }  
    }
    
}
