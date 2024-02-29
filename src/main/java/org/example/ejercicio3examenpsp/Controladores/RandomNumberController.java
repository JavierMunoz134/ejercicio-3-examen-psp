package org.example.ejercicio3examenpsp.Controladores;

import org.example.ejercicio3examenpsp.Modelos.RandomNumber;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/random")
public class RandomNumberController {

    private final Random random = new Random();

    // Devuelve un array de 100 números aleatorios
    @GetMapping("/numbers")
    public ResponseEntity<int[]> getRandomNumbers() {
        int[] numbers = IntStream.range(0, 100)
                .map(i -> random.nextInt())
                .toArray();
        return ResponseEntity.ok(numbers);
    }
// Devuelve un número aleatorio de x dígitos
    @GetMapping("/number/{d}")
    public ResponseEntity<RandomNumber> getRandomNumber(@PathVariable int d) {
        int number = random.nextInt((int) Math.pow(10, d));
        return ResponseEntity.ok(new RandomNumber(number));
    }

    @PutMapping("/number")
    // Recibe un número aleatorio y devuelve otro número aleatorio de la misma longitud
    public ResponseEntity<RandomNumber> putRandomNumber(@RequestBody RandomNumber randomNumber) {
        int digits = (int) Math.log10(randomNumber.getRandom()) + 1;
        int number = random.nextInt((int) Math.pow(10, digits));
        return ResponseEntity.ok(new RandomNumber(number));
    }
}