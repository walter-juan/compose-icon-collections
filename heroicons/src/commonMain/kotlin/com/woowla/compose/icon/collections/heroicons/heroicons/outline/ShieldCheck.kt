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

public val OutlineGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.75f)
                lineTo(11.25f, 15.0f)
                lineTo(15.0f, 9.75f)
                moveTo(12.0f, 2.714f)
                curveTo(9.849f, 4.751f, 6.946f, 6.0f, 3.75f, 6.0f)
                curveTo(3.699f, 6.0f, 3.649f, 6.0f, 3.598f, 5.999f)
                curveTo(3.21f, 7.179f, 3.0f, 8.44f, 3.0f, 9.75f)
                curveTo(3.0f, 15.341f, 6.824f, 20.04f, 12.0f, 21.372f)
                curveTo(17.176f, 20.04f, 21.0f, 15.341f, 21.0f, 9.75f)
                curveTo(21.0f, 8.44f, 20.79f, 7.179f, 20.402f, 5.999f)
                curveTo(20.351f, 6.0f, 20.301f, 6.0f, 20.25f, 6.0f)
                curveTo(17.054f, 6.0f, 14.151f, 4.751f, 12.0f, 2.714f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
