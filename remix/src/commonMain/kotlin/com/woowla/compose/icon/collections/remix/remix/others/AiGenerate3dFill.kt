package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.AiGenerate3dFill: ImageVector
    get() {
        if (_aiGenerate3dFill != null) {
            return _aiGenerate3dFill!!
        }
        _aiGenerate3dFill = Builder(name = "AiGenerate3dFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.268f, 2.313f)
                curveTo(13.474f, 3.33f, 13.0f, 4.609f, 13.0f, 6.0f)
                curveTo(13.0f, 9.314f, 15.686f, 12.0f, 19.0f, 12.0f)
                curveTo(19.892f, 12.0f, 20.739f, 11.804f, 21.5f, 11.454f)
                verticalLineTo(17.5f)
                lineTo(12.0f, 23.0f)
                lineTo(2.5f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(12.0f, 1.0f)
                lineTo(14.268f, 2.313f)
                close()
                moveTo(4.5f, 16.347f)
                lineTo(12.0f, 20.69f)
                verticalLineTo(12.0f)
                lineTo(4.5f, 7.657f)
                verticalLineTo(16.347f)
                close()
                moveTo(18.529f, 2.319f)
                curveTo(18.706f, 1.893f, 19.294f, 1.893f, 19.471f, 2.319f)
                lineTo(19.724f, 2.931f)
                curveTo(20.156f, 3.973f, 20.962f, 4.806f, 21.975f, 5.257f)
                lineTo(22.692f, 5.576f)
                curveTo(23.103f, 5.759f, 23.103f, 6.356f, 22.692f, 6.539f)
                lineTo(21.933f, 6.877f)
                curveTo(20.945f, 7.316f, 20.153f, 8.119f, 19.714f, 9.128f)
                lineTo(19.467f, 9.693f)
                curveTo(19.286f, 10.108f, 18.714f, 10.108f, 18.533f, 9.693f)
                lineTo(18.287f, 9.128f)
                curveTo(17.848f, 8.119f, 17.055f, 7.316f, 16.067f, 6.877f)
                lineTo(15.308f, 6.539f)
                curveTo(14.897f, 6.356f, 14.897f, 5.759f, 15.308f, 5.576f)
                lineTo(16.025f, 5.257f)
                curveTo(17.038f, 4.806f, 17.844f, 3.973f, 18.276f, 2.931f)
                lineTo(18.529f, 2.319f)
                close()
            }
        }
        .build()
        return _aiGenerate3dFill!!
    }

private var _aiGenerate3dFill: ImageVector? = null
