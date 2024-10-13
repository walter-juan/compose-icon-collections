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

public val SolidGroup.BxsBath: ImageVector
    get() {
        if (_bxsBath != null) {
            return _bxsBath!!
        }
        _bxsBath = Builder(name = "BxsBath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.113f)
                curveToRelative(0.0f, -0.997f, 0.678f, -1.923f, 1.661f, -2.085f)
                arcTo(2.003f, 2.003f, 0.0f, false, true, 11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.003f, 4.003f, 0.0f, false, false, -4.398f, -3.98f)
                curveTo(6.523f, 3.222f, 5.0f, 5.089f, 5.0f, 7.178f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.606f, 1.674f, 4.823f, 4.0f, 5.65f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.35f)
                curveToRelative(2.326f, -0.827f, 4.0f, -3.044f, 4.0f, -5.65f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bxsBath!!
    }

private var _bxsBath: ImageVector? = null
