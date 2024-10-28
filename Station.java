public class Station {
    // Initialize the Variables
    protected String name;
    protected String color;
    protected Boolean isAvailable;
    protected Station next;
    protected Station prev;
    //Constructor Calls
    public Station(String color, String name){
        this.name = name;
        this.color = color;
        this.isAvailable = true;
        this.prev = null;
        this.next = null;
    }

    //Method to add a station ahead in a doubly linked list fashion
    public void addNext(Station s){
        this.next = s;
        s.prev = this;
    }
    
    //Method to add a station prev in a doubly linked list fashion
    public void addPrev(Station s){
        this.prev = s;
        s.next = this;
    }

    //Method to swap the isAvailable boolean
    public void switchAvailable(){
        if(this.isAvailable == true){
            this.isAvailable = false;
        } else {
            this.isAvailable = true;
        }
    }
    //Returns the isAvailable boolean
    public boolean isAvailable(){
        return this.isAvailable;
    }

    //A helper method in order to correctly format the toString()
    public String noneName(Station s){
        if(s == null){
            return "none";
        }
        return s.name;
    }
    //The toString() method in order to print out the results to match the test cases
    public String toString(){
        return "STATION " + name + ": " + color + " line, in service: " + isAvailable + ", previous station: " + noneName(prev) + ", next station: " + noneName(next);
    }
    //Ovveries the orignal .equals objects to see if two stations are equal
    //Two stations are equal when color and name are the same
    public boolean equals(Station s){
        if(this.color == s.color && this.name == s.name){
            return true;
        }
        return false;
    }
    //Connects two stations together
    public void connect(Station s){
        this.next = s;
        s.prev = this;
    }
    // Checks the length of a "walk" between 2 stations using a reccursive approach
    //(This implementation only works for one line as, I couldn't figure how to incorporate multiple lines)
    public int tripLength(Station dest){
        int num = 0;
        if(this == dest){
            return num;
        }
        return tripLengthRecursive(this, dest, num);
    }

    // A helper method which would cause the recurrsion
    public int tripLengthRecursive(Station dest, Station dest2, int num){
        //base case to break out the reccursion
        if(dest == dest2){
            return num;
        }
        // if(dest instanceof TransferStation){
        //     TransferStation temp = (TransferStation) dest;
        //     int i = temp.otherStations.size();
        //     for(int j = 0; j < i; j++){
                
        //     }

        // }
        //increment the num and move the next to continue the reccursive approach
        num++;
        dest = dest.next;
        return tripLengthRecursive(dest, dest2, num);
}
}
