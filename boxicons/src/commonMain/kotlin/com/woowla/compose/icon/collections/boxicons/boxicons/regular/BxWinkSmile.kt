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

public val RegularGroup.BxWinkSmile: ImageVector
    get() {
        if (_bxWinkSmile != null) {
            return _bxWinkSmile!!
        }
        _bxWinkSmile = Builder(name = "BxWinkSmile", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 14.828f)
                arcToRelative(3.988f, 3.988f, 0.0f, false, true, -2.02f, 1.09f)
                arcToRelative(4.108f, 4.108f, 0.0f, false, true, -1.616f, 0.0f)
                arcToRelative(4.103f, 4.103f, 0.0f, false, true, -0.749f, -0.232f)
                arcToRelative(4.161f, 4.161f, 0.0f, false, true, -0.679f, -0.368f)
                arcToRelative(4.115f, 4.115f, 0.0f, false, true, -1.082f, -1.082f)
                lineToRelative(-1.658f, 1.117f)
                curveToRelative(0.215f, 0.319f, 0.462f, 0.619f, 0.733f, 0.889f)
                arcToRelative(5.991f, 5.991f, 0.0f, false, false, 8.485f, 0.002f)
                curveToRelative(0.272f, -0.271f, 0.52f, -0.571f, 0.734f, -0.891f)
                lineToRelative(-1.658f, -1.117f)
                curveToRelative(-0.143f, 0.211f, -0.307f, 0.41f, -0.49f, 0.592f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 10.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 10.0f)
                curveToRelative(-2.0f, 0.0f, -2.5f, 2.0f, -2.5f, 2.0f)
                horizontalLineToRelative(5.0f)
                reflectiveCurveToRelative(-0.501f, -2.0f, -2.5f, -2.0f)
                close()
            }
        }
        .build()
        return _bxWinkSmile!!
    }

private var _bxWinkSmile: ImageVector? = null
