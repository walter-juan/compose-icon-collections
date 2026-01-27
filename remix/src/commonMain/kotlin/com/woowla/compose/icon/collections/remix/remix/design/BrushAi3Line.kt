package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.BrushAi3Line: ImageVector
    get() {
        if (_brushAi3Line != null) {
            return _brushAi3Line!!
        }
        _brushAi3Line = Builder(name = "BrushAi3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.997f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.997f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.997f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.997f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.997f)
                curveTo(21.0f, 21.549f, 20.552f, 21.997f, 20.0f, 21.997f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.997f, 3.0f, 21.549f, 3.0f, 20.997f)
                verticalLineTo(12.997f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.997f)
                curveTo(2.0f, 6.445f, 2.448f, 5.997f, 3.0f, 5.997f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.997f)
                curveTo(8.0f, 2.445f, 8.448f, 1.996f, 9.0f, 1.996f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.997f)
                close()
                moveTo(5.0f, 19.997f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.997f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.997f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.997f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.997f)
                close()
                moveTo(18.529f, 1.319f)
                curveTo(18.706f, 0.893f, 19.294f, 0.893f, 19.471f, 1.319f)
                lineTo(19.724f, 1.931f)
                curveTo(20.156f, 2.973f, 20.962f, 3.806f, 21.975f, 4.257f)
                lineTo(22.692f, 4.576f)
                curveTo(23.103f, 4.759f, 23.103f, 5.356f, 22.692f, 5.539f)
                lineTo(21.933f, 5.877f)
                curveTo(20.945f, 6.316f, 20.153f, 7.119f, 19.714f, 8.128f)
                lineTo(19.467f, 8.693f)
                curveTo(19.286f, 9.107f, 18.714f, 9.107f, 18.533f, 8.693f)
                lineTo(18.287f, 8.128f)
                curveTo(17.848f, 7.119f, 17.055f, 6.316f, 16.067f, 5.877f)
                lineTo(15.308f, 5.539f)
                curveTo(14.897f, 5.356f, 14.897f, 4.759f, 15.308f, 4.576f)
                lineTo(16.025f, 4.257f)
                curveTo(17.038f, 3.806f, 17.844f, 2.973f, 18.276f, 1.931f)
                lineTo(18.529f, 1.319f)
                close()
            }
        }
        .build()
        return _brushAi3Line!!
    }

private var _brushAi3Line: ImageVector? = null
