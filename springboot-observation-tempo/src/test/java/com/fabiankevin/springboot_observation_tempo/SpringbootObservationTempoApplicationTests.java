package com.fabiankevin.springboot_observation_tempo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringbootObservationTempoApplicationTests {

    @Test
    void contextLoads() {
        List<Integer> integers = List.of(1);

        assertThat(integers).containsOnly(1);



    }

}
