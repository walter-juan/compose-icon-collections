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

public val SolidGroup.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.916f, 4.626f)
                curveTo(20.261f, 4.856f, 20.354f, 5.321f, 20.124f, 5.666f)
                lineTo(11.124f, 19.166f)
                curveTo(10.999f, 19.353f, 10.797f, 19.474f, 10.574f, 19.496f)
                curveTo(10.35f, 19.518f, 10.129f, 19.439f, 9.97f, 19.28f)
                lineTo(3.97f, 13.28f)
                curveTo(3.677f, 12.987f, 3.677f, 12.512f, 3.97f, 12.22f)
                curveTo(4.263f, 11.927f, 4.737f, 11.927f, 5.03f, 12.22f)
                lineTo(10.383f, 17.573f)
                lineTo(18.876f, 4.834f)
                curveTo(19.106f, 4.489f, 19.571f, 4.396f, 19.916f, 4.626f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
