package models;

import java.util.ArrayList;

public class School {
    private ArrayList<Person> arr = new ArrayList<>();
    public void addMember(Person person){
        arr.add(person);
    }
    @Override
    public String toString() {
        String all = "";
        for(Person person:arr){
            all+= person.toString()+"\n";
        }
        return all;
    }
    public void sort(){
        for(int i=0;i<arr.size();i++){
            for(int j = 0;j<arr.size()-i-1;j++){
                if(arr.get(j).getSurname().compareTo(arr.get(j+1).getSurname())>0){
                    Person temp = arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }
    public void updateSalary(){
        for(Person teach:arr){
            if(teach.getYearsOfExperience()>10){
                teach.giveRaise(2.5f);
            }
        }
    }
}
