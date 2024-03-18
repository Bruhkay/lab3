public class PredatorBot extends Robot {
    PredatorBot(){
        this.setHEALTH(Math.random()+2);
        this.setATTACK(Math.random()+2);
        this.setSPEED(Math.random()/2);
        this.setName("P"+ getID());
        setID();
    }
    @Override
    public void attack(Simulation s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    
}
