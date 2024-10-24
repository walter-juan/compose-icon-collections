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

public val DesignGroup.BrushAiFill: ImageVector
    get() {
        if (_brushAiFill != null) {
            return _brushAiFill!!
        }
        _brushAiFill = Builder(name = "BrushAiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.713f, 7.128f)
                lineTo(4.467f, 7.694f)
                curveTo(4.286f, 8.108f, 3.714f, 8.108f, 3.533f, 7.694f)
                lineTo(3.287f, 7.128f)
                curveTo(2.847f, 6.119f, 2.055f, 5.316f, 1.068f, 4.877f)
                lineTo(0.308f, 4.539f)
                curveTo(-0.103f, 4.357f, -0.103f, 3.759f, 0.308f, 3.576f)
                lineTo(1.025f, 3.257f)
                curveTo(2.038f, 2.807f, 2.844f, 1.974f, 3.276f, 0.931f)
                lineTo(3.529f, 0.32f)
                curveTo(3.706f, -0.107f, 4.294f, -0.107f, 4.471f, 0.32f)
                lineTo(4.724f, 0.931f)
                curveTo(5.156f, 1.974f, 5.962f, 2.807f, 6.975f, 3.257f)
                lineTo(7.692f, 3.576f)
                curveTo(8.103f, 3.759f, 8.103f, 4.357f, 7.692f, 4.539f)
                lineTo(6.932f, 4.877f)
                curveTo(5.945f, 5.316f, 5.153f, 6.119f, 4.713f, 7.128f)
                close()
                moveTo(18.228f, 2.371f)
                lineTo(13.289f, 6.213f)
                curveTo(9.342f, 5.239f, 5.558f, 7.546f, 4.5f, 11.497f)
                curveTo(4.398f, 11.876f, 4.366f, 12.262f, 4.333f, 12.666f)
                curveTo(4.218f, 14.06f, 4.086f, 15.671f, 1.0f, 17.997f)
                curveTo(3.5f, 19.497f, 8.0f, 20.998f, 11.502f, 20.998f)
                curveTo(14.814f, 20.998f, 17.846f, 18.79f, 18.744f, 15.438f)
                curveTo(19.084f, 14.172f, 19.078f, 12.895f, 18.785f, 11.707f)
                lineTo(22.625f, 6.769f)
                curveTo(22.935f, 6.371f, 22.9f, 5.804f, 22.543f, 5.448f)
                lineTo(19.549f, 2.454f)
                curveTo(19.192f, 2.097f, 18.626f, 2.062f, 18.228f, 2.371f)
                close()
                moveTo(16.895f, 8.285f)
                curveTo(16.832f, 8.22f, 16.767f, 8.155f, 16.701f, 8.091f)
                lineTo(15.577f, 6.967f)
                lineTo(18.759f, 4.492f)
                lineTo(20.505f, 6.238f)
                lineTo(18.03f, 9.42f)
                lineTo(16.895f, 8.285f)
                close()
            }
        }
        .build()
        return _brushAiFill!!
    }

private var _brushAiFill: ImageVector? = null
