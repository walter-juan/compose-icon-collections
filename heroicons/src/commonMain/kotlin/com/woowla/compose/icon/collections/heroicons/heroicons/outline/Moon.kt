package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.752f, 15.002f)
                curveTo(20.597f, 15.484f, 19.33f, 15.75f, 18.0f, 15.75f)
                curveTo(12.615f, 15.75f, 8.25f, 11.385f, 8.25f, 6.0f)
                curveTo(8.25f, 4.671f, 8.516f, 3.403f, 8.998f, 2.248f)
                curveTo(5.476f, 3.718f, 3.0f, 7.195f, 3.0f, 11.25f)
                curveTo(3.0f, 16.635f, 7.365f, 21.0f, 12.75f, 21.0f)
                curveTo(16.805f, 21.0f, 20.282f, 18.524f, 21.752f, 15.002f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
