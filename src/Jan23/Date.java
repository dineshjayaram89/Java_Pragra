package Jan23;

public class Date {
    int day;
    int month;
    int year;
    public Date(){
        day = 0;
        month = 0;
        year = 0;
    }
    public void printDate(){
        System.out.println("Date: " + day + " Month : " + month + " Year: " +year  );
    }
    public Date(int d, int m, int y){
        day = d;
        month =m;
        year = y;
    }
}
