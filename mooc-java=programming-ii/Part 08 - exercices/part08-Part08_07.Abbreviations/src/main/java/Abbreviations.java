import java.util.HashMap;

public class Abbreviations{
    HashMap<String,String> abbreviations;

    public Abbreviations(){
        this.abbreviations=new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviations.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        if (this.abbreviations.containsKey(abbreviation)){
            return true;
        }else{
            return false;
        }
    }
    public String findExplanationFor(String abbreviation){
        String explanation=this.abbreviations.get(abbreviation);
        if(explanation!=null){
            return explanation;
        }else{
            return null;
        }
    }
}