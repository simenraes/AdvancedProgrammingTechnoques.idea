package be.thomamore.party.repositories;

import be.thomamore.party.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
}
