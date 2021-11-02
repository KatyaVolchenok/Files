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
public class FileDoc extends File {
    private String format;
    private int numberPage;

    public FileDoc(String name, int size, String format, int numberPage) {
        super(name, size);
        setFormat(format);
        setNumberPage(numberPage);
    }
    
    public String getFormat() {
        return format;
    }
    
    public int getNumberPage() {
        return numberPage;
    }
    
    public void setFormat(String format) {
        if(format != null && ! format.equals("")) {  
        this.format = format;
    } else {
           throw new IllegalArgumentException("Поле не должно быть пустым");
        }
    }
    public void setNumberPage(int numberPage) {
        if(numberPage > 0) {
            this.numberPage = numberPage;
        }
    }

    @Override
    public String toString(){
    return String.format("%-30s|", getName())+
            String.format("%20s|", getSize())+
            String.format("%-50s|", getFormat() + "," + getNumberPage() + "pages");
    }

}
