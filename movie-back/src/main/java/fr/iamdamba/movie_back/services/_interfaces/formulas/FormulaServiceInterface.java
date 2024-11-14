package fr.iamdamba.movie_back.services._interfaces.formulas;

import java.util.List;

import fr.iamdamba.movie_back.dtos.formulas.FormulaCreateDto;
import fr.iamdamba.movie_back.dtos.formulas.FormulaOneDto;
import fr.iamdamba.movie_back.dtos.formulas.FormulaUpdateDto;
import fr.iamdamba.movie_back.entities.Formula;

public interface FormulaServiceInterface {
    /** Returns the formula with the given id */
    public FormulaOneDto one(Long id);

    /** Returns all formulas */
    public List<Formula> all();

    /** Create a new formula */
    public FormulaOneDto create(FormulaCreateDto entity);

    /** Update the formula with the given id */
    public FormulaOneDto update(Long id, FormulaUpdateDto entity);
}
