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

public val RegularGroup.BxBullseye: ImageVector
    get() {
        if (_bxBullseye != null) {
            return _bxBullseye!!
        }
        _bxBullseye = Builder(name = "BxBullseye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.579f, 2.0f, 2.0f, 6.579f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.579f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.579f, 10.0f, -10.0f)
                reflectiveCurveTo(17.421f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.337f, 0.0f, -8.0f, -3.663f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.663f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.663f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.663f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.081f, 0.0f, -2.0f, 0.919f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.919f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.919f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.919f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxBullseye!!
    }

private var _bxBullseye: ImageVector? = null