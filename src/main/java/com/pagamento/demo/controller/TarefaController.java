package com.pagamento.demo.controller;

import com.pagamento.demo.model.Tarefa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {
    private List<Tarefa> tarefas = new ArrayList<>();
    private Long proximoId = 1L;

    @GetMapping
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    @PostMapping
    public Tarefa postTarefa(@RequestBody Tarefa novaTarefa) {
        novaTarefa.setId(proximoId++);
        tarefas.add(novaTarefa);
        return novaTarefa;
    }

}
