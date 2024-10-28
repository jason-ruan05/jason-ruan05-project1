public class EndStation extends Station {
    // Constructor call
    public EndStation(String color, String name){
        super(color, name);

    }
    //The toString() method for an endstation
    public String toString(){
        return "ENDSTATION " + name + ": " + color + " line, in service: " + isAvailable + ", previous station: " + noneName(prev) + ", next station: " + noneName(next);
    }
    //A method which would use when a station is an EndStation and 
    //makes the prev and next station be the same station
    public void makeEnd(){
        if(this.prev == null){
            this.prev = this.next;
        } else if(this.next == null){
            this.next = this.prev;
        }
    }
}