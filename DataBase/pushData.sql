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

INSERT INTO answer (description, questionId) VALUES ("true", "false", "null", "Инициализируются только переменные класса: 0, null, true/false", 1);
INSERT INTO answer (description, questionId) VALUES ("по ссылке", "по значению", "и по ссылке и по значению", "затрудняюсь ответить", 2);
INSERT INTO answer (description, questionId) VALUES ("никаких", "обязательная запись: public static void main", "обязательная запись: public static void main + входные параметры (только массив строк)", "обязательная запись: public static void main + входные параметры (любые)", 3);
INSERT INTO answer (description, questionId) VALUES ("одноразовое выполнение цикла", "многоразовое выполнение цикла", "выполнение цикла с использованием итератора", "выполнение цикла без использования итератора", 4);
INSERT INTO answer (description, questionId) VALUES ("continue", "for", "exit", "break", 5);
