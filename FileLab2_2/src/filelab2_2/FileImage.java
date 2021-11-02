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
public class FileImage extends File {
    private String format;
    private int sizeHeight;
    private int sizeWidth;    

    public FileImage(String name, int size, String format, int sizeHeight, int sizeWidth) {
        super(name, size);
        setFormat(format);
        setSizeHeight(sizeHeight);
        setSizeWidth(sizeWidth);
    }
    
    public String getFormat() {
        return format;
    }
    public int getSizeHeight() {
        return sizeHeight;
    }
    
    public int getSizeWidth() {
        return sizeWidth;
    }
    
        
    public void setFormat(String format) {
        if(format != null && ! format.equals("")) {  
        this.format = format;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым!");
        }
    }
    
    public void setSizeHeight(int sizeHeight) {
        if(sizeHeight > 0) {
            this.sizeHeight = sizeHeight;
        }
    }
    public void setSizeWidth(int sizeWidth) {
        if(sizeWidth > 0) {
            this.sizeWidth = sizeWidth;
        }
    }

    @Override
    public String toString() {
       return String.format("%-30s|", getName())+
            String.format("%20s|", getSize())+
            String.format("%-50s|", getFormat() + "," + getSizeHeight() + "x" + getSizeWidth());
    }
}

   

