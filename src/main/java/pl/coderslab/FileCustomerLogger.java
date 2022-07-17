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
@AllArgsConstructor
@NoArgsConstructor
public class FileCustomerLogger implements CustomerLogger {
    private String filename;


    @Override
    public void log() {
        File file = new File(filename);
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.append(LocalDateTime.now() + " Customer operation");
        } catch (IOException ex) {
            System.out.println("Błąd zapisu do pliku.");
        }
    }
}
