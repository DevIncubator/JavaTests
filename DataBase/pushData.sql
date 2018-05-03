INSERT INTO topic (name, description) VALUES ( "Java", "Тест по Java содержит вопросы, ответы на которые
знает большинство разработчиков с минимальным опытом программирования на Java. Тест будет полезен многим,
в том числе людям, которые не имеют большого опыта работы с Java и хотят получить минимальное представление
о базовых понятиях этого популярного языка программирования.");
INSERT INTO test (name, description, topicId) VALUES ( "Java - Основы", "этот раздел содержит вопросы касающиеся
 основных понятий, терминов и аббревиатур, конвенций именования классов, переменных и методов. Также в этом разделе
 рассматриваются вопросы по файлам (.java, .class, .jar) и пакетам, жизненному циклу объектов, сборке мусора (garbage collection).", 1);
INSERT INTO question (description, testId) VALUES ( "Какими значениями инициализируются переменные по умолчанию?", 1);
INSERT INTO question (description, testId) VALUES ( "Как передается значение переменной (по ссылке/значению)?", 1);
INSERT INTO question (description, testId) VALUES ( "Что вы знаете о функции main, какие обязательные условия ее определения?", 1);
INSERT INTO question (description, testId) VALUES ( "Что такое «итерация цикла»?", 1);
INSERT INTO question (description, testId) VALUES ( "Какой оператор используется для немедленной остановки цикла?", 1);
INSERT INTO literature (description, questionId) VALUES ( "Внутренние классы в Java", 1);
INSERT INTO literature (description, questionId) VALUES ( "Анонимные классы в Java", 2);
INSERT INTO literature (description, questionId) VALUES ( "Перечисления в Java", 3);
INSERT INTO literature (description, questionId) VALUES ( "Ход выполнения программы", 4);
INSERT INTO literature (description, questionId) VALUES ( "Колекции", 5);
INSERT INTO link (link, literatureId) VALUES ( "www.quizful.net", 1);
INSERT INTO link (link, literatureId) VALUES ( "www.dffefw.com", 1);
INSERT INTO link (link, literatureId) VALUES ( "www.wegfdb.com", 2);
INSERT INTO link (link, literatureId) VALUES ( "www.dfbdfjbi.com", 2);
INSERT INTO link (link, literatureId) VALUES ( "www.sdlkvnsdj.ocm", 3);
INSERT INTO link (link, literatureId) VALUES ( "www.sdlkgv.com", 3);
INSERT INTO link (link, literatureId) VALUES ( "www.xcvd.ru", 4);
INSERT INTO link (link, literatureId) VALUES ( "www.sjd.su", 4);
INSERT INTO link (link, literatureId) VALUES ( "www.gfdsse.dsf", 5);
INSERT INTO link (link, literatureId) VALUES ( "www.sqewf.com", 5);

INSERT INTO answer (description, correct, questionId) VALUES ("Инициализируются только переменные класса: 0, null, true/false", true, 1);
INSERT INTO answer (description, correct, questionId) VALUES ("Инициализирутся 0", false, 1);
INSERT INTO answer (description, correct, questionId) VALUES ("Инициализирутся true", false, 1);
INSERT INTO answer (description, correct, questionId) VALUES ("Инициализирутся false", false, 1);

INSERT INTO answer (description, correct, questionId) VALUES ("по ссылке", false, 2);
INSERT INTO answer (description, correct, questionId) VALUES ("по значению", true, 2);
INSERT INTO answer (description, correct, questionId) VALUES ("по ссылке и по значению", false, 2);
INSERT INTO answer (description, correct, questionId) VALUES ("затрудняюсь ответить", false, 2);

INSERT INTO answer (description, correct, questionId) VALUES ("никаких", false, 3);
INSERT INTO answer (description, correct, questionId) VALUES ("обязательная запись: public static void main", false, 3);
INSERT INTO answer (description, correct, questionId) VALUES ("обязательная запись: public static void main + входные параметры (только массив строк)", true, 3);
INSERT INTO answer (description, correct, questionId) VALUES ("обязательная запись: public static void main + входные параметры (любые параметры)", false, 3);

INSERT INTO answer (description, correct, questionId) VALUES ("одноразовое выполнение цикла", true, 4);
INSERT INTO answer (description, correct, questionId) VALUES ("многоразовое выполнение цикла", false, 4);
INSERT INTO answer (description, correct, questionId) VALUES ("одноразовое выполнение цикла с итератором", false, 4);
INSERT INTO answer (description, correct, questionId) VALUES ("одноразовое выполнение цикла без итератора", false, 4);

INSERT INTO answer (description, correct, questionId) VALUES ("continue", false, 5);
INSERT INTO answer (description, correct, questionId) VALUES ("for", false, 5);
INSERT INTO answer (description, correct, questionId) VALUES ("exit", false, 5);
INSERT INTO answer (description, correct, questionId) VALUES ("break", true, 5);

INSERT INTO role (id, user, tutor, admin, role) VALUES (1, 1, 0, 0, "ROLE_USER");
INSERT INTO role (id, user, tutor, admin, role) VALUES (2, 0, 1, 0, "ROLE_TUTOR");
INSERT INTO role (id, user, tutor, admin, role) VALUES (3, 0, 0, 1, "ROLE_ADMIN");

INSERT INTO user (id, firstName, lastName, login, password, roleId) VALUES ('1', 'Kirill', 'Sereda', 'ksereda', '$2a$11$6KDcfufBYnnx6RtcVXEz/uxnXLwITQ6TlwjKLskJgulxfqroA/asC', '1');
INSERT INTO user (id, firstName, lastName, login, password, roleId) VALUES ('2', 'Oleg', 'Seiko', 'owin', '$2a$11$tBzo2SWlQ4vvWQ.tYlCeQOz4tgZF69g5Tc3V6l9OGbnvQk7PBQZrW', '2');
INSERT INTO user (id, firstName, lastName, login, password, roleId) VALUES ('3', 'Alex', 'Rybin', 'alex23', '$2a$11$kP/eB6LOFkqzN82zVgFqRuYgt3WWoMdrfSN5FTbGmIbfPzhyrNVAS', '3');

INSERT INTO `statistic` (id, date, correct, questionId, userId) VALUES
(1,'2018-01-01 00:00:00',1,1,1),
(2,'2018-01-02 00:01:00',1,1,2),
(3,'2018-01-01 00:00:00',0,2,1),
(4,'2018-01-02 00:01:00',0,2,2),
(5,'2018-01-01 00:00:00',1,3,1),
(6,'2018-01-02 00:01:00',0,3,2),
(7,'2018-01-01 00:00:00',1,4,1),
(8,'2018-01-02 00:01:00',0,4,2),
(9,'2018-01-01 00:00:00',1,5,1),
(10,'2018-01-02 00:01:00',0,5,2),
(11,'2018-04-05 23:08:30',1,3,1),
(12,'2018-04-05 23:08:30',1,4,1),
(13,'2018-04-05 23:08:30',1,5,1),
(14,'2018-04-05 23:08:30',0,1,1),
(15,'2018-04-05 23:08:30',0,2,1),
(16,'2018-04-06 18:19:23',1,1,1),
(17,'2018-04-06 18:19:23',1,2,1),
(18,'2018-04-06 18:19:23',1,4,1),
(19,'2018-04-06 18:19:23',1,5,1),
(20,'2018-04-06 18:19:23',0,3,1),
(21,'2018-04-27 12:18:19',1,5,1),
(22,'2018-04-27 12:18:19',0,1,1),
(23,'2018-04-27 12:18:19',0,2,1),
(24,'2018-04-27 12:18:19',0,3,1),
(25,'2018-04-27 12:18:19',0,4,1),
(26,'2018-04-27 12:18:49',1,5,1),
(27,'2018-04-27 12:18:49',0,1,1),
(28,'2018-04-27 12:18:49',0,2,1),
(29,'2018-04-27 12:18:49',0,3,1),
(30,'2018-04-27 12:18:49',0,4,1),
(31,'2018-04-27 12:36:45',1,1,1),
(32,'2018-04-27 12:36:45',1,4,1),
(33,'2018-04-27 12:36:45',1,5,1),
(34,'2018-04-27 12:36:45',0,2,1),
(35,'2018-04-27 12:36:45',0,3,1),
(36,'2018-04-29 17:07:06',1,4,1),
(37,'2018-04-29 17:07:06',1,5,1),
(38,'2018-04-29 17:07:06',0,1,1),
(39,'2018-04-29 17:07:06',0,2,1),
(40,'2018-04-29 17:07:06',0,3,1),
(41,'2018-05-02 12:15:49',1,5,1),
(42,'2018-05-02 12:15:49',0,1,1),
(43,'2018-05-02 12:15:49',0,2,1),
(44,'2018-05-02 12:15:49',0,3,1),
(45,'2018-05-02 12:15:49',0,4,1),
(46,'2018-05-02 16:16:50',1,5,1),
(47,'2018-05-02 16:16:50',0,1,1),
(48,'2018-05-02 16:16:50',0,2,1),
(49,'2018-05-02 16:16:50',0,3,1),
(50,'2018-05-02 16:16:50',0,4,1);