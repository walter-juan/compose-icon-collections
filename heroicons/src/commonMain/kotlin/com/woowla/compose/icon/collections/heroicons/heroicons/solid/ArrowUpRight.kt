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

public val SolidGroup.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) {
            return _arrowUpRight!!
        }
        _arrowUpRight = Builder(name = "ArrowUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.25f, 3.75f)
                lineTo(19.5f, 3.75f)
                curveTo(19.699f, 3.75f, 19.89f, 3.829f, 20.03f, 3.97f)
                curveTo(20.171f, 4.11f, 20.25f, 4.301f, 20.25f, 4.5f)
                verticalLineTo(15.75f)
                curveTo(20.25f, 16.164f, 19.914f, 16.5f, 19.5f, 16.5f)
                curveTo(19.086f, 16.5f, 18.75f, 16.164f, 18.75f, 15.75f)
                verticalLineTo(6.311f)
                lineTo(5.03f, 20.03f)
                curveTo(4.737f, 20.323f, 4.263f, 20.323f, 3.97f, 20.03f)
                curveTo(3.677f, 19.737f, 3.677f, 19.263f, 3.97f, 18.97f)
                lineTo(17.689f, 5.25f)
                lineTo(8.25f, 5.25f)
                curveTo(7.836f, 5.25f, 7.5f, 4.914f, 7.5f, 4.5f)
                curveTo(7.5f, 4.086f, 7.836f, 3.75f, 8.25f, 3.75f)
                close()
            }
        }
        .build()
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
