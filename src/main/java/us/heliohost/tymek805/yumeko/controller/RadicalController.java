package us.heliohost.tymek805.yumeko.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import us.heliohost.tymek805.yumeko.model.Radical;
import us.heliohost.tymek805.yumeko.repository.RadicalRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/radicals")
public class RadicalController {
    @Autowired
    private RadicalRepository radicalRepository;

    @GetMapping
    public List<Radical> getAllRadicals() {
        return radicalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Radical getRadicalById(@PathVariable Long id) {
        return radicalRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Radical createRadical(@RequestBody Radical radical) {
        return radicalRepository.save(radical);
    }

    @PutMapping("/{id}")
    public Radical updateRadical(@PathVariable Long id, @RequestBody Radical radicalDetails) {
        Radical radical = radicalRepository.findById(id).orElse(null);
        if (radical != null) {
            return radical;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteRadical(@PathVariable Long id) {
        radicalRepository.deleteById(id);
    }
}
