/*
Lauren Hodges
 */
public class Dresser {
    private Clothing[][] clothes;

    public Dresser() {//default
        this.clothes = new Clothing[5][10];
    }



    private int getEmpty(int drawer) { //finds empty spots in the dresser
        for (int i = 0 ; i < 10 ; i++) {
            if(this.clothes[drawer][i] == null)
                return i;
        }
        return -1;
    }

    public void add(Clothing aClothing){ //finds empty spot, fills with clothing type
        int i=0;
        for(Clothing_Type type : Clothing_Type.values()){
            if(type==aClothing.getType()){
                if(i>1){
                    i-=1;
                }
                int spot = getEmpty(i);
                if(spot != -1)
                    this.clothes[i][spot] = aClothing;
                else
                    System.out.println("Drawer is full.");
                break;
            }
            i += 1;
        }
    }
    public void remove(Clothing aClothing) { //finds correct spot, makes it null
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                if((this.clothes[i][j] != null) && (clothes[i][j].equals(aClothing))) {
                    this.clothes[i][j] = null;
                    break;
                }
            }
        }
    }
    public void print() { //prints
        int i = 0;
        for (Clothing[] aClothing : clothes) {
            System.out.println("Drawer " + i);
            for (Clothing cloth : aClothing) {
                if(cloth != null) {
                    System.out.println(cloth);
                }
            }
            i += 1;
            System.out.println();
        }
    }
}

