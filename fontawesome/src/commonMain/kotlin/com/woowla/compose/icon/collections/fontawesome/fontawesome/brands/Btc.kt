package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Btc: ImageVector
    get() {
        if (_btc != null) {
            return _btc!!
        }
        _btc = Builder(name = "Btc", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(310.4f, 242.6f)
                curveToRelative(27.7f, -14.2f, 45.4f, -39.4f, 41.3f, -81.3f)
                curveToRelative(-5.4f, -57.4f, -52.5f, -76.6f, -114.8f, -81.9f)
                lineToRelative(0.0f, -79.4f)
                lineToRelative(-48.5f, 0.0f)
                lineToRelative(0.0f, 77.2f)
                curveToRelative(-12.6f, 0.0f, -25.5f, 0.3f, -38.4f, 0.6f)
                lineToRelative(0.0f, -77.8f)
                lineToRelative(-48.5f, 0.0f)
                lineToRelative(0.0f, 79.4f)
                curveToRelative(-17.8f, 0.5f, -38.6f, 0.3f, -97.4f, 0.0f)
                lineToRelative(0.0f, 51.7f)
                curveToRelative(38.3f, -0.7f, 58.4f, -3.1f, 63.0f, 21.4f)
                lineToRelative(0.0f, 217.4f)
                curveToRelative(-2.9f, 19.5f, -18.5f, 16.7f, -53.3f, 16.1f)
                lineTo(4.0f, 443.7f)
                curveToRelative(88.5f, 0.0f, 97.4f, 0.3f, 97.4f, 0.3f)
                lineToRelative(0.0f, 68.0f)
                lineToRelative(48.5f, 0.0f)
                lineToRelative(0.0f, -67.1f)
                curveToRelative(13.2f, 0.3f, 26.2f, 0.3f, 38.4f, 0.3f)
                lineToRelative(0.0f, 66.7f)
                lineToRelative(48.5f, 0.0f)
                lineToRelative(0.0f, -68.0f)
                curveToRelative(81.3f, -4.4f, 135.6f, -24.9f, 142.9f, -101.5f)
                curveToRelative(5.7f, -61.4f, -23.3f, -88.9f, -69.3f, -99.9f)
                close()
                moveTo(150.8f, 134.6f)
                curveToRelative(27.4f, 0.0f, 113.1f, -8.5f, 113.1f, 48.5f)
                curveToRelative(0.0f, 54.5f, -85.7f, 48.2f, -113.1f, 48.2f)
                lineToRelative(0.0f, -96.7f)
                close()
                moveTo(150.8f, 386.4f)
                lineToRelative(0.0f, -106.5f)
                curveToRelative(32.8f, 0.0f, 133.1f, -9.1f, 133.1f, 53.3f)
                curveToRelative(0.0f, 60.2f, -100.4f, 53.3f, -133.1f, 53.3f)
                close()
            }
        }
        .build()
        return _btc!!
    }

private var _btc: ImageVector? = null
