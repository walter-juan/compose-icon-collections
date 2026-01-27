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

public val SystemGroup.LoopRightAiFill: ImageVector
    get() {
        if (_loopRightAiFill != null) {
            return _loopRightAiFill!!
        }
        _loopRightAiFill = Builder(name = "LoopRightAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(8.856f, 22.0f, 6.051f, 20.548f, 4.219f, 18.281f)
                lineTo(2.0f, 20.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                lineTo(5.643f, 16.857f)
                curveTo(7.106f, 18.77f, 9.41f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(11.529f, 8.319f)
                curveTo(11.706f, 7.893f, 12.294f, 7.893f, 12.471f, 8.319f)
                lineTo(12.724f, 8.931f)
                curveTo(13.156f, 9.973f, 13.962f, 10.806f, 14.975f, 11.257f)
                lineTo(15.692f, 11.576f)
                curveTo(16.103f, 11.759f, 16.103f, 12.356f, 15.692f, 12.539f)
                lineTo(14.933f, 12.877f)
                curveTo(13.945f, 13.316f, 13.153f, 14.119f, 12.714f, 15.128f)
                lineTo(12.467f, 15.693f)
                curveTo(12.286f, 16.108f, 11.714f, 16.108f, 11.533f, 15.693f)
                lineTo(11.287f, 15.128f)
                curveTo(10.848f, 14.119f, 10.055f, 13.316f, 9.067f, 12.877f)
                lineTo(8.308f, 12.539f)
                curveTo(7.897f, 12.356f, 7.897f, 11.759f, 8.308f, 11.576f)
                lineTo(9.025f, 11.257f)
                curveTo(10.038f, 10.806f, 10.844f, 9.973f, 11.276f, 8.931f)
                lineTo(11.529f, 8.319f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.144f, 2.0f, 17.949f, 3.452f, 19.781f, 5.719f)
                lineTo(22.0f, 3.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                lineTo(18.357f, 7.143f)
                curveTo(16.894f, 5.23f, 14.59f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _loopRightAiFill!!
    }

private var _loopRightAiFill: ImageVector? = null
