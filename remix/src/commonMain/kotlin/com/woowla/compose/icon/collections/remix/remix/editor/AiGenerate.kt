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

public val EditorGroup.AiGenerate: ImageVector
    get() {
        if (_aiGenerate != null) {
            return _aiGenerate!!
        }
        _aiGenerate = Builder(name = "AiGenerate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.713f, 9.128f)
                lineTo(19.467f, 9.694f)
                curveTo(19.286f, 10.108f, 18.714f, 10.108f, 18.533f, 9.694f)
                lineTo(18.287f, 9.128f)
                curveTo(17.847f, 8.119f, 17.056f, 7.316f, 16.068f, 6.877f)
                lineTo(15.308f, 6.539f)
                curveTo(14.897f, 6.357f, 14.897f, 5.759f, 15.308f, 5.576f)
                lineTo(16.025f, 5.257f)
                curveTo(17.038f, 4.807f, 17.844f, 3.974f, 18.276f, 2.931f)
                lineTo(18.529f, 2.32f)
                curveTo(18.706f, 1.893f, 19.294f, 1.893f, 19.471f, 2.32f)
                lineTo(19.724f, 2.931f)
                curveTo(20.156f, 3.974f, 20.962f, 4.807f, 21.975f, 5.257f)
                lineTo(22.692f, 5.576f)
                curveTo(23.103f, 5.759f, 23.103f, 6.357f, 22.692f, 6.539f)
                lineTo(21.932f, 6.877f)
                curveTo(20.944f, 7.316f, 20.153f, 8.119f, 19.713f, 9.128f)
                close()
                moveTo(6.0f, 5.0f)
                curveTo(4.895f, 5.0f, 4.0f, 5.895f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 18.105f, 4.895f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 19.0f, 20.0f, 18.105f, 20.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 19.209f, 20.209f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(3.791f, 21.0f, 2.0f, 19.209f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 4.791f, 3.791f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _aiGenerate!!
    }

private var _aiGenerate: ImageVector? = null
