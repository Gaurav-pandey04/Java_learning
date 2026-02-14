// Print a timetable in which it should show 5 days of week and then 9 hour of schedule 

public class Timetable {
    public static void main(String[] args){
        for(int i=1; i<6; i++){
            System.out.println("Day: " + i);
            for(int j=9; j<18; j++){
                System.out.println("    " + j + " - " + (j+1));
            }
        }
    }
}