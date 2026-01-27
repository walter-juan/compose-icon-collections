package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.RemixFill: ImageVector
    get() {
        if (_remixFill != null) {
            return _remixFill!!
        }
        _remixFill = Builder(name = "RemixFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 15.314f, 19.314f, 18.0f, 16.0f, 18.0f)
                curveTo(12.686f, 18.0f, 10.0f, 15.314f, 10.0f, 12.0f)
                curveTo(10.0f, 11.448f, 9.552f, 11.0f, 9.0f, 11.0f)
                curveTo(8.448f, 11.0f, 8.0f, 11.448f, 8.0f, 12.0f)
                curveTo(8.0f, 16.418f, 11.582f, 20.0f, 16.0f, 20.0f)
                curveTo(16.871f, 20.0f, 17.708f, 19.859f, 18.493f, 19.602f)
                curveTo(16.746f, 21.096f, 14.479f, 22.0f, 12.0f, 22.0f)
                curveTo(6.669f, 22.0f, 2.313f, 17.828f, 2.017f, 12.571f)
                curveTo(2.236f, 9.458f, 4.83f, 7.0f, 8.0f, 7.0f)
                curveTo(11.314f, 7.0f, 14.0f, 9.686f, 14.0f, 13.0f)
                curveTo(14.0f, 13.552f, 14.448f, 14.0f, 15.0f, 14.0f)
                curveTo(15.552f, 14.0f, 16.0f, 13.552f, 16.0f, 13.0f)
                curveTo(16.0f, 8.582f, 12.418f, 5.0f, 8.0f, 5.0f)
                curveTo(6.505f, 5.0f, 5.106f, 5.41f, 3.909f, 6.124f)
                curveTo(5.727f, 3.625f, 8.673f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _remixFill!!
    }

private var _remixFill: ImageVector? = null
