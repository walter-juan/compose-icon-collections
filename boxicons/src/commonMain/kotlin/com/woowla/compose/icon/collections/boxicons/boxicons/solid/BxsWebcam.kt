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

public val SolidGroup.BxsWebcam: ImageVector
    get() {
        if (_bxsWebcam != null) {
            return _bxsWebcam!!
        }
        _bxsWebcam = Builder(name = "BxsWebcam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, 4.037f, -9.0f, 9.0f)
                curveToRelative(0.0f, 3.328f, 1.82f, 6.232f, 4.513f, 7.79f)
                lineToRelative(-2.067f, 1.378f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.555f, -1.832f)
                lineToRelative(-2.067f, -1.378f)
                curveTo(19.18f, 17.232f, 21.0f, 14.328f, 21.0f, 11.0f)
                curveToRelative(0.0f, -4.963f, -4.037f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(10.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 11.0f)
                close()
            }
        }
        .build()
        return _bxsWebcam!!
    }

private var _bxsWebcam: ImageVector? = null
