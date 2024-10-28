import java.util.ArrayList;
public class TransferStation extends Station {
    //Intialize an ArrayList because the TransferStation connects multiple lines
    public ArrayList<Station> otherStations;
    //Constructor Calls
    public TransferStation(String color, String name){
        super(color, name);
        this.otherStations = new ArrayList<>();
    }
    //Adds a next station to the ArrayList
    public void addTransferStationNext(Station s){
        s.prev = this;
        this.otherStations.add(s);
    }
    //Adds a prev station to the ArrayList
    public void addTransferStationPrev(Station s){
        s.next = this;
        this.otherStations.add(s);
    }

    //A helper method used to format the toString()
    public String nameTransfer(ArrayList<Station> transfers){
        String name = "";
        if(transfers.size() == 0){
            return name;
        }
        for(int i = 0; i < transfers.size(); i++){
            name = name + "\t" + transfers.get(i).toString() + "\n";
        }
        return name;


    }

    //The toString() method in order to pass the test case
    public String toString(){
        return "TRANSFERSTATION " + name + ": " + color + " line, in service: " + isAvailable + ", previous station: " + noneName(prev) + ", next station: " + noneName(next) + "\n\tTransfers: \n" + nameTransfer(otherStations);
    }
}