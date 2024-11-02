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

public val SolidGroup.ArrowLeftStartOnRectangle: ImageVector
    get() {
        if (_arrowLeftStartOnRectangle != null) {
            return _arrowLeftStartOnRectangle!!
        }
        _arrowLeftStartOnRectangle = Builder(name = "ArrowLeftStartOnRectangle", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 3.75f)
                curveTo(17.328f, 3.75f, 18.0f, 4.422f, 18.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(18.0f, 19.578f, 17.328f, 20.25f, 16.5f, 20.25f)
                horizontalLineTo(10.5f)
                curveTo(9.672f, 20.25f, 9.0f, 19.578f, 9.0f, 18.75f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 14.586f, 8.664f, 14.25f, 8.25f, 14.25f)
                curveTo(7.836f, 14.25f, 7.5f, 14.586f, 7.5f, 15.0f)
                verticalLineTo(18.75f)
                curveTo(7.5f, 20.407f, 8.843f, 21.75f, 10.5f, 21.75f)
                horizontalLineTo(16.5f)
                curveTo(18.157f, 21.75f, 19.5f, 20.407f, 19.5f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(19.5f, 3.593f, 18.157f, 2.25f, 16.5f, 2.25f)
                lineTo(10.5f, 2.25f)
                curveTo(8.843f, 2.25f, 7.5f, 3.593f, 7.5f, 5.25f)
                verticalLineTo(9.0f)
                curveTo(7.5f, 9.414f, 7.836f, 9.75f, 8.25f, 9.75f)
                curveTo(8.664f, 9.75f, 9.0f, 9.414f, 9.0f, 9.0f)
                verticalLineTo(5.25f)
                curveTo(9.0f, 4.422f, 9.672f, 3.75f, 10.5f, 3.75f)
                lineTo(16.5f, 3.75f)
                close()
                moveTo(5.78f, 8.47f)
                curveTo(5.487f, 8.177f, 5.013f, 8.177f, 4.72f, 8.47f)
                lineTo(1.72f, 11.47f)
                curveTo(1.427f, 11.763f, 1.427f, 12.237f, 1.72f, 12.53f)
                lineTo(4.72f, 15.53f)
                curveTo(5.013f, 15.823f, 5.487f, 15.823f, 5.78f, 15.53f)
                curveTo(6.073f, 15.237f, 6.073f, 14.763f, 5.78f, 14.47f)
                lineTo(4.061f, 12.75f)
                lineTo(15.0f, 12.75f)
                curveTo(15.414f, 12.75f, 15.75f, 12.414f, 15.75f, 12.0f)
                curveTo(15.75f, 11.586f, 15.414f, 11.25f, 15.0f, 11.25f)
                lineTo(4.061f, 11.25f)
                lineTo(5.78f, 9.53f)
                curveTo(6.073f, 9.237f, 6.073f, 8.763f, 5.78f, 8.47f)
                close()
            }
        }
        .build()
        return _arrowLeftStartOnRectangle!!
    }

private var _arrowLeftStartOnRectangle: ImageVector? = null
