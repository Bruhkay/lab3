public class SimpleBot extends Robot {
    SimpleBot(){
        this.setHEALTH(Math.random()+2);
        this.setATTACK(Math.random()+1);
        this.setSPEED(Math.random()+1);
        this.setName("S"+ getID());
        setID();
    }
    @Override
    public void attack(Simulation s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    
}
