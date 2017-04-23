/*===
 * class HelpDesk
 * uses class Ticket and ArrayPriorityQueue
 * implementation of a help desk using a priority queue
  ==*/

import java.util.ArrayList;
import java.io.*;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> _data;
    private int IDtracker = 0;

    public HelpDesk() {
        _data = new ArrayPriorityQueue<Ticket>();
    }
    
    //respond method to help user after a dequeue
    public void respond(Ticket t){
        System.out.println("Thank you for your patience " + t.getName());
        if(t.getDeskOp().equals("reinstallOS")){
            System.out.println("You will need to reinstall your OS to get rid of viruses.");
        }
        else if(t.getDeskOp().equals("brokenCupholder")){
            System.out.println("That isn't a cupholder. It is a cd drive.");
        }
        else{
            System.out.println("Error you have not made a request");
        }
        System.out.println("We hope that we were helpful.");
        System.out.println("------------");
    }
    
    public void IDtracker() {
        IDtracker += 1;   
    }

}
