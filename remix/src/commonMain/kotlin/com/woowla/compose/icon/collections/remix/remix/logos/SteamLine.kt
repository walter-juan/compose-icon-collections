package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.SteamLine: ImageVector
    get() {
        if (_steamLine != null) {
            return _steamLine!!
        }
        _steamLine = Builder(name = "SteamLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.001f, 4.0f)
                curveTo(19.763f, 4.0f, 22.001f, 6.239f, 22.001f, 9.0f)
                curveTo(22.001f, 11.761f, 19.763f, 14.0f, 17.001f, 14.0f)
                curveTo(16.697f, 14.0f, 16.399f, 13.973f, 16.109f, 13.921f)
                lineTo(13.458f, 15.909f)
                curveTo(13.486f, 16.102f, 13.501f, 16.299f, 13.501f, 16.5f)
                curveTo(13.501f, 18.709f, 11.71f, 20.5f, 9.501f, 20.5f)
                curveTo(7.292f, 20.5f, 5.501f, 18.709f, 5.501f, 16.5f)
                curveTo(5.501f, 16.323f, 5.513f, 16.148f, 5.535f, 15.976f)
                lineTo(1.709f, 14.43f)
                lineTo(2.458f, 12.576f)
                lineTo(6.285f, 14.121f)
                curveTo(7.014f, 13.137f, 8.183f, 12.5f, 9.501f, 12.5f)
                curveTo(9.664f, 12.5f, 9.824f, 12.51f, 9.982f, 12.529f)
                lineTo(12.023f, 9.468f)
                curveTo(12.008f, 9.314f, 12.001f, 9.158f, 12.001f, 9.0f)
                curveTo(12.001f, 6.239f, 14.24f, 4.0f, 17.001f, 4.0f)
                close()
                moveTo(9.501f, 14.5f)
                curveTo(9.037f, 14.5f, 8.609f, 14.658f, 8.27f, 14.924f)
                lineTo(9.876f, 15.573f)
                curveTo(10.388f, 15.78f, 10.635f, 16.362f, 10.428f, 16.875f)
                curveTo(10.221f, 17.387f, 9.639f, 17.634f, 9.126f, 17.427f)
                lineTo(7.52f, 16.779f)
                curveTo(7.656f, 17.751f, 8.491f, 18.5f, 9.501f, 18.5f)
                curveTo(10.606f, 18.5f, 11.501f, 17.605f, 11.501f, 16.5f)
                curveTo(11.501f, 15.395f, 10.606f, 14.5f, 9.501f, 14.5f)
                close()
                moveTo(12.865f, 11.81f)
                lineTo(11.882f, 13.285f)
                curveTo(12.166f, 13.496f, 12.421f, 13.744f, 12.641f, 14.021f)
                lineTo(14.001f, 13.0f)
                curveTo(13.56f, 12.669f, 13.175f, 12.267f, 12.865f, 11.81f)
                close()
                moveTo(17.001f, 6.0f)
                curveTo(15.344f, 6.0f, 14.001f, 7.343f, 14.001f, 9.0f)
                curveTo(14.001f, 10.657f, 15.344f, 12.0f, 17.001f, 12.0f)
                curveTo(18.658f, 12.0f, 20.001f, 10.657f, 20.001f, 9.0f)
                curveTo(20.001f, 7.343f, 18.658f, 6.0f, 17.001f, 6.0f)
                close()
                moveTo(17.001f, 7.0f)
                curveTo(18.106f, 7.0f, 19.001f, 7.895f, 19.001f, 9.0f)
                curveTo(19.001f, 10.105f, 18.106f, 11.0f, 17.001f, 11.0f)
                curveTo(15.896f, 11.0f, 15.001f, 10.105f, 15.001f, 9.0f)
                curveTo(15.001f, 7.895f, 15.896f, 7.0f, 17.001f, 7.0f)
                close()
            }
        }
        .build()
        return _steamLine!!
    }

private var _steamLine: ImageVector? = null
