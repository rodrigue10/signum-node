package brs.http;

import brs.Asset;
import brs.BurstException;
import brs.Order;
import brs.assetexchange.AssetExchange;
import brs.services.ParameterService;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import javax.servlet.http.HttpServletRequest;

import static brs.http.common.Parameters.*;
import static brs.http.common.ResultFields.BID_ORDERS_RESPONSE;

public final class GetBidOrders extends APIServlet.JsonRequestHandler {

  private final ParameterService parameterService;
  private final AssetExchange assetExchange;

  GetBidOrders(ParameterService parameterService, AssetExchange assetExchange) {
    super(new APITag[] {APITag.AE}, ASSET_PARAMETER, FIRST_INDEX_PARAMETER, LAST_INDEX_PARAMETER);
    this.parameterService = parameterService;
    this.assetExchange = assetExchange;
  }

  @Override
  protected
  JsonElement processRequest(HttpServletRequest req) throws BurstException {

    long assetId = parameterService.getAsset(req).getId();
    int firstIndex = ParameterParser.getFirstIndex(req);
    int lastIndex = ParameterParser.getLastIndex(req);

    JsonArray orders = new JsonArray();
    Asset asset = null;
    for (Order.Bid bidOrder : assetExchange.getSortedBidOrders(assetId, firstIndex, lastIndex)) {
      if(asset == null || asset.getId() != bidOrder.getAssetId()) {
        asset = assetExchange.getAsset(bidOrder.getAssetId());
      }
      orders.add(JSONData.bidOrder(bidOrder, asset));
    }

    JsonObject response = new JsonObject();
    response.add(BID_ORDERS_RESPONSE, orders);
    return response;
  }

}
