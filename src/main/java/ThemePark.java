import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IEnjoyable> attractionsAndStalls;

    public ThemePark (String name){
        this.attractionsAndStalls = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAttractionOrStall(IEnjoyable thing){
        attractionsAndStalls.add(thing);
    }

    public int attractionCount(){
        return attractionsAndStalls.size();
    }

    public String report(){
        String report = "";

      for (IEnjoyable eachOne: attractionsAndStalls ) {
  report += eachOne.getName() + ": " + eachOne.getFunRating() + ", ";
      }


        return report;
    }
}
