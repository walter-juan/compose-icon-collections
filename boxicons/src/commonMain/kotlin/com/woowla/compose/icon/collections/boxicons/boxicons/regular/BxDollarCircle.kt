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

public val RegularGroup.BxDollarCircle: ImageVector
    get() {
        if (_bxDollarCircle != null) {
            return _bxDollarCircle!!
        }
        _bxDollarCircle = Builder(name = "BxDollarCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveToRelative(-2.0f, 0.0f, -2.0f, -0.63f, -2.0f, -1.0f)
                reflectiveCurveToRelative(0.7f, -1.0f, 2.0f, -1.0f)
                reflectiveCurveToRelative(1.39f, 0.64f, 1.4f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 7.12f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.09f)
                curveTo(9.0f, 7.42f, 8.0f, 8.71f, 8.0f, 10.0f)
                curveToRelative(0.0f, 1.12f, 0.52f, 3.0f, 4.0f, 3.0f)
                curveToRelative(2.0f, 0.0f, 2.0f, 0.68f, 2.0f, 1.0f)
                reflectiveCurveToRelative(-0.62f, 1.0f, -2.0f, 1.0f)
                curveToRelative(-1.84f, 0.0f, -2.0f, -0.86f, -2.0f, -1.0f)
                horizontalLineTo(8.0f)
                curveToRelative(0.0f, 0.92f, 0.66f, 2.55f, 3.0f, 2.92f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.08f)
                curveToRelative(2.0f, -0.34f, 3.0f, -1.63f, 3.0f, -2.92f)
                curveToRelative(0.0f, -1.12f, -0.52f, -3.0f, -4.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bxDollarCircle!!
    }

private var _bxDollarCircle: ImageVector? = null
