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

public val SolidGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(12.414f, 2.25f, 12.75f, 2.586f, 12.75f, 3.0f)
                verticalLineTo(12.0f)
                curveTo(12.75f, 12.414f, 12.414f, 12.75f, 12.0f, 12.75f)
                curveTo(11.586f, 12.75f, 11.25f, 12.414f, 11.25f, 12.0f)
                verticalLineTo(3.0f)
                curveTo(11.25f, 2.586f, 11.586f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(6.166f, 5.106f)
                curveTo(6.459f, 5.399f, 6.459f, 5.873f, 6.166f, 6.166f)
                curveTo(2.945f, 9.388f, 2.945f, 14.612f, 6.166f, 17.834f)
                curveTo(9.388f, 21.056f, 14.612f, 21.056f, 17.834f, 17.834f)
                curveTo(21.056f, 14.612f, 21.056f, 9.388f, 17.834f, 6.166f)
                curveTo(17.541f, 5.873f, 17.541f, 5.399f, 17.834f, 5.106f)
                curveTo(18.126f, 4.813f, 18.601f, 4.813f, 18.894f, 5.106f)
                curveTo(22.702f, 8.913f, 22.702f, 15.087f, 18.894f, 18.894f)
                curveTo(15.087f, 22.702f, 8.913f, 22.702f, 5.106f, 18.894f)
                curveTo(1.298f, 15.087f, 1.298f, 8.913f, 5.106f, 5.106f)
                curveTo(5.399f, 4.813f, 5.873f, 4.813f, 6.166f, 5.106f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
