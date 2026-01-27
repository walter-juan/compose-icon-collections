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

public val DesignGroup.PencilAi2Line: ImageVector
    get() {
        if (_pencilAi2Line != null) {
            return _pencilAi2Line!!
        }
        _pencilAi2Line = Builder(name = "PencilAi2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.529f, 15.319f)
                curveTo(18.706f, 14.893f, 19.294f, 14.893f, 19.471f, 15.319f)
                lineTo(19.724f, 15.931f)
                curveTo(20.156f, 16.973f, 20.962f, 17.806f, 21.975f, 18.257f)
                lineTo(22.691f, 18.576f)
                curveTo(23.102f, 18.759f, 23.102f, 19.356f, 22.691f, 19.539f)
                lineTo(21.933f, 19.877f)
                curveTo(20.945f, 20.316f, 20.153f, 21.119f, 19.714f, 22.128f)
                lineTo(19.467f, 22.693f)
                curveTo(19.286f, 23.108f, 18.714f, 23.108f, 18.533f, 22.693f)
                lineTo(18.286f, 22.128f)
                curveTo(17.847f, 21.119f, 17.055f, 20.316f, 16.067f, 19.877f)
                lineTo(15.308f, 19.539f)
                curveTo(14.897f, 19.356f, 14.897f, 18.759f, 15.308f, 18.576f)
                lineTo(16.025f, 18.257f)
                curveTo(17.038f, 17.806f, 17.844f, 16.973f, 18.276f, 15.931f)
                lineTo(18.529f, 15.319f)
                close()
                moveTo(16.435f, 3.212f)
                curveTo(16.825f, 2.821f, 17.459f, 2.821f, 17.85f, 3.212f)
                lineTo(20.678f, 6.041f)
                curveTo(21.068f, 6.432f, 21.068f, 7.065f, 20.678f, 7.455f)
                lineTo(7.242f, 20.89f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.647f)
                lineTo(16.435f, 3.212f)
                close()
                moveTo(5.0f, 17.476f)
                verticalLineTo(18.89f)
                horizontalLineTo(6.414f)
                lineTo(15.727f, 9.576f)
                lineTo(14.314f, 8.162f)
                lineTo(5.0f, 17.476f)
                close()
                moveTo(15.727f, 6.748f)
                lineTo(17.143f, 8.162f)
                lineTo(18.557f, 6.748f)
                lineTo(17.143f, 5.334f)
                lineTo(15.727f, 6.748f)
                close()
            }
        }
        .build()
        return _pencilAi2Line!!
    }

private var _pencilAi2Line: ImageVector? = null
