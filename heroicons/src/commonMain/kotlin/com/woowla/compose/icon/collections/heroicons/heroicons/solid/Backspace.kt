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

public val SolidGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.515f, 10.674f)
                curveTo(1.783f, 11.406f, 1.783f, 12.594f, 2.515f, 13.326f)
                lineTo(8.89f, 19.701f)
                curveTo(9.242f, 20.052f, 9.719f, 20.25f, 10.216f, 20.25f)
                horizontalLineTo(19.5f)
                curveTo(21.157f, 20.25f, 22.5f, 18.907f, 22.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22.5f, 5.093f, 21.157f, 3.75f, 19.5f, 3.75f)
                lineTo(10.216f, 3.75f)
                curveTo(9.719f, 3.75f, 9.242f, 3.948f, 8.89f, 4.299f)
                lineTo(2.515f, 10.674f)
                close()
                moveTo(12.53f, 9.22f)
                curveTo(12.237f, 8.927f, 11.763f, 8.927f, 11.47f, 9.22f)
                curveTo(11.177f, 9.513f, 11.177f, 9.987f, 11.47f, 10.28f)
                lineTo(13.189f, 12.0f)
                lineTo(11.47f, 13.72f)
                curveTo(11.177f, 14.013f, 11.177f, 14.487f, 11.47f, 14.78f)
                curveTo(11.763f, 15.073f, 12.237f, 15.073f, 12.53f, 14.78f)
                lineTo(14.25f, 13.061f)
                lineTo(15.97f, 14.78f)
                curveTo(16.263f, 15.073f, 16.737f, 15.073f, 17.03f, 14.78f)
                curveTo(17.323f, 14.487f, 17.323f, 14.013f, 17.03f, 13.72f)
                lineTo(15.311f, 12.0f)
                lineTo(17.03f, 10.28f)
                curveTo(17.323f, 9.987f, 17.323f, 9.513f, 17.03f, 9.22f)
                curveTo(16.737f, 8.927f, 16.263f, 8.927f, 15.97f, 9.22f)
                lineTo(14.25f, 10.939f)
                lineTo(12.53f, 9.22f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
