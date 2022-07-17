package pl.coderslab;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@Data
//@Repository
public class FileCustomerLogger implements CustomerLogger {
//    private String filename;
//    File file = new File(filename);

    @Override
    public void log() {
//        try (FileWriter fileWriter = new FileWriter("filename.txt", true)){
//            fileWriter.append(LocalDateTime.now() + " Customer operation");
//        } catch (IOException ex) {
//            System.out.println("Błąd zapisu do pliku.");
//        }
    }
}
