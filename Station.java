public class Station {
    protected String name;
    protected String color;
    protected Boolean isAvailable;
    protected Station next;
    protected Station prev;
    protected Station head;
    protected Station tail;
    public Station(String color, String name){
        this.name = name;
        this.color = color;
        this.isAvailable = true;
        this.prev = null;
        this.next = null;
        this.head = null;
        this.tail = null;
    }

    // private Station head = null;
    // private Station tail = null;

    public void addNext(Station s){
        this.next = s;
        s.prev = this;
    }

    public void addPrev(Station s){
        this.prev = s;
        s.next = this;
    }

    public void switchAvailable(){
        if(this.isAvailable == true){
            this.isAvailable = false;
        } else {
            this.isAvailable = true;
        }
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public String noneName(Station s){
        if(s == null){
            return "none";
        }
        return s.name;
    }

    public String toString(){
        return "STATION " + name + ": " + color + " line, in service: " + isAvailable + ", previous station: " + noneName(prev) + ", next station: " + noneName(next);
    }

    public boolean equals(Station s){
        if(this.color == s.color && this.name == s.name){
            return true;
        }
        return false;
    }

    public void connect(Station s){

    }

    public int tripLength(Station dest){
        return 0;
    }



}
