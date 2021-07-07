package pl.sepiqon.rodzinka.data.service;

import pl.sepiqon.rodzinka.data.entity.Czlonek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;

@Service
public class CzlonekService extends CrudService<Czlonek, Integer> {

    private CzlonekRepository repository;

    public CzlonekService(@Autowired CzlonekRepository repository) {
        this.repository = repository;
    }

    @Override
    protected CzlonekRepository getRepository() {
        return repository;
    }

    public void save(Czlonek czlonek) {
        this.repository.save(czlonek);

    }

    public void clear() {
        this.repository.deleteAll();
    }

}
