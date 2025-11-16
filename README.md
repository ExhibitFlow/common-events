# ExhibitFlow Common Events

Shared event definitions for ExhibitFlow microservices architecture.

[![Build Status](https://github.com/exhibitflow/common_events/actions/workflows/publish.yml/badge.svg)](https://github.com/exhibitflow/common_events/actions)
[![GitHub release](https://img.shields.io/github/v/release/exhibitflow/common_events)](https://github.com/exhibitflow/common_events/releases)

## Installation

### Prerequisites

Create GitHub Personal Access Token with `read:packages` scope at:
https://github.com/settings/tokens

### Configure Maven

Add to `~/.m2/settings.xml`:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0">
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

### Add to Project

Add repository to `pom.xml`:

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/exhibitflow/common_events</url>
  </repository>
</repositories>
```

Add dependency:

```xml
<dependency>
  <groupId>com.exhibitflow.common_events</groupId>
  <artifactId>common_events</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Usage

Import event classes from packages:
- `com.exhibitflow.common_events.stall.*`
- `com.exhibitflow.common_events.exhibit.*`
- `com.exhibitflow.common_events.booking.*`
- `com.exhibitflow.common_events.payment.*`
- `com.exhibitflow.common_events.notification.*`

Use constants from:
- `com.exhibitflow.common_events.constants.EventTypes`
- `com.exhibitflow.common_events.constants.EventTopics`

## Available Events

**Stall**: StallReservedEvent, StallConfirmedEvent, StallCancelledEvent

**Exhibit**: ExhibitCreatedEvent

**Booking**: BookingConfirmedEvent

**Payment**: PaymentCompletedEvent

**Notification**: NotificationRequestedEvent

## Updating This Package

### Add New Event

1. Create event class extending `BaseEvent`
2. Add constant to `EventTypes.java`
3. Commit changes
4. Create version tag

### Publish New Version

```bash
git tag v1.x.x
git push origin v1.x.x
```

Workflow automatically builds, tests, and publishes to GitHub Packages.

### Version Numbering

- MAJOR.x.x - Breaking changes
- x.MINOR.x - New features
- x.x.PATCH - Bug fixes

## Development

```bash
mvn clean install    
mvn test            
```

## Support

Issues: https://github.com/exhibitflow/common_events/issues
