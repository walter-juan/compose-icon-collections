package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.StoreSlash: ImageVector
    get() {
        if (_storeSlash != null) {
            return _storeSlash!!
        }
        _storeSlash = Builder(name = "StoreSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-58.6f, -58.6f)
                curveToRelative(1.1f, -4.0f, 1.6f, -8.2f, 1.6f, -12.5f)
                lineToRelative(0.0f, -151.2f)
                curveToRelative(-12.5f, 4.6f, -26.1f, 7.2f, -40.5f, 7.2f)
                curveToRelative(-8.1f, 0.0f, -15.9f, -0.8f, -23.5f, -2.4f)
                lineToRelative(0.0f, 66.4f)
                lineToRelative(-30.2f, 0.0f)
                lineToRelative(-137.5f, -137.5f)
                curveToRelative(2.9f, -3.6f, 5.5f, -7.4f, 7.6f, -11.5f)
                curveToRelative(11.6f, 22.0f, 34.7f, 37.0f, 61.3f, 37.0f)
                curveToRelative(26.8f, 0.0f, 49.8f, -15.1f, 61.4f, -37.1f)
                curveToRelative(11.4f, 22.1f, 34.5f, 37.1f, 60.8f, 37.1f)
                curveToRelative(45.6f, 0.0f, 78.4f, -43.7f, 65.6f, -87.5f)
                lineTo(513.8f, 72.3f)
                curveTo(506.8f, 48.4f, 484.9f, 32.0f, 460.0f, 32.0f)
                lineTo(116.0f, 32.0f)
                curveToRelative(-5.5f, 0.0f, -10.8f, 0.8f, -15.9f, 2.3f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(151.5f, 221.3f)
                lineTo(48.7f, 118.6f)
                lineTo(38.9f, 152.5f)
                curveToRelative(-12.8f, 43.7f, 20.0f, 87.5f, 65.6f, 87.5f)
                curveToRelative(18.1f, 0.0f, 34.7f, -7.1f, 47.0f, -18.7f)
                close()
                moveTo(410.2f, 480.0f)
                lineToRelative(-128.0f, -128.0f)
                lineToRelative(-154.2f, 0.0f)
                lineToRelative(0.0f, -66.4f)
                curveToRelative(-7.6f, 1.6f, -15.5f, 2.4f, -23.5f, 2.4f)
                curveToRelative(-14.4f, 0.0f, -28.0f, -2.6f, -40.5f, -7.2f)
                lineTo(64.0f, 432.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(298.2f, 0.0f)
                close()
            }
        }
        .build()
        return _storeSlash!!
    }

private var _storeSlash: ImageVector? = null
