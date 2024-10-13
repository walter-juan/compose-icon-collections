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

public val SolidGroup.BxsFace: ImageVector
    get() {
        if (_bxsFace != null) {
            return _bxsFace!!
        }
        _bxsFace = Builder(name = "BxsFace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.168f, 0.258f, -2.275f, 0.709f, -3.276f)
                curveToRelative(0.154f, 0.09f, 0.308f, 0.182f, 0.456f, 0.276f)
                curveToRelative(0.396f, 0.25f, 0.791f, 0.5f, 1.286f, 0.688f)
                curveToRelative(0.494f, 0.187f, 1.088f, 0.312f, 1.879f, 0.312f)
                curveToRelative(0.792f, 0.0f, 1.386f, -0.125f, 1.881f, -0.313f)
                reflectiveCurveToRelative(0.891f, -0.437f, 1.287f, -0.687f)
                reflectiveCurveToRelative(0.792f, -0.5f, 1.287f, -0.688f)
                curveToRelative(0.494f, -0.187f, 1.088f, -0.312f, 1.88f, -0.312f)
                reflectiveCurveToRelative(1.386f, 0.125f, 1.88f, 0.313f)
                curveToRelative(0.495f, 0.187f, 0.891f, 0.437f, 1.287f, 0.687f)
                reflectiveCurveToRelative(0.792f, 0.5f, 1.287f, 0.688f)
                curveToRelative(0.178f, 0.067f, 0.374f, 0.122f, 0.581f, 0.171f)
                curveToRelative(0.191f, 0.682f, 0.3f, 1.398f, 0.3f, 2.141f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 12.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 12.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxsFace!!
    }

private var _bxsFace: ImageVector? = null
