package az.mypractisesecond.mypractisespringboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("/v1")
    public String carNameV1(){
        return "BMW";
    }

    @GetMapping("/v2")
    public String carNameV2(){
        return "Mercedes";
    }


    @RequestMapping(path = "/v3",method = RequestMethod.GET)
    public String carNameV3(){
        return "Nissan";
    }

    /*

    @Getmapping("ser/s1/")
    public String carSerieV1(@PathVariable String ser){
        return "BMW SERIES:"+ser;
    }

    @GetMapping("ser/s1/{sere}")
    public String carSerieV1(@PathVariable ("sere") String ser, @PathVariable ("car") String car){
        return "BMW SERIES:"+ser +"  CAR: " +car;
    }

     */

    @GetMapping("ser/s1/{sere}/ayir/{car}")
    public String carSerieV1(@PathVariable (value = "sere" , required = false) String ser, @PathVariable ("car") String car){
        return "BMW SERIES:"+ser +"  CAR: " +car;
    }

    /*@GetMapping("ser/s2")
    public String carSerieV2(@RequestParam String ser){
        return "Mercedes SERIES:"+ser;
    }
    */

    @GetMapping("ser/s2")
    public String carSerieV2(@RequestParam(required = false) String ser,@RequestParam String car){
    return "Mercedes SERIES:"+ser +"  CAR: " +car;
    }
}