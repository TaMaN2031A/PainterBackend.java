package com.painter.demo.shapes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

     String toString();

     void handle(jsonShape data);
}

