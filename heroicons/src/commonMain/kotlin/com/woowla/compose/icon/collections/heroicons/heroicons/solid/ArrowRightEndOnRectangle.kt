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

public val SolidGroup.ArrowRightEndOnRectangle: ImageVector
    get() {
        if (_arrowRightEndOnRectangle != null) {
            return _arrowRightEndOnRectangle!!
        }
        _arrowRightEndOnRectangle = Builder(name = "ArrowRightEndOnRectangle", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 3.75f)
                curveTo(17.328f, 3.75f, 18.0f, 4.422f, 18.0f, 5.25f)
                lineTo(18.0f, 18.75f)
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
                lineTo(19.5f, 5.25f)
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
                moveTo(11.47f, 8.47f)
                curveTo(11.177f, 8.763f, 11.177f, 9.237f, 11.47f, 9.53f)
                lineTo(13.189f, 11.25f)
                lineTo(2.25f, 11.25f)
                curveTo(1.836f, 11.25f, 1.5f, 11.586f, 1.5f, 12.0f)
                curveTo(1.5f, 12.414f, 1.836f, 12.75f, 2.25f, 12.75f)
                lineTo(13.189f, 12.75f)
                lineTo(11.47f, 14.47f)
                curveTo(11.177f, 14.763f, 11.177f, 15.237f, 11.47f, 15.53f)
                curveTo(11.763f, 15.823f, 12.237f, 15.823f, 12.53f, 15.53f)
                lineTo(15.53f, 12.53f)
                curveTo(15.823f, 12.237f, 15.823f, 11.763f, 15.53f, 11.47f)
                lineTo(12.53f, 8.47f)
                curveTo(12.237f, 8.177f, 11.763f, 8.177f, 11.47f, 8.47f)
                close()
            }
        }
        .build()
        return _arrowRightEndOnRectangle!!
    }

private var _arrowRightEndOnRectangle: ImageVector? = null
