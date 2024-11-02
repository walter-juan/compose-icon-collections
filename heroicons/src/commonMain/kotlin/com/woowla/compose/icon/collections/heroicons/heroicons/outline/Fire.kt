package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.362f, 5.214f)
                curveTo(18.243f, 6.501f, 20.25f, 9.391f, 20.25f, 12.75f)
                curveTo(20.25f, 17.306f, 16.556f, 21.0f, 12.0f, 21.0f)
                curveTo(7.444f, 21.0f, 3.75f, 17.306f, 3.75f, 12.75f)
                curveTo(3.75f, 10.538f, 4.621f, 8.529f, 6.038f, 7.047f)
                curveTo(6.804f, 8.118f, 7.82f, 8.997f, 9.001f, 9.601f)
                curveTo(9.046f, 6.825f, 10.348f, 4.355f, 12.362f, 2.734f)
                curveTo(13.125f, 3.758f, 14.138f, 4.618f, 15.362f, 5.214f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(14.071f, 18.0f, 15.75f, 16.321f, 15.75f, 14.25f)
                curveTo(15.75f, 12.347f, 14.332f, 10.775f, 12.495f, 10.532f)
                curveTo(11.487f, 11.437f, 10.786f, 12.678f, 10.57f, 14.079f)
                curveTo(9.788f, 13.887f, 9.065f, 13.542f, 8.437f, 13.078f)
                curveTo(8.316f, 13.447f, 8.25f, 13.841f, 8.25f, 14.25f)
                curveTo(8.25f, 16.321f, 9.929f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
