package brs.http;

import brs.Burst;
import brs.assetexchange.AssetExchange;
import brs.services.AccountService;
import brs.util.Convert;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.servlet.http.HttpServletRequest;

import static brs.http.common.Parameters.*;
import static brs.http.common.ResultFields.ASSETS_RESPONSE;

public final class GetAllAssets extends AbstractAssetsRetrieval {

  private final AssetExchange assetExchange;

  public GetAllAssets(AssetExchange assetExchange, AccountService accountService) {
    super(new APITag[] {APITag.AE}, assetExchange, accountService, FIRST_INDEX_PARAMETER, LAST_INDEX_PARAMETER, HEIGHT_START_PARAMETER, HEIGHT_END_PARAMETER, SKIP_ZERO_VOLUME_PARAMETER);
    this.assetExchange = assetExchange;
  }

  @Override
  protected
  JsonElement processRequest(HttpServletRequest req) {
    int firstIndex = ParameterParser.getFirstIndex(req);
    int lastIndex = ParameterParser.getLastIndex(req);
    
    int heightEnd = Burst.getBlockchain().getHeight();
    // default is one day window
    int heightStart = heightEnd - 360;

    String heightStartString = Convert.emptyToNull(req.getParameter(HEIGHT_START_PARAMETER));
    if(heightStartString != null) {
      heightStart = Integer.parseInt(heightStartString);
    }

    String heightEndString = Convert.emptyToNull(req.getParameter(HEIGHT_END_PARAMETER));
    if(heightEndString != null) {
      heightEnd = Integer.parseInt(heightEndString);
    }
    
    boolean skipZeroVolume = "true".equalsIgnoreCase(req.getParameter(SKIP_ZERO_VOLUME_PARAMETER));

    JsonObject response = new JsonObject();

    response.add(ASSETS_RESPONSE, assetsToJson(assetExchange.getAllAssets(firstIndex, lastIndex).iterator(), heightStart, heightEnd, skipZeroVolume));

    return response;
  }

}
