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

public val BrandsGroup.Monero: ImageVector
    get() {
        if (_monero != null) {
            return _monero!!
        }
        _monero = Builder(name = "Monero", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 384.0f)
                lineToRelative(108.4f, 0.0f)
                curveTo(425.0f, 455.9f, 346.1f, 504.0f, 256.0f, 504.0f)
                reflectiveCurveTo(87.0f, 455.9f, 43.6f, 384.0f)
                lineToRelative(108.4f, 0.0f)
                lineToRelative(0.0f, -127.8f)
                lineToRelative(104.0f, 104.8f)
                lineToRelative(104.0f, -105.0f)
                lineToRelative(0.0f, 128.0f)
                close()
                moveTo(96.0f, 336.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(159.4f, 159.4f)
                lineToRelative(160.6f, -159.4f)
                lineToRelative(0.0f, 208.0f)
                lineToRelative(74.8f, 0.0f)
                curveToRelative(8.5f, -25.1f, 13.2f, -52.0f, 13.2f, -80.0f)
                curveToRelative(0.0f, -137.0f, -111.0f, -248.0f, -248.0f, -248.0f)
                reflectiveCurveTo(8.0f, 119.0f, 8.0f, 256.0f)
                curveToRelative(0.0f, 28.0f, 4.6f, 54.9f, 13.2f, 80.0f)
                lineTo(96.0f, 336.0f)
                close()
            }
        }
        .build()
        return _monero!!
    }

private var _monero: ImageVector? = null
