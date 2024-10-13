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

public val SolidGroup.BxsSkull: ImageVector
    get() {
        if (_bxsSkull != null) {
            return _bxsSkull!!
        }
        _bxsSkull = Builder(name = "BxsSkull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(5.505f, 2.0f, 2.0f, 6.637f, 2.0f, 11.0f)
                curveToRelative(0.0f, 2.129f, 1.009f, 3.979f, 3.0f, 5.508f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.493f)
                curveToRelative(1.991f, -1.528f, 3.0f, -3.379f, 3.0f, -5.507f)
                curveToRelative(0.0f, -4.363f, -3.505f, -9.0f, -10.0f, -9.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveToRelative(-1.121f, 0.0f, -2.0f, -1.098f, -2.0f, -2.5f)
                reflectiveCurveTo(6.879f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(2.0f, 1.098f, 2.0f, 2.5f)
                reflectiveCurveTo(9.121f, 13.0f, 8.0f, 13.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(-1.121f, 0.0f, -2.0f, -1.098f, -2.0f, -2.5f)
                reflectiveCurveTo(14.879f, 8.0f, 16.0f, 8.0f)
                reflectiveCurveToRelative(2.0f, 1.098f, 2.0f, 2.5f)
                reflectiveCurveToRelative(-0.879f, 2.5f, -2.0f, 2.5f)
                close()
            }
        }
        .build()
        return _bxsSkull!!
    }

private var _bxsSkull: ImageVector? = null
