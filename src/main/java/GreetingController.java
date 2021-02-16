import model.Note;
import repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GreetingController {
    private final NoteRepository noteRepository;

    @RequestMapping("/greeting")
    public List<Note> greeting() {
        return noteRepository.findAll();
    }
}
