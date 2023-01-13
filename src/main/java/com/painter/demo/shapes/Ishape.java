package com.painter.demo.shapes;

import com.github.cliftonlabs.json_simple.JsonObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

// Polymorphism
@Component
public interface Ishape {

    String getFirst();

    void setFirst(String first);

     String getSecond();

     void setSecond(String second);

     String getThird();

     void setThird(String third);

     String getFourth();

     void setFourth(String fourth);

     String getFifth();

     void setFifth(String fifth);

     String getSixth();


     void setSixth(String sixth);

     String getSeventh();

     void setSeventh(String seventh);

     String getEight();
    
     void setEight(String eight);

     String getNinth();

     void setNinth(String ninth);

     String getTenth();

     void setTenth(String tenth);

     String getEleventh();

     void setEleventh(String eleventh);

     String getTwelfth();

     void setTwelfth(String twelfth);

     String getThrteen();

     void setThrteen(String thrteen);

     String getFourteen();

     void setFourteen(String fourteen);

     String toString();

     void handle(jsonShape data);

     Ishape clone(Ishape toBeCloned);

     JsonObject tojsonobject();

     Ishape fromjsonObject(JsonObject jsonObject);

     void ObjectToXml (Document xmlDoc, Element mainElement);

     Ishape  xmlToObject(Node shape_node);

}

