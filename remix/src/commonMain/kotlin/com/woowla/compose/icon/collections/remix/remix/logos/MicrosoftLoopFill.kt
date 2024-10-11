package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.MicrosoftLoopFill: ImageVector
    get() {
        if (_microsoftLoopFill != null) {
            return _microsoftLoopFill!!
        }
        _microsoftLoopFill = Builder(name = "MicrosoftLoopFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                horizontalLineTo(6.665f)
                curveTo(8.685f, 20.548f, 10.0f, 18.178f, 10.0f, 15.5f)
                horizontalLineTo(12.0f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12.0f)
                curveTo(15.5f, 10.067f, 13.933f, 8.5f, 12.0f, 8.5f)
                curveTo(10.067f, 8.5f, 8.5f, 10.067f, 8.5f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(8.5f, 19.09f, 5.59f, 22.0f, 2.0f, 22.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _microsoftLoopFill!!
    }

private var _microsoftLoopFill: ImageVector? = null
