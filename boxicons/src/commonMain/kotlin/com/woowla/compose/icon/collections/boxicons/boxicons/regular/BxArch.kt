package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxArch: ImageVector
    get() {
        if (_bxArch != null) {
            return _bxArch!!
        }
        _bxArch = Builder(name = "BxArch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.995f)
                curveToRelative(0.006f, -0.502f, 0.177f, -3.005f, 3.0f, -3.005f)
                reflectiveCurveToRelative(2.994f, 2.503f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.729f, -1.045f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 3.271f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _bxArch!!
    }

private var _bxArch: ImageVector? = null
