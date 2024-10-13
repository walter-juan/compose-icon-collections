package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsVolumeFull: ImageVector
    get() {
        if (_bxsVolumeFull != null) {
            return _bxsVolumeFull!!
        }
        _bxsVolumeFull = Builder(name = "BxsVolumeFull", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                curveToRelative(3.527f, -1.547f, 5.999f, -4.909f, 5.999f, -9.0f)
                reflectiveCurveTo(19.527f, 4.547f, 16.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.387f, 1.386f, 3.999f, 4.047f, 3.999f, 7.0f)
                reflectiveCurveTo(18.387f, 17.614f, 16.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(1.225f, -1.1f, 2.0f, -3.229f, 2.0f, -5.0f)
                reflectiveCurveToRelative(-0.775f, -3.9f, -2.0f, -5.0f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(2.697f)
                lineTo(14.0f, 21.868f)
                verticalLineTo(2.132f)
                lineTo(6.697f, 7.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxsVolumeFull!!
    }

private var _bxsVolumeFull: ImageVector? = null
