package com.painter.demo;

import com.painter.demo.Services.Drawer;
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
	    Drawer drawer = new Drawer(); // I'll use him again and again

        @GetMapping(value="/addShape")
        @ResponseBody
        public String addShape(@RequestBody jsonShape shape)
        {
                return drawer.addShape(shape.first, shape);
        }

        @GetMapping(value="/undo")
        @ResponseBody
        public String undo() {return drawer.undo();}

        @GetMapping(value="/redo")
        @ResponseBody
        public String redo() {return drawer.redo();}







       /* @GetMapping("/rectangle")
        public Ishape squareRec(@RequestParam(name = "wid") String width, @RequestParam(name = "len") String length,
        @RequestParam(name = "x") String x, @RequestParam(name = "y") String y)
        {
                String[] data = new String[5];
                data[0] = width; data[1] = length ;data[2] = x; data[3] = y; data[4] = String.valueOf(id++);
                return drawer.addShape("Rectangle", data);
        }

        @GetMapping("/undo")
        public void undo()
        {
                drawer.undo();
        }

        {
           "lenght":"40",
        }
*/
}