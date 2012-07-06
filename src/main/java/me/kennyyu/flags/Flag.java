package me.kennyyu.flags;

/**
 * Interface for wrapping values in flags. In order to make a flag active, the
 * flag must be annotated with {@link FlagInfo}, and
 * {@link Flags#parse(String[])} must be called. Flag objects must be static
 * fields, and may or may not be private.
 *
 * @param <T> the type this flag holds.
 */
public interface Flag<T> {

  /**
   * @return the value of this flag
   */
  T get();

}
