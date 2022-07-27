package entity.mapper;

import entity.dto.TableDto;
import entity.model.Table;

public class TableMapper {

    public static TableDto tableToTableDto(Table table){
       return new TableDto(table.getTitle(), table.getMaxPlayer(), table.getMaxPlayer(), table.getCreatedBy(),
               table.getStatus(), table.getAudienceList(), table.getCurrentPlayerList());
    }

    public static Table tableDtoToTable(TableDto tableDto){
        return new Table(tableDto.getTitle(), tableDto.getMaxPlayer(), tableDto.getMaxPlayer(), tableDto.getCreatedBy(),
                tableDto.getStatus(), tableDto.getAudienceList(), tableDto.getCurrentPlayerList());
    }


}
