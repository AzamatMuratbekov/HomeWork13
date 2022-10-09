public class Class {
   private int number;
   private String soz;
   private int[] array;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Class(int number, String soz, int[] array) {
        this.number = number;
        this.soz = soz;
        this.array = array;

    }
}
