import java.util.ArrayList;
public class TransferStation extends Station {
    public ArrayList<Station> transfers;

    public TransferStation(String color, String name){
        super(color, name);
        this.transfers = new ArrayList<>();
    }
    public void addTransferStationNext(Station s){
        s.prev = this;
        this.transfers.add(s);
    }

    public void addTransferStationPrev(Station s){
        s.next = this;
        this.transfers.add(s);
    }

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


    public String toString(){
        return "TRANSFERSTATION " + name + ": " + color + " line, in service: " + isAvailable + ", previous station: " + noneName(prev) + ", next station: " + noneName(next) + "\n\tTransfers: \n" + nameTransfer(transfers);
    }
}