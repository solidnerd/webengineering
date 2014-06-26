package persistence;

import java.io.IOException;

import model.Kontakt;
/**
 * Abstractor for the DAO
 */
public interface KontaktDAO {
	public void Save(Kontakt contact) throws Exception;
}
