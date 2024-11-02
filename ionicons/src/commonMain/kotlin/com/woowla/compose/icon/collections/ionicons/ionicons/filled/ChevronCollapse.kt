package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.ChevronCollapse: ImageVector
    get() {
        if (_chevronCollapse != null) {
            return _chevronCollapse!!
        }
        _chevronCollapse = Builder(name = "ChevronCollapse", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.86f, 88.28f)
                curveToRelative(-8.68f, 10.02f, -7.6f, 25.17f, 2.42f, 33.85f)
                lineToRelative(120.0f, 104.0f)
                curveToRelative(9.02f, 7.82f, 22.42f, 7.82f, 31.44f, 0.0f)
                lineToRelative(120.0f, -104.0f)
                curveToRelative(10.02f, -8.68f, 11.1f, -23.84f, 2.42f, -33.85f)
                reflectiveCurveToRelative(-23.84f, -11.1f, -33.85f, -2.42f)
                lineTo(256.0f, 176.24f)
                lineTo(151.72f, 85.86f)
                curveToRelative(-10.02f, -8.68f, -25.17f, -7.6f, -33.85f, 2.42f)
                close()
                moveTo(117.86f, 423.72f)
                curveToRelative(-8.68f, -10.02f, -7.6f, -25.17f, 2.42f, -33.85f)
                lineToRelative(120.0f, -104.0f)
                curveToRelative(9.02f, -7.82f, 22.42f, -7.82f, 31.44f, 0.0f)
                lineToRelative(120.0f, 104.0f)
                curveToRelative(10.02f, 8.68f, 11.1f, 23.84f, 2.42f, 33.85f)
                reflectiveCurveToRelative(-23.84f, 11.1f, -33.85f, 2.42f)
                lineTo(256.0f, 335.76f)
                lineToRelative(-104.28f, 90.38f)
                curveToRelative(-10.02f, 8.68f, -25.17f, 7.6f, -33.85f, -2.42f)
                close()
            }
        }
        .build()
        return _chevronCollapse!!
    }

private var _chevronCollapse: ImageVector? = null
