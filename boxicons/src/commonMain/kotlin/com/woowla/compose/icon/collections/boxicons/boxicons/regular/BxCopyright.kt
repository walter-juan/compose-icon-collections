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

public val RegularGroup.BxCopyright: ImageVector
    get() {
        if (_bxCopyright != null) {
            return _bxCopyright!!
        }
        _bxCopyright = Builder(name = "BxCopyright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(5.421f, 0.0f, 10.0f, -4.579f, 10.0f, -10.0f)
                reflectiveCurveTo(17.421f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.579f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.579f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.337f, 0.0f, 8.0f, 3.663f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.663f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.663f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.663f, -8.0f, 8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(0.901f, 0.0f, 2.581f, -0.168f, 3.707f, -1.292f)
                lineToRelative(-1.414f, -1.416f)
                curveTo(13.85f, 14.735f, 12.992f, 15.0f, 12.0f, 15.0f)
                curveToRelative(-1.626f, 0.0f, -3.0f, -1.374f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.374f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.993f, 0.0f, 1.851f, 0.265f, 2.293f, 0.707f)
                lineToRelative(1.414f, -1.414f)
                curveTo(14.582f, 7.168f, 12.901f, 7.0f, 12.0f, 7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _bxCopyright!!
    }

private var _bxCopyright: ImageVector? = null
