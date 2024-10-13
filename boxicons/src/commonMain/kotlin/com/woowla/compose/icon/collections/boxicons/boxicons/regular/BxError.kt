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

public val RegularGroup.BxError: ImageVector
    get() {
        if (_bxError != null) {
            return _bxError!!
        }
        _bxError = Builder(name = "BxError", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.001f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.768f, 4.2f)
                curveTo(13.42f, 3.545f, 12.742f, 3.138f, 12.0f, 3.138f)
                reflectiveCurveToRelative(-1.42f, 0.407f, -1.768f, 1.063f)
                lineTo(2.894f, 18.064f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, false, 0.054f, 1.968f)
                arcTo(1.984f, 1.984f, 0.0f, false, false, 4.661f, 21.0f)
                horizontalLineToRelative(14.678f)
                curveToRelative(0.708f, 0.0f, 1.349f, -0.362f, 1.714f, -0.968f)
                arcToRelative(1.989f, 1.989f, 0.0f, false, false, 0.054f, -1.968f)
                lineTo(13.768f, 4.2f)
                close()
                moveTo(4.661f, 19.0f)
                lineTo(12.0f, 5.137f)
                lineTo(19.344f, 19.0f)
                horizontalLineTo(4.661f)
                close()
            }
        }
        .build()
        return _bxError!!
    }

private var _bxError: ImageVector? = null
