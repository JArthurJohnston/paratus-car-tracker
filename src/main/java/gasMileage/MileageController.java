package gasMileage;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MileageController {

    @RequestMapping("/reflect-mileage")
    public Mileage reflectMileage(@RequestParam(value = "latitude", defaultValue = "9999") long latitude,
                                  @RequestParam(value = "longitude", defaultValue = "8888") long longitude,
                                  @RequestParam(value = "mileage", defaultValue = "77.66") float mileage){
        return new Mileage(latitude, longitude, mileage);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/mileage")
    public void addMileage(@RequestBody Mileage mileage){
        Mileage.allMileageEntries.add(mileage);
    }

    @RequestMapping("/mileages")
    public List<Mileage> allMileages(@RequestParam(value = "latitude", defaultValue = "9999") long latitude,
                                     @RequestParam(value = "longitude", defaultValue = "8888") long longitude,
                                     @RequestParam(value = "mileage", defaultValue = "77.66") float mileage){
        return Mileage.allMileageEntries;
    }

}
