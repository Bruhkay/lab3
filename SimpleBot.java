public class SimpleBot extends Robot {
    SimpleBot(boolean isRedTeam){
        this.setHEALTH(Math.random()+2);
        this.setATTACK(Math.random()+1);
        this.setSPEED(Math.random()+1);
        this.setName("S"+ getID());
        this.setRedTeam(isRedTeam);
        setID();
    }
    @Override
    public void attack(Simulation s) {
        System.out.println(this.getName() + " attacks "+ s.getRandomTarget(!this.getIsRedTeam()).getName() );
        if(s.getRandomTarget(!this.getIsRedTeam()).getHitAnfIsDestroyed(this.ATTACK)){
            s.remove(s.getRandomTarget(!this.getIsRedTeam()));
            s.getRandomTarget(!this.getIsRedTeam()).getHitAnfIsDestroyed(this.ATTACK);
        }  
    }
    
}
