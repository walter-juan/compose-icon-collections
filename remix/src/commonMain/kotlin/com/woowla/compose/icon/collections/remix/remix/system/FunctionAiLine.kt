package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.FunctionAiLine: ImageVector
    get() {
        if (_functionAiLine != null) {
            return _functionAiLine!!
        }
        _functionAiLine = Builder(name = "FunctionAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                curveTo(10.552f, 13.0f, 11.0f, 13.448f, 11.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 20.552f, 10.552f, 21.0f, 10.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 13.448f, 3.448f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(20.0f, 13.0f)
                curveTo(20.552f, 13.0f, 21.0f, 13.448f, 21.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(13.448f, 21.0f, 13.0f, 20.552f, 13.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(13.0f, 13.448f, 13.448f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(15.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(16.529f, 3.319f)
                curveTo(16.706f, 2.893f, 17.294f, 2.893f, 17.471f, 3.319f)
                lineTo(17.724f, 3.931f)
                curveTo(18.156f, 4.973f, 18.962f, 5.806f, 19.975f, 6.257f)
                lineTo(20.693f, 6.576f)
                curveTo(21.103f, 6.759f, 21.103f, 7.356f, 20.693f, 7.539f)
                lineTo(19.933f, 7.877f)
                curveTo(18.945f, 8.316f, 18.153f, 9.119f, 17.714f, 10.128f)
                lineTo(17.467f, 10.693f)
                curveTo(17.287f, 11.108f, 16.714f, 11.108f, 16.533f, 10.693f)
                lineTo(16.287f, 10.128f)
                curveTo(15.848f, 9.119f, 15.055f, 8.316f, 14.068f, 7.877f)
                lineTo(13.308f, 7.539f)
                curveTo(12.898f, 7.356f, 12.898f, 6.759f, 13.308f, 6.576f)
                lineTo(14.026f, 6.257f)
                curveTo(15.039f, 5.806f, 15.845f, 4.973f, 16.277f, 3.931f)
                lineTo(16.529f, 3.319f)
                close()
                moveTo(10.0f, 3.0f)
                curveTo(10.552f, 3.0f, 11.0f, 3.448f, 11.0f, 4.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 10.552f, 10.552f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 11.0f, 3.0f, 10.552f, 3.0f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _functionAiLine!!
    }

private var _functionAiLine: ImageVector? = null
