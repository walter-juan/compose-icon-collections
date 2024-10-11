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

public val LogosGroup.DiscordFill: ImageVector
    get() {
        if (_discordFill != null) {
            return _discordFill!!
        }
        _discordFill = Builder(name = "DiscordFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.303f, 5.337f)
                curveTo(17.934f, 4.711f, 16.48f, 4.255f, 14.963f, 4.0f)
                curveTo(14.772f, 4.329f, 14.56f, 4.775f, 14.411f, 5.125f)
                curveTo(12.797f, 4.891f, 11.194f, 4.891f, 9.603f, 5.125f)
                curveTo(9.454f, 4.775f, 9.231f, 4.329f, 9.051f, 4.0f)
                curveTo(7.523f, 4.255f, 6.069f, 4.711f, 4.709f, 5.337f)
                curveTo(1.961f, 9.391f, 1.218f, 13.349f, 1.589f, 17.255f)
                curveTo(3.414f, 18.581f, 5.176f, 19.388f, 6.907f, 19.919f)
                curveTo(7.332f, 19.346f, 7.714f, 18.73f, 8.043f, 18.083f)
                curveTo(7.416f, 17.849f, 6.822f, 17.563f, 6.249f, 17.223f)
                curveTo(6.398f, 17.117f, 6.546f, 17.0f, 6.684f, 16.883f)
                curveTo(10.144f, 18.465f, 13.891f, 18.465f, 17.308f, 16.883f)
                curveTo(17.457f, 17.0f, 17.595f, 17.117f, 17.743f, 17.223f)
                curveTo(17.17f, 17.563f, 16.576f, 17.849f, 15.95f, 18.083f)
                curveTo(16.279f, 18.73f, 16.661f, 19.346f, 17.085f, 19.919f)
                curveTo(18.815f, 19.388f, 20.587f, 18.581f, 22.403f, 17.255f)
                curveTo(22.86f, 12.734f, 21.681f, 8.807f, 19.303f, 5.337f)
                close()
                moveTo(8.52f, 14.846f)
                curveTo(7.48f, 14.846f, 6.631f, 13.901f, 6.631f, 12.745f)
                curveTo(6.631f, 11.588f, 7.459f, 10.643f, 8.52f, 10.643f)
                curveTo(9.571f, 10.643f, 10.43f, 11.588f, 10.409f, 12.745f)
                curveTo(10.409f, 13.901f, 9.571f, 14.846f, 8.52f, 14.846f)
                close()
                moveTo(15.494f, 14.846f)
                curveTo(14.453f, 14.846f, 13.603f, 13.901f, 13.603f, 12.745f)
                curveTo(13.603f, 11.588f, 14.432f, 10.643f, 15.494f, 10.643f)
                curveTo(16.544f, 10.643f, 17.404f, 11.588f, 17.382f, 12.745f)
                curveTo(17.382f, 13.901f, 16.555f, 14.846f, 15.494f, 14.846f)
                close()
            }
        }
        .build()
        return _discordFill!!
    }

private var _discordFill: ImageVector? = null
