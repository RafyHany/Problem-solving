class MyCalendar {
    TreeSet<Event> schedule ;
    public MyCalendar() {
         schedule = new TreeSet<>((a,b)-> {
            return a.start < b.start? -1 : a.start > b.start? 1 : Integer.compare(a.end , b.end)  ;
        });
    }

    public boolean book(int start, int end) {
        for(Event e : schedule){
            if(start < e.end && end >e.start)
                return false;
          
            if(start < e.start && end <= e.end)
                break;
        }
        schedule.add(new Event(start , end));
        return true;
    }
 
}
class Event{
    int start ;
    int end ;
    public Event(int start , int end){
        this.start = start ;
        this.end = end ;
    }
    public Event(){
        this.start = 0 ;
        this.end = 0 ;
    }
}