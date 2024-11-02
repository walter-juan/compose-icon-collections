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

public val SolidGroup.ArrowUpTray: ImageVector
    get() {
        if (_arrowUpTray != null) {
            return _arrowUpTray!!
        }
        _arrowUpTray = Builder(name = "ArrowUpTray", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 2.47f)
                curveTo(11.763f, 2.177f, 12.237f, 2.177f, 12.53f, 2.47f)
                lineTo(17.03f, 6.97f)
                curveTo(17.323f, 7.263f, 17.323f, 7.737f, 17.03f, 8.03f)
                curveTo(16.737f, 8.323f, 16.263f, 8.323f, 15.97f, 8.03f)
                lineTo(12.75f, 4.811f)
                lineTo(12.75f, 16.5f)
                curveTo(12.75f, 16.914f, 12.414f, 17.25f, 12.0f, 17.25f)
                curveTo(11.586f, 17.25f, 11.25f, 16.914f, 11.25f, 16.5f)
                lineTo(11.25f, 4.811f)
                lineTo(8.03f, 8.03f)
                curveTo(7.737f, 8.323f, 7.263f, 8.323f, 6.97f, 8.03f)
                curveTo(6.677f, 7.737f, 6.677f, 7.263f, 6.97f, 6.97f)
                lineTo(11.47f, 2.47f)
                close()
                moveTo(3.0f, 15.75f)
                curveTo(3.414f, 15.75f, 3.75f, 16.086f, 3.75f, 16.5f)
                verticalLineTo(18.75f)
                curveTo(3.75f, 19.578f, 4.422f, 20.25f, 5.25f, 20.25f)
                horizontalLineTo(18.75f)
                curveTo(19.578f, 20.25f, 20.25f, 19.578f, 20.25f, 18.75f)
                verticalLineTo(16.5f)
                curveTo(20.25f, 16.086f, 20.586f, 15.75f, 21.0f, 15.75f)
                curveTo(21.414f, 15.75f, 21.75f, 16.086f, 21.75f, 16.5f)
                verticalLineTo(18.75f)
                curveTo(21.75f, 20.407f, 20.407f, 21.75f, 18.75f, 21.75f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 21.75f, 2.25f, 20.407f, 2.25f, 18.75f)
                verticalLineTo(16.5f)
                curveTo(2.25f, 16.086f, 2.586f, 15.75f, 3.0f, 15.75f)
                close()
            }
        }
        .build()
        return _arrowUpTray!!
    }

private var _arrowUpTray: ImageVector? = null
