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

public val RegularGroup.BxBrushAlt: ImageVector
    get() {
        if (_bxBrushAlt != null) {
            return _bxBrushAlt!!
        }
        _bxBrushAlt = Builder(name = "BxBrushAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.001f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 4.999f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, -0.874f, -2.108f)
                arcToRelative(2.943f, 2.943f, 0.0f, false, false, -2.39f, -0.879f)
                curveTo(10.202f, 2.144f, 9.0f, 3.508f, 9.0f, 5.117f)
                lineTo(9.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-9.999f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 5.117f)
                curveToRelative(0.0f, -0.57f, 0.407f, -1.07f, 1.002f, -1.117f)
                curveToRelative(0.266f, 0.0f, 0.512f, 0.103f, 0.712f, 0.307f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.286f, 0.692f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(0.995f)
                lineToRelative(0.005f, 0.001f)
                horizontalLineToRelative(5.0f)
                lineTo(19.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(0.002f, 6.0f)
                lineTo(5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxBrushAlt!!
    }

private var _bxBrushAlt: ImageVector? = null
