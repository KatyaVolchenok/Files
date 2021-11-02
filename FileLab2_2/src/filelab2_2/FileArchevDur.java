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
public class FileArchevDur {
   
    private String duration;

    public FileArchevDur(String duration) {
        setDuration(duration);
    }
    
    
    public String getDuration () {
        return duration;
    }
    
    public void setDuration(String duration) {
    if(duration != null && ! duration.equals("")) {  
        this.duration = duration;
    } else {
           throw new IllegalArgumentException("Поле длительность не должно быть пустым");
        }
    }
}
