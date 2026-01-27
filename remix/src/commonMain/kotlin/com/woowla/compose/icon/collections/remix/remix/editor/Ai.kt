package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.Ai: ImageVector
    get() {
        if (_ai != null) {
            return _ai!!
        }
        _ai = Builder(name = "Ai", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4f, 21.0f)
                horizontalLineTo(14.246f)
                lineTo(12.246f, 16.0f)
                horizontalLineTo(5.754f)
                lineTo(3.754f, 21.0f)
                horizontalLineTo(1.6f)
                lineTo(8.0f, 5.0f)
                horizontalLineTo(10.0f)
                lineTo(16.4f, 21.0f)
                close()
                moveTo(21.0f, 12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(6.554f, 14.0f)
                horizontalLineTo(11.446f)
                lineTo(9.0f, 7.885f)
                lineTo(6.554f, 14.0f)
                close()
                moveTo(19.529f, 2.319f)
                curveTo(19.706f, 1.894f, 20.294f, 1.893f, 20.471f, 2.319f)
                lineTo(20.724f, 2.931f)
                curveTo(21.156f, 3.973f, 21.962f, 4.806f, 22.975f, 5.257f)
                lineTo(23.691f, 5.576f)
                curveTo(24.102f, 5.759f, 24.102f, 6.356f, 23.691f, 6.539f)
                lineTo(22.933f, 6.877f)
                curveTo(21.945f, 7.316f, 21.153f, 8.119f, 20.714f, 9.128f)
                lineTo(20.467f, 9.693f)
                curveTo(20.286f, 10.108f, 19.714f, 10.108f, 19.533f, 9.693f)
                lineTo(19.286f, 9.128f)
                curveTo(18.847f, 8.119f, 18.055f, 7.316f, 17.067f, 6.877f)
                lineTo(16.308f, 6.539f)
                curveTo(15.897f, 6.356f, 15.897f, 5.759f, 16.308f, 5.576f)
                lineTo(17.025f, 5.257f)
                curveTo(18.038f, 4.806f, 18.844f, 3.973f, 19.276f, 2.931f)
                lineTo(19.529f, 2.319f)
                close()
            }
        }
        .build()
        return _ai!!
    }

private var _ai: ImageVector? = null
