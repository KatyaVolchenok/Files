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
public class FilwArchivSize {
    private String imagesize;
    

    public FilwArchivSize(String imagesize) {
        setImagesize(imagesize);
        
    }
    public String getImagesize() {
        return imagesize;
    }
    
   
    
    public void setImagesize(String imagesize) {
    if(imagesize != null && ! imagesize.equals("")) {  
        this.imagesize = imagesize;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }
    
    
}
