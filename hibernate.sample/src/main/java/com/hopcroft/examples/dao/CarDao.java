package com.hopcroft.examples.dao;
/**
 * @author ananth 
 */
import java.util.List;
 
import org.springframework.dao.DataAccessException;
 
import com.hopcroft.examples.domain.Car;
 
public interface CarDao {
    public List<Car> getCars() throws DataAccessException;
    public Car getCar(Long carId) throws DataAccessException;
}