package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.Apps2Fill: ImageVector
    get() {
        if (_apps2Fill != null) {
            return _apps2Fill!!
        }
        _apps2Fill = Builder(name = "Apps2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.5f)
                curveTo(4.515f, 11.5f, 2.5f, 9.485f, 2.5f, 7.0f)
                curveTo(2.5f, 4.515f, 4.515f, 2.5f, 7.0f, 2.5f)
                curveTo(9.485f, 2.5f, 11.5f, 4.515f, 11.5f, 7.0f)
                curveTo(11.5f, 9.485f, 9.485f, 11.5f, 7.0f, 11.5f)
                close()
                moveTo(7.0f, 21.5f)
                curveTo(4.515f, 21.5f, 2.5f, 19.485f, 2.5f, 17.0f)
                curveTo(2.5f, 14.515f, 4.515f, 12.5f, 7.0f, 12.5f)
                curveTo(9.485f, 12.5f, 11.5f, 14.515f, 11.5f, 17.0f)
                curveTo(11.5f, 19.485f, 9.485f, 21.5f, 7.0f, 21.5f)
                close()
                moveTo(17.0f, 11.5f)
                curveTo(14.515f, 11.5f, 12.5f, 9.485f, 12.5f, 7.0f)
                curveTo(12.5f, 4.515f, 14.515f, 2.5f, 17.0f, 2.5f)
                curveTo(19.485f, 2.5f, 21.5f, 4.515f, 21.5f, 7.0f)
                curveTo(21.5f, 9.485f, 19.485f, 11.5f, 17.0f, 11.5f)
                close()
                moveTo(17.0f, 21.5f)
                curveTo(14.515f, 21.5f, 12.5f, 19.485f, 12.5f, 17.0f)
                curveTo(12.5f, 14.515f, 14.515f, 12.5f, 17.0f, 12.5f)
                curveTo(19.485f, 12.5f, 21.5f, 14.515f, 21.5f, 17.0f)
                curveTo(21.5f, 19.485f, 19.485f, 21.5f, 17.0f, 21.5f)
                close()
            }
        }
        .build()
        return _apps2Fill!!
    }

private var _apps2Fill: ImageVector? = null
