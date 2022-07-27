package player.service.impl;

import entity.dto.TableDto;
import entity.enums.TableStatus;
import entity.mapper.TableMapper;
import entity.model.Table;
import entity.repository.TableRepo;
import player.service.TableService;

public class TableServiceImpl implements TableService {
private final TableRepo tableRepo;

    public TableServiceImpl(TableRepo tableRepo) {
        this.tableRepo = tableRepo;
    }


    @Override
    public void join(Long id) {
        return;
    }

    @Override
    public TableDto create(TableDto tableDto) {
        Table table = TableMapper.tableDtoToTable(tableDto);
        table.setStatus(TableStatus.OPENED);
        Table savedTable = tableRepo.save(table);
        return TableMapper.tableToTableDto(savedTable);

    }
}
