package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Sailsdotjs: ImageVector
    get() {
        if (_sailsdotjs != null) {
            return _sailsdotjs!!
        }
        _sailsdotjs = Builder(name = "Sailsdotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.238f, 24.0f)
                reflectiveCurveTo(-6.938f, 9.398f, 11.938f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(2.238f)
                moveTo(14.859f, 24.0f)
                verticalLineTo(9.125f)
                reflectiveCurveToRelative(3.012f, 4.914f, 9.133f, 14.875f)
                horizontalLineToRelative(-9.133f)
            }
        }
        .build()
        return _sailsdotjs!!
    }

private var _sailsdotjs: ImageVector? = null
