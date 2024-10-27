public class EndStation extends Station {
    public EndStation(String color, String name){
        super(color, name);

    }

    public String toString(){
        return "ENDSTATION " + name + ": " + color + " line, in service: " + isAvailable + ", previous station: " + noneName(prev) + ", next station: " + noneName(next);
    }

    public void makeEnd(){
        if(this.prev == null){
            this.prev = this.next;
        } else if(this.next == null){
            this.next = this.prev;
        }
    }
}