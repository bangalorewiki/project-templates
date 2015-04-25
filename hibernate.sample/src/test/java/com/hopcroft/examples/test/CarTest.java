package com.hopcroft.examples.test;
 
import java.util.List;
import java.util.logging.Logger;
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import com.hopcroft.examples.dao.CarDao;
import com.hopcroft.examples.domain.Car;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/testApplicationContext.xml" })
public class CarTest {
 
    @Autowired
    private CarDao carDao;
    private Logger logger = Logger.getLogger("myLog");
    private Long id;
 
    @Before
    public void init() {
//      carNumber = carDao.getCars().size();
        id = 1L;
    }
 
    @Test
    public void listCarsTest() {
        List<Car> cars = carDao.getCars();
        
      logger.info("Cars: " + cars.size());
        Assert.assertNotNull(cars);
        Assert.assertEquals(4, cars.size());
    }
 
    @Test
    public void getCarTest() {
        Car car = carDao.getCar(id);
        Assert.assertEquals(id.longValue(), car.getId());
        Assert.assertEquals("Boxster", car.getModel());
    }
}