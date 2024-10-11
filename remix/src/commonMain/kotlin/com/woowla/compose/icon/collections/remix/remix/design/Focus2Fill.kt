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

public val DesignGroup.Focus2Fill: ImageVector
    get() {
        if (_focus2Fill != null) {
            return _focus2Fill!!
        }
        _focus2Fill = Builder(name = "Focus2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.427f, 20.0f, 20.0f, 16.427f, 20.0f, 12.0f)
                curveTo(20.0f, 7.573f, 16.427f, 4.0f, 12.0f, 4.0f)
                curveTo(7.573f, 4.0f, 4.0f, 7.573f, 4.0f, 12.0f)
                curveTo(4.0f, 16.427f, 7.573f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(8.68f, 18.0f, 6.0f, 15.32f, 6.0f, 12.0f)
                curveTo(6.0f, 8.68f, 8.68f, 6.0f, 12.0f, 6.0f)
                curveTo(15.32f, 6.0f, 18.0f, 8.68f, 18.0f, 12.0f)
                curveTo(18.0f, 15.32f, 15.32f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.9f, 10.0f, 10.0f, 10.9f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1f, 10.9f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1f, 14.0f, 14.0f, 13.1f, 14.0f, 12.0f)
                curveTo(14.0f, 10.9f, 13.1f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _focus2Fill!!
    }

private var _focus2Fill: ImageVector? = null
