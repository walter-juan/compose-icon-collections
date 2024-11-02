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

public val SolidGroup.ArrowsUpDown: ImageVector
    get() {
        if (_arrowsUpDown != null) {
            return _arrowsUpDown!!
        }
        _arrowsUpDown = Builder(name = "ArrowsUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.97f, 2.47f)
                curveTo(7.263f, 2.177f, 7.737f, 2.177f, 8.03f, 2.47f)
                lineTo(12.53f, 6.97f)
                curveTo(12.823f, 7.263f, 12.823f, 7.737f, 12.53f, 8.03f)
                curveTo(12.237f, 8.323f, 11.763f, 8.323f, 11.47f, 8.03f)
                lineTo(8.25f, 4.811f)
                verticalLineTo(16.5f)
                curveTo(8.25f, 16.914f, 7.914f, 17.25f, 7.5f, 17.25f)
                curveTo(7.086f, 17.25f, 6.75f, 16.914f, 6.75f, 16.5f)
                verticalLineTo(4.811f)
                lineTo(3.53f, 8.03f)
                curveTo(3.237f, 8.323f, 2.763f, 8.323f, 2.47f, 8.03f)
                curveTo(2.177f, 7.737f, 2.177f, 7.263f, 2.47f, 6.97f)
                lineTo(6.97f, 2.47f)
                close()
                moveTo(16.5f, 6.75f)
                curveTo(16.914f, 6.75f, 17.25f, 7.086f, 17.25f, 7.5f)
                lineTo(17.25f, 19.189f)
                lineTo(20.47f, 15.97f)
                curveTo(20.763f, 15.677f, 21.237f, 15.677f, 21.53f, 15.97f)
                curveTo(21.823f, 16.263f, 21.823f, 16.737f, 21.53f, 17.03f)
                lineTo(17.03f, 21.53f)
                curveTo(16.89f, 21.671f, 16.699f, 21.75f, 16.5f, 21.75f)
                curveTo(16.301f, 21.75f, 16.11f, 21.671f, 15.97f, 21.53f)
                lineTo(11.47f, 17.03f)
                curveTo(11.177f, 16.737f, 11.177f, 16.263f, 11.47f, 15.97f)
                curveTo(11.763f, 15.677f, 12.237f, 15.677f, 12.53f, 15.97f)
                lineTo(15.75f, 19.189f)
                lineTo(15.75f, 7.5f)
                curveTo(15.75f, 7.086f, 16.086f, 6.75f, 16.5f, 6.75f)
                close()
            }
        }
        .build()
        return _arrowsUpDown!!
    }

private var _arrowsUpDown: ImageVector? = null
