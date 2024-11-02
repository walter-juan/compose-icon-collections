package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.MagnifyingGlassCircle: ImageVector
    get() {
        if (_magnifyingGlassCircle != null) {
            return _magnifyingGlassCircle!!
        }
        _magnifyingGlassCircle = Builder(name = "MagnifyingGlassCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 10.875f)
                curveTo(8.25f, 9.425f, 9.425f, 8.25f, 10.875f, 8.25f)
                curveTo(12.325f, 8.25f, 13.5f, 9.425f, 13.5f, 10.875f)
                curveTo(13.5f, 11.6f, 13.207f, 12.255f, 12.731f, 12.731f)
                curveTo(12.255f, 13.207f, 11.6f, 13.5f, 10.875f, 13.5f)
                curveTo(9.425f, 13.5f, 8.25f, 12.325f, 8.25f, 10.875f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(10.875f, 6.75f)
                curveTo(8.597f, 6.75f, 6.75f, 8.597f, 6.75f, 10.875f)
                curveTo(6.75f, 13.153f, 8.597f, 15.0f, 10.875f, 15.0f)
                curveTo(11.743f, 15.0f, 12.549f, 14.731f, 13.213f, 14.274f)
                lineTo(15.22f, 16.28f)
                curveTo(15.513f, 16.573f, 15.987f, 16.573f, 16.28f, 16.28f)
                curveTo(16.573f, 15.987f, 16.573f, 15.513f, 16.28f, 15.22f)
                lineTo(14.274f, 13.213f)
                curveTo(14.731f, 12.549f, 15.0f, 11.743f, 15.0f, 10.875f)
                curveTo(15.0f, 8.597f, 13.153f, 6.75f, 10.875f, 6.75f)
                close()
            }
        }
        .build()
        return _magnifyingGlassCircle!!
    }

private var _magnifyingGlassCircle: ImageVector? = null
