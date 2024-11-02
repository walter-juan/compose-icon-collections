package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ArrowUpOnSquare: ImageVector
    get() {
        if (_arrowUpOnSquare != null) {
            return _arrowUpOnSquare!!
        }
        _arrowUpOnSquare = Builder(name = "ArrowUpOnSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.47f, 1.72f)
                curveTo(11.763f, 1.427f, 12.237f, 1.427f, 12.53f, 1.72f)
                lineTo(15.53f, 4.72f)
                curveTo(15.823f, 5.013f, 15.823f, 5.487f, 15.53f, 5.78f)
                curveTo(15.237f, 6.073f, 14.763f, 6.073f, 14.47f, 5.78f)
                lineTo(12.75f, 4.061f)
                lineTo(12.75f, 7.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.061f)
                lineTo(9.53f, 5.78f)
                curveTo(9.237f, 6.073f, 8.763f, 6.073f, 8.47f, 5.78f)
                curveTo(8.177f, 5.487f, 8.177f, 5.013f, 8.47f, 4.72f)
                lineTo(11.47f, 1.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 7.5f)
                lineTo(11.25f, 15.0f)
                curveTo(11.25f, 15.414f, 11.586f, 15.75f, 12.0f, 15.75f)
                curveTo(12.414f, 15.75f, 12.75f, 15.414f, 12.75f, 15.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(16.5f)
                curveTo(18.157f, 7.5f, 19.5f, 8.843f, 19.5f, 10.5f)
                verticalLineTo(19.5f)
                curveTo(19.5f, 21.157f, 18.157f, 22.5f, 16.5f, 22.5f)
                horizontalLineTo(7.5f)
                curveTo(5.843f, 22.5f, 4.5f, 21.157f, 4.5f, 19.5f)
                verticalLineTo(10.5f)
                curveTo(4.5f, 8.843f, 5.843f, 7.5f, 7.5f, 7.5f)
                horizontalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _arrowUpOnSquare!!
    }

private var _arrowUpOnSquare: ImageVector? = null
