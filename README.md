# SW-Lab-2024-2

# گزارش پروژه

## شروع پروژه (ساخت مخزن و جدول Kanban)
<div dir="rtl">
پس از آنکه پروژه را در قالب یک ریپوی جدید ایجاد کردیم، تسک‌های لازم را در یک پروژه Kanban به صورت زیر مشخص می‌کنیم.


![image](https://github.com/AmiraliE1380/SW-Lab-2024-2/blob/main/images/Kanban_initial.png)



## پرسش 1

<div dir="rtl">
  
توسعه محور بر اساس تست (TDD) و روش سنتی پیاده‌سازی و سپس آزمون (که به آن آزمون پس از نوشته و ترمیم هم اطلاق می‌شود) هرکدام ویژگی‌ها و مزایا ویژه خود را دارند و برای انواع پروژه‌ها و مواقع مختلف مناسب هستند. در ادامه راهنمایی عمومی ارائه شده است:

### توسعه محور بر اساس تست (TDD):

سیستم‌های پیچیده:
TDD به ویژه در پروژه‌های نرم‌افزاری پیچیده که الزامات ممکن است به طور مکرر تغییر کنند، مفید است. این به کمک اطمینان حاصل می‌کند که قابلیت‌های موجود باقی مانده و در عین حال قابلیت‌های جدید اضافه یا موجودیت‌های موجود تغییر یابند.

نرم‌افزارهای حیاتی:
برای سیستم‌های حیاتی که صحت و قابلیت اطمینان حیاتی هستند (مانند نرم‌افزارهای پزشکی، کاربردهای هوافضا)، TDD بسیار ارزشمند است. رویکرد گام به گام و تکراری آن به ساخت یک پایگاه کد قوی کمک می‌کند.

توسعه همکارانه:
TDD مناسب برای محیط‌های توسعه همکارانه است. چون آزمون‌ها به عنوان مستندات اجرایی عمل می‌کنند، به اعضای تیم کمک می‌کند تا رفتار مورد انتظار کد را درک کنند.

بازآرایی:
وقتی نیاز به بازآرایی یا بهبود طراحی کد موجود است، داشتن مجموعه جامعی از تست‌ها از TDD یک شبکه ایمن فراهم می‌کند. توسعه‌دهندگان می‌توانند با اطمینان تغییرات را اعمال کنند، با اطمینان از اینکه تست‌ها به پیدا کردن مشکلات رگرسیونی کمک خواهند کرد.

### روش کلاسیک (پیاده‌سازی و سپس آزمون):

پروتوتایپینگ:
در مراحل ابتدایی یک پروژه یا زمان ساخت پروتوتایپ، روش کلاسیک ممکن است مناسب‌تر باشد. توسعه سریع و تکرارهای سریع در این مرحله از اهمیت بالایی برخوردار است و ممکن است نگهداری یک مجموعه از تست‌ها به عنوان اولویت محسوب نشود.

پروژه‌ها یا اسکریپت‌های کوچک:
برای پروژه‌های کوچک یا اسکریپت‌های سریع، هزینه نگهداری تست‌ها ممکن است غیرضروری تلقی شود. تمرکز اصلی بر روی سریع انجام کار است و آزمون ویژگی‌ها ممکن است کمتر اهمیت داشته باشد.

آموزش و اکتشاف:
وقتی یک فناوری جدید یاد می‌گیرید یا با یک ایده جدید آزمایش می‌کنید، روش کلاسیک می‌تواند انعطاف‌پذیرتر باشد. ممکن است ایده واضحی از الزامات مقدماتی نداشته باشد که در این موارد TDD کمک زیادی نکند.

پایگاه‌های کد قدیمی:
در مواقعی که کد موجود نقدهای تستی مناسبی ندارد، معرفی TDD ممکن است چالش‌برانگیز باشد. روش کلاسیک ممکن است برای تدریجی اضافه کردن تست‌ها در حین تغییرات مفید باشد.

در واقعیت، انتخاب بین TDD و روش کلاسیک اغلب به عواملی نظیر اندازه پروژه، توانمندی تیم، الزامات پروژه و مهلت‌ها بستگی دارد. بسیاری از پروژه‌ها از ترکیب هر دو رویکرد بهره می‌برند و روش را به نیازهای خاص هر فاز توسعه تطبیق می‌دهند.

</div>

## پرسش 2


<div dir="rtl">

تیم توسعه اصلی‌ترین مسئولیت را در تست واحدها (unit tests) دارد. تست واحدها شامل آزمون اجزای یا واحدهای کد به صورت جداگانه است تا اطمینان حاصل شود که آنها به‌طور صحیح و مطابق specification واکنش نشان می‌دهند. توسعه‌دهندگان این آزمون‌ها را می‌نویسند تا رفتار واحدهای کوچکی از کد، مانند توابع یا متدها را تأیید کنند.

تیم تضمین کیفیت، بیشتر بر روی آزمون ادغام (integration testing) و آزمون سیستم تمرکز دارد. آزمون ادغام تأیید می‌کند که واحدهای کد به درستی با یکدیگر کار می‌کنند هنگامی که به عنوان بخش‌های بزرگتری در ماژول‌ها یا سیستم‌های بزرگ‌تر ادغام می‌شوند. آزمون سیستم رفتار کل سیستم را ارزیابی می‌کند تا اطمینان حاصل شود که مشخصات را برآورده می‌کند و به درستی در محیط مقصد خود عمل می‌کند. این شامل آزمون جنبه‌های مختلفی نظیر امنیت، functionality و performance ،usability می‌شود.

### خلاصه:

- آزمون واحد: اطمینان حاصل می‌کند که واحدهای کد به درستی به صورت جداگانه کار می‌کنند. اصلی‌ترین مسئولیت تیم توسعه است.
- آزمون ادغام: اطمینان حاصل می‌کند که اجزای ادغام شده به درستی کار می‌کنند. بیشتر به عهده تیم تضمین کیفیت است.
- آزمون سیستم: رفتار کل سیستم را ارزیابی می‌کند. همچنین اصلی‌ترین مسئولیت تیم تضمین کیفیت است.
</div>
