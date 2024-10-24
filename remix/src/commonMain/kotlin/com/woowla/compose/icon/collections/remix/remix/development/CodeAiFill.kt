package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.CodeAiFill: ImageVector
    get() {
        if (_codeAiFill != null) {
            return _codeAiFill!!
        }
        _codeAiFill = Builder(name = "CodeAiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.713f, 10.128f)
                lineTo(17.467f, 10.694f)
                curveTo(17.286f, 11.108f, 16.714f, 11.108f, 16.533f, 10.694f)
                lineTo(16.287f, 10.128f)
                curveTo(15.847f, 9.119f, 15.056f, 8.316f, 14.068f, 7.877f)
                lineTo(13.308f, 7.539f)
                curveTo(12.897f, 7.357f, 12.897f, 6.759f, 13.308f, 6.576f)
                lineTo(14.025f, 6.257f)
                curveTo(15.038f, 5.807f, 15.844f, 4.974f, 16.276f, 3.931f)
                lineTo(16.529f, 3.32f)
                curveTo(16.706f, 2.893f, 17.294f, 2.893f, 17.471f, 3.32f)
                lineTo(17.724f, 3.931f)
                curveTo(18.156f, 4.974f, 18.962f, 5.807f, 19.975f, 6.257f)
                lineTo(20.692f, 6.576f)
                curveTo(21.103f, 6.759f, 21.103f, 7.357f, 20.692f, 7.539f)
                lineTo(19.932f, 7.877f)
                curveTo(18.944f, 8.316f, 18.153f, 9.119f, 17.713f, 10.128f)
                close()
                moveTo(2.828f, 12.0f)
                lineTo(7.071f, 16.243f)
                lineTo(5.657f, 17.657f)
                lineTo(0.0f, 12.0f)
                lineTo(5.657f, 6.343f)
                lineTo(7.071f, 7.757f)
                lineTo(2.828f, 12.0f)
                close()
                moveTo(18.343f, 17.657f)
                lineTo(24.0f, 12.0f)
                lineTo(21.171f, 9.172f)
                lineTo(19.757f, 10.586f)
                lineTo(21.171f, 12.0f)
                lineTo(16.929f, 16.243f)
                lineTo(18.343f, 17.657f)
                close()
            }
        }
        .build()
        return _codeAiFill!!
    }

private var _codeAiFill: ImageVector? = null
