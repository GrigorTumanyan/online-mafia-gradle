package player.service;

import entity.dto.TableDto;

public interface TableService {
    void join(Long id);

    TableDto create(TableDto tableDto);
}
