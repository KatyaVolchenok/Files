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
public class FileMedia extends File {
    private String format;
    private String desc;
    private String duration;

    public FileMedia(String name, int  size, String format, String desc, String duration) {
        super(name, size);
        setFormat(format);
        setDesc(desc);
        setDuration(duration);
    }
    
    public String getFormat() {
        return format;
    }
    
    public String getDesc() {
        return desc;
    }
    public String getDuration () {
        return duration;
}
     
    public void setFormat(String format) {
        if(format != null && ! format.equals("")) {  
        this.format = format;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым!");
        }
    }
    
    public void setDesc(String desc) {
        if(desc != null && ! desc.equals("")) {  
        this.desc = desc;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым!");
        }
    }
    
    public void setDuration(String duration) {
         if(duration != null && ! duration.equals("")) {  
        this.duration = duration;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым!");
        }
    }

    @Override
    public String toString() {
        return String.format("%-30s|", getName())+
            String.format("%20s|", getSize())+
            String.format("%-50s|", getFormat() + "," + getDesc() + "," + getDuration());
    }

  }
