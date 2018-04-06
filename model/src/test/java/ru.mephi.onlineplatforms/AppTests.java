package ru.mephi.onlineplatforms;

import org.junit.Test;
import ru.mephi.onlineplatform.entities.Student;
import ru.mephi.onlineplatform.entities.User;
import ru.mephi.onlineplatform.repository.dao.UserDao;
import ru.mephi.onlineplatform.repository.domain.UserDaoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Stanislav_Semichevskiy
 */
public class AppTests {
    @Test
    public void shouldAddElement() {
        //given
        UserDao userDao = new UserDaoImpl();

        User student = new Student();
        student.setEmail("a@b.ru");

        User savedUser = userDao.save(student);
        assertNotNull(savedUser.getId());
        assertEquals(savedUser.getEmail(), student.getEmail());
    }

    @Test
    public void shouldFindElementById() {
        //given
        UserDao userDao = new UserDaoImpl();

        User student = new Student();
        student.setEmail("a@b.ru");

        Long id = userDao.save(student).getId();

        User savedUser = userDao.findById(id);
        assertNotNull(savedUser.getId());
        assertEquals(savedUser.getEmail(), student.getEmail());
    }
}
