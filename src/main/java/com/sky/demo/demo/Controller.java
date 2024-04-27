package com.sky.demo.demo;

import com.sun.jdi.DoubleValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path="/calculator")
    public String welcome(){
        return("<b>Добро пожаловать в калькулятор!</b>");
    }

    @GetMapping(path="/calculator/plus")
    public String calculatePlus(@RequestParam Integer value1,
                                @RequestParam Integer value2){
        Integer valueSum=value1+value2;
        return("Итог:")+value1+("+")+value2+("=")+valueSum;
    }

    @GetMapping(path="/calculator/minus")
    public String calculateMinus(@RequestParam Integer value1,
                                @RequestParam Integer value2){
        Integer valueSum=value1-value2;
        return("Итог:")+value1+("-")+value2+("=")+valueSum;
    }

    @GetMapping(path="/calculator/devide")

    public String calculateDevide(@RequestParam Double value1,
                                @RequestParam Double value2){
        Double valueSum=value1/value2;
        return("Итог:")+value1+("/")+value2+("=")+valueSum;
    }
    @GetMapping(path="/calculator/multiply")
    public String calculateMultiply(@RequestParam Double value1,
                                  @RequestParam Double value2){
        Double valueSum=value1*value2;
        return("Итог:")+value1+("*")+value2+("=")+valueSum;
    }
}
