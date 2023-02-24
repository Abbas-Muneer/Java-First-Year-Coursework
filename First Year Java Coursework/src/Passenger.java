public class Passenger {
    public static String firstName;
    public static String surName;
    public static int expenses;

    public Passenger(String firstName, String surName, int expenses){
        this.firstName = firstName;
        this.surName = surName;
        this.expenses = expenses;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setsurName(String surName){
        this.surName = surName;
    }

    public void setexpenses(int expenses){
        this.expenses = expenses;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getSurName(){
        return surName;
    }

    public int getExpensees(){
        return expenses;
    }

}
