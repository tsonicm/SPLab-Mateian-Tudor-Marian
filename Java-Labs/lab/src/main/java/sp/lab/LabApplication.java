package sp.lab;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sp.lab.Models.Book;
import sp.lab.Models.ImageProxy;
import sp.lab.Models.Section;

@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(LabApplication.class, args);
		
		long startTime = System.currentTimeMillis();

        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");

        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);

        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);

        long endTime = System.currentTimeMillis();

        System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");

	}

}
