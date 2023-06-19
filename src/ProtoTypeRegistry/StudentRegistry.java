package src.ProtoTypeRegistry;

import java.util.HashMap;

public class StudentRegistry {

    HashMap<String ,Student>map;

    public StudentRegistry(){
        this.map = new HashMap<>();
    }



    public void Register(String key,Student studentPrototye){
        this.map.put(key,studentPrototye);
    }

    public Student getStudentProtoType(String  key){
        return this.map.get(key);
    }
}
