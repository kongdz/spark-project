package dao.factory;

import dao.ITaskDAO;
import dao.impl.TaskDaoImpl;

/**
 * DAO工厂类
 */
public class DAOFactory {

    /**
     * 获取任务管理DAO
     *
     * @return
     */
    public static ITaskDAO getTaskDAO() {
        return new TaskDaoImpl();
    }

}
