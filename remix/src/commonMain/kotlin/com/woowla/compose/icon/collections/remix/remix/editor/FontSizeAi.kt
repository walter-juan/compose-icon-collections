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

public val EditorGroup.FontSizeAi: ImageVector
    get() {
        if (_fontSizeAi != null) {
            return _fontSizeAi!!
        }
        _fontSizeAi = Builder(name = "FontSizeAi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.467f, 8.694f)
                lineTo(19.713f, 8.128f)
                curveTo(20.153f, 7.119f, 20.944f, 6.316f, 21.932f, 5.877f)
                lineTo(22.692f, 5.539f)
                curveTo(23.103f, 5.357f, 23.103f, 4.759f, 22.692f, 4.576f)
                lineTo(21.975f, 4.257f)
                curveTo(20.962f, 3.807f, 20.156f, 2.974f, 19.724f, 1.931f)
                lineTo(19.471f, 1.32f)
                curveTo(19.294f, 0.893f, 18.706f, 0.893f, 18.529f, 1.32f)
                lineTo(18.276f, 1.931f)
                curveTo(17.844f, 2.974f, 17.038f, 3.807f, 16.025f, 4.257f)
                lineTo(15.308f, 4.576f)
                curveTo(14.897f, 4.759f, 14.897f, 5.357f, 15.308f, 5.539f)
                lineTo(16.068f, 5.877f)
                curveTo(17.056f, 6.316f, 17.847f, 7.119f, 18.287f, 8.128f)
                lineTo(18.533f, 8.694f)
                curveTo(18.714f, 9.108f, 19.286f, 9.108f, 19.467f, 8.694f)
                close()
                moveTo(4.754f, 15.0f)
                horizontalLineTo(11.246f)
                lineTo(13.246f, 20.0f)
                horizontalLineTo(15.4f)
                lineTo(9.0f, 4.0f)
                horizontalLineTo(7.0f)
                lineTo(0.6f, 20.0f)
                horizontalLineTo(2.754f)
                lineTo(4.754f, 15.0f)
                close()
                moveTo(8.0f, 6.885f)
                lineTo(10.446f, 13.0f)
                horizontalLineTo(5.554f)
                lineTo(8.0f, 6.885f)
                close()
                moveTo(21.0f, 12.0f)
                verticalLineTo(12.535f)
                curveTo(20.412f, 12.195f, 19.729f, 12.0f, 19.0f, 12.0f)
                curveTo(16.791f, 12.0f, 15.0f, 13.791f, 15.0f, 16.0f)
                curveTo(15.0f, 18.209f, 16.791f, 20.0f, 19.0f, 20.0f)
                curveTo(19.729f, 20.0f, 20.412f, 19.805f, 21.0f, 19.465f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 17.105f, 20.105f, 18.0f, 19.0f, 18.0f)
                curveTo(17.896f, 18.0f, 17.0f, 17.105f, 17.0f, 16.0f)
                curveTo(17.0f, 14.895f, 17.896f, 14.0f, 19.0f, 14.0f)
                curveTo(20.105f, 14.0f, 21.0f, 14.895f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _fontSizeAi!!
    }

private var _fontSizeAi: ImageVector? = null
