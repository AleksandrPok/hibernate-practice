package cinema.service;

import cinema.model.MovieSession;
import java.time.LocalDate;
import java.util.List;

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession add(MovieSession movieSession);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);

    MovieSession get(Long id);
}
