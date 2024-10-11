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

public val LogosGroup.RemixRunLine: ImageVector
    get() {
        if (_remixRunLine != null) {
            return _remixRunLine!!
        }
        _remixRunLine = Builder(name = "RemixRunLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(17.814f, 2.0f, 20.5f, 4.686f, 20.5f, 8.0f)
                curveTo(20.5f, 10.198f, 19.318f, 12.121f, 17.554f, 13.165f)
                curveTo(19.038f, 14.258f, 20.0f, 16.017f, 20.0f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 15.791f, 16.209f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.5f)
                curveTo(16.709f, 12.0f, 18.5f, 10.209f, 18.5f, 8.0f)
                curveTo(18.5f, 5.791f, 16.709f, 4.0f, 14.5f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.0f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _remixRunLine!!
    }

private var _remixRunLine: ImageVector? = null
