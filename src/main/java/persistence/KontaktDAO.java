package persistence;

import java.io.IOException;

import model.Kontakt;

public interface KontaktDAO {
	public void Save(Kontakt contact) throws Exception;
}
