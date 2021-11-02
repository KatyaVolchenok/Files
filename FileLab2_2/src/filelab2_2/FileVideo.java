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
public class FileVideo extends FileMedia {
    private String picsize;

    public FileVideo(String name, int size, String format, String desc,  String duration, String picsize) {
        super(name, size, format, desc, duration);
        setPicsize(picsize);
    }
     public String getPicsize (){
         return picsize;
     }
    
    public void setPicsize(String picsize) {
        if(picsize == null){
            throw new NullPointerException("Поле размер пустое");
        }else {
           this.picsize= picsize;  
        }
    }
    @Override
    public String toString() {
        return String.format("%-30s|", getName())+
            String.format("%20s|", getSize())+
            String.format("%-50s|", getFormat() + "," + getDesc() + "," + getDuration() + "," + getPicsize());
    }

    
}
