package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.MusicAiLine: ImageVector
    get() {
        if (_musicAiLine != null) {
            return _musicAiLine!!
        }
        _musicAiLine = Builder(name = "MusicAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.713f, 8.128f)
                lineTo(18.467f, 8.694f)
                curveTo(18.286f, 9.108f, 17.714f, 9.108f, 17.533f, 8.694f)
                lineTo(17.287f, 8.128f)
                curveTo(16.847f, 7.119f, 16.056f, 6.316f, 15.068f, 5.877f)
                lineTo(14.308f, 5.539f)
                curveTo(13.897f, 5.357f, 13.897f, 4.759f, 14.308f, 4.576f)
                lineTo(15.025f, 4.257f)
                curveTo(16.038f, 3.807f, 16.844f, 2.974f, 17.276f, 1.931f)
                lineTo(17.529f, 1.32f)
                curveTo(17.706f, 0.893f, 18.294f, 0.893f, 18.471f, 1.32f)
                lineTo(18.724f, 1.931f)
                curveTo(19.156f, 2.974f, 19.962f, 3.807f, 20.975f, 4.257f)
                lineTo(21.692f, 4.576f)
                curveTo(22.103f, 4.759f, 22.103f, 5.357f, 21.692f, 5.539f)
                lineTo(20.932f, 5.877f)
                curveTo(19.944f, 6.316f, 19.153f, 7.119f, 18.713f, 8.128f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 19.209f, 7.209f, 21.0f, 5.0f, 21.0f)
                curveTo(2.791f, 21.0f, 1.0f, 19.209f, 1.0f, 17.0f)
                curveTo(1.0f, 14.791f, 2.791f, 13.0f, 5.0f, 13.0f)
                curveTo(5.729f, 13.0f, 6.412f, 13.195f, 7.0f, 13.535f)
                verticalLineTo(3.0f)
                close()
                moveTo(18.0f, 13.535f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 19.209f, 18.209f, 21.0f, 16.0f, 21.0f)
                curveTo(13.791f, 21.0f, 12.0f, 19.209f, 12.0f, 17.0f)
                curveTo(12.0f, 14.791f, 13.791f, 13.0f, 16.0f, 13.0f)
                curveTo(16.729f, 13.0f, 17.412f, 13.195f, 18.0f, 13.535f)
                close()
                moveTo(5.0f, 19.0f)
                curveTo(6.105f, 19.0f, 7.0f, 18.105f, 7.0f, 17.0f)
                curveTo(7.0f, 15.895f, 6.105f, 15.0f, 5.0f, 15.0f)
                curveTo(3.895f, 15.0f, 3.0f, 15.895f, 3.0f, 17.0f)
                curveTo(3.0f, 18.105f, 3.895f, 19.0f, 5.0f, 19.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(17.105f, 19.0f, 18.0f, 18.105f, 18.0f, 17.0f)
                curveTo(18.0f, 15.895f, 17.105f, 15.0f, 16.0f, 15.0f)
                curveTo(14.895f, 15.0f, 14.0f, 15.895f, 14.0f, 17.0f)
                curveTo(14.0f, 18.105f, 14.895f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _musicAiLine!!
    }

private var _musicAiLine: ImageVector? = null
