package feb20.enumDemo;

public enum DaysofTheWeek {
    Monday(1), Tuesday(2),
    Wednesday(3), Thursday(4),
    Friday(5), Saturday(6),
    Sunday(7);

    final int dayOfTheWeek;

    DaysofTheWeek(int dayOfTheWeek){
        this.dayOfTheWeek = dayOfTheWeek;
    }
    public boolean isWeekend(DaysofTheWeek d){
        return (d == Saturday) || (d == Sunday);
}
}
