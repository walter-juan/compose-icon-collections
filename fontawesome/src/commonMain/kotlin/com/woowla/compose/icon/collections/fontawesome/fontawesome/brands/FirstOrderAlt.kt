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

public val BrandsGroup.FirstOrderAlt: ImageVector
    get() {
        if (_firstOrderAlt != null) {
            return _firstOrderAlt!!
        }
        _firstOrderAlt = Builder(name = "FirstOrderAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(256.0f, 15.8f)
                arcToRelative(240.2f, 240.2f, 0.0f, true, true, 0.0f, 480.4f)
                arcToRelative(240.2f, 240.2f, 0.0f, true, true, 0.0f, -480.4f)
                close()
                moveTo(256.0f, 36.3f)
                arcToRelative(219.7f, 219.7f, 0.0f, true, false, 0.0f, 439.4f)
                arcToRelative(219.7f, 219.7f, 0.0f, true, false, 0.0f, -439.4f)
                close()
                moveTo(256.0f, 44.5f)
                arcToRelative(211.5f, 211.5f, 0.0f, true, true, 0.0f, 423.0f)
                arcToRelative(211.5f, 211.5f, 0.0f, true, true, 0.0f, -423.0f)
                close()
                moveTo(442.2f, 304.5f)
                curveToRelative(-4.4f, 17.1f, -11.2f, 33.5f, -20.1f, 48.7f)
                lineToRelative(-74.1f, -35.9f)
                lineToRelative(61.5f, 54.8f)
                curveToRelative(-10.6f, 14.1f, -23.2f, 26.6f, -37.2f, 37.3f)
                lineToRelative(-54.8f, -61.6f)
                lineToRelative(35.9f, 74.3f)
                curveToRelative(-15.2f, 9.0f, -31.6f, 15.8f, -48.6f, 20.2f)
                lineToRelative(-27.3f, -78.5f)
                lineToRelative(4.8f, 82.9f)
                curveToRelative(-8.6f, 1.2f, -17.4f, 1.8f, -26.3f, 1.8f)
                reflectiveCurveToRelative(-17.7f, -0.6f, -26.3f, -1.8f)
                lineToRelative(4.8f, -82.5f)
                lineToRelative(-27.2f, 78.0f)
                curveToRelative(-17.1f, -4.5f, -33.4f, -11.3f, -48.7f, -20.2f)
                lineToRelative(35.9f, -74.3f)
                lineToRelative(-54.9f, 61.6f)
                curveToRelative(-14.0f, -10.7f, -26.6f, -23.2f, -37.2f, -37.3f)
                lineToRelative(61.6f, -54.9f)
                lineToRelative(-74.3f, 35.9f)
                curveTo(80.7f, 338.0f, 74.0f, 321.7f, 69.5f, 304.6f)
                lineToRelative(77.8f, -27.1f)
                lineToRelative(-82.2f, 4.8f)
                curveToRelative(-1.2f, -8.6f, -1.8f, -17.3f, -1.8f, -26.2f)
                curveToRelative(0.0f, -9.0f, 0.6f, -17.8f, 1.8f, -26.5f)
                lineToRelative(82.4f, 4.8f)
                lineToRelative(-77.9f, -27.2f)
                curveToRelative(4.5f, -17.1f, 11.3f, -33.5f, 20.2f, -48.7f)
                lineToRelative(74.2f, 35.9f)
                lineToRelative(-61.5f, -54.9f)
                curveToRelative(10.7f, -14.0f, 23.2f, -26.6f, 37.3f, -37.2f)
                lineToRelative(54.8f, 61.5f)
                lineToRelative(-35.8f, -74.2f)
                curveToRelative(15.2f, -8.9f, 31.6f, -15.7f, 48.6f, -20.1f)
                lineToRelative(26.9f, 77.2f)
                lineToRelative(-4.7f, -81.6f)
                curveToRelative(8.6f, -1.2f, 17.4f, -1.8f, 26.3f, -1.8f)
                reflectiveCurveToRelative(17.7f, 0.6f, 26.3f, 1.8f)
                lineToRelative(-4.7f, 82.2f)
                lineToRelative(27.0f, -77.8f)
                curveToRelative(17.3f, 4.5f, 33.6f, 11.4f, 48.6f, 20.2f)
                lineToRelative(-35.8f, 74.1f)
                lineToRelative(54.7f, -61.5f)
                curveToRelative(14.1f, 10.7f, 26.6f, 23.2f, 37.2f, 37.2f)
                lineToRelative(-61.4f, 54.8f)
                lineToRelative(74.1f, -35.9f)
                curveToRelative(8.9f, 15.2f, 15.7f, 31.6f, 20.2f, 48.6f)
                lineToRelative(-77.8f, 27.1f)
                lineToRelative(82.2f, -4.7f)
                curveToRelative(1.2f, 8.7f, 1.8f, 17.5f, 1.8f, 26.5f)
                curveToRelative(0.0f, 8.9f, -0.6f, 17.6f, -1.8f, 26.2f)
                lineToRelative(-82.1f, -4.7f)
                lineToRelative(77.7f, 27.1f)
                close()
            }
        }
        .build()
        return _firstOrderAlt!!
    }

private var _firstOrderAlt: ImageVector? = null
