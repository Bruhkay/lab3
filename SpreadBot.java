public class SpreadBot extends Robot {
    SpreadBot(){
        this.setHEALTH(Math.random()+2);
        this.setATTACK(Math.random()/2);
        this.setSPEED(Math.random()+0.5);
        this.setName("K"+ getID());
        setID();
    }
    @Override
    public void attack(Simulation s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    
}
