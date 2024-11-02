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

public val SolidGroup.ArrowLeftOnRectangle: ImageVector
    get() {
        if (_arrowLeftOnRectangle != null) {
            return _arrowLeftOnRectangle!!
        }
        _arrowLeftOnRectangle = Builder(name = "ArrowLeftOnRectangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 3.75f)
                curveTo(6.672f, 3.75f, 6.0f, 4.422f, 6.0f, 5.25f)
                lineTo(6.0f, 18.75f)
                curveTo(6.0f, 19.578f, 6.672f, 20.25f, 7.5f, 20.25f)
                horizontalLineTo(13.5f)
                curveTo(14.328f, 20.25f, 15.0f, 19.578f, 15.0f, 18.75f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 14.586f, 15.336f, 14.25f, 15.75f, 14.25f)
                curveTo(16.164f, 14.25f, 16.5f, 14.586f, 16.5f, 15.0f)
                verticalLineTo(18.75f)
                curveTo(16.5f, 20.407f, 15.157f, 21.75f, 13.5f, 21.75f)
                horizontalLineTo(7.5f)
                curveTo(5.843f, 21.75f, 4.5f, 20.407f, 4.5f, 18.75f)
                lineTo(4.5f, 5.25f)
                curveTo(4.5f, 3.593f, 5.843f, 2.25f, 7.5f, 2.25f)
                lineTo(13.5f, 2.25f)
                curveTo(15.157f, 2.25f, 16.5f, 3.593f, 16.5f, 5.25f)
                verticalLineTo(9.0f)
                curveTo(16.5f, 9.414f, 16.164f, 9.75f, 15.75f, 9.75f)
                curveTo(15.336f, 9.75f, 15.0f, 9.414f, 15.0f, 9.0f)
                verticalLineTo(5.25f)
                curveTo(15.0f, 4.422f, 14.328f, 3.75f, 13.5f, 3.75f)
                lineTo(7.5f, 3.75f)
                close()
                moveTo(12.53f, 8.47f)
                curveTo(12.823f, 8.763f, 12.823f, 9.237f, 12.53f, 9.53f)
                lineTo(10.811f, 11.25f)
                lineTo(21.75f, 11.25f)
                curveTo(22.164f, 11.25f, 22.5f, 11.586f, 22.5f, 12.0f)
                curveTo(22.5f, 12.414f, 22.164f, 12.75f, 21.75f, 12.75f)
                lineTo(10.811f, 12.75f)
                lineTo(12.53f, 14.47f)
                curveTo(12.823f, 14.763f, 12.823f, 15.237f, 12.53f, 15.53f)
                curveTo(12.237f, 15.823f, 11.763f, 15.823f, 11.47f, 15.53f)
                lineTo(8.47f, 12.53f)
                curveTo(8.177f, 12.237f, 8.177f, 11.763f, 8.47f, 11.47f)
                lineTo(11.47f, 8.47f)
                curveTo(11.763f, 8.177f, 12.237f, 8.177f, 12.53f, 8.47f)
                close()
            }
        }
        .build()
        return _arrowLeftOnRectangle!!
    }

private var _arrowLeftOnRectangle: ImageVector? = null
