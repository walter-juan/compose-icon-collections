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

public val RegularGroup.BxBeenHere: ImageVector
    get() {
        if (_bxBeenHere != null) {
            return _bxBeenHere!!
        }
        _bxBeenHere = Builder(name = "BxBeenHere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(7.589f, 2.0f, 4.0f, 5.589f, 4.0f, 9.995f)
                curveToRelative(-0.029f, 6.445f, 7.116f, 11.604f, 7.42f, 11.819f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.16f, 0.0f)
                curveTo(12.884f, 21.599f, 20.029f, 16.44f, 20.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(12.0f, 19.735f)
                curveTo(10.389f, 18.427f, 5.979f, 14.441f, 6.0f, 10.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.005f)
                curveToRelative(0.021f, 4.437f, -4.388f, 8.423f, -6.0f, 9.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.586f)
                lineTo(8.707f, 9.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(11.0f, 14.414f)
                lineToRelative(5.707f, -5.707f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _bxBeenHere!!
    }

private var _bxBeenHere: ImageVector? = null
