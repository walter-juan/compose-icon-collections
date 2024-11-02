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

public val SolidGroup.ArrowsPointingOut: ImageVector
    get() {
        if (_arrowsPointingOut != null) {
            return _arrowsPointingOut!!
        }
        _arrowsPointingOut = Builder(name = "ArrowsPointingOut", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 3.75f)
                curveTo(15.0f, 3.336f, 15.336f, 3.0f, 15.75f, 3.0f)
                lineTo(20.25f, 3.0f)
                curveTo(20.664f, 3.0f, 21.0f, 3.336f, 21.0f, 3.75f)
                verticalLineTo(8.25f)
                curveTo(21.0f, 8.664f, 20.664f, 9.0f, 20.25f, 9.0f)
                curveTo(19.836f, 9.0f, 19.5f, 8.664f, 19.5f, 8.25f)
                verticalLineTo(5.561f)
                lineTo(15.53f, 9.53f)
                curveTo(15.237f, 9.823f, 14.763f, 9.823f, 14.47f, 9.53f)
                curveTo(14.177f, 9.237f, 14.177f, 8.763f, 14.47f, 8.47f)
                lineTo(18.439f, 4.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 4.5f, 15.0f, 4.164f, 15.0f, 3.75f)
                close()
                moveTo(3.0f, 3.75f)
                curveTo(3.0f, 3.336f, 3.336f, 3.0f, 3.75f, 3.0f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 3.0f, 9.0f, 3.336f, 9.0f, 3.75f)
                curveTo(9.0f, 4.164f, 8.664f, 4.5f, 8.25f, 4.5f)
                horizontalLineTo(5.561f)
                lineTo(9.53f, 8.47f)
                curveTo(9.823f, 8.763f, 9.823f, 9.237f, 9.53f, 9.53f)
                curveTo(9.237f, 9.823f, 8.763f, 9.823f, 8.47f, 9.53f)
                lineTo(4.5f, 5.561f)
                verticalLineTo(8.25f)
                curveTo(4.5f, 8.664f, 4.164f, 9.0f, 3.75f, 9.0f)
                curveTo(3.336f, 9.0f, 3.0f, 8.664f, 3.0f, 8.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(14.47f, 15.53f)
                curveTo(14.177f, 15.237f, 14.177f, 14.763f, 14.47f, 14.47f)
                curveTo(14.763f, 14.177f, 15.237f, 14.177f, 15.53f, 14.47f)
                lineTo(19.5f, 18.439f)
                verticalLineTo(15.75f)
                curveTo(19.5f, 15.336f, 19.836f, 15.0f, 20.25f, 15.0f)
                curveTo(20.664f, 15.0f, 21.0f, 15.336f, 21.0f, 15.75f)
                verticalLineTo(20.25f)
                curveTo(21.0f, 20.664f, 20.664f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 21.0f, 15.0f, 20.664f, 15.0f, 20.25f)
                curveTo(15.0f, 19.836f, 15.336f, 19.5f, 15.75f, 19.5f)
                horizontalLineTo(18.439f)
                lineTo(14.47f, 15.53f)
                close()
                moveTo(9.53f, 14.47f)
                curveTo(9.823f, 14.763f, 9.823f, 15.237f, 9.53f, 15.53f)
                lineTo(5.561f, 19.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 19.5f, 9.0f, 19.836f, 9.0f, 20.25f)
                curveTo(9.0f, 20.664f, 8.664f, 21.0f, 8.25f, 21.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 21.0f, 3.0f, 20.664f, 3.0f, 20.25f)
                verticalLineTo(15.75f)
                curveTo(3.0f, 15.336f, 3.336f, 15.0f, 3.75f, 15.0f)
                curveTo(4.164f, 15.0f, 4.5f, 15.336f, 4.5f, 15.75f)
                verticalLineTo(18.439f)
                lineTo(8.47f, 14.47f)
                curveTo(8.763f, 14.177f, 9.237f, 14.177f, 9.53f, 14.47f)
                close()
            }
        }
        .build()
        return _arrowsPointingOut!!
    }

private var _arrowsPointingOut: ImageVector? = null
