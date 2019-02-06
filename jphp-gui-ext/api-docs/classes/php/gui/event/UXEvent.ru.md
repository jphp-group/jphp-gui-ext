# UXEvent

- **класс** `UXEvent` (`php\gui\event\UXEvent`)
- **пакет** `gui`
- **исходники** `php/gui/event/UXEvent.php`

**Классы наследники**

> [UXKeyEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXKeyEvent.ru.md), [UXWebEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXWebEvent.ru.md), [UXMouseEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXMouseEvent.ru.md), [UXDragEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXDragEvent.ru.md), [UXWindowEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXWindowEvent.ru.md), [UXScrollEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXScrollEvent.ru.md), [UXContextMenuEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXContextMenuEvent.ru.md), [UXWebErrorEvent](https://github.com/jphp-group/jphp-gui-ext/blob/master/jphp-gui-ext/api-docs/classes/php/gui/event/UXWebErrorEvent.ru.md)

**Описание**

Class Event

---

#### Свойства

- `->`[`sender`](#prop-sender) : `UXNode|UXWindow`
- `->`[`target`](#prop-target) : `object|UXNode`

---

#### Статичные Методы

- `UXEvent ::`[`makeMock()`](#method-makemock)

---

#### Методы

- `->`[`copyFor()`](#method-copyfor)
- `->`[`isConsumed()`](#method-isconsumed)
- `->`[`consume()`](#method-consume) - _..._

---
# Статичные Методы

<a name="method-makemock"></a>

### makeMock()
```php
UXEvent::makeMock(mixed $sender): UXEvent
```

---
# Методы

<a name="method-copyfor"></a>

### copyFor()
```php
copyFor(object $newSender): UXEvent
```

---

<a name="method-isconsumed"></a>

### isConsumed()
```php
isConsumed(): bool
```

---

<a name="method-consume"></a>

### consume()
```php
consume(): void
```
...