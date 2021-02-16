package model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "device_notes")
public class Note {
    private String serialNumber;

    private String userName;

    private String note;

}
