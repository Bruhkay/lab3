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
        Robot r = s.getRandomTarget(!this.getIsRedTeam());
        System.out.println(this.getName() + " attacks "+ r.getName() );
        s.damageToBot(r, this.ATTACK);
    }
    
}
