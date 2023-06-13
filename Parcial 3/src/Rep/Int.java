package Rep;

import Model.Asig;

import java.io.IOException;
import java.util.List;

public interface Int {


    Asig findByNum(int id);
    List<Asig> findAll() throws IOException,ClassNotFoundException;
    void save(Asig asig)throws IOException;
    void update(Asig asig)throws IOException,ClassNotFoundException;

    void  delete(Asig asig)throws IOException;

}
