package co.com.sofka;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {


	public Flux<String> emptyFlux() {
		return Flux.empty();
	}

	public Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

	public Flux<String> fooBarFluxFromList() {
		ArrayList<String> List = new ArrayList<>(Arrays.asList("foo", "bar"));
		return Flux.fromIterable(List);
	}

	public Flux<String> errorFlux() {
		return Flux.error(new IllegalStateException());
	}

	public Flux<Long> counter() {
		Duration cycle = Duration.of(100L, ChronoUnit.MILLIS);
		return Flux.interval(cycle).take(10L);
	}
}
