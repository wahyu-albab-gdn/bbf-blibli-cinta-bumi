package com.gdn.bbf.blibli.cinta.bumi.controller.api;

import com.gdn.bbf.blibli.cinta.bumi.controller.api.resbody.Response;
import com.gdn.bbf.blibli.cinta.bumi.model.Profile;
import com.gdn.bbf.blibli.cinta.bumi.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @GetMapping("/api/profile/{profileId}")
    public Response<Profile> index(@PathVariable String profileId) {
        Optional<Profile> test = profileRepository.findById(profileId);
        if (test.isPresent()) {
            return Response.<Profile>builder()
                    .status("OK")
                    .data(test.get())
                    .build();
        }
        return Response.<Profile>builder()
                .status("NOT FOUND")
                .build();
    }
}
