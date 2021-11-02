/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filelab2_2;


/**
 *
 * @author Shwartskopff
 */
public abstract class File {
    String name;
    private int size;
   
    public File(String name, int size) {
        setName(name);
        setSize(size);
    }
    
    public String getName() {
        return name;
    }
    
    public int getSize () {
        return size;
    }
    
    public void setName(String name) {
        if(name != null && ! name.equals("")) {  
        this.name = name;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }
    public void setSize(int size) {
        if(size > 0) {
            this.size = size;
        }
    }
    
    @Override
    public abstract String toString();
   
    public static void printAll(File[] file) {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%-30s|", "File Name") + String.format("%-20s|", "Size") 
        + String.format("%-50s|", "Details"));
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (File f: file) {
            System.out.println(f.toString());
        }
        System.out.println("_____________________________________________________________________________________________________________");
    }

}

    
  
    

