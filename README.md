# Втора лабораториска вежба по Софтверско инженерство
# Кирил Смилевски, бр. на индекс 213127

**Control Flow Graph**<br>
![grafSI](https://github.com/ksmilevski/SI_2023_lab2_213127/assets/126695480/eec0ba07-0c88-4ef5-8b8b-baa49156b2e8)

**Цикломатска комплексност**<br>
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.

**Тест случаи според критериумот Every statement** <br>
kombinacija - test case - branch <br>
FFF - user!=null,password!=null,email!=null - A-C <br>
TXX - user=null - A-B <br>
FTX - user!=null,password=null - A-B <br>
FFT - user!=null,password!=null,email=null - A-B <br>

**Тест случаи според критериумот Every path**<br>
1. username="Kiril",password=null,email=null (user==null || user.getPassword()==null || user.getEmail()==null) <br>
2. username="Kiril",password="Password123",email="kiril@gmail.com" (Password не го исполнува условот да содржи специјален карактер)<br>
3. username=null,password="Password123!",email=kirilgmail.com (Username e null и password не го исполнува условот да содржи @ и .)<br>
4. username="Kiril",password="pas123!",username="kiril@gmail.com (Username или email-oт на новиот корисник веќе постои во листата на корисници и password не го исполнува условот да биде подолг од 8 карактери)<br>
5. username="Kiril",password="Password 123!",email="kiril@gmail.com" (Password не го исполнува условот да не содржи празно место)<br>
