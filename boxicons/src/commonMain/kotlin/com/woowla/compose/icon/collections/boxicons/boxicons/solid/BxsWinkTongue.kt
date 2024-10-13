package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsWinkTongue: ImageVector
    get() {
        if (_bxsWinkTongue != null) {
            return _bxsWinkTongue!!
        }
        _bxsWinkTongue = Builder(name = "BxsWinkTongue", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.434f, 2.903f, 8.198f, 6.906f, 9.505f)
                arcTo(3.969f, 3.969f, 0.0f, false, true, 8.0f, 19.0f)
                verticalLineToRelative(-2.499f)
                curveTo(6.412f, 15.027f, 6.0f, 13.0f, 6.0f, 13.0f)
                horizontalLineToRelative(12.0f)
                reflectiveCurveToRelative(-0.411f, 2.027f, -2.0f, 3.501f)
                lineTo(16.0f, 19.0f)
                curveToRelative(0.0f, 0.953f, -0.349f, 1.816f, -0.906f, 2.504f)
                curveTo(19.097f, 20.197f, 22.0f, 16.434f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(8.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 11.0f)
                close()
                moveTo(13.0f, 11.0f)
                reflectiveCurveToRelative(0.5f, -2.0f, 2.5f, -2.0f)
                curveToRelative(1.999f, 0.0f, 2.5f, 2.0f, 2.5f, 2.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _bxsWinkTongue!!
    }

private var _bxsWinkTongue: ImageVector? = null
