# Втора лабораториска вежба по Софтверско инженерство
## Кирил Смилевски, бр. на индекс 213127

**Control Flow Graph**<br>
![graf](https://github.com/ksmilevski/SI_2023_lab2_213127/assets/126695480/de4be22d-59a7-440c-94b9-0953d3b0af6e)

**Цикломатска комплексност**<br>
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.

**Тест случаи според критериумот Multiple Condition** <br>
kombinacija - test case - branch <br>
FFF - user!=null,password!=null,email!=null - A-C <br>
TXX - user=null - A-B <br>
FTX - user!=null,password=null - A-B <br>
FFT - user!=null,password!=null,email=null - A-B <br>

**Тест случаи според критериумот Every Branch**<br>
1. username="Kiril",password=null,email=null (user==null || user.getPassword()==null || user.getEmail()==null) <br>
2. username="Kiril",password="Password123",email="kiril@gmail.com" (Password не го исполнува условот да содржи специјален карактер)<br>
3. username=null,password="Password123!",email=kirilgmail.com (Username e null и password не го исполнува условот да содржи @ и .)<br>
4. username="Kiril",password="pas123!",username="kiril@gmail.com" (Username или email-oт на новиот корисник веќе постои во листата на корисници и password не го исполнува условот да биде подолг од 8 карактери)<br>
5. username="Kiril",password="Password 123!",email="kiril@gmail.com" (Password не го исполнува условот да не содржи празно место)<br>
![Capture](https://github.com/ksmilevski/SI_2023_lab2_213127/assets/126695480/042b5c7d-ffb2-4ea5-b402-569eb26044e9)

**Објаснување на напишаните unit tests**<br>
Во функцијата EveryBranch() користам assertThrows и assertEquals за сите test cases. Вкупно имам 5 assertions, по еден за секој test case. Test cases се објаснети во сликата погоре (кој test case го опфаќа кој Branch)<br>
Во функцијата multipleConditions() користам assertThrows (assertTrue и assertFalse) за секој од 4 test cases по еден assertion. Во точката "Тест случаи според критериумот Multiple Condition" го имам објаснето секој test case и кој condition го опфаќа истиот.<br>
При стартување на функцијата низ сите наведени test cases во конзола јавува дека тестовите се успешни и нема никаква грешка. <br>
**Test Cases за Multiple Condition и Every Branch**  
![lab2SI](https://github.com/ksmilevski/SI_2023_lab2_213127/assets/126695480/5f222356-bdcd-4840-93d7-333e31e66c72)


