package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxWifi2: ImageVector
    get() {
        if (_bxWifi2 != null) {
            return _bxWifi2!!
        }
        _bxWifi2 = Builder(name = "BxWifi2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.671f, 14.307f)
                curveTo(16.184f, 12.819f, 14.17f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-4.184f, 0.819f, -5.671f, 2.307f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(1.11f, -1.11f, 2.621f, -1.722f, 4.257f, -1.722f)
                curveToRelative(1.636f, 0.001f, 3.147f, 0.612f, 4.257f, 1.722f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.437f, 11.292f)
                curveToRelative(-4.572f, -4.573f, -12.301f, -4.573f, -16.873f, 0.0f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(3.807f, -3.807f, 10.238f, -3.807f, 14.045f, 0.0f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _bxWifi2!!
    }

private var _bxWifi2: ImageVector? = null
