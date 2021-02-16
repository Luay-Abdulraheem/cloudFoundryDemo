import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import model.Note;
import repository.NoteRepository;

@Component
@RequiredArgsConstructor
public class NoteListener {
    private final NoteRepository noteRepository;

    @RabbitListener(queues = {"notes"})
    public void processOrder(@Payload Note note) {
        noteRepository.save(note);
    }
}
