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

public val RegularGroup.BxSearchAlt: ImageVector
    get() {
        if (_bxSearchAlt != null) {
            return _bxSearchAlt!!
        }
        _bxSearchAlt = Builder(name = "BxSearchAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                arcToRelative(7.952f, 7.952f, 0.0f, false, false, 4.897f, -1.688f)
                lineToRelative(4.396f, 4.396f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.396f, -4.396f)
                arcTo(7.952f, 7.952f, 0.0f, false, false, 18.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.412f, 8.586f)
                curveToRelative(0.379f, 0.38f, 0.588f, 0.882f, 0.588f, 1.414f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.977f, 3.977f, 0.0f, false, false, -1.174f, -2.828f)
                curveToRelative(-1.514f, -1.512f, -4.139f, -1.512f, -5.652f, 0.0f)
                lineToRelative(1.412f, 1.416f)
                curveToRelative(0.76f, -0.758f, 2.07f, -0.756f, 2.826f, -0.002f)
                close()
            }
        }
        .build()
        return _bxSearchAlt!!
    }

private var _bxSearchAlt: ImageVector? = null
