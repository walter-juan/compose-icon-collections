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

public val SolidGroup.BxsBrushAlt: ImageVector
    get() {
        if (_bxsBrushAlt != null) {
            return _bxsBrushAlt!!
        }
        _bxsBrushAlt = Builder(name = "BxsBrushAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.001f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.999f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, -0.874f, -2.108f)
                arcToRelative(2.943f, 2.943f, 0.0f, false, false, -2.39f, -0.879f)
                curveTo(10.202f, 2.144f, 9.0f, 3.508f, 9.0f, 5.117f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(10.001f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(5.117f)
                curveToRelative(0.0f, -0.57f, 0.407f, -1.07f, 1.002f, -1.117f)
                curveToRelative(0.266f, 0.0f, 0.512f, 0.103f, 0.712f, 0.307f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.286f, 0.692f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(0.995f)
                lineToRelative(0.005f, 0.001f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bxsBrushAlt!!
    }

private var _bxsBrushAlt: ImageVector? = null
