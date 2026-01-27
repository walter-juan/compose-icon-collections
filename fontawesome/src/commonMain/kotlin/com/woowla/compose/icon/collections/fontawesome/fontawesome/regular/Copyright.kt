package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, -416.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(205.1f, 306.9f)
                curveToRelative(-28.1f, -28.1f, -28.1f, -73.7f, 0.0f, -101.8f)
                reflectiveCurveToRelative(73.7f, -28.1f, 101.8f, 0.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                curveToRelative(-46.9f, -46.9f, -122.8f, -46.9f, -169.7f, 0.0f)
                reflectiveCurveToRelative(-46.9f, 122.8f, 0.0f, 169.7f)
                reflectiveCurveToRelative(122.8f, 46.9f, 169.7f, 0.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(-24.6f, -9.4f, -33.9f, 0.0f)
                curveToRelative(-28.1f, 28.1f, -73.7f, 28.1f, -101.8f, 0.0f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
