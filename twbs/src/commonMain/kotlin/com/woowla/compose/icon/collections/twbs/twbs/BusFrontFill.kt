package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BusFrontFill: ImageVector
    get() {
        if (_busFrontFill != null) {
            return _busFrontFill!!
        }
        _busFrontFill = Builder(name = "BusFrontFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.0f, -2.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                verticalLineTo(2.64f)
                curveTo(1.0f, 1.452f, 1.845f, 0.408f, 3.064f, 0.268f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 8.0f, 0.0f)
                curveToRelative(2.1f, 0.0f, 3.792f, 0.136f, 4.936f, 0.268f)
                curveTo(14.155f, 0.408f, 15.0f, 1.452f, 15.0f, 2.64f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(3.552f, 3.22f)
                arcTo(43.0f, 43.0f, 0.0f, false, true, 8.0f, 3.0f)
                curveToRelative(1.837f, 0.0f, 3.353f, 0.107f, 4.448f, 0.22f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.104f, -0.994f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 8.0f, 2.0f)
                curveToRelative(-1.876f, 0.0f, -3.426f, 0.109f, -4.552f, 0.226f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.104f, 0.994f)
                moveTo(8.0f, 4.0f)
                curveToRelative(-1.876f, 0.0f, -3.426f, 0.109f, -4.552f, 0.226f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 4.723f)
                verticalLineToRelative(3.554f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.448f, 0.497f)
                curveTo(4.574f, 8.891f, 6.124f, 9.0f, 8.0f, 9.0f)
                reflectiveCurveToRelative(3.426f, -0.109f, 4.552f, -0.226f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.0f, 8.277f)
                verticalLineTo(4.723f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.448f, -0.497f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 8.0f, 4.0f)
                moveToRelative(-3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
            }
        }
        .build()
        return _busFrontFill!!
    }

private var _busFrontFill: ImageVector? = null
