package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandOpera: ImageVector
    get() {
        if (_brandOpera != null) {
            return _brandOpera!!
        }
        _brandOpera = Builder(name = "BrandOpera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-5.0f, 2.66f)
                curveToRelative(-2.285f, 0.0f, -3.915f, 2.619f, -3.997f, 5.752f)
                lineToRelative(-0.003f, 0.248f)
                curveToRelative(0.0f, 3.242f, 1.655f, 6.0f, 4.0f, 6.0f)
                reflectiveCurveToRelative(4.0f, -2.758f, 4.0f, -6.0f)
                reflectiveCurveToRelative(-1.655f, -6.0f, -4.0f, -6.0f)
            }
        }
        .build()
        return _brandOpera!!
    }

private var _brandOpera: ImageVector? = null
