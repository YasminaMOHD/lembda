/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembda;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javafx.stage.FileChooser;


/**
 *
 * @author lenovo
 */
public class Lembda {

    public static void main(String[] args) throws FileNotFoundException, IOException {
 //Q1
 // a
      IntConsumer i= 
              (value)->{
            System.out.printf("%d ", value);
        };
      
//b
        UnaryOperator unaryOperator = new UnaryOperator() {
            @Override
            public Object apply(Object t) {
                String s=(String)t;
                return (String)s.toUpperCase();
            }};
 
//c
  Supplier<String> i1= 
              ()->{
            return "Welcom to lembda !";
        }; 
                
//d
     UnaryOperator<Integer> i2= 
              (value)->{
           return value*value*value;
        };   

//Q2

String text=("C:\\Users\\lenovo\\Documents\\NetBeansProjects\\Ass3Part1\\src\\ass3part1\\Research.txt");
Pattern p = Pattern.compile("\\s+");
Map<String, Long> map= new TreeMap<>();
try {
  map = Files.lines(Paths.get(text))
	.flatMap(str->Stream.of(str.split("")))
   .collect(Collectors
                 .groupingBy(String::toUpperCase,                             
                             Collectors.counting()
                             ));

} catch (IOException e) { 	
    e.printStackTrace();}   
System.out.println(map);




}
    }
     
   
    
             
    

