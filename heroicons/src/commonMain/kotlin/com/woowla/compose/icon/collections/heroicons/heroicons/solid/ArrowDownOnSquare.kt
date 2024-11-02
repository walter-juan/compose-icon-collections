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

public val SolidGroup.ArrowDownOnSquare: ImageVector
    get() {
        if (_arrowDownOnSquare != null) {
            return _arrowDownOnSquare!!
        }
        _arrowDownOnSquare = Builder(name = "ArrowDownOnSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                curveTo(12.414f, 1.5f, 12.75f, 1.836f, 12.75f, 2.25f)
                lineTo(12.75f, 7.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(2.25f)
                curveTo(11.25f, 1.836f, 11.586f, 1.5f, 12.0f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 7.5f)
                lineTo(11.25f, 13.189f)
                lineTo(9.53f, 11.47f)
                curveTo(9.237f, 11.177f, 8.763f, 11.177f, 8.47f, 11.47f)
                curveTo(8.177f, 11.763f, 8.177f, 12.237f, 8.47f, 12.53f)
                lineTo(11.47f, 15.53f)
                curveTo(11.61f, 15.671f, 11.801f, 15.75f, 12.0f, 15.75f)
                curveTo(12.199f, 15.75f, 12.39f, 15.671f, 12.53f, 15.53f)
                lineTo(15.53f, 12.53f)
                curveTo(15.823f, 12.237f, 15.823f, 11.763f, 15.53f, 11.47f)
                curveTo(15.237f, 11.177f, 14.763f, 11.177f, 14.47f, 11.47f)
                lineTo(12.75f, 13.189f)
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
        return _arrowDownOnSquare!!
    }

private var _arrowDownOnSquare: ImageVector? = null
