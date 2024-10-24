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

public val MediaGroup.VoiceAiLine: ImageVector
    get() {
        if (_voiceAiLine != null) {
            return _voiceAiLine!!
        }
        _voiceAiLine = Builder(name = "VoiceAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.713f, 7.128f)
                lineTo(20.467f, 7.694f)
                curveTo(20.286f, 8.108f, 19.714f, 8.108f, 19.533f, 7.694f)
                lineTo(19.287f, 7.128f)
                curveTo(18.847f, 6.119f, 18.056f, 5.316f, 17.068f, 4.877f)
                lineTo(16.308f, 4.539f)
                curveTo(15.897f, 4.357f, 15.897f, 3.759f, 16.308f, 3.576f)
                lineTo(17.025f, 3.257f)
                curveTo(18.038f, 2.807f, 18.844f, 1.974f, 19.276f, 0.931f)
                lineTo(19.529f, 0.32f)
                curveTo(19.706f, -0.107f, 20.294f, -0.107f, 20.471f, 0.32f)
                lineTo(20.724f, 0.931f)
                curveTo(21.156f, 1.974f, 21.962f, 2.807f, 22.975f, 3.257f)
                lineTo(23.692f, 3.576f)
                curveTo(24.103f, 3.759f, 24.103f, 4.357f, 23.692f, 4.539f)
                lineTo(22.932f, 4.877f)
                curveTo(21.944f, 5.316f, 21.153f, 6.119f, 20.713f, 7.128f)
                close()
                moveTo(8.5f, 6.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.0f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(17.5f, 8.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(8.0f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _voiceAiLine!!
    }

private var _voiceAiLine: ImageVector? = null
