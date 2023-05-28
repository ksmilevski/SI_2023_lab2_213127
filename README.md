# Втора лабораториска вежба по Софтверско инженерство
# Кирил Смилевски, бр. на индекс 213127

**Control Flow Graph**

![grafSI](https://github.com/ksmilevski/SI_2023_lab2_213127/assets/126695480/eec0ba07-0c88-4ef5-8b8b-baa49156b2e8)

**Цикломатска комплексност**

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 2.

**Тест случаи според критериумот Every statement**
kombinacija - test case - branch
FFF - user!=null,password!=null,email!=null - A-C
TXX - user=null - A-B
FTX - user!=null,password=null - A-B
FFT - user!=null,password!=null,email=null - A-B
