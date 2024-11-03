package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GeoAltFill: ImageVector
    get() {
        if (_geoAltFill != null) {
            return _geoAltFill!!
        }
        _geoAltFill = Builder(name = "GeoAltFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                reflectiveCurveToRelative(6.0f, -5.686f, 6.0f, -10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 6.0f)
                curveToRelative(0.0f, 4.314f, 6.0f, 10.0f, 6.0f, 10.0f)
                moveToRelative(0.0f, -7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
            }
        }
        .build()
        return _geoAltFill!!
    }

private var _geoAltFill: ImageVector? = null
