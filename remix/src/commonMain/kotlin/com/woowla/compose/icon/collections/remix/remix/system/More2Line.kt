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

public val SystemGroup.More2Line: ImageVector
    get() {
        if (_more2Line != null) {
            return _more2Line!!
        }
        _more2Line = Builder(name = "More2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(11.175f, 3.0f, 10.5f, 3.675f, 10.5f, 4.5f)
                curveTo(10.5f, 5.325f, 11.175f, 6.0f, 12.0f, 6.0f)
                curveTo(12.825f, 6.0f, 13.5f, 5.325f, 13.5f, 4.5f)
                curveTo(13.5f, 3.675f, 12.825f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(11.175f, 18.0f, 10.5f, 18.675f, 10.5f, 19.5f)
                curveTo(10.5f, 20.325f, 11.175f, 21.0f, 12.0f, 21.0f)
                curveTo(12.825f, 21.0f, 13.5f, 20.325f, 13.5f, 19.5f)
                curveTo(13.5f, 18.675f, 12.825f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveTo(11.175f, 10.5f, 10.5f, 11.175f, 10.5f, 12.0f)
                curveTo(10.5f, 12.825f, 11.175f, 13.5f, 12.0f, 13.5f)
                curveTo(12.825f, 13.5f, 13.5f, 12.825f, 13.5f, 12.0f)
                curveTo(13.5f, 11.175f, 12.825f, 10.5f, 12.0f, 10.5f)
                close()
            }
        }
        .build()
        return _more2Line!!
    }

private var _more2Line: ImageVector? = null
