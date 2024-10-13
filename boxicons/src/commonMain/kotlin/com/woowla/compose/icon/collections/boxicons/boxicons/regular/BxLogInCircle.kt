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

public val RegularGroup.BxLogInCircle: ImageVector
    get() {
        if (_bxLogInCircle != null) {
            return _bxLogInCircle!!
        }
        _bxLogInCircle = Builder(name = "BxLogInCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.998f, 16.0f)
                lineToRelative(5.0f, -4.0f)
                lineToRelative(-5.0f, -4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.999f, 2.999f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, false, -6.364f, 2.637f)
                lineTo(8.049f, 7.05f)
                curveToRelative(1.322f, -1.322f, 3.08f, -2.051f, 4.95f, -2.051f)
                reflectiveCurveToRelative(3.628f, 0.729f, 4.95f, 2.051f)
                reflectiveCurveTo(20.0f, 10.13f, 20.0f, 12.0f)
                reflectiveCurveToRelative(-0.729f, 3.628f, -2.051f, 4.95f)
                reflectiveCurveToRelative(-3.08f, 2.051f, -4.95f, 2.051f)
                reflectiveCurveToRelative(-3.628f, -0.729f, -4.95f, -2.051f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(1.699f, 1.7f, 3.959f, 2.637f, 6.364f, 2.637f)
                reflectiveCurveToRelative(4.665f, -0.937f, 6.364f, -2.637f)
                curveTo(21.063f, 16.665f, 22.0f, 14.405f, 22.0f, 12.0f)
                reflectiveCurveToRelative(-0.937f, -4.665f, -2.637f, -6.364f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, false, -6.364f, -2.637f)
                close()
            }
        }
        .build()
        return _bxLogInCircle!!
    }

private var _bxLogInCircle: ImageVector? = null
