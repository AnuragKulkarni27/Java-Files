import java.util.ArrayList;
public class variablecolumns {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();
        // Adding elements to the 2D ArrayList twoDArrayList
        twoDArrayList.add(new ArrayList<>());
        twoDArrayList.add(new ArrayList<>());
        twoDArrayList.add(new ArrayList<>());
        // Adding elements to specific rows 
        twoDArrayList.get(0).add(1);
        twoDArrayList.get(0).add(2);
        twoDArrayList.get(0).add(3);

        twoDArrayList.get(1).add(4);
        twoDArrayList.get(1).add(5);

        twoDArrayList.get(2).add(6);
        twoDArrayList.get(2).add(7);
        twoDArrayList.get(2).add(8);
        twoDArrayList.get(2).add(9);

        // Displaying the 2D ArrayList 
        for (int i = 0; i < twoDArrayList.size(); i++) {
            for (int j = 0; j < twoDArrayList.get(i).size(); j++) {
                System.out.print(twoDArrayList.get(i).get(j) + " ");
            }
            System.out.println() ;
    }
}
}
