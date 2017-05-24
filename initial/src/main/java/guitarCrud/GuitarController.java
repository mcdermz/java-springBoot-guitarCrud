package guitarCrud;

import org.springframework.web.bind.annotation.*;

/**
 * Created by seanmcdermott on 5/19/17.
 */
@RestController
@RequestMapping("/guitars")
public class GuitarController {
    private final GuitarRepository repository;

    public GuitarController(GuitarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public Iterable<Guitar> all() {
        return this.repository.findAll();
    }

    @PostMapping("")
    public Guitar create(@RequestBody Guitar guitar) {
        return this.repository.save(guitar);
    }

    @GetMapping("/{id}")
    public Guitar show(@PathVariable("id") long id) {
        return this.repository.findOne(id);
    }

    @GetMapping("/find/{brand}")
    public Iterable<Guitar> show(@PathVariable("brand") String brand) {
        return this.repository.findByBrand(brand);
    }

    @PutMapping("/{id}")
    public Guitar put(@PathVariable("id") long id, @RequestBody Guitar guitar) {
        Guitar dbGuitar = repository.findOne(id);
        if (guitar.getBrand() != null) {
            dbGuitar.setBrand(guitar.getBrand());
        }
        if (guitar.getModel() != null) {
            dbGuitar.setModel(guitar.getModel());
        }
        return this.repository.save(dbGuitar);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        this.repository.delete(id);
    }
}



