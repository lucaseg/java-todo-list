package com.lucas.todolist.controller;

import com.lucas.todolist.dtos.request.TaskDto;
import com.lucas.todolist.service.ITodoListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoListController {
    ITodoListService todoListService;

    public TodoListController(ITodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<TaskDto>> listAllTasksTodo(){
        return null;
    }

    @PostMapping("/create")
    public ResponseEntity<TaskDto> addNewTask(@RequestBody TaskDto taskDto){
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<TaskDto> updateTask(@RequestBody TaskDto taskDto){
        return null;
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteTask(@RequestParam Integer taskID){
        return  null;
    }
}
