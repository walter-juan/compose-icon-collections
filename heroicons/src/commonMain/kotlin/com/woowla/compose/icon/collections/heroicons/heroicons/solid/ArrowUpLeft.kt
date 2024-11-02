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

public val SolidGroup.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) {
            return _arrowUpLeft!!
        }
        _arrowUpLeft = Builder(name = "ArrowUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 6.311f)
                lineTo(5.25f, 15.75f)
                curveTo(5.25f, 16.164f, 4.914f, 16.5f, 4.5f, 16.5f)
                curveTo(4.086f, 16.5f, 3.75f, 16.164f, 3.75f, 15.75f)
                lineTo(3.75f, 4.5f)
                curveTo(3.75f, 4.301f, 3.829f, 4.11f, 3.97f, 3.97f)
                curveTo(4.11f, 3.829f, 4.301f, 3.75f, 4.5f, 3.75f)
                lineTo(15.75f, 3.75f)
                curveTo(16.164f, 3.75f, 16.5f, 4.086f, 16.5f, 4.5f)
                curveTo(16.5f, 4.914f, 16.164f, 5.25f, 15.75f, 5.25f)
                lineTo(6.311f, 5.25f)
                lineTo(20.03f, 18.97f)
                curveTo(20.323f, 19.263f, 20.323f, 19.737f, 20.03f, 20.03f)
                curveTo(19.737f, 20.323f, 19.263f, 20.323f, 18.97f, 20.03f)
                lineTo(5.25f, 6.311f)
                close()
            }
        }
        .build()
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
