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

public val RegularGroup.BxUpsideDown: ImageVector
    get() {
        if (_bxUpsideDown != null) {
            return _bxUpsideDown!!
        }
        _bxUpsideDown = Builder(name = "BxUpsideDown", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.829f, 9.172f)
                curveToRelative(0.181f, 0.181f, 0.346f, 0.38f, 0.488f, 0.592f)
                lineToRelative(1.658f, -1.119f)
                arcToRelative(6.063f, 6.063f, 0.0f, false, false, -1.621f, -1.62f)
                arcToRelative(5.963f, 5.963f, 0.0f, false, false, -2.148f, -0.903f)
                arcToRelative(5.985f, 5.985f, 0.0f, false, false, -5.448f, 1.634f)
                arcToRelative(5.993f, 5.993f, 0.0f, false, false, -0.733f, 0.889f)
                lineToRelative(1.657f, 1.119f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 2.51f, -1.683f)
                arcToRelative(3.989f, 3.989f, 0.0f, false, true, 3.637f, 1.091f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 13.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.507f, 13.507f)
                moveToRelative(-1.493f, 0.0f)
                arcToRelative(1.493f, 1.493f, 0.0f, true, true, 2.986f, 0.0f)
                arcToRelative(1.493f, 1.493f, 0.0f, true, true, -2.986f, 0.0f)
            }
        }
        .build()
        return _bxUpsideDown!!
    }

private var _bxUpsideDown: ImageVector? = null
