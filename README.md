# Bank ATM Simulator

## Assignment Goal

Build a simplified banking application with ATM cash withdrawal support.
The design must preserve financial consistency:

- Internal transfers must be atomic and consistent.
- Money must not be lost during account-to-account operations.
- Total money changes only through explicit external operations (`EXTERNAL_IN`, `EXTERNAL_OUT`).
- ATM withdrawals must validate available banknotes by currency and denomination.

## Project Structure

Maven + MVC-style package organization:

- `com.bank.atm.model` - domain entities and enums
- `com.bank.atm.service` - service interfaces (business contracts)
- `com.bank.atm.repository` - repository interfaces (storage contracts)
- `com.bank.atm.controller` - application flow orchestration
- `com.bank.atm.view` - console view layer
- `com.bank.atm.exception` - domain-specific exceptions

## Domain Relationships

### Core Relations

- `User (1) -> (*) Account`
  - One user can own multiple accounts.
  - Each account belongs to exactly one user (`ownerUserId`).

- `Transaction -> Account`
  - Transfer: references both `fromAccountId` and `toAccountId`.
  - External deposit: only `toAccountId`.
  - External withdraw: only `fromAccountId`.

- `ATM (1) -> (1) AtmCashInventory`
  - ATM owns one cash inventory object.

- `AtmCashInventory (1) -> (*) CashSlot`
  - Each cash slot represents one `(currency, denomination)` and available note count.

- `WithdrawalOption`
  - Represents one possible banknote combination for a requested withdrawal.
  - Contains `currency` + map of `denomination -> notesCount`.

### Shared Base

- `BaseEntity` is a shared parent for major entities (`User`, `Account`, `Transaction`, `ATM`) and provides:
  - `id`
  - `createdAt`

### Service Interfaces

- `AccountService`
  - create/find accounts, read balance
- `TransactionService`
  - transfer and explicit external in/out operations
- `AtmService`
  - compute withdrawal options and execute selected withdrawal

### Repository Interfaces

- `UserRepository`
- `AccountRepository`
- `TransactionRepository`
- `AtmInventoryRepository`


## Minimal Flow (High Level)

1. Controller receives action from view.
2. Controller delegates to service.
3. Service validates business rules and uses repositories.
4. On success, service records transaction state as committed.
5. View prints result/errors.