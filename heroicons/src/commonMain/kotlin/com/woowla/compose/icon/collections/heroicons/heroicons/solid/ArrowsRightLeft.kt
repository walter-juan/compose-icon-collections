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

public val SolidGroup.ArrowsRightLeft: ImageVector
    get() {
        if (_arrowsRightLeft != null) {
            return _arrowsRightLeft!!
        }
        _arrowsRightLeft = Builder(name = "ArrowsRightLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.97f, 2.47f)
                curveTo(16.263f, 2.177f, 16.737f, 2.177f, 17.03f, 2.47f)
                lineTo(21.53f, 6.97f)
                curveTo(21.671f, 7.11f, 21.75f, 7.301f, 21.75f, 7.5f)
                curveTo(21.75f, 7.699f, 21.671f, 7.89f, 21.53f, 8.03f)
                lineTo(17.03f, 12.53f)
                curveTo(16.737f, 12.823f, 16.263f, 12.823f, 15.97f, 12.53f)
                curveTo(15.677f, 12.237f, 15.677f, 11.763f, 15.97f, 11.47f)
                lineTo(19.189f, 8.25f)
                lineTo(7.5f, 8.25f)
                curveTo(7.086f, 8.25f, 6.75f, 7.914f, 6.75f, 7.5f)
                curveTo(6.75f, 7.086f, 7.086f, 6.75f, 7.5f, 6.75f)
                lineTo(19.189f, 6.75f)
                lineTo(15.97f, 3.53f)
                curveTo(15.677f, 3.237f, 15.677f, 2.763f, 15.97f, 2.47f)
                close()
                moveTo(8.03f, 11.47f)
                curveTo(8.323f, 11.763f, 8.323f, 12.237f, 8.03f, 12.53f)
                lineTo(4.811f, 15.75f)
                horizontalLineTo(16.5f)
                curveTo(16.914f, 15.75f, 17.25f, 16.086f, 17.25f, 16.5f)
                curveTo(17.25f, 16.914f, 16.914f, 17.25f, 16.5f, 17.25f)
                horizontalLineTo(4.811f)
                lineTo(8.03f, 20.47f)
                curveTo(8.323f, 20.763f, 8.323f, 21.237f, 8.03f, 21.53f)
                curveTo(7.737f, 21.823f, 7.263f, 21.823f, 6.97f, 21.53f)
                lineTo(2.47f, 17.03f)
                curveTo(2.177f, 16.737f, 2.177f, 16.263f, 2.47f, 15.97f)
                lineTo(6.97f, 11.47f)
                curveTo(7.263f, 11.177f, 7.737f, 11.177f, 8.03f, 11.47f)
                close()
            }
        }
        .build()
        return _arrowsRightLeft!!
    }

private var _arrowsRightLeft: ImageVector? = null
