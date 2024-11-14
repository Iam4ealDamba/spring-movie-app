package fr.iamdamba.movie_back.services.formulas;

import java.util.List;

import fr.iamdamba.movie_back.dtos.formulas.FormulaCreateDto;
import fr.iamdamba.movie_back.dtos.formulas.FormulaOneDto;
import fr.iamdamba.movie_back.dtos.formulas.FormulaUpdateDto;
import fr.iamdamba.movie_back.entities.Formula;
import fr.iamdamba.movie_back.services._interfaces.formulas.FormulaServiceInterface;

public class FormulaService implements FormulaServiceInterface {

    @Override
    public FormulaOneDto one(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'one'");
    }

    @Override
    public List<Formula> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }

    @Override
    public FormulaOneDto create(FormulaCreateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public FormulaOneDto update(Long id, FormulaUpdateDto entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
