package coding.challenge.energyconsumption.controller;

import coding.challenge.energyconsumption.dto.VillageDTO;
import coding.challenge.energyconsumption.mapper.VillageMapper;
import coding.challenge.energyconsumption.model.Village;
import coding.challenge.energyconsumption.service.VillageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class VillageController {

    private VillageService villageService;

    public VillageController(VillageService villageService) {
        this.villageService = villageService;
    }

    @GetMapping(path = "/api/village/{village-id}")
    public ResponseEntity<?> getVillage(@PathVariable(value = "village-id") Long villageId) {
        Optional<Village> village = villageService.getById(villageId);
        if (!village.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(village);
    }


    @PostMapping(path = "/api/village")
    public ResponseEntity<?> saveVillage(@RequestBody @Valid  VillageDTO villageDTO) {
        return ResponseEntity.ok(villageService.save(VillageMapper.toVillage(villageDTO)));
    }


    // Put API for updating villages

    // Delete API fo removing villages
}
