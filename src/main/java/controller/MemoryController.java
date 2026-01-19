package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class MemoryController {
    private final List<byte[]> allocations = new ArrayList<>();

    @GetMapping("/oom")
    public String oom(@RequestParam(defaultValue = "50")int mb){
        allocations.add(new byte[mb*1024*1024]); //allocate mb and keep it referenced
        return "Allocated "+ mb + "MB. Total chunks: "+ allocations.size();
    }
}
