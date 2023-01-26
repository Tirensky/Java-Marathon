package day13;

/**
 * Нам необходимо создать свою небольшую социальную сеть на Java.
 * Для этого мы должны реализовать следующие классы:
 * User - сущность “Пользователь”
 * Message - сущность “Сообщение”
 * MessageDatabase - класс, который будет заниматься хранением сообщений
 * Test - класс, где в методе main() мы будем тестировать нашу соц. сеть
 * Класс User должен иметь следующую структуру:
 * Поля:
 * - Строковое поле “имя пользователя” (англ. username)
 * - Список, параметризованный классом User, с названием “подписки” (англ.
 * subscriptions). В этом списке должны храниться те пользователи, на
 * которых подписан пользователь.
 * Конструктор:
 * Должен принимать в качестве аргумента только имя пользователя. Также, должен
 * инициализировать поле “подписки” пустым списком.
 * Методы:
 * - Геттеры на все поля
 * - public void subscribe(User user) - подписывает пользователя на
 * пользователя user
 * - public boolean isSubscribed(User user) - возвращает True, если
 * пользователь подписан на пользователя user и False, если не подписан.
 * - public boolean isFriend(User user) - возвращает True, если
 * пользователь user является другом и False, если пользователь user не
 * является другом. Подумайте, что такое дружба в контексте соц. сетей.
 * - public void sendMessage(User user, String text) - отправляет
 * сообщение с текстом text пользователю user. Здесь должен использоваться
 * статический метод из MessageDatabase.
 * - public String toString() - возвращает строковое представление
 * пользователя (имя пользователя).
 * Класс Message должен иметь следующую структуру:
 * Поля:
 * - Поле типа User “отправитель” (англ. sender) - отправитель сообщения
 * - Поле типа User “получатель” (англ. receiver) - получатель сообщения
 * - Строковое поле “текст” (англ. text) - текст сообщения
 * - Поле типа Date “дата” (англ. date) - дата отправки сообщения
 * Конструктор:
 * - Конструктор должен принимать 3 аргумента - отправителя, получателя и текст
 * сообщения. Также, конструктор должен назначать полю date текущее время
 * (то есть время создания объекта Message).
 * Методы:
 * - Геттеры на все поля
 * - Метод toString(), который возвращает строковое представление сообщения
 * в таком формате:
 * FROM: 'Имя отправителя'
 * TO: 'Имя получателя'
 * ON: Sun Aug 30 19:07:34 MSK 2020
 * 'Текст сообщения'
 * *в поле ON должна быть дата создания объекта класса Message
 * Класс MessageDatabase должен иметь следующую структуру:
 * Поля:
 * - Статическое поле “сообщения” (англ. messages), которое будет хранить список
 * из сообщений (объектов класса Message). Это поле должно
 * инициализироваться пустым списком. Этот список и есть наша условная “база
 * данных”, которая хранит все сообщения в соц. сети.
 * Конструктор:
 * Нет конструктора. Объекты класса MessageDatabase создаваться не будут (все
 * методы и поля статические).
 * Методы:
 * - public static void sendMessage(User u1, User u2, String text)
 * - этот метод “отправляет” новое сообщение от пользователя u1 пользователю
 * u2 с текстом text. Отправка в нашем контексте означает добавление
 * сообщения в нашу “базу данных”.
 * - public static List<Message> getMessages() - возвращает список всех
 * сообщений в “базе данных”.
 * - public static void showDialog(User u1, User u2) - этот метод
 * должен вывести цепочку сообщений (диалог) пользователей u1 и u2.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("User 1");
        User user2 = new User("User 2");
        User user3 = new User("User 3");

        user1.sendMessage(user2, "Hello from u1");
        user1.sendMessage(user2, "How r u?");
        user2.sendMessage(user1, "Hi, u1!");
        user2.sendMessage(user1, "I'm u2. Nice to meet u!");
        user2.sendMessage(user1, "I'm fine, thx! And u?");

        user3.sendMessage(user1, "Hey! My name is u3");
        user3.sendMessage(user1, "Do u remember me?");
        user3.sendMessage(user1, "V went to the same school");
        user1.sendMessage(user3, "Aloha, u3. Of course I remember u!");
        user1.sendMessage(user3, "So nice to c u again");
        user1.sendMessage(user3, "Let's meet up. R u free tomorrow?");
        user3.sendMessage(user1, "Yep, I'm free tomorrow. Let's go!");

        MessageDatabase.showDialog(user1, user3);
        System.out.println("----------");
        MessageDatabase.showDialog(user2, user1);
    }
}
