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
public class Main {
    public static void main(String [] args) {
    File[] file = {
	    new FileDoc("j110-lab2-hiers.docx", 23212, "docx", 2),
	    new FileImage("spb-map.png", 1703527, "image", 1024, 3072),
	    new FileMedia("06-PrettyWoman.mp3", 7893454, "audio", "Eric Clapton, Pretty Woman", "05:28"),
            new FileVideo("BackToFuture1.avi", 1470984192, "video", "Back to future I,1985", "01:48:08", "640x352"),
            		};
        
         File.printAll(file);
         System.out.println();
         
    FileMedia[] fileMedia = new FileMedia[] {
        new FileMedia("01-All the small Thing", 3452341, "audio", "Blink 182, All the small things", "02:52"),
        new FileMedia("02-My favourite game", 6756345, "audio", "Cardigans, My favourite game", "03:39"),
        new FileMedia("03-Blaze Of Glory", 7656453, "audio", "Jon Bon Jovi, Blaze Of Glory", "05:33"),
        new FileMedia("04-Holiday", 6798765, "audio", "Creen Day, Holiday", "03:53"),
        new FileMedia("05-Nothing Else Matters", 6756435, "audio", "Metallica, Nothing Else Matters", "06:20"),
        new FileMedia("06-PrettyWoman.mp3", 7893454, "audio", "Eric Clapton, Pretty Woman", "05:28")
    }; 
         File.printAll(fileMedia); // Метод printAll()dызывается для печати массива FileMedia, так как данный тип унаследовал этот метод от класса File.
}
}
