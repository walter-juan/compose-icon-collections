package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GeoAlt: ImageVector
    get() {
        if (_geoAlt != null) {
            return _geoAlt!!
        }
        _geoAlt = Builder(name = "GeoAlt", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.166f, 8.94f)
                curveToRelative(-0.524f, 1.062f, -1.234f, 2.12f, -1.96f, 3.07f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 8.0f, 14.58f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -2.206f, -2.57f)
                curveToRelative(-0.726f, -0.95f, -1.436f, -2.008f, -1.96f, -3.07f)
                curveTo(3.304f, 7.867f, 3.0f, 6.862f, 3.0f, 6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                curveToRelative(0.0f, 0.862f, -0.305f, 1.867f, -0.834f, 2.94f)
                moveTo(8.0f, 16.0f)
                reflectiveCurveToRelative(6.0f, -5.686f, 6.0f, -10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 6.0f)
                curveToRelative(0.0f, 4.314f, 6.0f, 10.0f, 6.0f, 10.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
            }
        }
        .build()
        return _geoAlt!!
    }

private var _geoAlt: ImageVector? = null
