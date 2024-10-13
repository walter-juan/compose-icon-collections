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

public val RegularGroup.BxInfinite: ImageVector
    get() {
        if (_bxInfinite != null) {
            return _bxInfinite!!
        }
        _bxInfinite = Builder(name = "BxInfinite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                curveToRelative(-2.094f, 0.0f, -3.611f, 1.567f, -5.001f, 3.346f)
                curveTo(10.609f, 8.567f, 9.093f, 7.0f, 7.0f, 7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, 1.459f, 3.534f)
                arcTo(4.956f, 4.956f, 0.0f, false, false, 6.99f, 17.0f)
                horizontalLineToRelative(0.012f)
                curveToRelative(2.089f, -0.005f, 3.605f, -1.572f, 4.996f, -3.351f)
                curveTo(13.389f, 15.431f, 14.906f, 17.0f, 17.0f, 17.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(6.998f, 15.0f)
                lineToRelative(-0.008f, 1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.799f, 0.0f, -1.55f, -0.312f, -2.114f, -0.878f)
                arcTo(3.004f, 3.004f, 0.0f, false, true, 7.0f, 9.0f)
                curveToRelative(1.33f, 0.0f, 2.56f, 1.438f, 3.746f, 2.998f)
                curveTo(9.558f, 13.557f, 8.328f, 14.997f, 6.998f, 15.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(-1.33f, 0.0f, -2.561f, -1.44f, -3.749f, -3.002f)
                curveTo(14.438f, 10.438f, 15.668f, 9.0f, 17.0f, 9.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxInfinite!!
    }

private var _bxInfinite: ImageVector? = null
