package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.963f, 2.286f)
                curveTo(12.842f, 2.122f, 12.659f, 2.016f, 12.457f, 1.99f)
                curveTo(12.255f, 1.964f, 12.051f, 2.022f, 11.892f, 2.15f)
                curveTo(10.022f, 3.655f, 8.717f, 5.838f, 8.353f, 8.326f)
                curveTo(7.697f, 7.85f, 7.12f, 7.271f, 6.648f, 6.611f)
                curveTo(6.518f, 6.429f, 6.314f, 6.315f, 6.091f, 6.299f)
                curveTo(5.868f, 6.284f, 5.65f, 6.368f, 5.496f, 6.529f)
                curveTo(3.95f, 8.144f, 3.0f, 10.337f, 3.0f, 12.75f)
                curveTo(3.0f, 17.72f, 7.029f, 21.75f, 12.0f, 21.75f)
                curveTo(16.971f, 21.75f, 21.0f, 17.72f, 21.0f, 12.75f)
                curveTo(21.0f, 9.089f, 18.814f, 5.94f, 15.68f, 4.534f)
                curveTo(14.571f, 3.993f, 13.655f, 3.213f, 12.963f, 2.286f)
                close()
                moveTo(15.75f, 14.25f)
                curveTo(15.75f, 16.321f, 14.071f, 18.0f, 12.0f, 18.0f)
                curveTo(9.929f, 18.0f, 8.25f, 16.321f, 8.25f, 14.25f)
                curveTo(8.25f, 13.841f, 8.316f, 13.447f, 8.437f, 13.078f)
                curveTo(9.065f, 13.542f, 9.788f, 13.887f, 10.57f, 14.079f)
                curveTo(10.786f, 12.678f, 11.487f, 11.437f, 12.495f, 10.532f)
                curveTo(14.332f, 10.775f, 15.75f, 12.347f, 15.75f, 14.25f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
