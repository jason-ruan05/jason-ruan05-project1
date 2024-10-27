public class EndStation extends Station {


    public EndStation(String name, String color){
        super(name, color);
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