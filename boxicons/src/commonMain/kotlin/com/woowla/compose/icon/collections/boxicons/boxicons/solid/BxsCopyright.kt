package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCopyright: ImageVector
    get() {
        if (_bxsCopyright != null) {
            return _bxsCopyright!!
        }
        _bxsCopyright = Builder(name = "BxsCopyright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.579f, 2.0f, 2.0f, 6.58f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.579f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.58f, 10.0f, -10.0f)
                reflectiveCurveTo(17.421f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(0.992f, 0.0f, 1.85f, -0.265f, 2.293f, -0.708f)
                lineToRelative(1.414f, 1.415f)
                curveTo(14.581f, 16.832f, 12.901f, 17.0f, 12.0f, 17.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                curveToRelative(0.901f, 0.0f, 2.582f, 0.168f, 3.707f, 1.293f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(13.851f, 9.264f, 12.993f, 9.0f, 12.0f, 9.0f)
                curveToRelative(-1.626f, 0.0f, -3.0f, 1.374f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.374f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxsCopyright!!
    }

private var _bxsCopyright: ImageVector? = null
