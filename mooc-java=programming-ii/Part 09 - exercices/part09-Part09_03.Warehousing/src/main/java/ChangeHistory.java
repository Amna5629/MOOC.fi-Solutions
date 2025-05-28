import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

	public ChangeHistory() {
		this.changeHistory = new ArrayList<>();
	}

    public void add(double status){
        changeHistory.add(status);
    }
    public void clear(){
        changeHistory.clear();
    }
    public String toString(){
        return changeHistory.toString();
    }
    public double maxValue() {
        if(changeHistory.size()==0){
            return 0.0;
        }

        Double max=0.0;

        for(Double i : changeHistory){
            if(i>max){
                max=i;
            }
        
        }
        return max;
  
    }
    public double minValue(){
        if(changeHistory.size()==0){
            return 0.0;
        }

        Double min=changeHistory.get(0);

        for(Double i : changeHistory){
            if(i<min){
                min=i;
            }
        
        }
        return min;
    }
    public double average(){
        if (this.changeHistory.size() == 0) {
			return 0;
		}

		double total = 0;

		for (Double item : changeHistory) {
			total += item;
		}

		return (double) total / this.changeHistory.size();
    }


}
