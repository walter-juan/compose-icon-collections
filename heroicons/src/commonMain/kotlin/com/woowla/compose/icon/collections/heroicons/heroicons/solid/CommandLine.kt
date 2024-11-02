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

public val SolidGroup.CommandLine: ImageVector
    get() {
        if (_commandLine != null) {
            return _commandLine!!
        }
        _commandLine = Builder(name = "CommandLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 4.343f, 3.593f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 3.0f, 21.75f, 4.343f, 21.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.75f, 19.657f, 20.407f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 21.0f, 2.25f, 19.657f, 2.25f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.22f, 6.97f)
                curveTo(6.513f, 6.677f, 6.987f, 6.677f, 7.28f, 6.97f)
                lineTo(9.53f, 9.22f)
                curveTo(9.823f, 9.513f, 9.823f, 9.987f, 9.53f, 10.28f)
                lineTo(7.28f, 12.53f)
                curveTo(6.987f, 12.823f, 6.513f, 12.823f, 6.22f, 12.53f)
                curveTo(5.927f, 12.237f, 5.927f, 11.763f, 6.22f, 11.47f)
                lineTo(7.939f, 9.75f)
                lineTo(6.22f, 8.03f)
                curveTo(5.927f, 7.737f, 5.927f, 7.263f, 6.22f, 6.97f)
                close()
                moveTo(10.5f, 11.25f)
                curveTo(10.086f, 11.25f, 9.75f, 11.586f, 9.75f, 12.0f)
                curveTo(9.75f, 12.414f, 10.086f, 12.75f, 10.5f, 12.75f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 12.75f, 14.25f, 12.414f, 14.25f, 12.0f)
                curveTo(14.25f, 11.586f, 13.914f, 11.25f, 13.5f, 11.25f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _commandLine!!
    }

private var _commandLine: ImageVector? = null
