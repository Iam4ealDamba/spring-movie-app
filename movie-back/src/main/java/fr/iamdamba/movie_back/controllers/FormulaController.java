package fr.iamdamba.movie_back.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.iamdamba.movie_back.dtos.formulas.FormulaCreateDto;
import fr.iamdamba.movie_back.dtos.formulas.FormulaOneDto;
import fr.iamdamba.movie_back.dtos.formulas.FormulaUpdateDto;

@RestController()
@RequestMapping("/api/formulas")
public class FormulaController {
    /** Get all formulas */
    @GetMapping()
    public ResponseEntity<List<FormulaOneDto>> all() {
        List<FormulaOneDto> ShowOneDto = new ArrayList<>();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Get one formulas by id
     * 
     * @param id id of the formula (Long)
     */
    @GetMapping("/{id}")
    public ResponseEntity<FormulaOneDto> one(@PathVariable Long id) {
        FormulaOneDto ShowOneDto = new FormulaOneDto();
        return new ResponseEntity<>(ShowOneDto, HttpStatus.OK);
    }

    /**
     * Create a new formula
     * 
     * @param entity json of the formula (StudioCreateDto)
     */
    @PostMapping()
    public ResponseEntity<FormulaOneDto> create(@RequestBody FormulaCreateDto entity) {
        FormulaOneDto newShow = new FormulaOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Update a formula
     * 
     * @param id     id of the formula (String)
     * @param entity json of the formula (StudioUpdateDto)
     */
    @PutMapping("/{id}")
    public ResponseEntity<FormulaOneDto> putMethodName(@PathVariable String id, @RequestBody FormulaUpdateDto entity) {

        FormulaOneDto newShow = new FormulaOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

    /**
     * Delete a formula
     * 
     * @param id id of the formula (String)
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<FormulaOneDto> deleteMethodName(@PathVariable String id) {
        FormulaOneDto newShow = new FormulaOneDto();
        return new ResponseEntity<>(newShow, HttpStatus.OK);
    }

}
