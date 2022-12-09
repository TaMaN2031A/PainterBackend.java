package com.painter.demo;

import com.painter.demo.Services.Drawer;
import com.painter.demo.Services.IDs;
import com.painter.demo.shapes.jsonShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@CrossOrigin
@RestController
@RequestMapping
public class Controller{

        @Autowired
	    Drawer drawer = new Drawer();

        @GetMapping(value="/addShape")
        @ResponseBody
        public void addShape(@RequestBody jsonShape shape) {drawer.addShape(shape.first, shape);}

        @GetMapping(value="/undo")
        @ResponseBody
        public String undo() {return drawer.undo();}

        @GetMapping(value="/redo")
        @ResponseBody
        public String redo() {return drawer.redo();}

        @GetMapping(value="/copy")
        @ResponseBody
        public void copy(@RequestBody IDs ID) {drawer.copy(ID);}

}