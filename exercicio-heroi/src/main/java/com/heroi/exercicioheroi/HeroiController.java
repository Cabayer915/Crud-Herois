package com.heroi.exercicioheroi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {
    private List<Heroi> herois = new ArrayList<>();

    public HeroiController() {
        Heroi superman = new Heroi("Superman", "O Homem de Aço, vindo do planeta Krypton e com força sobre-humana.", 100_000);
        Heroi spiderMan = new Heroi("Spider-Man", "Homem-Aranha, com habilidades aracnídeas como teias e super força.", 20_000);
        Heroi ironMan = new Heroi("Iron Man", "Tony Stark, um gênio bilionário playboy filantropo que usa armaduras de alta tecnologia.", 80_000);
        Heroi wolverine = new Heroi("Wolverine", "Mutante com garras de adamantium retráteis e um fator de cura acelerado.", 15_000);
        Heroi hulk = new Heroi("Hulk", "O Incrível Hulk, a personificação da raiva do Dr. Bruce Banner, com força descomunal.", 150_000);
        Heroi blackWidow = new Heroi("Black Widow", "Natasha Romanoff, ex-agente da KGB e altamente treinada em combate.", 5_000);

        herois.add(superman);
        herois.add(spiderMan);
        herois.add(ironMan);
        herois.add(wolverine);
        herois.add(hulk);
        herois.add(blackWidow);
    }
    @GetMapping
    public List<Heroi> getHerois() {
        return herois;
    }

    @GetMapping("/{indice}")
    public Heroi getHeroi(@PathVariable int indice) {
        if (indice >= 0 && indice < herois.size()) {
            return herois.get(indice);
        } else {
            return null;
        }
    }

    @PostMapping
    public Heroi cadastrarHeroi(@RequestBody Heroi heroiCadastro) {
        this.herois.add(heroiCadastro);
        return heroiCadastro;
    }

    @PutMapping("/{indice}")
    public Heroi atualizarHeroi(@PathVariable int indice, @RequestBody Heroi heroiAtualizar) {
        if (indice >= 0 && indice < herois.size()) {
            this.herois.set(indice, heroiAtualizar);

            return heroiAtualizar;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{indice}")
    public String removerHeroi(@PathVariable int indice) {
        if (indice >= 0 && indice < herois.size()) {
            herois.remove(indice);
            return "Heroi removido.";
        } else {
            return "Herói não encontrado.";
        }
    }
}
