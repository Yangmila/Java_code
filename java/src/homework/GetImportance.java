package homework;

import java.util.List;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class GetImportance {
    int sum = 0;
    public int getImportance(List<Employee> employees, int id) {
        for(Employee e : employees){
            if(e.id == id){
                sum += e.importance;
                for(int i : e.subordinates){
                    getImportance(employees, i);
                }
            }
        }
        return sum;
    }
}
