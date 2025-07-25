# Онлайн-журнал жалоб и обращений

Проект для подачи, обработки и управления жалобами граждан.

---

## Описание

Платформа, где граждане могут подать жалобу или предложение, а официальные сотрудники рассматривают их, дают ответы и меняют статус жалобы.

---

## Основные функции

- Регистрация и аутентификация пользователей через Keycloak
- Роли пользователей: USER (гражданин), OFFICIAL (чиновник), ADMIN (админ)
- Создание, просмотр и управление жалобами
- Добавление ответов к жалобам официальными сотрудниками
- Назначение жалоб сотрудникам и изменение их статуса
- Валидация данных и безопасность
- Документация API через Swagger

---

## Технологии

- Java 17
- Spring Boot
- Spring Security + Keycloak
- MapStruct (для маппинга DTO)
- Hibernate / JPA
- PostgreSQL (или другая СУБД)
- Swagger (OpenAPI)
- Maven / Gradle

---

## Запуск проекта

1. Склонировать репозиторий  
   `bash
   git clone https://github.com/vladick09872/online-journal-of-complaints-and-appeals
## Документация 

-Адрес: http://localhost:8082/swagger-ui/index.html#/