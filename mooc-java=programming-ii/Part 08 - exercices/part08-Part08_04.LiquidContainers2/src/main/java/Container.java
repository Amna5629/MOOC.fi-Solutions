public class Container {
    private int container=0;


    public Container(){
        this.container=0;
        
    }
    public int contains(){
        return this.container;
    }
    public void add(int amount){
        if (amount < 0) {
			return;
		} else if (this.container + amount >= 100) {
			this.container = 100;
		} else {
			this.container += amount;
		}
               
    }
    public void remove(int amount){
        if (amount < 0) {
			return;
		} else if (this.container <= amount) {
			this.container = 0;
		} else {
			this.container -= amount;
		}
    }
    public String toString(){
        return this.container + "/100";
    }
}
