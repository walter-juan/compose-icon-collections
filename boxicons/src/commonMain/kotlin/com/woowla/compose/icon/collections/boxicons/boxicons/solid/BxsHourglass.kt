package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsHourglass: ImageVector
    get() {
        if (_bxsHourglass != null) {
            return _bxsHourglass!!
        }
        _bxsHourglass = Builder(name = "BxsHourglass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.014f, 7.014f, 0.0f, false, false, -3.433f, -6.02f)
                curveToRelative(-0.355f, -0.21f, -0.567f, -0.547f, -0.567f, -0.901f)
                verticalLineToRelative(-0.158f)
                curveToRelative(0.0f, -0.354f, 0.212f, -0.691f, 0.566f, -0.9f)
                arcTo(7.016f, 7.016f, 0.0f, false, false, 19.0f, 5.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(7.016f, 7.016f, 0.0f, false, false, 3.434f, 6.021f)
                curveToRelative(0.354f, 0.209f, 0.566f, 0.545f, 0.566f, 0.9f)
                verticalLineToRelative(0.158f)
                curveToRelative(0.0f, 0.354f, -0.212f, 0.691f, -0.566f, 0.9f)
                arcTo(7.016f, 7.016f, 0.0f, false, false, 5.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(17.0f, 4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.005f, 5.005f, 0.0f, false, true, -1.004f, 3.0f)
                horizontalLineTo(8.004f)
                arcTo(5.005f, 5.005f, 0.0f, false, true, 7.0f, 5.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(9.45f, 14.702f)
                curveToRelative(0.971f, -0.574f, 1.55f, -1.554f, 1.55f, -2.623f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.079f)
                curveToRelative(0.0f, 1.068f, 0.579f, 2.049f, 1.551f, 2.623f)
                arcTo(4.98f, 4.98f, 0.0f, false, true, 16.573f, 17.0f)
                horizontalLineTo(7.427f)
                arcToRelative(4.977f, 4.977f, 0.0f, false, true, 2.023f, -2.298f)
                close()
            }
        }
        .build()
        return _bxsHourglass!!
    }

private var _bxsHourglass: ImageVector? = null
