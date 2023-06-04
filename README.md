# Блог (My Blog)
Репозиторій [My Blog](https://github.com/max-krasnousov/myblog.git).
Цей блог було розроблено з використанням Java, Spring Framework, JSP, Oracle Database, Maven та WebLogic Server. 
Даний блог надає можливості перегляду та створення постів/коментарів лише авторизованим користувачам. Він призначений для публікації постів, їх перегляду та коментуванню, також користувач має можливість давати відповіді на коментарі. 

## Інтерфейс
1) Для неавторизованих користувачів відбувається переадресація на форму авторизації.
2) Форма авторизація.
3) Форма реєстрація.
4) Головна сторіна, це перелік постів, по 6 на сторінці.
5) Форма створення посту.
6) Сторінка посту, коментарі до нього, та форма для залишення коментару.
7) Профіль користувача, з можливістю внесення змін, та таблиця зі статистикою постів користувача.
8) Форма для скидання паролю.
9) Форма для заміни паролю.

## Складові для зручного запуску
Необхідно мати:
1) [Java 8+ JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).
2) [Intellij IDEA Ultimate](https://www.jetbrains.com/idea/download/#section=windows).
3) [Oracle Database 18c+](https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html).
4) [Oracle WebLogic Server 14c](https://www.oracle.com/middleware/technologies/weblogic-server-installers-downloads.html).
5) [MailHog](https://github.com/mailhog/MailHog) (Тільки для локального тестування поштового сервісу).

## Налаштування для запуску
1) Якщо немаєте потрібних компонентів зі списку вище, то встановіть їх.
2) Створіть базу даних у Oracle Database, та запустіть в ній скрипт з [testData.sql](https://github.com/max-krasnousov/myblog/blob/e06441679a0b3aae9c775d9f0365e4f7a2255d6f/src/main/resources/testData.sql).
3) Додайте у WebLogic dataSource, який з'єднайта з базою даних з попереднього кроку, дайте йому JNDI назву "MyData". Якщо назва інша то замініть його також для властивості "db.data.source.name" у файлі [app.properties](https://github.com/max-krasnousov/myblog/blob/e06441679a0b3aae9c775d9f0365e4f7a2255d6f/src/main/resources/app.properties).
4) Клонуйте проект з даного репозиторію [My Blog](https://github.com/max-krasnousov/myblog.git), відкрийте його у Intellij IDEA Ultimate та підтягніть залежності Maven з [pom.xml](https://github.com/max-krasnousov/myblog/blob/e06441679a0b3aae9c775d9f0365e4f7a2255d6f/pom.xml) файлу.
5) Сконфігуруйте Run/Debug по прикладу, встановість ваш логін та пароль до встановленого WebLogic серверу та створіть артефакт по зразку, назва його може бути інша.
6) Запустіть MailHog, якщо хочете протестувати роботу з повідомленнями на пошту, чи зміність конфігурацію для іншгого SMTP серверу.
7) Додаток можна запускати через Intellij IDEA Ultimate.

## Властивості
Властивості які використовуються для приєднання до бази даних та надсилання листів на пошту розміщені у файлі [app.properties](https://github.com/max-krasnousov/myblog/blob/e06441679a0b3aae9c775d9f0365e4f7a2255d6f/src/main/resources/app.properties), внесіть зміни за потреби.
| Ключ  | Значення за замовчуванням | Опис |
| ------------- | ------------- | ------------- |
| db.context.factory  | weblogic.jndi.WLInitialContextFactory  | Клас необхідний для підключення до weblogic  |
| db.provider.url  | t3://localhost:7001  | Url для підключення до бази даних за допомогою wblogic  |
| db.data.source.name  | MyData  | Назва створеного Data Source  |
| mail.address  | my.send.mail@gmail.com  | Адреса пошти на SMTP сервері з якої буде надіслане повідомлення |
| mail.password  | 1234Pass5@#  | Пароль до пошти на SMTP сервері з якої буде надіслане повідомлення  |
| mail.host  | localhost  | IP адреса розміщення SMTP сервера |
| mail.port  | 1025  | Порт на якому розміщений SMTP сервер  |
| mail.ssl  | true  | Визначає, використовувати шифрування SSL чи ні  |
| mail.auth  | true  | Визначає, чи потрібно автентифікувати відправника електронної пошти на сервері SMTP  |
| mail.app.url  | http://localhost:7001/my-blog/  | URL адреса блогу  |
| mail.reset.url  | http://localhost:7001/my-blog/redirect/reset-password?token=  | URL шаблон для скидання паролю  |
