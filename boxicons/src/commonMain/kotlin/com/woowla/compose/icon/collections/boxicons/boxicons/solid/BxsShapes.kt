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

public val SolidGroup.BxsShapes: ImageVector
    get() {
        if (_bxsShapes != null) {
            return _bxsShapes!!
        }
        _bxsShapes = Builder(name = "BxsShapes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.867f, 2.504f)
                curveToRelative(-0.355f, -0.624f, -1.381f, -0.623f, -1.736f, 0.0f)
                lineToRelative(-3.999f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.868f, -1.496f)
                lineToRelative(-4.001f, -7.0f)
                close()
                moveTo(3.0f, 22.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(17.5f, 13.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _bxsShapes!!
    }

private var _bxsShapes: ImageVector? = null
