package player.controller;

import entity.dto.TableDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import player.service.TableService;

@Controller
@RequestMapping("api/v1/table")
public class TableController {

    private final ModelMap modelMap;

    private final TableService tableService;

    public TableController(ModelMap modelMap, TableService tableService) {
        this.modelMap = modelMap;
        this.tableService = tableService;
    }

    @GetMapping("/{id}")
    public String join(@PathVariable Long id, ModelMap modelMap) {
        tableService.join(id);
        return  null;
    }

    @PostMapping()
    public String create(ModelMap modelMap, TableDto tableDto){
        TableDto savedTableDto = tableService.create(tableDto);
        modelMap.addAttribute("tableInfo", savedTableDto.getTitle());
        return "redirect:/table";

    }

}
