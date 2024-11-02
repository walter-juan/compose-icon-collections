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

public val SolidGroup.ArrowDownTray: ImageVector
    get() {
        if (_arrowDownTray != null) {
            return _arrowDownTray!!
        }
        _arrowDownTray = Builder(name = "ArrowDownTray", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(12.414f, 2.25f, 12.75f, 2.586f, 12.75f, 3.0f)
                verticalLineTo(14.689f)
                lineTo(15.97f, 11.47f)
                curveTo(16.263f, 11.177f, 16.737f, 11.177f, 17.03f, 11.47f)
                curveTo(17.323f, 11.763f, 17.323f, 12.237f, 17.03f, 12.53f)
                lineTo(12.53f, 17.03f)
                curveTo(12.237f, 17.323f, 11.763f, 17.323f, 11.47f, 17.03f)
                lineTo(6.97f, 12.53f)
                curveTo(6.677f, 12.237f, 6.677f, 11.763f, 6.97f, 11.47f)
                curveTo(7.263f, 11.177f, 7.737f, 11.177f, 8.03f, 11.47f)
                lineTo(11.25f, 14.689f)
                verticalLineTo(3.0f)
                curveTo(11.25f, 2.586f, 11.586f, 2.25f, 12.0f, 2.25f)
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
        return _arrowDownTray!!
    }

private var _arrowDownTray: ImageVector? = null
