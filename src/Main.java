
import java.util.ArrayList;
public class Main {

public static void main(String[] args){
}

public  static class Node{
    int healthMetric;
    Node next;

    public Node(int healthMetric, Node next) {
        this.healthMetric = healthMetric;
        this.next = next;

    }
}

public boolean isHealthRecordSymetrical(Node head) {
    Node current = head;
    ArrayList<Integer> healthArray = new ArrayList<>();
    while (current != null) {
        healthArray.add( current.healthMetric);
        current = current.next;
    }

    for (int i = 0; i < healthArray.size()/2; i++){
        if(healthArray.get(i).equals(healthArray.get(healthArray.size() - 1 - i))){
            return false;
        }

    }
    return true;
}

}


