package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.MenLine: ImageVector
    get() {
        if (_menLine != null) {
            return _menLine!!
        }
        _menLine = Builder(name = "MenLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.049f, 8.537f)
                lineTo(18.586f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.414f)
                lineTo(16.463f, 9.951f)
                curveTo(17.427f, 11.213f, 18.0f, 12.79f, 18.0f, 14.5f)
                curveTo(18.0f, 18.642f, 14.642f, 22.0f, 10.5f, 22.0f)
                curveTo(6.358f, 22.0f, 3.0f, 18.642f, 3.0f, 14.5f)
                curveTo(3.0f, 10.358f, 6.358f, 7.0f, 10.5f, 7.0f)
                curveTo(12.21f, 7.0f, 13.787f, 7.573f, 15.049f, 8.537f)
                close()
                moveTo(10.5f, 20.0f)
                curveTo(13.538f, 20.0f, 16.0f, 17.538f, 16.0f, 14.5f)
                curveTo(16.0f, 11.462f, 13.538f, 9.0f, 10.5f, 9.0f)
                curveTo(7.462f, 9.0f, 5.0f, 11.462f, 5.0f, 14.5f)
                curveTo(5.0f, 17.538f, 7.462f, 20.0f, 10.5f, 20.0f)
                close()
            }
        }
        .build()
        return _menLine!!
    }

private var _menLine: ImageVector? = null
