package com.painter.demo.Services;
import com.painter.demo.shapes.*;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class Drawer
{
    int currentLevel = 0;
    ArrayList<ArrayList<Ishape>> History = new ArrayList<>();

    Factory factory = new Factory();
    public String addShape(String type, jsonShape data)
    {
        ArrayList state = new ArrayList<Ishape>() ;
        ArrayList buffer = new ArrayList<Ishape>() ;
        System.out.println(History);
        currentLevel++;
        System.out.println(currentLevel);
        Ishape sentShape = factory.createShape(type); // FactorJob is done
        sentShape.handle(data); // Done
        if(currentLevel!=1)
            buffer = History.get(currentLevel-2);
        int i = 0;
        for(Object iterator: buffer){
            state.add(iterator);
        }
        state.add(sentShape);
        History.add(currentLevel-1, state);
        System.out.println(History);
        return formatter();
    }
    String formatter(){
        String carrierPigeons = "[";
        int i = 0;
        for (Ishape iterator:
             History.get(currentLevel-1)) {
            carrierPigeons += iterator.toString();
                    i++;
                    if(i!=currentLevel)
                        carrierPigeons += ",";
        }
        carrierPigeons += "]";
        return carrierPigeons;
    }
    public String undo()
    {
        currentLevel--;
        System.out.println(History);
        return formatter();
    }
    public String redo()
    {
        currentLevel++;
        return formatter();
    }


}
